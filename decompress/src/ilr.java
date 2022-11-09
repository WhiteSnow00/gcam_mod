import android.view.WindowManager$LayoutParams;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public class ilr extends ilo
{
    private final klv a;
    private final Window b;
    private final iqg c;
    public final BottomBarController d;
    public final ivj e;
    public final jjb f;
    public final imk g;
    public final gjj h;
    private final bti i;
    
    public ilr(final klv a, final BottomBarController d, final ivj e, final jjb f, final Window b, final imk g, final bti i, final gjj h, final iqg c) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = b;
        this.g = g;
        this.i = i;
        d.switchToMode(jbm.h);
        e.ai(jbm.h);
        this.f = f;
        this.h = h;
        this.c = c;
    }
    
    @Override
    public void f() {
        final WindowManager$LayoutParams attributes = this.b.getAttributes();
        attributes.rotationAnimation = 3;
        this.b.setAttributes(attributes);
        this.i.a();
        this.a.aR(jbm.h);
        this.f.v(true);
        final jjb f = this.f;
        if (((jjq)f).L) {
            f.h();
        }
        this.f.p(false);
        this.c.c();
    }
    
    @Override
    public void g() {
        this.f.v(false);
        this.f.p(false);
        this.c.m();
    }
}
