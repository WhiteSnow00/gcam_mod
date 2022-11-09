import android.media.AudioDeviceInfo;
import android.util.Log;
import android.media.AudioTimestamp;
import java.nio.ByteBuffer;
import android.os.Handler;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioFormat;
import android.os.SystemClock;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mba implements max
{
    private final max a;
    private final ExecutorService b;
    private final int c;
    private final long d;
    private long e;
    private long f;
    private volatile Future g;
    private volatile boolean h;
    
    public mba(final max a, final ExecutorService b) {
        this.e = 0L;
        this.f = 0L;
        this.g = null;
        this.h = false;
        this.a = a;
        this.b = b;
        this.c = mbb.a(a.a()) * Math.max(1, a.a().getChannelCount());
        this.d = 1000000000L / a.a().getSampleRate();
    }
    
    private final long e() {
        switch (((may)this.a).b) {
            default: {
                return SystemClock.elapsedRealtimeNanos();
            }
            case 0: {
                return System.nanoTime();
            }
        }
    }
    
    private final void f() {
        synchronized (this) {
            if (this.h) {
                ofi.v(this.g);
            }
        }
    }
    
    @Override
    public final AudioFormat a() {
        throw null;
    }
    
    public final void addOnRoutingChangedListener(final AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener, final Handler handler) {
        this.a.addOnRoutingChangedListener(audioRouting$OnRoutingChangedListener, handler);
    }
    
    @Override
    public final maw b(final ByteBuffer byteBuffer, final int n) {
        monitorenter(this);
        try {
            if (!this.h) {
                monitorexit(this);
                return null;
            }
            if (this.g.isDone()) {
                maw b;
                do {
                    b = this.a.b(byteBuffer, n);
                    if (b == null) {
                        monitorexit(this);
                        return null;
                    }
                } while (b.c < this.e);
                monitorexit(this);
                return b;
            }
            long e = this.e;
            if (e == 0L) {
                e = this.e();
                this.e = e;
            }
            if (e > this.e()) {
                monitorexit(this);
                return null;
            }
            final AudioTimestamp audioTimestamp = new AudioTimestamp();
            final int n2 = n / this.c;
            audioTimestamp.framePosition = this.f;
            audioTimestamp.nanoTime = this.e;
            final maw a = maw.a(byteBuffer, n, this.e);
            final long n3 = n2;
            this.f += n3;
            final long e2 = this.e;
            final long d = this.d;
            Long.signum(n3);
            this.e = e2 + n3 * d;
            byteBuffer.rewind();
            byteBuffer.put(new byte[n]);
            monitorexit(this);
            return a;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            if (this.h) {
                Log.w("SSAudioStream", "AudioStream already started.");
                return;
            }
            this.h = true;
            this.g = this.b.submit(new maz(this.a));
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.h) {
                this.d();
            }
            this.a.close();
        }
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            if (!this.h) {
                Log.w("SSAudioStream", "Trying to stop an un-started AudioStream.");
                return;
            }
            this.f();
            this.a.d();
            this.h = false;
            this.g = null;
            this.e = 0L;
            this.f = 0L;
        }
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
