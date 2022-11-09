import android.view.WindowManager$LayoutParams;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public class cna extends cne
{
    private final jjb a;
    private final Window b;
    private final iqg c;
    private final bti d;
    public final BottomBarController e;
    public final ivj f;
    public final imk g;
    public final cnf h;
    public cne i;
    
    public cna(final BottomBarController e, final ivj f, final jjb a, final Window b, final imk g, final bti d, final iqg c, final cnf h) {
        this.e = e;
        this.f = f;
        this.a = a;
        this.b = b;
        this.g = g;
        this.d = d;
        this.c = c;
        this.h = h;
    }
    
    @Override
    public final boolean aX() {
        return this.i.aX();
    }
    
    @Override
    public void f() {
        this.d.a();
        this.e.switchToMode(jbm.i);
        this.f.ai(jbm.i);
        final WindowManager$LayoutParams attributes = this.b.getAttributes();
        attributes.rotationAnimation = 3;
        this.b.setAttributes(attributes);
        this.a.p(false);
        this.a.v(true);
        final jjb a = this.a;
        if (((jjq)a).L) {
            a.h();
        }
        this.c.c();
        this.g.d(true);
    }
    
    @Override
    public void g() {
        this.a.v(false);
        this.a.p(false);
        this.c.m();
    }
    
    @Override
    public final int j() {
        this.i.j();
        return this.i.j();
    }
}
