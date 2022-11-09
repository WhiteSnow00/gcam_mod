import android.widget.TextView;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngt extends pt
{
    public ngt(final Context context, final AttributeSet set) {
        super(ngv.a(context, set, 16842884, 0), set, 16842884);
        final Context context2 = this.getContext();
        if (c(context2)) {
            final Resources$Theme theme = context2.getTheme();
            final TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(set, ngu.b, 16842884, 0);
            final int a = a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a == -1) {
                final TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(set, ngu.b, 16842884, 0);
                final int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    this.b(theme, resourceId);
                }
            }
        }
    }
    
    private static int a(final Context context, final TypedArray typedArray, final int... array) {
        int n;
        int n2;
        for (n = 0, n2 = -1; n < 2 && n2 < 0; ++n) {
            final int n3 = array[n];
            final TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(n3, typedValue) && typedValue.type == 2) {
                final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
                n2 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            }
            else {
                n2 = typedArray.getDimensionPixelSize(n3, -1);
            }
        }
        return n2;
    }
    
    private final void b(final Resources$Theme resources$Theme, int a) {
        final TypedArray obtainStyledAttributes = resources$Theme.obtainStyledAttributes(a, ngu.a);
        a = a(this.getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            jp.d(this, a);
        }
    }
    
    private static boolean c(final Context context) {
        return neu.f(context, 2130969764, true);
    }
    
    @Override
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        if (c(context)) {
            this.b(context.getTheme(), n);
        }
    }
}
