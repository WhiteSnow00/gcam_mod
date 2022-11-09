import android.animation.Animator$AnimatorListener;
import android.support.v7.widget.ActionBarOverlayLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nx implements Runnable
{
    final /* synthetic */ ActionBarOverlayLayout a;
    private final /* synthetic */ int b;
    
    public nx(final ActionBarOverlayLayout a) {
        this.a = a;
    }
    
    public nx(final ActionBarOverlayLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                this.a.h();
                final ActionBarOverlayLayout a = this.a;
                a.i = a.c.animate().translationY(0.0f).setListener((Animator$AnimatorListener)this.a.j);
                return;
            }
            case 0: {
                this.a.h();
                final ActionBarOverlayLayout a2 = this.a;
                a2.i = a2.c.animate().translationY((float)(-this.a.c.getHeight())).setListener((Animator$AnimatorListener)this.a.j);
            }
        }
    }
}
