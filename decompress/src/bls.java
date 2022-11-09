import java.util.Iterator;
import java.util.concurrent.Executor;
import android.graphics.PointF;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bls extends jgp
{
    public final bke a;
    public jck b;
    public jck c;
    private final bjh d;
    private final lfu e;
    private final Set f;
    private final jjb g;
    private final imb h;
    private final niz i;
    private final kjf j;
    private final bkb k;
    
    public bls(final bjh d, final bkb k, final bke a, final lfu e, final Set f, final jjb g, final imb h, final niz i) {
        this.b = null;
        this.c = null;
        this.j = new blr(this);
        this.d = d;
        this.k = k;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean a(final PointF pointF) {
        if (this.h.c()) {
            return false;
        }
        final jck b = this.b;
        if (b != null) {
            b.c();
        }
        final jck c = this.c;
        if (c != null) {
            c.c();
        }
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((jgp)iterator.next()).a(pointF);
        }
        final bkk a = this.d.a();
        final jjb g = this.g;
        if (!((jjq)g).L) {
            g.h();
        }
        else if (g.C()) {
            this.g.x();
        }
        if (this.i.g()) {
            ((jib)this.i.c()).c();
        }
        (this.b = this.a.c(pointF)).b(new bln(this));
        final bkx a2 = this.k.a(this.e, pointF, a);
        knf.g(((jcq)this.b).b, a2.b(), this.j, mcn.n());
        final bkn bkn = (bkn)a;
        final ofn c2 = bkn.c;
        knf.e(c2, new blo(a2, 1));
        knf.f(a2.c(), new blp(c2, a2), odx.a);
        knf.f(bkn.d, new blo(a2), odx.a);
        return true;
    }
}
