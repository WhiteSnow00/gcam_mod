import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcy implements hze
{
    private static final nsd c;
    public final hzg a;
    public final kjk b;
    private final kwd d;
    private final fxu e;
    private final kse f;
    private final hzj g;
    private final AtomicBoolean h;
    private final lfg i;
    private final liz j;
    private final gnb k;
    private final AtomicBoolean l;
    private final cxl m;
    
    static {
        c = nsd.g("com/google/android/apps/camera/microvideo/LongShotTorchController");
    }
    
    public fcy(final Executor executor, final kwd d, final fxu e, final hzg a, final hzf hzf, final AtomicBoolean h, final lfg i, final liz j, final gnb k, final AtomicBoolean l, final kse f, final cxl m) {
        this.b = new kjk();
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        final hzi a2 = hzj.a();
        a2.c(executor);
        a2.a = "LongShotTorch";
        a2.f(hzf);
        a2.d(new fcw(h, 1));
        a2.e(new fcw(h));
        this.g = a2.a();
    }
    
    final fcx a(hhy ex, final boolean b) {
        if (((hhy)ex).i() == hio.o && b && !this.h.get() && this.e.l() == lfu.b) {
            this.f.f("LongShotTorchController#turnOnTorch");
            try {
                if (gnb.b() && this.m.k(cxz.j) && this.e.l().equals(lfu.b)) {
                    if (this.j.g()) {
                        this.d.f(kxc.p(jlk.a, 125));
                    }
                    else {
                        this.d.f(kxc.p(jlk.b, false));
                    }
                }
                final kwh c = this.d.c();
                final Serializable a = nii.a;
                Label_0318: {
                    Label_0315: {
                        try {
                            ex = (CancellationException)c.a();
                            ((lbf)ex).c = 1;
                            ((lbf)ex).e = 2;
                            final long a2 = c.b(((lbf)ex).e()).get().a;
                            this.l.set(true);
                            if (a2 != -1L) {
                                ex = (CancellationException)niz.i(a2 + TimeUnit.MILLISECONDS.toNanos(250L));
                                break Label_0318;
                            }
                            fcy.c.c().E(1522).o("Invalid converged 3A timestamp for Long Shot.");
                            break Label_0315;
                        }
                        catch (final CancellationException ex) {}
                        catch (final InterruptedException ex) {}
                        catch (final ExecutionException ex) {}
                        catch (final kuw kuw) {}
                        a.m(fcy.c.b(), "Couldn't set the torch state for Long Shot", '\u05f3', ex);
                    }
                    ex = (CancellationException)a;
                }
                this.f.g();
                return new fcx((niz)ex, c, this.d, this.k, this.i, this.l, this.m);
            }
            catch (final kuw kuw2) {}
            catch (final InterruptedException ex2) {}
            return new fcx(nii.a, bqx.k, this.d, this.k, this.i, this.l, this.m);
        }
        return new fcx(nii.a, bqx.j, this.d, this.k, this.i, this.l, this.m);
    }
    
    @Override
    public final void c(final hzf hzf) {
        this.g.c(hzf);
    }
}
