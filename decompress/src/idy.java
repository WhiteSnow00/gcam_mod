import android.content.res.Resources$Theme;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idy extends FrameLayout
{
    public final ImageView a;
    public final Resources b;
    public final TextView c;
    public final TextView d;
    
    public idy(final Context context) {
        super(context);
        this.c = new TextView(context, (AttributeSet)null, 0, 2132018607);
        this.d = new TextView(context, (AttributeSet)null, 0, 2132018618);
        this.a = new ImageView(context);
        this.b = context.getResources();
    }
    
    public final void a() {
        this.c.setPadding(this.b.getDimensionPixelSize(2131165475), 0, 0, 0);
        this.c.setCompoundDrawablePadding(this.b.getDimensionPixelSize(2131165487));
        this.c.setCompoundDrawablesWithIntrinsicBounds(2131231316, 0, 0, 0);
        this.c.setLetterSpacing(igu.a(this.b.getDimension(2131165488)));
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, this.b.getDimensionPixelSize(2131165474));
        layoutParams.gravity = 19;
        this.c.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.c.setGravity(16);
        this.a.setImageDrawable(this.b.getDrawable(2131231548, (Resources$Theme)null));
        final FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(-2, -2);
        layoutParams2.leftMargin = this.b.getDimensionPixelSize(2131165480);
        layoutParams2.gravity = 19;
        this.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        this.d.setLetterSpacing(igu.a(this.b.getDimension(2131165488)));
        this.d.setGravity(16);
        final FrameLayout$LayoutParams layoutParams3 = new FrameLayout$LayoutParams(-2, this.b.getDimensionPixelSize(2131165477));
        layoutParams3.leftMargin = this.b.getDimensionPixelSize(2131165478);
        layoutParams3.gravity = 19;
        this.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
    }
    
    public final void b(final boolean b, final boolean b2) {
        final int dimensionPixelSize = this.b.getDimensionPixelSize(2131165483);
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.c.getLayoutParams();
        final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)this.a.getLayoutParams();
        final FrameLayout$LayoutParams layoutParams3 = (FrameLayout$LayoutParams)this.d.getLayoutParams();
        if (b) {
            layoutParams.width = -2;
            layoutParams2.leftMargin = this.b.getDimensionPixelSize(2131165480) + dimensionPixelSize;
            layoutParams3.leftMargin = this.b.getDimensionPixelSize(2131165478) + dimensionPixelSize;
        }
        if (b2) {
            layoutParams3.width = -2;
        }
        this.c.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        this.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
        this.requestLayout();
    }
    
    final void c(final String text) {
        if (!this.c.getText().toString().equals(text)) {
            this.c.setText((CharSequence)text);
        }
    }
    
    public final void d(final String text) {
        if (!this.d.getText().toString().equals(text)) {
            this.d.setText((CharSequence)text);
        }
    }
}
