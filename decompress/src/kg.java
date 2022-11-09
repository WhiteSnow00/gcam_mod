import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.app.Dialog;
import android.view.Window;
import android.content.Context;
import android.app.Activity;
import java.util.Iterator;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kg
{
    public static final yw a;
    public static final Object b;
    
    static {
        a = new yw();
        b = new Object();
    }
    
    public static void h(final kg kg) {
        final Object b = kg.b;
        monitorenter(b);
        try {
            final Iterator iterator = kg.a.iterator();
            while (iterator.hasNext()) {
                final kg kg2 = iterator.next().get();
                if (kg2 == kg || kg2 == null) {
                    iterator.remove();
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public static kg o(final Activity activity) {
        return new kw((Context)activity, null, activity);
    }
    
    public static kg p(final Dialog dialog) {
        return new kw(dialog.getContext(), dialog.getWindow(), dialog);
    }
    
    public abstract ju a();
    
    public abstract View b(final int p0);
    
    public abstract void c(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void d();
    
    public abstract void e();
    
    public abstract void f();
    
    public abstract void g();
    
    public abstract void i(final int p0);
    
    public abstract void j(final View p0);
    
    public abstract void k(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void l(final CharSequence p0);
    
    public abstract void m();
    
    public abstract void n(final int p0);
}
