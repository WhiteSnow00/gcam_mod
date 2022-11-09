import android.media.MediaCrypto;
import android.media.MediaCodec$Callback;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import android.media.MediaCodec$BufferInfo;
import android.util.Pair;
import android.media.Image;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.Set;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;
import android.media.MediaCodec;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

final class ftt
{
    public final Deque a;
    public final Deque b;
    public final MediaCodec c;
    public final Handler d;
    public final krr e;
    public final Deque f;
    public boolean g;
    public final AtomicBoolean h;
    final /* synthetic */ ftu i;
    private Surface j;
    private mcf k;
    private boolean l;
    private boolean m;
    private lyo n;
    private mao o;
    private final Set p;
    private long q;
    private final float[] r;
    private final float[] s;
    private final float[] t;
    private final float[] u;
    private final kra v;
    
    public ftt(final ftu i, final MediaCodec c, final Handler d, final kra v) {
        this.i = i;
        this.a = new ArrayDeque();
        this.b = new ArrayDeque();
        this.f = new ArrayDeque();
        this.g = false;
        this.l = false;
        this.m = false;
        this.h = new AtomicBoolean(false);
        this.p = new HashSet();
        final float[] array2;
        final float[] array = array2 = new float[16];
        array2[0] = 1.0f;
        array2[2] = (array2[1] = 0.0f);
        array2[4] = (array2[3] = 0.0f);
        array2[5] = -1.0f;
        array2[7] = (array2[6] = 0.0f);
        array2[9] = (array2[8] = 0.0f);
        array2[10] = 1.0f;
        array2[12] = (array2[11] = 0.0f);
        array2[13] = 1.0f;
        array2[14] = 0.0f;
        array2[15] = 1.0f;
        this.r = array;
        final float[] array3;
        final float[] s = array3 = new float[16];
        array3[0] = 1.0f;
        array3[2] = (array3[1] = 0.0f);
        array3[4] = (array3[3] = 0.0f);
        array3[5] = 1.0f;
        array3[7] = (array3[6] = 0.0f);
        array3[9] = (array3[8] = 0.0f);
        array3[10] = 1.0f;
        array3[12] = (array3[11] = 0.0f);
        array3[14] = (array3[13] = 0.0f);
        array3[15] = 1.0f;
        this.s = s;
        final float[] array4;
        final float[] t = array4 = new float[16];
        array4[0] = -1.0f;
        array4[2] = (array4[1] = 0.0f);
        array4[4] = (array4[3] = 0.0f);
        array4[5] = -1.0f;
        array4[7] = (array4[6] = 0.0f);
        array4[9] = (array4[8] = 0.0f);
        array4[10] = 1.0f;
        array4[11] = 0.0f;
        array4[13] = (array4[12] = 1.0f);
        array4[14] = 0.0f;
        array4[15] = 1.0f;
        this.t = t;
        this.c = c;
        this.d = d;
        final int andIncrement = i.a.getAndIncrement();
        final StringBuilder sb = new StringBuilder(18);
        sb.append("codec ");
        sb.append(andIncrement);
        sb.append(" ");
        final krv j = krv.j(sb.toString(), i.f);
        this.e = j;
        this.v = v;
        if (i.k.c(i.c.l())) {
            float[] u;
            if (hdz.d(v)) {
                u = s;
            }
            else {
                u = t;
            }
            this.u = u;
        }
        else {
            this.u = array;
        }
        j.b("created");
    }
    
