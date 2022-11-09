import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tt extends js
{
    public int b;
    
    public tt() {
        this.b = 0;
        this.a = 8388627;
    }
    
    public tt(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
    }
    
    public tt(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.b = 0;
    }
    
    public tt(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
        this.b = 0;
        this.leftMargin = viewGroup$MarginLayoutParams.leftMargin;
        this.topMargin = viewGroup$MarginLayoutParams.topMargin;
        this.rightMargin = viewGroup$MarginLayoutParams.rightMargin;
        this.bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    public tt(final js js) {
        super(js);
        this.b = 0;
    }
    
    public tt(final tt tt) {
        super(tt);
        this.b = 0;
        this.b = tt.b;
    }
}
