import android.util.AndroidRuntimeException;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aci implements abt
{
    public static final ach a;
    public static final ach b;
    public static final ach c;
    public static final ach d;
    public static final ach e;
    public static final ach f;
    public static final ach g;
    public float h;
    public float i;
    public boolean j;
    final Object k;
    final acl l;
    public boolean m;
    public float n;
    public float o;
    public final ArrayList p;
    private long q;
    private final float r;
    private final ArrayList s;
    private abw t;
    
    static {
        a = new abz();
        b = new aca();
        c = new acb();
        d = new acc();
        e = new acd();
        f = new ace();
        g = new abx();
    }
    
    public aci(final acm acm) {
        this.h = 0.0f;
        this.i = Float.MAX_VALUE;
        this.j = false;
        this.m = false;
        this.n = Float.MAX_VALUE;
        this.o = -3.4028235E38f;
        this.q = 0L;
        this.s = new ArrayList();
        this.p = new ArrayList();
        this.k = null;
        this.l = new aby(acm);
        this.r = 1.0f;
    }
    
    public aci(final Object k, final acl l) {
        this.h = 0.0f;
        this.i = Float.MAX_VALUE;
        this.j = false;
        this.m = false;
        this.n = Float.MAX_VALUE;
        this.o = -3.4028235E38f;
        this.q = 0L;
        this.s = new ArrayList();
        this.p = new ArrayList();
        this.k = k;
        this.l = l;
        float r;
        if (l != aci.d && l != aci.e && l != aci.f) {
            if (l == aci.g) {
                r = 0.00390625f;
            }
            else if (l != aci.b && l != aci.c) {
                r = 1.0f;
            }
            else {
                r = 0.002f;
            }
        }
        else {
            r = 0.1f;
        }
        this.r = r;
    }
    
    private static void i(final ArrayList list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i) == null) {
                list.remove(i);
            }
        }
    }
    
    @Override
    public final void a(final long n) {
        final long q = this.q;
        if (q == 0L) {
            this.q = n;
            this.d(this.i);
            return;
        }
        this.q = n;
        final boolean f = this.f(n - q);
        final float min = Math.min(this.i, this.n);
        this.i = min;
        this.d(this.i = Math.max(min, this.o));
        if (f) {
            this.h();
        }
    }
    
    final float b() {
        return this.r * 0.75f;
    }
    
    public final abw c() {
        if (this.t == null) {
            if (abw.a.get() == null) {
                abw.a.set(new abw(new abv()));
            }
            this.t = abw.a.get();
        }
        return this.t;
    }
    
    final void d(float i) {
        this.l.b(this.k, i);
        for (int j = 0; j < this.p.size(); ++j) {
            if (this.p.get(j) != null) {
                final iqp iqp = this.p.get(j);
                i = this.i;
                final iqq a = iqp.a;
                a.c.setScrollX((int)i);
                final ModeSwitcher c = a.c;
                final iql c2 = c.c;
                final jbm b = c.b();
                if (c2.h != c2.b.get(b)) {
                    c2.d(b);
                }
            }
        }
        i(this.p);
    }
    
    public void e() {
        if (this.c().a()) {
            if (!this.m) {
                this.m = true;
                if (!this.j) {
                    this.i = this.l.a(this.k);
                }
                final float i = this.i;
                if (i > this.n || i < this.o) {
                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                }
                final abw c = this.c();
                if (c.c.size() == 0) {
                    c.h.a(c.e);
                }
                if (!c.c.contains(this)) {
                    c.c.add(this);
                }
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }
    
    public abstract boolean f(final long p0);
    
    public final void g(final acg acg) {
        if (!this.s.contains(acg)) {
            this.s.add(acg);
        }
    }
    
    public final void h() {
        int i = 0;
        this.m = false;
        final abw c = this.c();
        c.b.remove(this);
        final int index = c.c.indexOf(this);
        if (index >= 0) {
            c.c.set(index, null);
            c.g = true;
        }
        this.q = 0L;
        this.j = false;
        while (i < this.s.size()) {
            if (this.s.get(i) != null) {
                ((acg)this.s.get(i)).a();
            }
            ++i;
        }
        i(this.s);
    }
}
