import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhn extends lhf
{
    public final kmd f;
    public final klw g;
    private klj h;
    
    public lhn(final long n) {
        super(n);
        final klw g = new klw();
        this.g = g;
        this.f = new kmd(0L, g);
    }
    
    @Override
    protected final void d() {
        final kmd f = this.f;
        final Object a = super.a;
        monitorenter(a);
        try {
            long n;
            if (super.e) {
                n = super.b;
                monitorexit(a);
            }
            else if (!super.c.isEmpty()) {
                final Iterator iterator = super.c.iterator();
                long n2 = 0L;
                while (iterator.hasNext()) {
                    n2 += ((lhe)iterator.next()).b;
                }
                final long d = super.d;
                monitorexit(a);
                n = n2 + d;
            }
            else {
                n = super.d;
                monitorexit(a);
            }
            f.aR(n);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final klj f() {
        synchronized (this) {
            if (this.h == null) {
                this.h = klq.j(this.f, new lhm(this));
            }
            return this.h;
        }
    }
}
