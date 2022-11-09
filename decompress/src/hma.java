import java.util.Iterator;
import android.util.ArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hma
{
    public final Set a;
    private niz b;
    private niz c;
    private lfg d;
    
    public hma() {
        this.a = (Set)new ArraySet();
    }
    
    final krc a(final hlz hlz) {
        synchronized (this) {
            this.a.add(hlz);
            final lfg d = this.d;
            if (d != null) {
                hlz.e(d);
            }
            return new hly(this, hlz);
        }
    }
    
    public final niz b() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final niz c() {
        synchronized (this) {
            return this.c;
        }
    }
    
    final void d(final lfg d) {
        monitorenter(this);
        try {
            this.d = d;
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hlz)iterator.next()).e(d);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void e(final ljm ljm) {
        monitorenter(this);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hlz)iterator.next()).f(ljm);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void f(final niz b) {
        synchronized (this) {
            this.b = b;
        }
    }
    
    final void g(final niz c) {
        synchronized (this) {
            this.c = c;
        }
    }
    
    final void h(final lbe lbe, final kwz kwz) {
        monitorenter(this);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hlz)iterator.next()).g(lbe, kwz);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
