import android.content.res.Resources$Theme;
import android.util.Pair;
import java.util.concurrent.Executor;
import java.util.Iterator;
import j$.util.function.Supplier;
import android.view.ViewTreeObserver;
import java.util.Collection;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.Collections;
import java.util.ArrayList;
import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwg implements iwk, iwh, iwi, iwj
{
    public final List a;
    public volatile boolean b;
    public volatile int c;
    public volatile int d;
    public boolean e;
    public volatile boolean f;
    public boolean g;
    public boolean h;
    public efm i;
    public int j;
    public boolean k;
    public final Object l;
    public int m;
    private final iwf n;
    private final List o;
    private final List p;
    private final List q;
    private volatile View r;
    private volatile int s;
    private volatile int t;
    private volatile int u;
    private volatile int v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;
    
    public iwg(final iwf n) {
        this.u = 500;
        this.v = 500;
        this.e = false;
        this.g = true;
        this.k = false;
        this.l = new Object();
        this.n = n;
        this.o = Collections.synchronizedList(new ArrayList<Object>());
        this.a = Collections.synchronizedList(new ArrayList<Object>());
        this.p = Collections.synchronizedList(new ArrayList<Object>());
        this.q = Collections.synchronizedList(new ArrayList<Object>());
        this.d = 0;
        this.c = 0;
        this.f = true;
        this.b = false;
        this.j = 0;
    }
    
    public iwg(final String s) {
        this(new iwc((Spannable)SpannableString.valueOf((CharSequence)s)));
    }
    
    @Override
    public final krc a() {
        this.i.getClass();
        final View a = this.n.a(this.r.getContext(), this.h);
        final iwm iwm = new iwm(this.r);
        final iwb iwb = new iwb(iwm, a, this.s, this.r, this.t, this.y, this.z, this.d, this.m, this.w, this.e, this.h);
        iwb.a.r = this.u;
        iwb.a.s = this.v;
        iwb.a.q = this.c;
        iwb.a.g = this.f;
        final iwe iwe = new iwe(this, iwb, 1);
        iwb.c = iwe;
        final iwt a2 = iwb.a;
        a2.h = iwe;
        final int j = this.j;
        a2.b.setColor(j);
        a2.c.setColor(j);
        iwb.b = this.a;
        iwb.a.t = this.o;
        Object o = iwm.d;
        synchronized (o) {
            final View view = iwm.a.get();
            if (!iwm.e && view != null) {
                final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)iwm);
                iwm.e = true;
                iwm.f = new iwl(iwm, viewTreeObserver);
                monitorexit(o);
            }
            else {
                monitorexit(o);
            }
            o = new iwe(this, iwb);
            iwm.c.add(o);
            final List p = this.p;
            o = iwb.a;
            ((iwt)o).d.clear();
            ((iwt)o).d.addAll(p);
            if (this.x) {
                this.b(iwb);
            }
            else if (!this.g) {
                o = iwm.a.get();
                if (o != null && ((View)o).getVisibility() == 0) {
                    this.b(iwb);
                }
            }
            else {
                o = new iwe(this, iwb, 2);
                iwm.b.add(o);
            }
            return new iwd(this, iwb, iwm);
        }
    }
    
    public final void b(final iwb iwb) {
        final Object l = this.l;
        monitorenter(l);
        try {
            Label_0073: {
                if (!this.k) {
                    final Iterator iterator = this.q.iterator();
                    while (iterator.hasNext()) {
                        if (!(boolean)((Supplier)iterator.next()).get()) {
                            break Label_0073;
                        }
                    }
                    this.i.e(iwb);
                    monitorexit(l);
                    return;
                }
            }
            monitorexit(l);
        }
        finally {
            monitorexit(l);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final View r, final int z) {
        this.r = r;
        this.s = 1;
        this.z = z;
    }
    
    @Override
    public final void d(final Supplier supplier) {
        this.q.add(supplier);
    }
    
    @Override
    public final void e(final Runnable runnable) {
        this.p.add(runnable);
    }
    
    @Override
    public final void f(final Runnable runnable, final Executor executor) {
        this.o.add(Pair.create((Object)runnable, (Object)executor));
    }
    
    @Override
    public final void g(final Runnable runnable, final Executor executor) {
        this.a.add(new iwa(runnable, executor, 0L));
    }
    
    public final void h(final View r, final int y) {
        this.r = r;
        this.s = 4;
        this.y = y;
    }
    
    public final void i(final View r, final int y) {
        this.r = r;
        this.s = 3;
        this.y = y;
    }
    
    @Override
    public final void j(final View r, final int z) {
        this.r = r;
        this.s = 2;
        this.z = z;
    }
    
    @Override
    public final void k() {
        this.w = true;
    }
    
    @Override
    public final void l() {
        this.u = 400;
    }
    
    @Override
    public final void m() {
        this.v = 300;
    }
    
    @Override
    public final void n() {
        this.x = true;
    }
    
    public final void o(final View view) {
        this.c(view, 0);
    }
    
    @Override
    public final void p() {
        this.t = 2;
    }
    
    @Override
    public final void q() {
        this.t = 3;
    }
    
    @Override
    public final void r() {
        this.t = 1;
    }
    
    @Override
    public final void s(final View view) {
        this.i(view, 0);
    }
    
    public final void t(final View view) {
        this.j(view, 0);
    }
    
    @Override
    public final void u() {
        int j;
        if (this.h) {
            j = neu.c(this.r, 2130968909);
        }
        else {
            j = this.r.getResources().getColor(2131101472, (Resources$Theme)null);
        }
        this.j = j;
    }
    
    @Override
    public final void v() {
        this.e = false;
    }
}
