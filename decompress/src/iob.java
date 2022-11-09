import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iob extends cr
{
    public int Z;
    
    public iob() {
        super(-1, -1);
        this.Z = 1;
    }
    
    public iob(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ioc.a);
        if (obtainStyledAttributes.hasValue(0)) {
            this.Z = (new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 })[obtainStyledAttributes.getInt(0, 0)];
        }
        obtainStyledAttributes.recycle();
    }
    
    public iob(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
    }
}
