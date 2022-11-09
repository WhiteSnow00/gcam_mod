import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public class js extends ViewGroup$MarginLayoutParams
{
    public int a;
    
    public js() {
        super(-2, -2);
        this.a = 8388627;
    }
    
    public js(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lo.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
    
    public js(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = 0;
    }
    
    public js(final js js) {
        super((ViewGroup$MarginLayoutParams)js);
        this.a = 0;
        this.a = js.a;
    }
}
