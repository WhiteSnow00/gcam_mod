import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class hqg implements hrk
{
    final /* synthetic */ hqj a;
    
    public hqg(final hqj a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final List o = this.a.o;
        monitorenter(o);
        try {
            final Iterator iterator = this.a.o.iterator();
            while (iterator.hasNext()) {
                ((hrk)iterator.next()).a();
            }
            monitorexit(o);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void b() {
        final List o = this.a.o;
        monitorenter(o);
        try {
            final Iterator iterator = this.a.o.iterator();
            while (iterator.hasNext()) {
                ((hrk)iterator.next()).b();
            }
            monitorexit(o);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void c() {
        final List o = this.a.o;
        monitorenter(o);
        try {
            final Iterator iterator = this.a.o.iterator();
            while (iterator.hasNext()) {
                ((hrk)iterator.next()).c();
            }
            monitorexit(o);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void d() {
        final List o = this.a.o;
        monitorenter(o);
        try {
            final Iterator iterator = this.a.o.iterator();
            while (iterator.hasNext()) {
                ((hrk)iterator.next()).d();
            }
            monitorexit(o);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
