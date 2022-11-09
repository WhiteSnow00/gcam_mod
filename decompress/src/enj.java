import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

final class enj extends ivr
{
    final /* synthetic */ enm a;
    
    public enj(final enm a) {
        this.a = a;
    }
    
    private final boolean a() {
        final hjg hjg = (hjg)this.a.K.aQ();
        final boolean b = this.a.S.g() && (boolean)((hyo)this.a.S.c()).a().aQ();
        return hjg != hjg.d && !this.a.v.c() && this.a.M && !b;
    }
    
    @Override
    public final void onShutterButtonClick() {
        final enm a = this.a;
        if (a.F == null) {
            String s;
            if (a.E != null) {
                s = "starting";
            }
            else {
                s = "closed";
            }
            enm.b.c().E(1301).r("Not taking picture since Camera is %s", s);
            return;
        }
        a.I.f();
        final enm a2 = this.a;
        if (a2.v.c()) {
            a2.v();
            return;
        }
        final hjg hjg = (hjg)a2.K.aQ();
        final int g = hjg.g;
        if (g > 0) {
            a2.I(g);
            return;
        }
        if (hjg != hjg.d) {
            a2.J();
            return;
        }
        if (a2.O.e()) {
            a2.P.b();
            return;
        }
        if (a2.O.f()) {
            a2.P.a();
            return;
        }
        a.l(enm.b.c(), "Not starting or stopping auto-timer capture since the state is disabled.", '\u052b');
    }
    
    @Override
    public final void onShutterButtonLongPressRelease() {
        if (this.a()) {
            this.a.q.b(2);
        }
    }
    
    @Override
    public final void onShutterButtonLongPressUnlock() {
        if (this.a()) {
            this.a.p.b(2);
            kpo.d(Looper.getMainLooper()).post((Runnable)new eni(this));
        }
    }
    
    @Override
    public final void onShutterButtonLongPressed() {
        if (this.a()) {
            this.a.q.a(2);
        }
    }
    
    @Override
    public final void onShutterButtonPressedStateChanged(final boolean m) {
        final enm a = this.a;
        a.M = m;
        if (m) {
            if (a.t.g()) {
                ((fer)a.t.c()).e();
            }
        }
        else {
            if (a.t.g()) {
                ((fer)a.t.c()).f();
            }
            if (a.ab.a().aQ()) {
                final fvp f = a.F;
                if (f != null) {
                    ((Boolean)((kkz)f.h().g).d).booleanValue();
                }
            }
        }
    }
    
    @Override
    public final void onShutterTouchStart() {
        this.a.I.e();
    }
}
