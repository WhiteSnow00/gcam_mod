import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfs implements dfz
{
    public final List a;
    
    public dfs() {
        this.a = new CopyOnWriteArrayList();
    }
    
    @Override
    public final void a() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dfz)iterator.next()).a();
        }
    }
    
    @Override
    public final void b(final Throwable t) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dfz)iterator.next()).b(t);
        }
    }
    
    @Override
    public final void c(final Throwable t) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dfz)iterator.next()).c(t);
        }
    }
    
    @Override
    public final void d() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dfz)iterator.next()).d();
        }
    }
    
    @Override
    public final void e() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dfz)iterator.next()).e();
        }
    }
    
    @Override
    public final void f() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dfz)iterator.next()).f();
        }
    }
}
