import android.arch.lifecycle.LiveData$LifecycleBoundObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public class s
{
    public static final Object a;
    final Object b;
    public final xg c;
    public int d;
    public boolean e;
    public volatile Object f;
    volatile Object g;
    public int h;
    public final Runnable i;
    private boolean j;
    private boolean k;
    
    static {
        a = new Object();
    }
    
    public s() {
        this.b = new Object();
        this.c = new xg();
        this.d = 0;
        final Object a = s.a;
        this.g = a;
        this.i = new p(this);
        this.f = a;
        this.h = -1;
    }
    
    public static void a(final String s) {
        if (ww.a().b()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot invoke ");
        sb.append(s);
        sb.append(" on a background thread");
        throw new IllegalStateException(sb.toString());
    }
    
    private final void h(final r r) {
        if (!r.d) {
            return;
        }
        if (!r.g()) {
            r.d(false);
            return;
        }
        final int e = r.e;
        final int h = this.h;
        if (e >= h) {
            return;
        }
        r.e = h;
        r.c.a(this.f);
    }
    
    final void b(r r) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (r != null) {
                this.h(r);
            }
            else {
                final xd e = this.c.e();
                while (e.hasNext()) {
                    this.h((r)((xc)e.a()).b);
                    if (this.k) {
                        break;
                    }
                }
            }
            if (!this.k) {
                break;
            }
            r = null;
        }
        this.j = false;
    }
    
    public final void c(final k k, final u u) {
        a("observe");
        if (k.aD().a == h.a) {
            return;
        }
        final LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, k, u);
        final r r = (r)this.c.f(u, liveData$LifecycleBoundObserver);
        if (r != null && !r.c(k)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (r != null) {
            return;
        }
        k.aD().b(liveData$LifecycleBoundObserver);
    }
    
    protected void d() {
    }
    
    protected void e() {
    }
    
    public void f(final u u) {
        a("removeObserver");
        final r r = (r)this.c.b(u);
        if (r == null) {
            return;
        }
        r.b();
        r.d(false);
    }
    
    protected void g(final Object o) {
        throw null;
    }
}
