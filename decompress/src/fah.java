import android.view.View;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.camera.ui.widget.ReviewImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fah
{
    public final ReviewImageView a;
    public final ImageView b;
    public boolean c;
    public boolean d;
    public int e;
    private final gkw f;
    private final hhu g;
    private final FrameLayout h;
    private final hhz i;
    
    public fah(final bqm bqm, final Resources resources, final gkw f, final hhu g) {
        this.i = new fag(this);
        this.f = f;
        this.g = g;
        final MainActivityLayout f2 = ((bsa)bqm.g()).f;
        this.h = (FrameLayout)f2.findViewById(2131427776);
        this.a = new ReviewImageView(f2.getContext());
        final ImageView b = new ImageView(f2.getContext());
        (this.b = b).setImageDrawable(resources.getDrawable(2131231604, (Resources$Theme)null));
        b.setVisibility(8);
    }
    
    private final void g() {
        this.b.setVisibility(8);
    }
    
    public final void a() {
        this.a.a();
        this.g();
        this.h.removeAllViews();
        this.g.i(this.i);
    }
    
    public final void b() {
        this.h.addView((View)this.a, 0);
        this.h.addView((View)this.b, 1);
        this.g.a(this.i);
    }
    
    public final void c() {
        this.d = false;
        this.g();
        this.a.a();
        this.c = false;
    }
    
    public final void d() {
        this.d = true;
        this.e = this.f.f().e - this.f.c().e;
    }
    
    public final void e() {
        this.b.setVisibility(0);
        this.b.setImageAlpha(178);
    }
}
