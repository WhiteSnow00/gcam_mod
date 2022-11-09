import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.NestedScrollView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnScrollChangeListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihg implements exn, exh
{
    public final Context a;
    public final kjm b;
    public final cxl c;
    public ndm d;
    public View$OnScrollChangeListener e;
    public long f;
    public int g;
    private final View$OnLayoutChangeListener h;
    private final eyt i;
    private final View$OnScrollChangeListener j;
    
    public ihg(final Context a, final kjm b, final gkw gkw, final ewy ewy, final eyt i, final cxl c) {
        this.g = 1;
        this.f = 0L;
        this.a = a;
        this.b = b;
        this.c = c;
        gkw.f();
        this.h = (View$OnLayoutChangeListener)new igy(gkw);
        this.i = i;
        this.j = (View$OnScrollChangeListener)new igz(this);
        b.b(new ihe(this, ewy));
    }
    
    public final ViewGroup a(final View view) {
        kjm.a();
        this.d();
        final Context a = this.a;
        int n;
        if (!this.c.k(cxr.at)) {
            n = 2132017872;
        }
        else {
            n = 2132017871;
        }
        final ndm d = new ndm(a, n);
        this.d = d;
        int contentView;
        if (!this.c.k(cxr.at)) {
            contentView = 2131623976;
        }
        else {
            contentView = 2131623975;
        }
        d.setContentView(contentView);
        this.d.c = true;
        if (this.c.k(cxr.at)) {
            final View viewById = this.d.findViewById(2131427457);
            if (viewById != null) {
                final Drawable drawable = this.a.getDrawable(2131231619);
                drawable.setTint(lrx.b(2131165589, this.a));
                viewById.setBackground(drawable);
            }
            final View inflate = View.inflate(this.a, 2131624015, (ViewGroup)null);
            final FrameLayout frameLayout = (FrameLayout)this.d.findViewById(2131427459);
            if (frameLayout != null) {
                frameLayout.addView(inflate);
                frameLayout.setVisibility(0);
            }
        }
        else {
            final ImageView imageView = (ImageView)this.d.findViewById(2131427458);
            imageView.getClass();
            imageView.setVisibility(0);
        }
        this.d.getWindow().addFlags(1024);
        final NestedScrollView nestedScrollView = (NestedScrollView)this.d.findViewById(2131427940);
        nestedScrollView.addOnLayoutChangeListener(this.h);
        nestedScrollView.setOnScrollChangeListener(this.j);
        if (view != null) {
            final FrameLayout frameLayout2 = (FrameLayout)this.d.findViewById(2131427942);
            if (frameLayout2 != null) {
                frameLayout2.addView(view);
            }
        }
        return (ViewGroup)nestedScrollView;
    }
    
    @Override
    public final void bi() {
        this.d();
    }
    
    public final void c(final ViewGroup viewGroup) {
        final ndm d = this.d;
        if (d == null) {
            return;
        }
        final NestedScrollView nestedScrollView = (NestedScrollView)d.findViewById(2131427940);
        nestedScrollView.getClass();
        ((View)viewGroup).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ihf((View)viewGroup, new ihc(this, nestedScrollView, d)));
        d.a().q = true;
        d.a().C(true);
    }
    
    public final void d() {
        this.b.b(new iha(this));
        final int g = this.g;
        if (g != 1 && this.f != 0L) {
            this.i.X(g, (int)(System.currentTimeMillis() - this.f));
        }
    }
    
    public final void e(final int g, final int n, final View view) {
        this.b.execute(new ihb(this, n, view));
        this.f = System.currentTimeMillis();
        this.g = g;
    }
}
