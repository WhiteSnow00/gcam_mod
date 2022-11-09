import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyf
{
    public final List a;
    private final Executor b;
    
    public kyf(final Executor b) {
        this.b = b;
        this.a = new ArrayList();
    }
    
    final void a(final kwp h, final boolean a, final boolean b, final kvx c, final boolean d, final ljm e, final boolean f, final boolean g) {
        synchronized (this.a) {
            kye kye;
            if (this.a.isEmpty()) {
                kye = new kye(this);
            }
            else {
                final List a2 = this.a;
                kye = (kye)a2.remove(a2.size() - 1);
            }
            monitorexit(this.a);
            kye.h = h;
            kye.a = a;
            kye.b = b;
            kye.c = c;
            kye.d = d;
            kye.e = e;
            kye.f = f;
            kye.g = g;
            Executor executor = h.f();
            if (executor == null) {
                executor = this.b;
            }
            executor.execute(kye);
        }
    }
}
