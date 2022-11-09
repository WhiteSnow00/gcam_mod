import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.animation.AnimatorSet;
import android.view.View;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fme
{
    public PreviewOverlay a;
    public iys b;
    private final View c;
    
    public fme(final View c) {
        this.c = c;
        this.d();
    }
    
    public final void a() {
        final iys b = this.b;
        final AnimatorSet m = b.m;
        if (m != null && m.isRunning()) {
            b.m.cancel();
        }
        b.a();
        this.a.c = true;
    }
    
    public final void b() {
        this.a.c = false;
    }
    
    public final void c() {
        this.a.c = true;
    }
    
    public final void d() {
        final jea a = jea.a(this.c);
        final FrameLayout frameLayout = (FrameLayout)a.c(2131428112);
        final iys b = this.b;
        if (b != null) {
            frameLayout.removeView((View)b);
        }
        this.a = (PreviewOverlay)a.c(2131427861);
        final iys b2 = new iys(frameLayout.getContext());
        jwn.ac(b2);
        ((ViewGroup)frameLayout).addView((View)b2);
        this.b = b2;
    }
    
    public final void e(final boolean j) {
        this.b.j = j;
    }
    
    public final void f(final int n) {
        this.b.b(n);
        PreviewOverlay previewOverlay;
        boolean c;
        if (n >= 100) {
            previewOverlay = this.a;
            c = true;
        }
        else {
            previewOverlay = this.a;
            c = false;
        }
        previewOverlay.c = c;
    }
}
