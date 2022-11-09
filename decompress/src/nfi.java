import android.graphics.RectF;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfi
{
    final ney a;
    final ney b;
    final ney c;
    final ney d;
    final nfa e;
    final nfa f;
    final nfa g;
    final nfa h;
    final njo i;
    final njo j;
    final njo k;
    final njo l;
    
    static {
        new nff(0.5f);
    }
    
    public nfi() {
        this.i = nfa.k();
        this.j = nfa.k();
        this.k = nfa.k();
        this.l = nfa.k();
        this.a = new new(0.0f);
        this.b = new new(0.0f);
        this.c = new new(0.0f);
        this.d = new new(0.0f);
        this.e = nfa.a();
        this.f = nfa.a();
        this.g = nfa.a();
        this.h = nfa.a();
    }
    
    public nfi(final nfh nfh) {
        this.i = nfh.i;
        this.j = nfh.j;
        this.k = nfh.k;
        this.l = nfh.l;
        this.a = nfh.a;
        this.b = nfh.b;
        this.c = nfh.c;
        this.d = nfh.d;
        this.e = nfh.e;
        this.f = nfh.f;
        this.g = nfh.g;
        this.h = nfh.h;
    }
    
    public static nfh a(Context obtainStyledAttributes, final AttributeSet set, int n, int n2) {
        final new new1 = new new(0.0f);
        final TypedArray obtainStyledAttributes2 = obtainStyledAttributes.obtainStyledAttributes(set, nfe.a, n, n2);
        n2 = obtainStyledAttributes2.getResourceId(0, 0);
        n = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (n != 0) {
            obtainStyledAttributes = (Context)new ContextThemeWrapper(obtainStyledAttributes, n2);
        }
        else {
            n = n2;
        }
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(n, nfe.b);
        try {
            final int int1 = ((TypedArray)obtainStyledAttributes).getInt(0, 0);
            final int int2 = ((TypedArray)obtainStyledAttributes).getInt(3, int1);
            n = ((TypedArray)obtainStyledAttributes).getInt(4, int1);
            n2 = ((TypedArray)obtainStyledAttributes).getInt(2, int1);
            final int int3 = ((TypedArray)obtainStyledAttributes).getInt(1, int1);
            final ney e = e((TypedArray)obtainStyledAttributes, 5, new1);
            final ney e2 = e((TypedArray)obtainStyledAttributes, 8, e);
            final ney e3 = e((TypedArray)obtainStyledAttributes, 9, e);
            final ney e4 = e((TypedArray)obtainStyledAttributes, 7, e);
            final ney e5 = e((TypedArray)obtainStyledAttributes, 6, e);
            final nfh nfh = new nfh();
            nfh.b(nfh.i = nfa.j(int2));
            nfh.a = e2;
            nfh.b(nfh.j = nfa.j(n));
            nfh.b = e3;
            nfh.b(nfh.k = nfa.j(n2));
            nfh.c = e4;
            nfh.b(nfh.l = nfa.j(int3));
            nfh.d = e5;
            return nfh;
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    private static ney e(final TypedArray typedArray, final int n, final ney ney) {
        final TypedValue peekValue = typedArray.peekValue(n);
        if (peekValue == null) {
            return ney;
        }
        if (peekValue.type == 5) {
            return new new((float)TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (peekValue.type == 6) {
            return new nff(peekValue.getFraction(1.0f, 1.0f));
        }
        return ney;
    }
    
    public final nfh b() {
        return new nfh(this);
    }
    
    public final nfi c(final float n) {
        final nfh b = this.b();
        b.a = new new(n);
        b.b = new new(n);
        b.c = new new(n);
        b.d = new new(n);
        return b.a();
    }
    
    public final boolean d(final RectF rectF) {
        final boolean b = this.h.getClass().equals(nfa.class) && this.f.getClass().equals(nfa.class) && this.e.getClass().equals(nfa.class) && this.g.getClass().equals(nfa.class);
        final float a = this.a.a(rectF);
        final boolean b2 = this.b.a(rectF) == a && this.d.a(rectF) == a && this.c.a(rectF) == a;
        final boolean b3 = this.j instanceof nfg && this.i instanceof nfg && this.k instanceof nfg && this.l instanceof nfg;
        return b && b2 && b3;
    }
}
