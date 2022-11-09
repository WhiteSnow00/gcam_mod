import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class to
{
    public final Context a;
    public final TypedArray b;
    public TypedValue c;
    
    private to(final Context a, final TypedArray b) {
        this.a = a;
        this.b = b;
    }
    
    public static to j(final Context context, final int n, final int[] array) {
        return new to(context, context.obtainStyledAttributes(n, array));
    }
    
    public static to k(final Context context, final AttributeSet set, final int[] array) {
        return new to(context, context.obtainStyledAttributes(set, array));
    }
    
    public static to q(final Context context, final AttributeSet set, final int[] array, final int n) {
        return new to(context, context.obtainStyledAttributes(set, array, n, 0));
    }
    
    public final int a(final int n, final int n2) {
        return this.b.getDimensionPixelOffset(n, n2);
    }
    
    public final int b(final int n, final int n2) {
        return this.b.getDimensionPixelSize(n, n2);
    }
    
    public final int c(final int n, final int n2) {
        return this.b.getInt(n, n2);
    }
    
    public final int d(final int n, final int n2) {
        return this.b.getInteger(n, n2);
    }
    
    public final int e(final int n, final int n2) {
        return this.b.getLayoutDimension(n, n2);
    }
    
    public final int f(final int n, final int n2) {
        return this.b.getResourceId(n, n2);
    }
    
    public final ColorStateList g(final int n) {
        if (this.b.hasValue(n)) {
            final int resourceId = this.b.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList a = lp.a(this.a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.b.getColorStateList(n);
    }
    
    public final Drawable h(final int n) {
        if (this.b.hasValue(n)) {
            final int resourceId = this.b.getResourceId(n, 0);
            if (resourceId != 0) {
                return lp.b(this.a, resourceId);
            }
        }
        return this.b.getDrawable(n);
    }
    
    public final Drawable i(int resourceId) {
        if (this.b.hasValue(resourceId)) {
            resourceId = this.b.getResourceId(resourceId, 0);
            if (resourceId != 0) {
                return ot.d().g(this.a, resourceId);
            }
        }
        return null;
    }
    
    public final CharSequence l(final int n) {
        return this.b.getText(n);
    }
    
    public final String m(final int n) {
        return this.b.getString(n);
    }
    
    public final void n() {
        this.b.recycle();
    }
    
    public final boolean o(final int n, final boolean b) {
        return this.b.getBoolean(n, b);
    }
    
    public final boolean p(final int n) {
        return this.b.hasValue(n);
    }
}
