import java.util.Collection;
import android.util.ArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glg extends kxc
{
    private final Set a;
    
    public glg() {
        this.a = (Set)new ArraySet();
    }
    
    @Override
    public final void aL(final kwz kwz, final long n) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).aL(kwz, n);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void aM(final lji lji) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).aM(lji);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void aN(final kvx kvx) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).aN(kvx);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void aO(final lem lem) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).aO(lem);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void aV(final long n, final int n2) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).aV(n, n2);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void aW(final long n, final int n2, final long n3) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).aW(n, n2, n3);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final ljm ljm) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).b(ljm);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void h(final long n, final Set set) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).h(n, set);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void i(final long n, final int n2) {
        monitorenter(this);
        try {
            final nrv bn = noi.F(this.a).bN();
            while (bn.hasNext()) {
                ((kxc)bn.next()).i(n, n2);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void j(final kxc kxc) {
        synchronized (this) {
            this.a.add(kxc);
        }
    }
    
    public final void k(final kxc kxc) {
        synchronized (this) {
            this.a.remove(kxc);
        }
    }
}
