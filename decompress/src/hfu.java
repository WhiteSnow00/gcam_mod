import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfu implements hik
{
    public final LinkedList a;
    
    public hfu() {
        this.a = new LinkedList();
    }
    
    @Override
    public final void a() {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).a();
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void b() {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).b();
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final eza eza) {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).c(eza);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final Bitmap bitmap) {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).d(bitmap);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void e(final niz niz) {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).e(niz);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void f(final int n, final int n2, final Throwable t) {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).f(n, n2, t);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void g(final int n, final int n2, final Throwable t) {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).g(n, n2, t);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void h(final int n, final int n2) {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).h(n, n2);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void i(final int n, final int n2) {
        final LinkedList a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((hik)iterator.next()).i(n, n2);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
