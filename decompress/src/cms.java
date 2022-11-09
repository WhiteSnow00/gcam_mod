import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public class cms extends cne
{
    public final BottomBarController e;
    public final cxl f;
    public final ivj g;
    public final iqg h;
    public final cnf i;
    public final niz j;
    public final gjj k;
    public cne l;
    public final itx m;
    
    public cms(final BottomBarController e, final cxl f, final ivj g, final iqg h, final itx m, final cnf i, final niz j, final gjj k) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.m = m;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final boolean aX() {
        return this.l.aX();
    }
    
    @Override
    public final int j() {
        return this.l.j();
    }
    
    public final void k() {
        this.i.d();
        this.e.stopHfrRecording();
        this.g.ad();
        if (this.f.k(cwv.H)) {
            if (this.j.g()) {
                ((cpf)this.j.c()).g(true);
            }
            this.h.v(true);
            this.h.l(true);
            return;
        }
        this.m.a();
    }
}
