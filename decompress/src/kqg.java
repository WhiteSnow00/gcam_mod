import android.media.MediaCodec$BufferInfo;
import android.media.MediaFormat;
import java.util.concurrent.Callable;
import android.media.MediaCodec;
import android.util.Log;
import android.media.MediaRecorder$OnErrorListener;
import android.view.Surface;
import java.io.File;
import java.util.concurrent.Future;
import java.io.FileDescriptor;
import android.location.Location;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqg implements kof
{
    public final Object a;
    public final kpz b;
    public koh c;
    public int d;
    private final Location e;
    private final FileDescriptor f;
    private final ofa g;
    private final int h;
    private final int i;
    
    public kqg(final kqf kqf) {
        this.a = new Object();
        this.g = kqf.a;
        final oey i = kqf.i;
        FileDescriptor f;
        if (i != null) {
            f = (FileDescriptor)ofi.v(i);
        }
        else {
            f = null;
        }
        this.f = f;
        this.h = kqf.h;
        this.e = kqf.j;
        final kpz b = kqf.b;
        this.b = b;
        final int m = kqf.m;
        this.i = m;
        b.f();
        final niz h = niz.h(kqf.k);
        final knc e = kqf.e;
        final kmz d = kqf.d;
        final niz h2 = niz.h(f);
        final niz h3 = niz.h(null);
        final niz h4 = niz.h(kqf.j);
        final int h5 = kqf.h;
        final int f2 = kqf.f;
        final long g = kqf.g;
        b.f();
        Label_0685: {
            if (h2.g()) {
                h2.c();
                b.v((FileDescriptor)h2.c());
            }
            else {
                if (!h3.g()) {
                    break Label_0685;
                }
                h3.c();
                b.w(((File)h3.c()).getAbsolutePath());
            }
            if (h.g()) {
                h.c();
                b.n((Surface)h.c());
            }
            if (d != null) {
                if (m == 0) {
                    throw null;
                }
                int n;
                if (m != 2) {
                    n = 5;
                }
                else {
                    n = 1;
                }
                b.l(n);
            }
            b.E();
            b.x(e.a.d);
            b.y(e.d);
            if (e.e != -1 && e.f != -1) {
                jlm.d(b.a(), e.e, e.f);
            }
            String.valueOf(String.valueOf(e.b)).length();
            b.B(e.b.c().a, e.b.c().b);
            e.b();
            b.z(e.b());
            e.c();
            b.A(e.c());
            e.a();
            b.m(e.a());
            if (d != null) {
                b.j(d.b);
                b.h(d.e);
                b.k(d.c);
                String.valueOf(String.valueOf(d.a)).length();
                b.i(d.a.g);
            }
            if (h4.g()) {
                h4.c();
                b.o((float)((Location)h4.c()).getLatitude(), (float)((Location)h4.c()).getLongitude());
            }
            b.u(h5);
            if (f2 > 0) {
                b.p(f2);
            }
            if (g > 0L) {
                b.q(g);
            }
            try {
                b.d();
                b.s((MediaRecorder$OnErrorListener)new kqe(kqf));
                final koh l = kqf.l;
                if (l != null) {
                    this.c = l;
                }
                this.d = 1;
                return;
            }
            catch (final kpx kpx) {
                final String value = String.valueOf(kpx);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 58);
                sb.append("immediateFailedFuture: MediaRecorder.prepare() exception: ");
                sb.append(value);
                Log.e("MedRecPrep", sb.toString());
                throw kpx;
            }
        }
        Log.e("MedRecPrep", "Either output file path or descriptor should present");
        throw new IllegalArgumentException("Either output file path or descriptor should present");
    }
    
    @Override
    public final int a() {
        return this.h;
    }
    
    @Override
    public final MediaCodec b() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }
    
    @Override
    public final niz c() {
        synchronized (this.a) {
            njo.o(this.d != 3);
            return niz.h(this.b.b());
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.a) {
            if (this.d == 3) {
                Log.w("VidRecMedRec", "Already stopped");
                return;
            }
            try {
                this.b.D();
                final koh c = this.c;
                if (c != null) {
                    c.c();
                }
            }
            catch (final kpx kpx) {
                Log.e("VidRecMedRec", "Fails to stop mediarecorder. Perhaps the recording is too short");
            }
            this.d = 3;
        }
    }
    
    @Override
    public final niz d() {
        return niz.h(this.e);
    }
    
    @Override
    public final niz e() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }
    
    @Override
    public final niz f() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }
    
    @Override
    public final oey g() {
        return this.g.b(new kqa(this, 1));
    }
    
    @Override
    public final oey h() {
        return this.g.b(new kqa(this));
    }
    
    @Override
    public final oey i() {
        throw new UnsupportedOperationException("fast shutdown is not supported, please use VideoRecorderMediaCodec");
    }
    
    @Override
    public final oey j(final kob kob) {
        return this.g.b(new kqc(this, kob));
    }
    
    @Override
    public final oey k() {
        return this.g.b(new kqd(this));
    }
    
    @Override
    public final void l(final MediaFormat mediaFormat) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }
    
    @Override
    public final void m(final FileDescriptor fileDescriptor) {
        synchronized (this.a) {
            final int d = this.d;
            boolean b = true;
            if (d != 2) {
                if (d != 4) {
                    b = false;
                }
            }
            njo.o(b);
            try {
                this.b.r(fileDescriptor);
            }
            catch (final kpx kpx) {
                Log.e("VidRecMedRec", "Fail to set next file descriptor.");
                throw new IllegalStateException("Fail to set next file descriptor.", kpx);
            }
        }
    }
    
    @Override
    public final void n(final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }
    
    @Override
    public final niz o() {
        return nii.a;
    }
    
    @Override
    public final void p(final float n) {
        throw new UnsupportedOperationException("changeBitrate is not supported, please use VideoRecorderMediaCodec");
    }
}
