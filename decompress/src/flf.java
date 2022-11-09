import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flf
{
    public final ihg a;
    public final Context b;
    public final cxl c;
    public View d;
    private final hkg e;
    private final DisplayMetrics f;
    private View g;
    
    public flf(final ihg a, final hkg e, final DisplayMetrics f, final Context b, final cxl c) {
        this.g = null;
        this.d = null;
        this.a = a;
        this.e = e;
        this.b = b;
        this.f = f;
        this.c = c;
    }
    
    public final void a() {
        kjm.a();
        if (this.g == null) {
            final FrameLayout g = new FrameLayout(this.b);
            final Context b = this.b;
            int n;
            if (!this.c.k(cxr.at)) {
                n = 2131624058;
            }
            else {
                n = 2131624057;
            }
            View.inflate(b, n, (ViewGroup)g);
            ((Button)g.findViewById(2131427689)).setOnClickListener((View$OnClickListener)new fle(this));
            final FrameLayout frameLayout = (FrameLayout)g.findViewById(2131427455);
            final EduImageView eduImageView = (EduImageView)g.findViewById(2131427454);
            final ViewGroup$LayoutParams layoutParams = eduImageView.getLayoutParams();
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)frameLayout.getLayoutParams();
            final float n2 = (float)(this.f.widthPixels - viewGroup$MarginLayoutParams.leftMargin - viewGroup$MarginLayoutParams.rightMargin);
            final float n3 = (float)(this.f.heightPixels - viewGroup$MarginLayoutParams.topMargin - viewGroup$MarginLayoutParams.bottomMargin);
            if (layoutParams.width > n2) {
                final int height = layoutParams.height;
                final int width = layoutParams.width;
                layoutParams.width = (int)n2;
                layoutParams.height = (int)(n2 * (height / (float)width));
                eduImageView.setLayoutParams(layoutParams);
            }
            else if (layoutParams.height > n3) {
                viewGroup$MarginLayoutParams.width = (int)(layoutParams.width / (float)layoutParams.height * n3);
                viewGroup$MarginLayoutParams.height = (int)n3;
                eduImageView.setLayoutParams(layoutParams);
            }
            eduImageView.a(this.b.getString(2131952310), this.b.getString(2131952309));
            this.g = (View)g;
        }
        this.a.e(7, 2131952304, this.g);
        this.e.c("micro_tutorial_dismiss");
    }
}
