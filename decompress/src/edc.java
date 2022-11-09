import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public class edc extends ecz
{
    public final ivj d;
    public final BottomBarController e;
    public final gjj f;
    public final ebo g;
    public final itx h;
    
    public edc(final ivj d, final BottomBarController e, final gjj f, final ebo g, final itx h) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public void f() {
        this.d.ai(jbm.d);
        this.d.H(true);
    }
    
    @Override
    public void g() {
        this.d.H(false);
    }
}
