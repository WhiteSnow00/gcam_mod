import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.View$AccessibilityDelegate;
import android.view.View$OnClickListener;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public class hsi extends ImageButton implements hsj
{
    public TransitionDrawable a;
    public View$OnClickListener b;
    public View$OnClickListener c;
    public hqi d;
    private int e;
    private final View$AccessibilityDelegate f;
    
    public hsi(final Context context) {
        super(context);
        this.f = new hsh(this);
        this.e = context.getResources().getDimensionPixelSize(2131166292);
    }
    
    public final Drawable a(final int n) {
        final Drawable drawable = this.getContext().getDrawable(n);
        drawable.getClass();
        return drawable;
    }
    
    public final void b() {
        this.e = this.getContext().getResources().getDimensionPixelSize(2131166303);
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)this.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, this.getResources().getDimensionPixelSize(2131166302));
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.setAccessibilityDelegate(this.f);
    }
    
    public final void c() {
        this.e = this.getContext().getResources().getDimensionPixelSize(2131166292);
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)this.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.setAccessibilityDelegate((View$AccessibilityDelegate)null);
    }
    
    public final void d() {
        this.e = this.getContext().getResources().getDimensionPixelSize(2131166303);
        this.setAccessibilityDelegate(this.f);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), this.e);
    }
}
