import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyx extends isr
{
    private final MainActivityLayout b;
    
    public iyx(final MainActivityLayout b, final FrameLayout frameLayout) {
        super((ViewGroup)frameLayout);
        this.b = b;
    }
    
    @Override
    public final void a(final View view) {
        kjm.a();
        super.a.addView(view);
        this.b.f((View)this.a);
    }
    
    @Override
    public final void b(final View view) {
        kjm.a();
        super.a.removeView(view);
        this.b.e();
    }
    
    @Override
    public final void c(final int n, final int n2) {
        this.b.g(n, n2);
    }
}
