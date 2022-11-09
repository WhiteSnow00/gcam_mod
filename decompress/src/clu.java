import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clu
{
    public final List a;
    public final niz b;
    public final ckn c;
    public final crg d;
    public final cma e;
    public final cxl f;
    public final AtomicBoolean g;
    public boolean h;
    private final klv i;
    private final jjb j;
    private final niz k;
    
    public clu(final niz b, final klv i, final ckn c, final crg d, final cma e, final cxl f, final jjb j, final klv klv, final bmz bmz, final niz k) {
        this.a = new ArrayList();
        this.g = new AtomicBoolean(true);
        this.h = true;
        this.b = b;
        this.i = i;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.j = j;
        this.k = k;
        bmz.i().c(klv.a(new cls(this), mcn.n()));
    }
    
    public final clp a() {
        return (clp)this.i.aQ();
    }
    
    public final krc b(final clt clt) {
        this.a.add(clt);
        return new clr(this, clt);
    }
    
    public final void c(final boolean b) {
        this.i.aR(clp.b);
        if (this.k.g()) {
            if (b) {
                ((cor)this.k.c()).f(false);
            }
            this.j.f(false);
        }
        this.e.g();
        if (this.b.g()) {
            ((cpu)this.b.c()).close();
        }
        this.g.set(true);
    }
    
    public final void d(final clp clp, final boolean l) {
        if (this.a() != clp) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((clt)iterator.next()).a((clp)this.i.aQ(), clp, l);
            }
            this.i.aR(clp);
            final cma e = this.e;
            e.l = l;
            final clp a = clp.a;
            switch (clp.ordinal()) {
                case 4: {
                    e.d();
                    return;
                }
                case 3: {
                    e.c();
                    return;
                }
                case 2: {
                    e.a();
                    return;
                }
                case 1: {
                    e.b();
                }
            }
        }
    }
}
