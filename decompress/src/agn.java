import android.animation.LayoutTransition;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

final class agn
{
    public static final ViewGroup$MarginLayoutParams a;
    
    static {
        (a = new ViewGroup$MarginLayoutParams(-1, -1)).setMargins(0, 0, 0, 0);
    }
    
    public static boolean a(final View view) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
