import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcd implements mbz
{
    public final oey a;
    public final oey b;
    public final oey c;
    public final oey d;
    public final ofn e;
    public final ofn f;
    public final ofn g;
    public final List h;
    public boolean i;
    private final mcp j;
    private final boolean k;
    private boolean l;
    
    public mcd(final oey a, final oey b, final oey c, final oey d, final boolean k, final Executor executor) {
        this.h = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
        this.j = new mcp(executor);
        this.e = ofn.f();
        this.f = ofn.f();
        this.g = ofn.f();
    }
    
    @Override
    public final mcf a(final mce mce) {
        synchronized (this) {
            if (this.l) {
                throw new IllegalStateException("Muxer already started. No tracks can be added now.");
            }
            final mci mci = new mci(mce.a, new mcp(this.j));
            this.h.add(mci);
            if (this.k) {
                return new mbx(mci);
            }
            return mci;
        }
    }
    
    @Override
    public final oey b() {
        return this.g;
    }
    
    @Override
    public final void c() {
        monitorenter(this);
        try {
            if (!this.l) {
                this.l = true;
                this.g.d(new mcc(this, 1), this.j);
                this.e.e(odg.i(ofi.k(this.a, this.b, this.c, this.d), new mcb(this), this.j));
                final ArrayList m = nqb.m();
                m.add(this.e);
                final Iterator iterator = this.h.iterator();
                while (iterator.hasNext()) {
                    m.add(((mci)iterator.next()).b);
                }
                ofi.j(m).d(new mcc(this), this.j);
                final ArrayList i = nqb.m();
                final Iterator iterator2 = this.h.iterator();
                while (iterator2.hasNext()) {
                    i.add(((mci)iterator2.next()).e);
                }
                ofi.j(i).d(new mcc(this, 2), this.j);
                monitorexit(this);
                return;
            }
            throw new IllegalStateException("Muxer already started. Cannot call start twice.");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
