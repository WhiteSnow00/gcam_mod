import android.media.AudioDeviceInfo;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.util.Log;
import java.nio.ByteBuffer;
import android.os.Handler;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTimestamp;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import android.media.AudioFormat;
import android.media.AudioRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class may implements max
{
    public AudioRecord a;
    public final int b;
    private final AudioFormat c;
    private final mbb d;
    private final AtomicInteger e;
    private final AtomicLong f;
    private final AtomicLong g;
    private final AtomicInteger h;
    private final AtomicInteger i;
    private final AtomicInteger j;
    private final AtomicInteger k;
    private final AtomicInteger l;
    private final AtomicLong m;
    private final AtomicLong n;
    private final AtomicLong o;
    private final AtomicLong p;
    private final AudioTimestamp q;
    private long r;
    
    public may(final AudioRecord a, final int b) {
        this.e = new AtomicInteger(0);
        this.f = new AtomicLong(0L);
        this.g = new AtomicLong(0L);
        this.h = new AtomicInteger(0);
        this.i = new AtomicInteger(0);
        this.j = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.m = new AtomicLong(0L);
        this.n = new AtomicLong(0L);
        this.o = new AtomicLong(0L);
        this.p = new AtomicLong(0L);
        this.a = a;
        this.b = b;
        final AudioFormat format = a.getFormat();
        this.c = format;
        this.d = new mbb(format);
        this.q = new AudioTimestamp();
    }
    
    private final void e(final boolean b) {
        if (!b && System.currentTimeMillis() < this.o.get()) {
            return;
        }
        String.format("  read=%d (%d bytes), maxDeltaNs=%d, noTimestamp=%d, noData=%d, noInit=%d, badOut=%d, largeGap=%d", this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
        this.o.set(System.currentTimeMillis() + 5000L);
    }
    
    @Override
    public final AudioFormat a() {
        return this.a.getFormat();
    }
    
    public final void addOnRoutingChangedListener(final AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener, final Handler handler) {
        this.a.addOnRoutingChangedListener(audioRouting$OnRoutingChangedListener, handler);
    }
    
    @Override
    public final maw b(final ByteBuffer byteBuffer, int n) {
        synchronized (this) {
            if (this.a.getState() != 1) {
                this.j.incrementAndGet();
                this.e(false);
                return null;
            }
            Label_0663: {
                if (byteBuffer.isDirect()) {
                    n = this.a.read(byteBuffer, n);
                    this.e.incrementAndGet();
                    this.f.addAndGet(n);
                }
                else {
                    if (!byteBuffer.hasArray()) {
                        break Label_0663;
                    }
                    n = this.a.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), n);
                    this.e.incrementAndGet();
                    this.f.addAndGet(n);
                }
                if (n == 0) {
                    this.i.incrementAndGet();
                    this.e(false);
                    return null;
                }
                if (this.a.getTimestamp(this.q, this.b) != 0) {
                    this.h.incrementAndGet();
                    this.e(false);
                    return null;
                }
                final mbb d = this.d;
                final AudioTimestamp q = this.q;
                final long n2 = n / (long)d.c / d.d;
                Object o = d.a;
                synchronized (o) {
                    final long e = d.e;
                    final long framePosition = q.framePosition;
                    final long b = d.b;
                    d.e += n2;
                    long r = (e - framePosition) * b + q.nanoTime;
                    monitorexit(o);
                    if (r < this.m.get()) {
                        Log.w("AudioStreamImpl", String.format("Stale audio packet detected: %d (start=%d)", r, this.m.get()));
                    }
                    else if (this.n.compareAndSet(0L, r)) {
                        final long n3 = this.n.get() - this.m.get();
                        String.format("First read. Start: %d ns. First packet: %d ns. Audio startup latency: %d ns (%d ms)", this.m.get(), this.n.get(), n3, TimeUnit.MILLISECONDS.convert(n3, TimeUnit.NANOSECONDS));
                    }
                    Label_0527: {
                        if (r < this.r) {
                            final long r2 = this.r;
                            final mbb d2 = this.d;
                            synchronized (d2.a) {
                                final long e2 = d2.e;
                                monitorexit(d2.a);
                                Log.w("AudioStreamImpl", String.format("Timestamp out of order: %d < %d. Frame pos=%d", r, r2, e2));
                                r = this.r;
                                this.r = 100000L + r;
                                break Label_0527;
                            }
                        }
                        this.r = 100000L + r;
                    }
                    long value = this.p.get();
                    if (value <= 0L) {
                        value = r;
                    }
                    final long n4 = r - value;
                    if (n4 >= 100000000L) {
                        Log.w("AudioStreamImpl", String.format("Large audio timestamp gap detected: %d ns (packet %d)", n4, this.e.get()));
                        this.l.incrementAndGet();
                    }
                    o = this.g;
                    ((AtomicLong)o).set(Math.max(((AtomicLong)o).get(), n4));
                    this.p.set(r);
                    this.e(false);
                    return maw.a(byteBuffer, n, r);
                }
            }
            Log.w("AudioStreamImpl", "Provided bytebuffer unsupported.");
            this.k.incrementAndGet();
            this.e(false);
            return null;
        }
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            this.r = 0L;
            final mbb d = this.d;
            Object a = d.a;
            synchronized (a) {
                d.e = 0L;
                monitorexit(a);
                if (this.a.getState() != 1) {
                    final int audioSource = this.a.getAudioSource();
                    final int sampleRate = this.a.getSampleRate();
                    final int channelConfiguration = this.a.getChannelConfiguration();
                    final int audioFormat = this.a.getAudioFormat();
                    final int a2 = mbb.a(this.a.getFormat());
                    final int max = Math.max(1, this.a.getChannelCount());
                    final int bufferSizeInFrames = this.a.getBufferSizeInFrames();
                    this.a.release();
                    Log.w("AudioStreamImpl", "AudioRecord in a bad state. Recreating AudioRecord");
                    a = new AudioRecord(audioSource, sampleRate, channelConfiguration, audioFormat, bufferSizeInFrames * (a2 * max));
                    this.a = (AudioRecord)a;
                }
                if (this.a.getState() != 1) {
                    Log.e("AudioStreamImpl", "Could not start AudioStream since it is not initialized.");
                    return;
                }
                this.a.startRecording();
                a = this.m;
                long n;
                if (this.b == 1) {
                    n = SystemClock.elapsedRealtimeNanos();
                }
                else {
                    n = System.nanoTime();
                }
                ((AtomicLong)a).set(n);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.e(true);
            this.a.release();
        }
    }
    
    @Override
    public final void d() {
        monitorenter(this);
        try {
            try {
                this.e(true);
                this.a.stop();
                this.e.set(0);
                this.f.set(0L);
                this.g.set(0L);
                this.h.set(0);
                this.i.set(0);
                this.j.set(0);
                this.k.set(0);
                this.l.set(0);
                this.o.set(0L);
                this.p.set(0L);
                this.m.set(0L);
                this.n.set(0L);
                monitorexit(this);
                return;
            }
            finally {}
        }
        catch (final IllegalStateException ex) {
            Log.w("AudioStreamImpl", "Error while closing AudioStream.", (Throwable)ex);
            monitorexit(this);
            return;
        }
        monitorexit(this);
    }
    
    public final AudioDeviceInfo getPreferredDevice() {
        return this.a.getPreferredDevice();
    }
    
    public final AudioDeviceInfo getRoutedDevice() {
        return this.a.getRoutedDevice();
    }
    
    public final void removeOnRoutingChangedListener(final AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener) {
        this.a.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener);
    }
    
    public final boolean setPreferredDevice(final AudioDeviceInfo preferredDevice) {
        return this.a.setPreferredDevice(preferredDevice);
    }
}
