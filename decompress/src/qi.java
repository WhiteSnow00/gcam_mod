import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qi
{
    public static final Rect a;
    
    static {
        a = new Rect();
        try {
            Class.forName("android.graphics.Insets");
        }
        catch (final ClassNotFoundException ex) {}
    }
    
    public static PorterDuff$Mode a(final int n, final PorterDuff$Mode porterDuff$Mode) {
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
            case 9: {
                return PorterDuff$Mode.SRC_ATOP;
            }
            case 5: {
                return PorterDuff$Mode.SRC_IN;
            }
            case 3: {
                return PorterDuff$Mode.SRC_OVER;
            }
        }
    }
    
    public static Rect b(final Drawable drawable) {
        final Insets opticalInsets = drawable.getOpticalInsets();
        final Rect rect = new Rect();
        rect.left = opticalInsets.left;
        rect.right = opticalInsets.right;
        rect.top = opticalInsets.top;
        rect.bottom = opticalInsets.bottom;
        return rect;
    }
    
    public static boolean c(final Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer$DrawableContainerState) {
                final Drawable[] children = ((DrawableContainer$DrawableContainerState)constantState).getChildren();
                for (int length = children.length, i = 0; i < length; ++i) {
                    if (!c(children[i])) {
                        return false;
                    }
                }
            }
        }
        else {
            if (drawable instanceof hd) {
                return c(((hd)drawable).a());
            }
            if (drawable instanceof lq) {
                return c(((lq)drawable).a);
            }
            if (drawable instanceof ScaleDrawable) {
                return c(((ScaleDrawable)drawable).getDrawable());
            }
        }
        return true;
    }
}
