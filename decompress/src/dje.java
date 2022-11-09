import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dje implements jfy, krc
{
    private static final nsd c;
    public final Object a;
    public long b;
    private final klj d;
    private int e;
    private djb f;
    
    static {
        c = nsd.g("com/google/android/apps/camera/facebeautification/live/LiveFaceBeautificationFullEffect");
    }
    
    public dje(final Executor executor, final klj d) {
        this.a = new Object();
        this.b = 0L;
        this.e = 0;
        this.d = d;
        executor.execute(new djd(this));
    }
    
    @Override
    public final jfz a() {
        return jfz.a;
    }
    
    @Override
    public final boolean b() {
        return this.d.aQ() != hjc.a;
    }
    
    @Override
    public final void c(kvs d, kwz d2, final kvs kvs) {
        final ljm c = d.c();
        if (c == null) {
            ++this.e;
            dje.c.c().E(794).p("Using previous faceMetadata: metadata missed for %d consecutive frames.", this.e);
        }
        else {
            this.e = 0;
            this.f = djb.a(c);
        }
        d = (kvs)d.d(d2);
        try {
            d2 = (kwz)kvs.d(d2);
            try {
                d.getClass();
                d2.getClass();
                final int e = this.e;
                final djb f = this.f;
                if (f != null && e <= 3) {
                    if (!f.a.isEmpty()) {
                        synchronized (this.a) {
                            if (this.b != 0L) {
                                final HardwareBuffer f2 = ((lju)d).f();
                                try {
                                    final long b = this.b;
                                    f2.getClass();
                                    f2.getClass();
                                    GpuRetoucherNative.process(b, f2, true, f2, true, ((lju)d).c(), ((lju)d).b(), f.a.toArray(), f.b, ((hjc)this.d.aQ()).e);
                                    if (f2 != null) {
                                        f2.close();
                                    }
                                }
                                finally {
                                    if (f2 != null) {
                                        try {
                                            f2.close();
                                        }
                                        finally {
                                            final Throwable t;
                                            final Throwable t2;
                                            t.addSuppressed(t2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (d2 != null) {
                    ((krc)d2).close();
                }
                if (d != null) {
                    d.close();
                }
            }
            finally {
                if (d2 != null) {
                    try {
                        ((krc)d2).close();
                    }
                    finally {
                        final Throwable t3;
                        ((Throwable)kvs).addSuppressed(t3);
                    }
                }
            }
        }
        finally {
            if (d != null) {
                try {
                    d.close();
                }
                finally {
                    final Throwable t4;
                    ((Throwable)d2).addSuppressed(t4);
                }
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.a) {
            final long b = this.b;
            if (b == 0L) {
                return;
            }
            GpuRetoucherNative.releaseRetoucher(b);
            this.b = 0L;
        }
    }
}
