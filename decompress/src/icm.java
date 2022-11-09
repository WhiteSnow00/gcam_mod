import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public class icm extends ibw
{
    public final BottomBarController f;
    public final imk g;
    public final cxl h;
    public final iqg i;
    public final gjj j;
    public final ivj k;
    public final icy l;
    public final eiq m;
    public final itx n;
    
    public icm(final BottomBarController f, final imk g, final cxl h, final iqg i, final itx n, final gjj j, final ivj k, final icy l, final eiq m) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.n = n;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    @Override
    public void f() {
        throw null;
    }
    
    public final void i() {
        this.j.i();
        this.f.stopTimelapseRecording();
        this.k.ah();
        final icy l = this.l;
        l.c(false);
        l.a.set(false);
        if (l.k.k(cwv.H)) {
            if (l.q.g()) {
                ((cpf)l.q.c()).i();
                ((cpf)l.q.c()).h(true);
                ((cpf)l.q.c()).f(true);
            }
        }
        else {
            l.v.a.set(true);
            l.S.a();
        }
        final icy i = this.l;
        if (i.k.k(cwv.H)) {
            i.j.a(false);
            i.H.f();
        }
        else {
            final iec j = i.i;
            j.f.animate().cancel();
            j.f.setAlpha(0.0f);
            j.f.setVisibility(8);
            j.j.cancel();
            j.a();
        }
        this.g.d(true);
        jgu.d();
        if (this.h.k(cwv.H)) {
            this.i.v(true);
            this.i.l(true);
            return;
        }
        this.n.a();
    }
}
