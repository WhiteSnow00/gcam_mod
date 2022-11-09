import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbe implements eip
{
    final /* synthetic */ cbh a;
    private boolean b;
    private boolean c;
    
    public cbe(final cbh a) {
        this.a = a;
        this.b = false;
        this.c = false;
    }
    
    @Override
    public final void d(final boolean b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        if (!b && this.c) {
            this.c = false;
            return;
        }
        final Object v = this.a.v;
        monitorenter(v);
        try {
            final cfd cfd = (cfd)((kkz)this.a.r.f).d;
            if ((!b && cfd != cfd.e) || (b && cfd == cfd.e)) {
                final Iterator iterator = this.a.f.iterator();
                while (iterator.hasNext()) {
                    ((ceh)iterator.next()).k(true);
                }
                if (b) {
                    this.c = true;
                }
            }
            monitorexit(v);
            if (this.a.m.k(cxr.ar)) {
                this.a.h.A(b);
            }
        }
        finally {
            monitorexit(v);
            while (true) {}
        }
    }
    
    @Override
    public final void e(final boolean b) {
        if (b) {
            this.a.g.z();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (b) {
            this.a.g.A();
        }
    }
}
