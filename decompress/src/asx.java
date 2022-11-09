import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.hardware.Camera$Parameters;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asx
{
    public abstract int a();
    
    @Deprecated
    public abstract Camera$Parameters b();
    
    public abstract Handler c();
    
    public abstract atd d();
    
    public abstract atl e();
    
    public abstract atu f();
    
    public abstract atv g();
    
    public abstract atx h();
    
    public void i(final byte[] array) {
        try {
            this.h().a(new asp(this, array));
        }
        catch (final RuntimeException ex) {
            this.d().c().c(ex);
        }
    }
    
    public abstract void j(final Handler p0, final asg p1);
    
    public void k(final boolean b) {
        try {
            this.h().a(new ass(this, b));
        }
        catch (final RuntimeException ex) {
            this.d().c().c(ex);
        }
    }
    
    public void l(final SurfaceTexture surfaceTexture) {
        try {
            this.h().a(new asu(this, surfaceTexture));
        }
        catch (final RuntimeException ex) {
            this.d().c().c(ex);
        }
    }
    
    public abstract void m(final Handler p0, final esl p1);
    
    public abstract void n(final Handler p0, final esl p1);
    
    public abstract void o(final atu p0);
    
    public void p() {
        if (this.g().d()) {
            return;
        }
        final atc atc = new atc();
        try {
            this.h().b(new asw(this, atc, 1), atc.b, "set preview texture");
        }
        catch (final RuntimeException ex) {
            this.d().c().c(ex);
        }
    }
    
    public abstract void q(final Handler p0, final esn p1, final aso p2, final aso p3);
    
    public final void r(final Handler handler, final asy asy) {
        try {
            this.h().a(new asv(this, handler, asy));
        }
        catch (final RuntimeException ex) {
            this.d().c().c(ex);
        }
    }
    
    protected final boolean s(atu a, final int n) {
        if (a == null) {
            auc.g(atd.i);
            return false;
        }
        final atl e = this.e();
        final float p2 = a.p;
        Label_0424: {
            if (!e.d(atf.a)) {
                if (p2 != 1.0f) {
                    auc.g(atl.a);
                    break Label_0424;
                }
            }
            else if (a.p > e.t) {
                final aub a2 = atl.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Zoom ratio is not supported: ratio = ");
                sb.append(a.p);
                sb.toString();
                auc.g(a2);
                break Label_0424;
            }
            final int q = a.q;
            if (q <= e.o && q >= e.n) {
                final ath s = a.s;
                if (!e.f(s)) {
                    if (!e.f(ath.e)) {
                        final aub a3 = atl.a;
                        if (s != null) {
                            s.name();
                        }
                        auc.g(a3);
                        break Label_0424;
                    }
                    auc.c(atl.a, "Focus mode not supported... trying FIXED");
                    a.s = ath.e;
                }
                final atg r = a.r;
                if (!e.e(r)) {
                    final aub a4 = atl.a;
                    if (r != null) {
                        r.name();
                    }
                    auc.g(a4);
                }
                else {
                    final aua e2 = a.e();
                    if (e.f.contains(e2)) {
                        final aua f = a.f();
                        if (e.c.contains(f)) {
                            if (!a.v || e.d(atf.g)) {
                                a = a.a();
                                try {
                                    this.h().a(new asr(this, n, a));
                                }
                                catch (final RuntimeException ex) {
                                    this.d().c().c(ex);
                                }
                                return true;
                            }
                            auc.g(atl.a);
                        }
                        else {
                            final aub a5 = atl.a;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unsupported preview size:");
                            sb2.append(f);
                            sb2.toString();
                            auc.g(a5);
                        }
                    }
                    else {
                        final aub a6 = atl.a;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unsupported photo size:");
                        sb3.append(e2);
                        sb3.toString();
                        auc.g(a6);
                    }
                }
            }
            else {
                auc.g(atl.a);
            }
        }
        auc.c(atd.i, "Unsupported settings in applySettings()");
        return false;
    }
}
