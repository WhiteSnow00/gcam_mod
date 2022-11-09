import java.util.Iterator;
import android.graphics.Rect;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfs
{
    public final ckq a;
    public final Context b;
    public final cjl c;
    public final cnl d;
    public final ckt e;
    public final clu f;
    public final bmq g;
    public final cbj h;
    private final crg i;
    private final cxl j;
    private final lfw k;
    
    public cfs(final crg i, final lfw k, final cxl j, final ckq a, final cnl d, final bmq g, final Context b, final cjl c, final ckt e, final cbj h, final clu f) {
        this.i = i;
        this.k = k;
        this.j = j;
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.f = f;
    }
    
    public final jbm a() {
        return this.c.a();
    }
    
    public final lfj b() {
        return der.b(this.k, this.j, this.i.e());
    }
    
    public final lfj c() {
        lfj b = this.b();
        if (b == null) {
            return null;
        }
        final lfg a = this.k.a(b);
        lfj lfj = b;
        if (a.l() == lfu.a) {
            lfj = b;
            if (a.I()) {
                lfj = b;
                if (this.j.k(cxr.S)) {
                    Rect h = new Rect(0, 0, 0, 0);
                    final Iterator<Object> iterator = ((lff)a).b.iterator();
                    while (true) {
                        lfj = b;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final lfj lfj2 = iterator.next();
                        final lfg a2 = this.k.a(lfj2);
                        if (a2.h().right <= h.right) {
                            continue;
                        }
                        h = a2.h();
                        b = lfj2;
                    }
                }
            }
        }
        return lfj;
    }
}
