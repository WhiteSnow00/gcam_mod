import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ot
{
    public static final PorterDuff$Mode a;
    private static ot b;
    private sx c;
    
    static {
        a = PorterDuff$Mode.SRC_IN;
    }
    
    public static PorterDuffColorFilter b(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (ot.class) {
            return sx.b(n, porterDuff$Mode);
        }
    }
    
    public static ot d() {
        synchronized (ot.class) {
            if (ot.b == null) {
                f();
            }
            return ot.b;
        }
    }
    
    public static void f() {
        synchronized (ot.class) {
            if (ot.b == null) {
                (ot.b = new ot()).c = sx.e();
                ot.b.c.g(new os());
            }
        }
    }
    
    final ColorStateList a(final Context context, final int n) {
        synchronized (this) {
            return this.c.a(context, n);
        }
    }
    
    public final Drawable c(final Context context, final int n) {
        synchronized (this) {
            return this.c.c(context, n);
        }
    }
    
    public final void e(final Context context) {
        synchronized (this) {
            this.c.f(context);
        }
    }
    
    final Drawable g(final Context context, final int n) {
        synchronized (this) {
            return this.c.d(context, n, true);
        }
    }
}
