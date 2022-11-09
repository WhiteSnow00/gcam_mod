import java.util.Arrays;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyv implements krc
{
    public lbg a;
    public final laj b;
    public final kxo c;
    
    public kyv(final kxo c, final lfg lfg, final laj b, final krr krr) {
        this.b = b;
        final List q = lfg.q();
        final int size = q.size();
        int n = 1;
        final Integer value = 1;
        njo.d(size > 0);
        int intValue = q.get(0);
        if (q.contains(4)) {
            intValue = 4;
        }
        else if (q.contains(value)) {
            intValue = 1;
        }
        final List p4 = lfg.p();
        njo.d(p4.size() > 0);
        int intValue2 = p4.get(0);
        if (p4.contains(value)) {
            intValue2 = 1;
        }
        final List r = lfg.r();
        njo.d(r.size() > 0);
        final int intValue3 = p4.get(0);
        if (!r.contains(value)) {
            n = intValue3;
        }
        final MeteringRectangle[] a = lbh.a;
        final MeteringRectangle[] a2 = lbh.a;
        final MeteringRectangle[] a3 = lbh.a;
        final Boolean value2 = false;
        this.a = new lbf(value, intValue, intValue2, n, 0, a, a2, a3, value2, value2, value2).e();
        krr.a("fscrtl3A");
        this.c = c;
    }
    
    final lbf a() {
        synchronized (this) {
            return lbf.d(this.a);
        }
    }
    
    final void b(final kwx kwx) {
        boolean d = kwx.d();
        final boolean b = kwx.b();
        final boolean c = kwx.c();
        final boolean b2 = false;
        final boolean b3 = false;
        try {
            final lag a = this.b.a();
            try {
                a.c(kwx, true);
                a.close();
                synchronized (this) {
                    final lbf c2 = lbf.c(this.a);
                    d = (d || this.a.a);
                    c2.f = d;
                    d = (b || this.a.b);
                    c2.g = d;
                    d = (c || this.a.c || b3);
                    c2.h = d;
                    this.d(c2.e());
                }
            }
            finally {
                try {
                    a.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)kwx).addSuppressed(t);
                }
            }
        }
        finally {
            synchronized (this) {
                final lbf c3 = lbf.c(this.a);
                c3.f = (d || this.a.a);
                c3.g = (b || this.a.b);
                c3.h = (c || this.a.c || b2);
                this.d(c3.e());
            }
        }
    }
    
    final void c(kvr a, final kwx kwx) {
        boolean d = kwx.d();
        final boolean b = kwx.b();
        final boolean c = kwx.c();
        synchronized (this) {
            a = this.c.a((kvr)a, this.a);
            monitorexit(this);
            final boolean b2 = false;
            final boolean b3 = false;
            try {
                final lag a2 = this.b.a();
                try {
                    synchronized (this) {
                        a2.e((kvr)a, true);
                        monitorexit(this);
                        a2.c(kwx, true);
                        a2.close();
                        synchronized (this) {
                            final lbf c2 = lbf.c((kvr)a);
                            d = (d || this.a.a);
                            c2.f = d;
                            d = (b || this.a.b);
                            c2.g = d;
                            d = (c || this.a.c || b3);
                            c2.h = d;
                            this.d(c2.e());
                        }
                    }
                }
                finally {
                    try {
                        a2.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)kwx).addSuppressed(t);
                    }
                }
            }
            finally {
                synchronized (this) {
                    final lbf c3 = lbf.c((kvr)a);
                    c3.f = (d || this.a.a);
                    c3.g = (b || this.a.b);
                    c3.h = (c || this.a.c || b2);
                    this.d(c3.e());
                }
            }
        }
    }
    
    @Override
    public final void close() {
    }
    
    final void d(final lbg a) {
        synchronized (this) {
            this.a = a;
        }
    }
    
    public final boolean e(final lbg lbg, final kvr kvr) {
        synchronized (this) {
            return lbg.b && (lbg.a().equals(kvr.a()) && Arrays.equals(lbg.e, ((lbg)kvr).e));
        }
    }
    
    public final boolean f(final lbg lbg, final kvr kvr) {
        synchronized (this) {
            return lbg.a && (lbg.b().equals(kvr.b()) && Arrays.equals(lbg.d, ((lbg)kvr).d));
        }
    }
    
    public final boolean g(final lbg lbg, final kvr kvr) {
        synchronized (this) {
            return lbg.c && (lbg.c().equals(kvr.c()) && Arrays.equals(lbg.f, ((lbg)kvr).f));
        }
    }
}
