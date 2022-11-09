import java.util.Collection;
import android.hardware.camera2.CaptureResult;
import java.util.HashSet;
import android.hardware.camera2.CaptureRequest$Key;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lav implements krc
{
    public final ExecutorService a;
    private final lax b;
    private final lar c;
    private oey d;
    private final oey e;
    private oey f;
    private final kxo g;
    private final boolean h;
    private final krr i;
    private final kzv j;
    
    public lav(final kxo g, final lfg lfg, final krr krr, final kwg kwg, final lax b, final lar c) {
        this.d = ofn.f();
        this.e = ofn.f();
        this.f = ofn.f();
        this.a = mcn.h("Sess3AEx");
        this.c = c;
        this.b = b;
        this.g = g;
        this.h = lfg.D();
        this.i = krr.a("SessCtrl3A");
        this.j = new kzv(kwg.k, kwg.l);
    }
    
    private static final boolean h(final Integer n) {
        return n == 4 || n == 3;
    }
    
    private static final boolean i(final lbg lbg, final kvr kvr) {
        return !lbg.b().equals(kvr.b());
    }
    
    private static final boolean j(final lbg lbg, final kvr kvr) {
        return lbg.b && (lbg.a().equals(kvr.a()) && Arrays.equals(lbg.e, ((lbg)kvr).e));
    }
    
    private static final boolean k(final lbg lbg, final kvr kvr) {
        return lbg.c && (lbg.c().equals(kvr.c()) && Arrays.equals(lbg.f, ((lbg)kvr).f));
    }
    
    final lbf a() {
        synchronized (this) {
            return this.c.b();
        }
    }
    
    final oey b(final kwx ex, final boolean b) {
        synchronized (this) {
            final krr i = this.i;
            final String value = String.valueOf(ex);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 31);
            sb.append("Call to trigger 3A with Spec : ");
            sb.append(value);
            i.b(sb.toString());
            try {
                final krc a = this.c.a();
                try {
                    this.e.cancel(true);
                    final boolean b2 = ((kwx)ex).d() && this.h;
                    final int b3 = ((kwx)ex).b;
                    final boolean b4 = b3 == 4 || b3 == 3;
                    int d = ((kwx)ex).d;
                    final boolean b5 = d == 4 || d == 3;
                    final boolean a2 = ((kwx)ex).a;
                    if (b4 || b5 || a2) {
                        final krr j = this.i;
                        final StringBuilder sb2 = new StringBuilder(104);
                        sb2.append("Unlocking 3a, deciding params aeRescan = ");
                        sb2.append(b4);
                        sb2.append(", awbRescan = ");
                        sb2.append(b5);
                        sb2.append(", usePreCaptureMeteringSequence = ");
                        sb2.append(a2);
                        j.b(sb2.toString());
                        this.c(false, b4 || a2, b5, false);
                    }
                    final boolean b6 = ((kwx)ex).b();
                    final boolean c = ((kwx)ex).c();
                    final lbg c2 = this.c.c();
                    final kyh a3 = kyh.a(this.b.a());
                    if (b4 || a2) {
                        a3.d(CaptureRequest.CONTROL_AE_LOCK, false);
                    }
                    if (b5) {
                        a3.d(CaptureRequest.CONTROL_AWB_LOCK, false);
                    }
                    final lap d2 = this.j.d(c2, b2, b6, c);
                    final lap c3 = this.j.c(c2, false, b4, b5);
                    final kyh a4 = kyh.a(a3);
                    Label_0703: {
                        Label_0659: {
                            Label_0627: {
                                if (!b2) {
                                    break Label_0627;
                                }
                            Label_0630_Outer:
                                while (true) {
                                    if (((kwx)ex).c == 2) {
                                        break Label_0609;
                                    }
                                    Label_0606: {
                                        if (!h(c2.b())) {
                                            break Label_0606;
                                        }
                                        this.i.b("For continuous AF mode, unlocking AF and waiting to converge.");
                                        final lax b7 = this.b;
                                        final lap c4 = this.j.c(c2, true, false, false);
                                        final kyh a5 = kyh.a(a3);
                                        final CaptureRequest$Key control_AF_TRIGGER = CaptureRequest.CONTROL_AF_TRIGGER;
                                        try {
                                            a5.d(control_AF_TRIGGER, 2);
                                            a5.g(kwc.c(c4));
                                            b7.h(a5.b());
                                            final kyh a6 = kyh.a(a3);
                                            a6.d(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                                            a6.g(kwc.c(c4));
                                            b7.f(a6.b());
                                            this.a.submit((Callable<Object>)new lau(c4.a)).get();
                                            this.i.b("AF converged");
                                            a4.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                                            d = 1;
                                            while (true) {
                                                if (a2) {
                                                    a4.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                                                    break Label_0659;
                                                }
                                                break Label_0627;
                                                continue Label_0630_Outer;
                                                d = 0;
                                                continue;
                                            }
                                        }
                                        finally {}
                                    }
                                    break;
                                }
                            }
                            if (d == 0) {
                                break Label_0703;
                            }
                        }
                        a4.g(kwc.c(c3));
                        a4.g(kwc.c(d2));
                        this.b.h(a4.b());
                        this.i.b("Trigger request sent.");
                    }
                    a3.g(kwc.c(c3));
                    a3.g(kwc.c(d2));
                    this.b.f(a3.b());
                    final kwx kwx;
                    if (kwx.b == 4 || kwx.d == 4 || a2) {
                        this.i.b("Wait for for AE/AWB to converge.");
                        this.a.submit((Callable<Object>)new lat(c3, 1)).get();
                        this.i.b("AE/AWB converged.");
                    }
                    if (b6 || c) {
                        final kyh a7 = kyh.a(a3);
                        if (b6) {
                            a7.d(CaptureRequest.CONTROL_AE_LOCK, true);
                        }
                        if (c) {
                            a7.d(CaptureRequest.CONTROL_AWB_LOCK, true);
                        }
                        a7.g(kwc.c(d2));
                        this.i.b("Sending the request to lock AE/AWB.");
                        this.b.f(a7.b());
                    }
                    this.c.e(b2 || c2.a, b6 || c2.b, c || c2.c, b);
                    final oey k = odg.i(ofi.k(c3.a, d2.a), emt.f, odx.a);
                    a.close();
                    return k;
                }
                finally {}
                try {
                    a.close();
                }
                finally {
                    final Throwable t;
                    ex.addSuppressed(t);
                }
            }
            catch (final RejectedExecutionException ex) {}
            catch (final InterruptedException ex) {}
            catch (final ExecutionException ex2) {}
            return ofi.m(ex);
        }
    }
    
    final oey c(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        synchronized (this) {
            final krc a = this.c.a();
            try {
                final oey f = this.f;
                final boolean b5 = true;
                f.cancel(true);
                final boolean b6 = b && this.h && b5;
                final lbf d = lbf.d(this.c.b().e());
                if (b2) {
                    d.g = false;
                }
                if (b3) {
                    d.h = false;
                }
                if (b6) {
                    d.f = false;
                }
                final lbg e = d.e();
                final kyh a2 = kyh.a(this.b.a());
                lar.g(a2, e);
                final lap b7 = this.j.b(e, b6, b2, b3);
                a2.g(kwc.c(b7));
                if (b6) {
                    final kyh a3 = kyh.a(a2);
                    a3.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    this.b.h(a3.b());
                }
                this.b.f(a2.b());
                this.c.e(e.a, e.b, e.c, b4);
                final oey a4 = b7.a;
                this.f = a4;
                a.close();
                return a4;
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
    
    @Override
    public final void close() {
        this.d.cancel(true);
        this.e.cancel(true);
        this.f.cancel(true);
    }
    
    final oey d(final kvr kvr, final boolean b) {
        synchronized (this) {
            final krc a = this.c.a();
            try {
                this.d.cancel(true);
                final kvr a2 = this.g.a(kvr, this.c.c());
                final lbg e = this.c.b().e();
                final boolean j = j(e, a2);
                final boolean k = k(e, a2);
                final boolean i = i(e, a2);
                final lbf c = lbf.c(a2);
                final boolean booleanValue = e.a;
                boolean b2 = false;
                if (booleanValue && !i) {
                    b2 = true;
                }
                c.f = b2;
                c.g = j;
                c.h = k;
                final lbg e2 = c.e();
                final kyh a3 = kyh.a(this.b.a());
                lar.g(a3, e2);
                final lap b3 = this.j.b(e2, i, j ^ true, true ^ k);
                a3.g(kwc.c(b3));
                this.b.f(a3.b());
                if (i) {
                    a3.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    lar.g(a3, e2);
                    this.b.h(a3.b());
                }
                this.c.d(e2, b);
                final oey a4 = b3.a;
                this.d = a4;
                a.close();
                return a4;
            }
            finally {
                try {
                    a.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)kvr).addSuppressed(t);
                }
            }
        }
    }
    
    final oey e(final kvr kvr) {
        synchronized (this) {
            final krc a = this.c.a();
            try {
                final boolean h = this.h;
                final kvr a2 = this.g.a(kvr, this.c.c());
                final lbg e = this.c.b().e();
                final boolean b = h || (e.a && !i(e, a2));
                final boolean j = j(e, a2);
                final boolean k = k(e, a2);
                final lbf c = lbf.c(a2);
                c.f = b;
                c.g = j;
                c.h = k;
                final lbg e2 = c.e();
                final kyh a3 = kyh.a(this.b.a());
                final lap d = this.j.d(a2, h, false, false);
                a3.g(kwc.c(d));
                lar.g(a3, e2);
                if (h) {
                    final kyh a4 = kyh.a(a3);
                    a4.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.b.h(a4.b());
                }
                this.b.f(a3.b());
                this.c.d(e2, false);
                final oey a5 = d.a;
                a.close();
                return a5;
            }
            finally {
                try {
                    a.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)kvr).addSuppressed(t);
                }
            }
        }
    }
    
    final void f(final kvr kvr) {
        synchronized (this) {
            this.g(kvr);
        }
    }
    
    final void g(kvr a) {
        monitorenter(this);
        try {
            final krc a2 = this.c.a();
            try {
                this.d.cancel(true);
                a = (RejectedExecutionException)this.g.a((kvr)a, this.c.c());
                final lbg e = this.c.b().e();
                final lbf c = lbf.c((kvr)a);
                c.f = e.a;
                c.g = e.b;
                c.h = e.c;
                final lbg e2 = c.e();
                final kyh a3 = kyh.a(this.b.a());
                lar.g(a3, e2);
                final boolean booleanValue = e2.a;
                final boolean booleanValue2 = e.a;
                int n = 0;
                boolean b = booleanValue;
                if (booleanValue2) {
                    b = booleanValue;
                    if (((kvr)a).b().equals(e.b())) {
                        b = false;
                    }
                }
                if (b && h(e2.b())) {
                    n = 1;
                }
                a3.d(CaptureRequest.CONTROL_AF_TRIGGER, n);
                final kzv j = this.j;
                final boolean booleanValue3 = e.a;
                final boolean booleanValue4 = e.b;
                final boolean booleanValue5 = e.c;
                final HashSet set = new HashSet();
                set.add(j.a(CaptureResult.CONTROL_AF_MODE, noi.H(e2.b())));
                set.add(j.a(CaptureResult.CONTROL_AE_MODE, noi.H(e2.a())));
                set.add(j.a(CaptureResult.CONTROL_AWB_MODE, noi.H(e2.c())));
                set.addAll(j.e(e2, booleanValue3, booleanValue4, booleanValue5));
                final kxc c2 = kwc.c(new lap(noi.F(set)));
                a3.g(c2);
                final kzv i = this.j;
                final lap lap = new lap(noi.I(i.a(CaptureResult.CONTROL_AF_MODE, noi.H(e2.b())), i.a(CaptureResult.CONTROL_AF_TRIGGER, noi.H(1))));
                if (n != 0) {
                    a3.g(kwc.c(lap));
                }
                this.b.f(a3.b());
                Label_0501: {
                    if (n == 0) {
                        break Label_0501;
                    }
                    try {
                        this.a.submit((Callable<Object>)new lat(lap)).get();
                        break Label_0501;
                    }
                    catch (final RejectedExecutionException a) {}
                    catch (final InterruptedException a) {}
                    catch (final ExecutionException ex) {}
                    ofi.m(a);
                    a2.close();
                    monitorexit(this);
                    return;
                }
                if (b && !h(((kvr)a).b())) {
                    final kyh a4 = kyh.a(a3);
                    a4.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    a4.g(c2);
                    this.b.h(a4.b());
                }
                this.c.d(e2, true);
            }
            finally {
                try {
                    a2.close();
                }
                finally {
                    final Throwable t;
                    a.addSuppressed(t);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
