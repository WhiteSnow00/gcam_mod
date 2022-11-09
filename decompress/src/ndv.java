import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.view.Window;
import android.view.View$OnTouchListener;
import android.app.Dialog;
import android.graphics.drawable.InsetDrawable;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndv extends kb
{
    private Drawable b;
    private final Rect c;
    
    public ndv(final Context context) {
        this(context, 0);
    }
    
    public ndv(final Context context, int n) {
        final int t = t(context);
        Object a = ngv.a(context, null, 2130968621, 2132017547);
        if (t != 0) {
            a = new lv((Context)a, t);
        }
        if (n == 0) {
            n = t(context);
        }
        super((Context)a, n);
        final Context a2 = this.a();
        final Resources$Theme theme = a2.getTheme();
        final TypedArray a3 = nem.a(a2, null, ndw.a, 2130968621, 2132017547, new int[0]);
        int dimensionPixelSize = a3.getDimensionPixelSize(2, a2.getResources().getDimensionPixelSize(2131165867));
        final int dimensionPixelSize2 = a3.getDimensionPixelSize(3, a2.getResources().getDimensionPixelSize(2131165868));
        n = a3.getDimensionPixelSize(1, a2.getResources().getDimensionPixelSize(2131165866));
        final int dimensionPixelSize3 = a3.getDimensionPixelSize(0, a2.getResources().getDimensionPixelSize(2131165865));
        a3.recycle();
        final int layoutDirection = a2.getResources().getConfiguration().getLayoutDirection();
        int n2;
        if (layoutDirection == 1) {
            n2 = dimensionPixelSize;
        }
        else {
            n2 = n;
        }
        if (layoutDirection == 1) {
            dimensionPixelSize = n;
        }
        this.c = new Rect(dimensionPixelSize, dimensionPixelSize2, n2, dimensionPixelSize3);
        n = neu.d(a2, 2130968905, this.getClass().getCanonicalName());
        final nfd b = new nfd(nfi.a(a2, null, 2130968621, 2132017547).a());
        b.e(a2);
        b.g(ColorStateList.valueOf(n));
        final TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(16844145, typedValue, true);
        final float dimension = typedValue.getDimension(this.a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            b.b(b.a.a.c(dimension));
        }
        this.b = b;
    }
    
    private static int t(final Context context) {
        final TypedValue e = neu.e(context, 2130969378);
        if (e == null) {
            return 0;
        }
        return e.data;
    }
    
    @Override
    public final kc b() {
        final kc b = super.b();
        final Window window = b.getWindow();
        final View decorView = window.getDecorView();
        final Drawable b2 = this.b;
        if (b2 instanceof nfd) {
            ((nfd)b2).f(ik.a(decorView));
        }
        final Drawable b3 = this.b;
        final Rect c = this.c;
        window.setBackgroundDrawable((Drawable)new InsetDrawable(b3, c.left, c.top, c.right, c.bottom));
        decorView.setOnTouchListener((View$OnTouchListener)new ndu(b, this.c));
        return b;
    }
    
    public final void i(final boolean b) {
        super.f(b);
    }
    
    public final void j(final int n) {
        final jx a = super.a;
        a.f = a.a.getText(n);
    }
    
    public final void k(final CharSequence f) {
        super.a.f = f;
    }
    
    public final void l(final int n, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        super.g(n, dialogInterface$OnClickListener);
    }
    
    public final void m(final CharSequence i, final DialogInterface$OnClickListener j) {
        final jx a = super.a;
        a.i = i;
        a.j = j;
    }
    
    public final void n(final DialogInterface$OnKeyListener dialogInterface$OnKeyListener) {
        super.d(dialogInterface$OnKeyListener);
    }
    
    public final void o(final int n, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        super.h(n, dialogInterface$OnClickListener);
    }
    
    public final void p(final CharSequence g, final DialogInterface$OnClickListener h) {
        final jx a = super.a;
        a.g = g;
        a.h = h;
    }
    
    public final void q(final int n) {
        final jx a = super.a;
        a.d = a.a.getText(n);
    }
    
    public final void r(final CharSequence charSequence) {
        super.e(charSequence);
    }
    
    public final void s(final View p) {
        super.a.p = p;
    }
}
