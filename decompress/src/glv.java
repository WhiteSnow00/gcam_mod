import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glv implements glk
{
    private final kse a;
    private final krr b;
    private final fwd c;
    private final klj d;
    private final klj e;
    private final jcx f;
    private final boolean g;
    private final int h;
    
    public glv(final kse a, final krq krq, final fwd c, final klj d, final klj e, final jcx f, final cxl cxl) {
        this.a = a;
        this.b = krq.a("PckConv3A");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = cxl.k(cxs.ai);
        this.h = (int)cxl.a(cxs.v).e(3000);
    }
    
    private final boolean b(int n) {
        if (n != 0) {
            if (n != 4) {
                if (n == 2) {
                    n = 1;
                }
                else {
                    n = 0;
                }
            }
            else {
                n = 1;
            }
            final boolean equals = ((hjb)this.d.aQ()).equals(hjb.b);
            return n != 0 && equals;
        }
        throw null;
    }
    
    @Override
    public final fwt a(kwh kwh, kwx a) {
        final kww a2 = kwx.a();
        final boolean booleanValue = (boolean)((kkz)this.c.a).d;
        boolean b = true;
        int c;
        if (booleanValue) {
            c = 1;
        }
        else {
            c = a.c;
        }
        a2.c(c);
        a2.b(a.b);
        a2.e(a.d);
        a2.d(a.a);
        final kwx a3 = a2.a();
        Label_0911: {
            try {
                this.b.b("Acquiring 3A lock.");
                this.a.f("3A");
                final boolean b2 = this.f.a((String)this.e.aQ()).D() && a3.c != 1;
                long n = -1L;
                if (b2) {
                    final int c2 = a3.c;
                    final kvq a4 = kwh.a();
                    niz niz;
                    if (c2 == 3) {
                        this.b.b("Switching AF Mode to AUTO for AF requirement CONVERGED");
                        ((lbf)a4).b = 1;
                        niz = niz.i(kwh.b(((lbf)a4).e()).get());
                    }
                    else if (this.b(c2)) {
                        this.b.b("AF was in implicit manual mode, changing AF to continuous mode and locking immediately.");
                        final kvq a5 = kwh.a();
                        ((lbf)a5).b = 4;
                        niz = niz.i(kwh.e(((lbf)a5).e()).get());
                    }
                    else {
                        niz = nii.a;
                    }
                    if (niz.g()) {
                        n = ((kvx)niz.c()).b;
                    }
                }
                final boolean b3 = b2 && !this.b(a3.c);
                final int b4 = a3.b;
                final boolean b5 = b4 == 3 || b4 == 4;
                final boolean b6 = a3.d == 3;
                if (b3 || b5 || b6) {
                    final krr b7 = this.b;
                    final StringBuilder sb = new StringBuilder(88);
                    sb.append("triggering af and locking ae/awb as needed, afTrigger=");
                    sb.append(b3);
                    sb.append(", lockAe=");
                    sb.append(b5);
                    sb.append(", lockAwb=");
                    sb.append(b6);
                    b7.b(sb.toString());
                    final kww a6 = kwx.a();
                    int c3;
                    if (b3) {
                        c3 = a3.c;
                    }
                    else {
                        c3 = 1;
                    }
                    a6.c(c3);
                    int b8;
                    if (b5) {
                        b8 = a3.b;
                    }
                    else {
                        b8 = 1;
                    }
                    a6.b(b8);
                    int d;
                    if (b6) {
                        d = a3.d;
                    }
                    else {
                        d = 1;
                    }
                    a6.e(d);
                    final int b9 = a3.b;
                    if (b9 != 3) {
                        b = false;
                    }
                    if (b9 == 0) {
                        throw null;
                    }
                    a6.d(b);
                    a = a6.a();
                    final oey c4 = ((kzi)kwh).a.c(a, false);
                    new kvx(-1L, -1L, -1L);
                    kvx kvx;
                    if (this.g && b3 && a3.c == 2) {
                        try {
                            kvx = c4.get(this.h, TimeUnit.MILLISECONDS);
                        }
                        catch (final TimeoutException ex) {
                            final krr b10 = this.b;
                            final int h = this.h;
                            final StringBuilder sb2 = new StringBuilder(87);
                            sb2.append("Timeout of ");
                            sb2.append(h);
                            sb2.append("ms caught when waiting for AF lock. Locking AF again immediately.");
                            b10.b(sb2.toString());
                            final kvq a7 = kwh.a();
                            ((lbf)a7).b = 0;
                            kwh.e(((lbf)a7).e());
                            final kvq a8 = kwh.a();
                            ((lbf)a8).b = 4;
                            kvx = (kvx)kwh.e(((lbf)a8).e()).get();
                        }
                    }
                    else {
                        kvx = c4.get();
                    }
                    n = kvx.b;
                }
                final krr b11 = this.b;
                final StringBuilder sb3 = new StringBuilder(46);
                sb3.append("3A lock acquired at frame ");
                sb3.append(n);
                b11.b(sb3.toString());
                kwh = (kwh)new glx(kwh, n, b2, b5, b6);
                this.a.g();
                return (fwt)kwh;
            }
            catch (final CancellationException ex2) {}
            catch (final ExecutionException ex3) {}
            finally {
                break Label_0911;
            }
            throw new InterruptedException(((Throwable)kwh).getMessage());
        }
        this.a.g();
    }
}