    private final void e() {
        monitorenter(this);
        try {
            while (!this.f.isEmpty()) {
                final lju lju = this.f.removeFirst();
                final krr e = this.e;
                final long d = lju.d();
                final StringBuilder sb = new StringBuilder(55);
                sb.append("Closing image at ");
                sb.append(d);
                sb.append(" after codec error");
                e.b(sb.toString());
                lju.close();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void f() {
        monitorenter(this);
        try {
            njo.o(this.m ^ true);
            final lyo n = this.n;
            while (!this.l && !this.f.isEmpty() && n != null && this.k != null) {
                final lju lju = this.f.removeFirst();
                this.j(lju);
                this.q = lju.d();
                lju.close();
            }
            if (!this.l && this.f.isEmpty() && this.g && n != null) {
                if (this.i.h) {
                    this.d(this.q);
                }
                else {
                    this.k();
                }
                this.l = true;
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void g() {
        monitorenter(this);
        try {
            njo.o(this.m ^ true);
            while (!this.l && !this.a.isEmpty() && !this.f.isEmpty() && this.k != null) {
                final int intValue = this.a.removeFirst();
                final lju lju = this.f.removeFirst();
                final Image inputImage = this.c.getInputImage(intValue);
                final long convert = TimeUnit.MICROSECONDS.convert(lju.d(), TimeUnit.NANOSECONDS);
                final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                final let let = new let(inputImage);
                final ftu i = this.i;
                final kra v = this.v;
                if (i.k.c(i.c.l())) {
                    if (lju.c() == let.b && lju.b() == let.c) {
                        lju.getClass();
                        njo.d(lju.a() == 35);
                        System.currentTimeMillis();
                        FrameUtilNative.mirrorYUV420888(lju.h().get(0).getBuffer(), lju.h().get(0).getRowStride(), lju.h().get(1).getBuffer(), lju.h().get(1).getRowStride(), lju.h().get(2).getBuffer(), lju.h().get(2).getRowStride(), let.k().get(0).getBuffer(), let.k().get(0).getRowStride(), let.k().get(1).getBuffer(), let.k().get(1).getRowStride(), let.k().get(2).getBuffer(), let.k().get(2).getRowStride(), lju.c(), lju.b(), hdz.d(v));
                        System.currentTimeMillis();
                    }
                    else {
                        i.e.a(lju, let);
                        hdz.e(let, v);
                    }
                }
                else {
                    i.e.a(lju, let);
                }
                final long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                final krr e = this.e;
                final long convert2 = TimeUnit.MILLISECONDS.convert(elapsedRealtimeNanos2 - elapsedRealtimeNanos, TimeUnit.NANOSECONDS);
                final StringBuilder sb = new StringBuilder(46);
                sb.append("frame transform done in ");
                sb.append(convert2);
                sb.append("ms");
                e.b(sb.toString());
                lju.close();
                this.c.queueInputBuffer(intValue, 0, this.i.i, convert, 0);
            }
            if (!this.a.isEmpty() && this.f.isEmpty() && this.g && !this.l) {
                this.c.queueInputBuffer((int)this.a.removeFirst(), 0, 0, 0L, 4);
                this.l = true;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void h() {
        synchronized (this) {
            if (this.m) {
                this.e();
                return;
            }
            if (this.i.g) {
                this.f();
                return;
            }
            this.g();
        }
    }
    
    private final void i() {
        monitorenter(this);
        try {
            final boolean m = this.m;
            boolean b = false;
            if (!m) {
                while (!this.b.isEmpty()) {
                    final mcf k = this.k;
                    final Pair pair = this.b.removeFirst();
                    final Integer n = (Integer)pair.first;
                    final MediaCodec$BufferInfo mediaCodec$BufferInfo = (MediaCodec$BufferInfo)pair.second;
                    if ((mediaCodec$BufferInfo.flags & 0x4) == 0x0 && (mediaCodec$BufferInfo.flags & 0x2) == 0x0) {
                        if (k != null) {
                            if (this.i.h) {
                                if (!this.p.contains(mediaCodec$BufferInfo.presentationTimeUs)) {
                                    ftu.c(k, mediaCodec$BufferInfo, this.c.getOutputBuffer((int)n));
                                    this.p.add(mediaCodec$BufferInfo.presentationTimeUs);
                                }
                            }
                            else {
                                ftu.c(k, mediaCodec$BufferInfo, this.c.getOutputBuffer((int)n));
                            }
                        }
                        else {
                            this.e.d("Submitting to null muxer track; was it closed already without an error?");
                        }
                    }
                    this.c.releaseOutputBuffer((int)n, false);
                    if ((mediaCodec$BufferInfo.flags & 0x4) != 0x0) {
                        final mao o = this.o;
                        if (o != null) {
                            o.close();
                            this.o = null;
                        }
                        final lyo n2 = this.n;
                        if (n2 != null) {
                            n2.close();
                            this.n = null;
                            this.j = null;
                        }
                        final Surface j = this.j;
                        if (j != null) {
                            j.release();
                            this.j = null;
                        }
                        this.e();
                        this.c.release();
                        this.i.b.decrementAndGet();
                        final krr e = this.e;
                        final int value = this.i.b.get();
                        final StringBuilder sb = new StringBuilder(59);
                        sb.append("Released codec (success); current active count: ");
                        sb.append(value);
                        e.b(sb.toString());
                        if (k != null) {
                            k.close();
                            this.k = null;
                        }
                        if (this.b.isEmpty()) {
                            continue;
                        }
                        this.e.d("Recevied EOS but output buffers still present?");
                        this.b.clear();
                    }
                }
                monitorexit(this);
                return;
            }
            if (this.k == null) {
                b = true;
            }
            njo.o(b);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void j(lju f) {
        synchronized (this) {
            final lyo n = this.n;
            if (n == null) {
                return;
            }
            final long d = f.d();
            f = (lju)f.f();
            Label_0173: {
                if (f == null) {
                    break Label_0173;
                }
                try {
                    final EGLImage eglImage = new EGLImage((HardwareBuffer)f);
                    try {
                        final lzn b = lzn.b(this.i.j, eglImage);
                        try {
                            n.i(ftm.a, new ftl(d));
                            final mao o = this.o;
                            if (o != null) {
                                o.d(b, n, this.u);
                            }
                            lza.c(this.i.j);
                            b.close();
                            eglImage.close();
                            ((HardwareBuffer)f).close();
                            return;
                        }
                        finally {
                            try {
                                b.close();
                            }
                            finally {
                                final Throwable t;
                                final Throwable t2;
                                t.addSuppressed(t2);
                            }
                        }
                    }
                    finally {
                        try {
                            eglImage.close();
                        }
                        finally {
                            final Throwable t3;
                            final Throwable t4;
                            t3.addSuppressed(t4);
                        }
                    }
                    this.e.h("Attempting to encode image with no hardware buffer content. Skipping.");
                }
                finally {
                    if (f != null) {
                        try {
                            ((HardwareBuffer)f).close();
                        }
                        finally {
                            final Throwable t5;
                            final Throwable t6;
                            t5.addSuppressed(t6);
                        }
                    }
                }
            }
        }
    }
    
    private final void k() {
        synchronized (this) {
            this.i.j.execute(new ftn(this));
        }
    }
    
    public final frl a(final lup k) {
        synchronized (this) {
            njo.p(this.k == null, "Trying to add track twice");
            this.c.setCallback((MediaCodec$Callback)new ftp(this, k), this.d);
            final ftu i = this.i;
            if (i.g) {
                i.d.setInteger("color-format", 2130708361);
                this.i.d.setInteger("color-range", 2);
                this.c.configure(this.i.d, (Surface)null, (MediaCrypto)null, 1);
                final Surface inputSurface = this.c.createInputSurface();
                this.n = lyo.c(this.i.j, new mav(inputSurface), lvl.d(this.i.d.getInteger("width"), this.i.d.getInteger("height")));
                this.o = mao.a(this.i.j);
                this.j = inputSurface;
            }
            else {
                this.c.configure(i.d, (Surface)null, (MediaCrypto)null, 1);
            }
            this.k = k;
            this.c.start();
            return new fts(this);
        }
    }
    
    public final void b(final Exception ex) {
        this.e.e("Error while encoding track", ex);
        synchronized (this) {
            final mcf k = this.k;
            if (k != null) {
                k.close();
                this.k = null;
                this.m = true;
            }
            monitorexit(this);
            this.e();
            this.c.release();
            this.i.b.decrementAndGet();
            final krr e = this.e;
            final int value = this.i.b.get();
            final StringBuilder sb = new StringBuilder(62);
            sb.append("Released codec due to error; current active count: ");
            sb.append(value);
            e.b(sb.toString());
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            try {
                this.h();
                this.i();
                monitorexit(this);
                return;
            }
            finally {}
        }
        catch (final IllegalStateException ex) {
            this.b(ex);
            monitorexit(this);
            return;
        }
        monitorexit(this);
    }
    
    public final void d(final long n) {
        synchronized (this) {
            final lyo n2 = this.n;
            if (n2 == null) {
                return;
            }
            if (!this.h.get()) {
                n2.i(ftm.c, new ftl(n, 2));
                lza.c(this.i.j);
                this.d.postDelayed((Runnable)new fto(this, n), 10L);
                return;
            }
            this.k();
        }
    }
}
