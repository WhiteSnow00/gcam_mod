import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public class cnk extends cne
{
    public final BottomBarController e;
    public final ivj f;
    public final imk g;
    public final iqg h;
    public final cnf i;
    public final niz j;
    public final gjj k;
    public cne l;
    
    public cnk(final BottomBarController e, final ivj f, final imk g, final iqg h, final cnf i, final niz j, final gjj k) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
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
        this.e.stopRecording();
        this.h.v(true);
        this.h.l(true);
        this.f.ag();
        this.g.d(true);
        if (this.j.g()) {
            ((cpu)this.j.c()).n();
        }
        jgu.d();
    }
}
