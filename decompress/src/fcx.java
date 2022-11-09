import java.util.Set;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class fcx
{
    public final niz a;
    private final krc b;
    private final kwd c;
    private final gnb d;
    private final lfg e;
    private final AtomicBoolean f;
    private final cxl g;
    
    public fcx(final niz a, final krc b, final kwd c, final gnb d, final lfg e, final AtomicBoolean f, final cxl g) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    final void a() {
        this.b.close();
        this.f.set(false);
        if (gnb.b() && this.g.k(cxz.j) && this.e.l().equals(lfu.b)) {
            final HashSet set = new HashSet();
            set.add(kxc.p(jlk.b, true));
            set.add(kxc.p(jlk.a, this.d.a(this.e)));
            this.c.h(set);
        }
    }
}
