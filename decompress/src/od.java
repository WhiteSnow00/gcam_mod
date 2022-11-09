import android.graphics.drawable.Drawable;
import android.view.View$OnTouchListener;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class od extends AppCompatImageView implements oh
{
    final /* synthetic */ og a;
    
    public od(final og a, final Context context) {
        this.a = a;
        super(context, null, 2130968611);
        this.setClickable(true);
        this.setFocusable(true);
        this.setVisibility(0);
        this.setEnabled(true);
        ((View)this).setTooltipText(this.getContentDescription());
        this.setOnTouchListener((View$OnTouchListener)new oc(this, (View)this));
    }
    
    @Override
    public final boolean c() {
        return false;
    }
    
    @Override
    public final boolean d() {
        return false;
    }
    
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        this.playSoundEffect(0);
        this.a.m();
        return true;
    }
    
    protected final boolean setFrame(int n, int height, int width, final int n2) {
        final boolean setFrame = super.setFrame(n, height, width, n2);
        final Drawable drawable = this.getDrawable();
        final Drawable background = this.getBackground();
        if (drawable != null && background != null) {
            width = this.getWidth();
            height = this.getHeight();
            n = Math.max(width, height) / 2;
            width = (width + (this.getPaddingLeft() - this.getPaddingRight())) / 2;
            height = (height + (this.getPaddingTop() - this.getPaddingBottom())) / 2;
            background.setHotspotBounds(width - n, height - n, width + n, height + n);
        }
        return setFrame;
    }
}
