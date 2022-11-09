import android.content.res.Configuration;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import android.graphics.Bitmap;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;
import android.content.ComponentCallbacks2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auz implements ComponentCallbacks2, bgk
{
    private static final bho e;
    protected final auf a;
    protected final Context b;
    final bgj c;
    public final CopyOnWriteArrayList d;
    private final bgq f;
    private final bgp g;
    private final bgt h;
    private final Runnable i;
    private final bge j;
    private bho k;
    
    static {
        final bho b = bho.b(Bitmap.class);
        b.K();
        e = b;
        bho.b(bfk.class).K();
        final bho bho = (bho)bho.c(ayg.b).v(auo.d).H();
    }
    
    public auz(final auf a, final bgj c, final bgp g, final Context b) {
        final bgq f = new bgq();
        final bgh g2 = a.g;
        this.h = new bgt();
        final aux i = new aux(this);
        this.i = i;
        this.a = a;
        this.c = c;
        this.g = g;
        this.f = f;
        this.b = b;
        final Context applicationContext = b.getApplicationContext();
        final auy auy = new auy(this, f);
        bge j;
        if (zv.s(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            j = new bgg(applicationContext, auy);
        }
        else {
            j = new bgl();
        }
        this.j = j;
        if (biv.m()) {
            biv.j(i);
        }
        else {
            c.a(this);
        }
        c.a(j);
        this.d = new CopyOnWriteArrayList(a.b.d);
        this.l(a.b.a());
        synchronized (a.f) {
            if (!a.f.contains(this)) {
                a.f.add(this);
                return;
            }
            throw new IllegalStateException("Cannot register already registered manager");
        }
    }
    
    public final auw a(final Class clazz) {
        return new auw(this.a, this, clazz, this.b);
    }
    
    public final auw b() {
        return this.a(Bitmap.class).b(auz.e);
    }
    
    public final auw c() {
        return this.a(Drawable.class);
    }
    
    public final auw d(final String s) {
        return this.c().e(s);
    }
    
    final bho e() {
        synchronized (this) {
            return this.k;
        }
    }
    
    public final void f(final bhy bhy) {
        if (bhy == null) {
            return;
        }
        final boolean n = this.n(bhy);
        final bhj c = bhy.c();
        if (!n) {
            final auf a = this.a;
            synchronized (a.f) {
                final Iterator iterator = a.f.iterator();
                while (iterator.hasNext()) {
                    if (((auz)iterator.next()).n(bhy)) {
                        return;
                    }
                }
                monitorexit(a.f);
                if (c != null) {
                    bhy.k(null);
                    c.c();
                }
            }
        }
    }
    
    public final void g() {
        monitorenter(this);
        try {
            this.h.g();
            final Iterator iterator = biv.g(this.h.a).iterator();
            while (iterator.hasNext()) {
                this.f((bhy)iterator.next());
            }
            this.h.a.clear();
            final bgq f = this.f;
            final Iterator iterator2 = biv.g(f.a).iterator();
            while (iterator2.hasNext()) {
                f.a((bhj)iterator2.next());
            }
            f.b.clear();
            this.c.e(this);
            this.c.e(this.j);
            biv.f().removeCallbacks(this.i);
            final auf a = this.a;
            synchronized (a.f) {
                if (a.f.contains(this)) {
                    a.f.remove(this);
                    monitorexit(a.f);
                    return;
                }
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.k();
            this.h.h();
        }
    }
    
    public final void i() {
        synchronized (this) {
            this.j();
            this.h.i();
        }
    }
    
    public final void j() {
        monitorenter(this);
        try {
            final bgq f = this.f;
            f.c = true;
            for (final bhj bhj : biv.g(f.a)) {
                if (bhj.n()) {
                    bhj.f();
                    f.b.add(bhj);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void k() {
        monitorenter(this);
        try {
            final bgq f = this.f;
            f.c = false;
            for (final bhj bhj : biv.g(f.a)) {
                if (!bhj.l() && !bhj.n()) {
                    bhj.b();
                }
            }
            f.b.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    protected final void l(bho k) {
        synchronized (this) {
            k = (bho)k.h();
            k.M();
            this.k = k;
        }
    }
    
    final void m(final bhy bhy, final bhj bhj) {
        synchronized (this) {
            this.h.a.add(bhy);
            final bgq f = this.f;
            f.a.add(bhj);
            if (!f.c) {
                bhj.b();
                return;
            }
            bhj.c();
            f.b.add(bhj);
        }
    }
    
    final boolean n(final bhy bhy) {
        synchronized (this) {
            final bhj c = bhy.c();
            if (c == null) {
                return true;
            }
            if (this.f.a(c)) {
                this.h.a.remove(bhy);
                bhy.k(null);
                return true;
            }
            return false;
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final String string = super.toString();
            final String value = String.valueOf(this.f);
            final String value2 = String.valueOf(this.g);
            final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 21 + String.valueOf(value).length() + String.valueOf(value2).length());
            sb.append(string);
            sb.append("{tracker=");
            sb.append(value);
            sb.append(", treeNode=");
            sb.append(value2);
            sb.append("}");
            return sb.toString();
        }
    }
}
