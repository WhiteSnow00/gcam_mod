import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aeh extends RelativeLayout$LayoutParams
{
    private aee a;
    
    public aeh() {
        super(-1, -1);
    }
    
    public aeh(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aed.a);
        final float fraction = obtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        aee aee;
        if (fraction != -1.0f) {
            aee = new aee();
            aee.a = fraction;
        }
        else {
            aee = null;
        }
        final float fraction2 = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        aee aee2 = aee;
        if (fraction2 != -1.0f) {
            if ((aee2 = aee) == null) {
                aee2 = new aee();
            }
            aee2.b = fraction2;
        }
        final float fraction3 = obtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        aee aee3 = aee2;
        if (fraction3 != -1.0f) {
            if ((aee3 = aee2) == null) {
                aee3 = new aee();
            }
            aee3.c = fraction3;
            aee3.d = fraction3;
            aee3.e = fraction3;
            aee3.f = fraction3;
        }
        final float fraction4 = obtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        aee aee4 = aee3;
        if (fraction4 != -1.0f) {
            if ((aee4 = aee3) == null) {
                aee4 = new aee();
            }
            aee4.c = fraction4;
        }
        final float fraction5 = obtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        aee aee5 = aee4;
        if (fraction5 != -1.0f) {
            if ((aee5 = aee4) == null) {
                aee5 = new aee();
            }
            aee5.d = fraction5;
        }
        final float fraction6 = obtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        aee aee6 = aee5;
        if (fraction6 != -1.0f) {
            if ((aee6 = aee5) == null) {
                aee6 = new aee();
            }
            aee6.e = fraction6;
        }
        final float fraction7 = obtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        aee aee7 = aee6;
        if (fraction7 != -1.0f) {
            if ((aee7 = aee6) == null) {
                aee7 = new aee();
            }
            aee7.f = fraction7;
        }
        final float fraction8 = obtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        aee aee8 = aee7;
        if (fraction8 != -1.0f) {
            if ((aee8 = aee7) == null) {
                aee8 = new aee();
            }
            aee8.g = fraction8;
        }
        final float fraction9 = obtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        aee aee9 = aee8;
        if (fraction9 != -1.0f) {
            if ((aee9 = aee8) == null) {
                aee9 = new aee();
            }
            aee9.h = fraction9;
        }
        final float fraction10 = obtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        aee a = aee9;
        if (fraction10 != -1.0f) {
            if ((a = aee9) == null) {
                a = new aee();
            }
            a.i = fraction10;
        }
        obtainStyledAttributes.recycle();
        this.a = a;
    }
    
    public final aee a() {
        if (this.a == null) {
            this.a = new aee();
        }
        return this.a;
    }
    
    protected final void setBaseAttributes(final TypedArray typedArray, final int n, final int n2) {
        ((ViewGroup$LayoutParams)this).width = typedArray.getLayoutDimension(n, 0);
        ((ViewGroup$LayoutParams)this).height = typedArray.getLayoutDimension(n2, 0);
    }
}
