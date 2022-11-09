import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dib implements dix
{
    public final Context a;
    public final ihg b;
    public final liz c;
    public final klv d;
    public final cxl e;
    public gjp f;
    public int g;
    private final kjm h;
    
    public dib(final Context a, final ihg b, final kjm h, final liz c, final klv d, final cxl e) {
        this.f = gjp.F;
        this.g = -1;
        this.a = a;
        this.b = b;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static void b(final FrameLayout[] array, final gjp gjp) {
        for (int i = 0; i < 3; ++i) {
            final gjp f = gjp.F;
            int visibility = 8;
            Label_0071: {
                if (gjp == f && i == 0) {
                    i = 0;
                }
                else if (gjp != gjp.D || i != 1) {
                    if (gjp == gjp.E && i == 2) {
                        visibility = 0;
                    }
                    break Label_0071;
                }
                visibility = 0;
            }
            array[i].setVisibility(visibility);
        }
    }
    
    public static void c(final gjp gjp, final View view, final View view2, final View view3, int backgroundResource, final int n) {
        int backgroundResource2;
        if (gjp == gjp.F) {
            backgroundResource2 = backgroundResource;
        }
        else {
            backgroundResource2 = n;
        }
        view.setBackgroundResource(backgroundResource2);
        int backgroundResource3;
        if (gjp == gjp.D) {
            backgroundResource3 = backgroundResource;
        }
        else {
            backgroundResource3 = n;
        }
        view2.setBackgroundResource(backgroundResource3);
        if (gjp != gjp.E) {
            backgroundResource = n;
        }
        view3.setBackgroundResource(backgroundResource);
    }
    
    public static void d(final gjp gjp, final ImageView imageView, final ImageView imageView2, final ImageView imageView3, int colorFilter, final int n) {
        if (imageView != null && imageView2 != null && imageView3 != null) {
            int colorFilter2;
            if (gjp == gjp.F) {
                colorFilter2 = colorFilter;
            }
            else {
                colorFilter2 = n;
            }
            imageView.setColorFilter(colorFilter2);
            int colorFilter3;
            if (gjp == gjp.D) {
                colorFilter3 = colorFilter;
            }
            else {
                colorFilter3 = n;
            }
            imageView2.setColorFilter(colorFilter3);
            if (gjp != gjp.E) {
                colorFilter = n;
            }
            imageView3.setColorFilter(colorFilter);
        }
    }
    
    public static void e(final gjp gjp, final TextView textView, final TextView textView2, final TextView textView3, int textColor, final int n) {
        if (textView != null && textView2 != null && textView3 != null) {
            int textColor2;
            if (gjp == gjp.F) {
                textColor2 = textColor;
            }
            else {
                textColor2 = n;
            }
            textView.setTextColor(textColor2);
            int textColor3;
            if (gjp == gjp.D) {
                textColor3 = textColor;
            }
            else {
                textColor3 = n;
            }
            textView2.setTextColor(textColor3);
            if (gjp != gjp.E) {
                textColor = n;
            }
            textView3.setTextColor(textColor);
        }
    }
    
    @Override
    public final void a(final gjp gjp) {
        this.h.b(new dia(this, gjp));
    }
}
