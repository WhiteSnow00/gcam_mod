import android.os.Handler;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public class t extends s
{
    public final void g(final Object f) {
        s.a("setValue");
        ++super.h;
        super.f = f;
        this.b(null);
    }
    
    public final void h(final Object g) {
        Object o = super.b;
        synchronized (o) {
            final Object g2 = super.g;
            final Object a = s.a;
            super.g = g;
            monitorexit(o);
            if (g2 != a) {
                return;
            }
            final ww a2 = ww.a();
            o = super.i;
            final aaf b = a2.b;
            final wy wy = (wy)b;
            if (wy.c == null) {
                synchronized (wy.a) {
                    if (((wy)b).c == null) {
                        ((wy)b).c = Handler.createAsync(Looper.getMainLooper());
                    }
                }
            }
            wy.c.post((Runnable)o);
        }
    }
}
