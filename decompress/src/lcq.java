import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcq implements lcr, krc
{
    public lcr a;
    public lcr b;
    public boolean c;
    public boolean d;
    public lal e;
    private final Handler f;
    private final List g;
    private lda h;
    
    public lcq(final Handler f) {
        this.c = false;
        this.d = false;
        this.f = f;
        this.g = new ArrayList();
    }
    
    public final void a() {
        this.h = null;
        final ArrayList list = new ArrayList(this.g);
        this.g.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            ((lco)list.get(i)).a(this.f);
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.a = null;
            this.b = null;
            this.c = false;
            final lal e = this.e;
            if (this.d) {
                this.e = null;
            }
            monitorexit(this);
            if (e != null) {
                monitorenter(lam.a);
                try {
                    e.a.e = 1;
                }
                finally {}
            }
        }
    }
    
    @Override
    public final void c(final lda h) {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.h = h;
            final lcr a = this.a;
            if (a != null) {
                a.c(h);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a();
            monitorexit(this);
            this.b();
        }
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.h = null;
            final lcr a = this.a;
            if (a != null) {
                a.d();
            }
        }
    }
    
    @Override
    public final void e(final lda lda) {
        synchronized (this) {
            if (this.d) {
                leg.b(lda, this.f);
                return;
            }
            final lcr a = this.a;
            if (a != null) {
                a.e(lda);
                return;
            }
            this.g.add(new lcp(lda));
        }
    }
    
    @Override
    public final void f(final List list) {
        synchronized (this) {
            njo.d(list.isEmpty() ^ true);
            if (this.d) {
                leg.c(list, this.f);
                return;
            }
            final lcr a = this.a;
            if (a != null) {
                a.f(list);
                return;
            }
            this.g.add(new lcn(list));
        }
    }
    
    public final lal g() {
        try {
            final lcr a = this.a;
            if (a != null) {
                final lda h = this.h;
                if (h != null) {
                    a.c(h);
                }
                for (final lco lco : this.g) {
                    final lcr a2 = this.a;
                    a2.getClass();
                    lco.b(a2);
                }
                this.g.clear();
            }
            return this.e;
        }
        catch (final kuw kuw) {
            this.close();
            return null;
        }
    }
}
