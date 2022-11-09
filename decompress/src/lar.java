import android.hardware.camera2.CaptureRequest;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lar
{
    public lbg a;
    private final ReentrantLock b;
    private final kyv c;
    
    public lar(final kyv c) {
        this.b = new ReentrantLock();
        this.a = c.a().e();
        this.c = c;
    }
    
    public static final Set f(final lbg lbg) {
        return noi.M(kxc.p(CaptureRequest.CONTROL_MODE, lbg.d()), kxc.p(CaptureRequest.CONTROL_AF_MODE, lbg.b()), kxc.p(CaptureRequest.CONTROL_AE_MODE, lbg.a()), kxc.p(CaptureRequest.CONTROL_AWB_MODE, lbg.c()), kxc.p(CaptureRequest.FLASH_MODE, lbg.e()), kxc.p(CaptureRequest.CONTROL_AE_LOCK, lbg.b), kxc.p(CaptureRequest.CONTROL_AWB_LOCK, lbg.c), kxc.p(CaptureRequest.CONTROL_AF_REGIONS, lbg.d), kxc.p(CaptureRequest.CONTROL_AE_REGIONS, lbg.e), kxc.p(CaptureRequest.CONTROL_AWB_REGIONS, lbg.f));
    }
    
    static final void g(final kyh kyh, final lbg lbg) {
        kyh.e(f(lbg));
    }
    
    final krc a() {
        this.b.lock();
        return new laq(this.b);
    }
    
    final lbf b() {
        final krc a = this.a();
        try {
            final lbf c = lbf.c(this.a);
            final lbg a2 = this.a;
            c.f = a2.a;
            c.g = a2.b;
            c.h = a2.c;
            a.close();
            return c;
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                t.addSuppressed(t2);
            }
        }
    }
    
    final lbg c() {
        final krc a = this.a();
        try {
            final lbg a2 = this.a;
            a.close();
            return a2;
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                t.addSuppressed(t2);
            }
        }
    }
    
    final void d(final lbg a, final boolean b) {
        final krc a2 = this.a();
        try {
            this.a = a;
            if (b) {
                this.c.d(a);
            }
            a2.close();
        }
        finally {
            try {
                a2.close();
            }
            finally {
                final Throwable t;
                ((Throwable)a).addSuppressed(t);
            }
        }
    }
    
    final void e(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final krc a = this.a();
        try {
            final lbf d = lbf.d(this.a);
            final Boolean value = b;
            d.f = value;
            final Boolean value2 = b2;
            d.g = value2;
            final Boolean value3 = b3;
            d.h = value3;
            this.a = d.e();
            if (b4) {
                final kyv c = this.c;
                final lbf a2 = c.a();
                a2.f = value;
                a2.g = value2;
                a2.h = value3;
                c.d(a2.e());
            }
            a.close();
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                t.addSuppressed(t2);
            }
        }
    }
}
