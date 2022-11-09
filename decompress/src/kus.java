import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kus implements kuu
{
    public final List a;
    
    public kus() {
        this.a = new CopyOnWriteArrayList();
    }
    
    public final krc a(final kuu kuu) {
        synchronized (this) {
            kuu.getClass();
            this.a.add(kuu);
            return new kur(this, kuu);
        }
    }
    
    @Override
    public final void b(final Throwable t) {
        synchronized (this) {
            throw null;
        }
    }
    
    @Override
    public final void c(final Throwable t) {
        monitorenter(this);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((kuu)iterator.next()).c(t);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
