import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zy extends ViewGroup$MarginLayoutParams
{
    public zv a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;
    private boolean q;
    
    public zy() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
    
    public zy(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, zs.b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        final boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            this.a = CoordinatorLayout.g(context, set, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        final zv a = this.a;
        if (a != null) {
            a.a(this);
        }
    }
    
    public zy(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
    
    public zy(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
    
    public zy(final zy zy) {
        super((ViewGroup$MarginLayoutParams)zy);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
    
    public final void a() {
        this.o = false;
    }
    
    public final void b(final zv a) {
        final zv a2 = this.a;
        if (a2 != a) {
            if (a2 != null) {
                a2.b();
            }
            this.a = a;
            this.b = true;
            if (a != null) {
                a.a(this);
            }
        }
    }
    
    public final void c(final int n, final boolean b) {
        switch (n) {
            default: {
                this.q = b;
                return;
            }
            case 0: {
                this.n = b;
            }
        }
    }
    
    public final boolean d(final int n) {
        switch (n) {
            default: {
                return this.q;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
