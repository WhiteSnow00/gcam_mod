import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

// 
// Decompiled by Procyon v0.6.0
// 

public class dgy extends dgt
{
    public final EvCompView a;
    public final CheckBox b;
    public final ObjectAnimator c;
    public final dhf d;
    public final klv e;
    
    public dgy(final EvCompView a, final CheckBox b, final ObjectAnimator c, final dhf d, final dgm dgm) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = dgm.b;
        c.addListener((Animator$AnimatorListener)new dgu(a));
    }
    
    public final void i(final boolean b, final boolean b2) {
        if (b2) {
            this.d.i();
            final dhf d = this.d;
            d.a.postDelayed(d.l, (long)d.k);
        }
        if (b) {
            this.c.start();
            return;
        }
        this.c.cancel();
        this.a.setAlpha(1.0f);
    }
}
