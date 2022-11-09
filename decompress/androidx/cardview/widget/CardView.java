// 
// Decompiled by Procyon v0.6.0
// 

package androidx.cardview.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class CardView extends FrameLayout
{
    private static final int[] e;
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    private final yl f;
    
    static {
        e = new int[] { 16842801 };
    }
    
    public CardView(final Context context) {
        this(context, null);
    }
    
    public CardView(final Context context, final AttributeSet set) {
        this(context, set, 2130968750);
    }
    
    public CardView(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        final Rect c = new Rect();
        this.c = c;
        this.d = new Rect();
        final yl f = new yl(this);
        this.f = f;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, yk.a, n, 2132017524);
        ik.E((View)this, context, yk.a, set, obtainStyledAttributes, n, 2132017524);
        ColorStateList list;
        if (obtainStyledAttributes.hasValue(2)) {
            list = obtainStyledAttributes.getColorStateList(2);
        }
        else {
            final TypedArray obtainStyledAttributes2 = this.getContext().obtainStyledAttributes(CardView.e);
            n = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            final float[] array = new float[3];
            Color.colorToHSV(n, array);
            if (array[2] > 0.5f) {
                n = this.getResources().getColor(2131099739);
            }
            else {
                n = this.getResources().getColor(2131099738);
            }
            list = ColorStateList.valueOf(n);
        }
        final float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        final float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        final float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        n = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        c.left = obtainStyledAttributes.getDimensionPixelSize(10, n);
        c.top = obtainStyledAttributes.getDimensionPixelSize(12, n);
        c.right = obtainStyledAttributes.getDimensionPixelSize(11, n);
        c.bottom = obtainStyledAttributes.getDimensionPixelSize(9, n);
        float b = dimension3;
        if (dimension2 > dimension3) {
            b = dimension2;
        }
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        final ym ym = new ym(list, dimension);
        f.a = ym;
        f.b.setBackgroundDrawable((Drawable)ym);
        final CardView b2 = f.b;
        ((View)b2).setClipToOutline(true);
        ((View)b2).setElevation(dimension2);
        final Drawable a = f.a;
        final boolean c2 = f.c();
        final boolean b3 = f.b();
        final ym ym2 = (ym)a;
        if (b != ym2.b || ym2.c != c2 || ym2.d != b3) {
            ym2.b = b;
            ym2.c = c2;
            ym2.d = b3;
            ym2.a(null);
            ym2.invalidateSelf();
        }
        if (!f.c()) {
            f.a(0, 0, 0, 0);
            return;
        }
        final ym ym3 = (ym)f.a;
        final float b4 = ym3.b;
        final float a2 = ym3.a;
        n = (int)Math.ceil(yn.a(b4, a2, f.b()));
        final int n2 = (int)Math.ceil(yn.b(b4, a2, f.b()));
        f.a(n, n2, n, n2);
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
    }
}
