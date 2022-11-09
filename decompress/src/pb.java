import android.graphics.Bitmap;
import android.widget.ProgressBar;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RatingBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pb extends RatingBar
{
    private final oz a;
    
    public pb(final Context context, final AttributeSet set) {
        super(context, set, 2130969588);
        tj.d((View)this, this.getContext());
        (this.a = new oz((ProgressBar)this)).a(set, 2130969588);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        synchronized (this) {
            super.onMeasure(n, n2);
            final Bitmap a = this.a.a;
            if (a != null) {
                this.setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * this.getNumStars(), n, 0), this.getMeasuredHeight());
            }
        }
    }
}
