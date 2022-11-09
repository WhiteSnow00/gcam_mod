import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rp
{
    protected final se a;
    public int b;
    final Rect c;
    
    public rp(final se a) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = a;
    }
    
    public static rp p(final se se) {
        return new rn(se);
    }
    
    public static rp q(final se se, final int n) {
        switch (n) {
            default: {
                return r(se);
            }
            case 0: {
                return p(se);
            }
        }
    }
    
    public static rp r(final se se) {
        return new ro(se);
    }
    
    public abstract int a(final View p0);
    
    public abstract int b(final View p0);
    
    public abstract int c(final View p0);
    
    public abstract int d(final View p0);
    
    public abstract int e();
    
    public abstract int f();
    
    public abstract int g();
    
    public abstract int h();
    
    public abstract int i();
    
    public abstract int j();
    
    public abstract int k();
    
    public abstract int l(final View p0);
    
    public abstract int m(final View p0);
    
    public abstract void n(final int p0);
    
    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return this.k() - this.b;
    }
}
