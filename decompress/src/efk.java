import java.util.Date;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import android.os.Handler;
import java.util.PriorityQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efk implements efm, jiz, cot, exn, exe, exj, exh
{
    public static final Object a;
    public final kjm b;
    public final ewy c;
    public final PriorityQueue d;
    public liq e;
    public boolean f;
    public boolean g;
    public efl h;
    public int i;
    public final lit j;
    private final Handler k;
    private final Set l;
    private Runnable m;
    private boolean n;
    private boolean o;
    
    static {
        a = new Object();
    }
    
    public efk(final kjm b, final Handler k, final ewy c, final lit j) {
        this.l = new HashSet();
        this.d = new PriorityQueue(bzj.e);
        this.n = false;
        this.o = false;
        this.f = false;
        this.g = false;
        this.i = 1;
        this.b = b;
        this.k = k;
        this.c = c;
        this.j = j;
    }
    
    private final void p() {
        synchronized (efk.a) {
            final efl h = this.h;
            if (h != null) {
                this.b.execute(new eff(h));
                if (this.h.l()) {
                    this.d.remove(this.h);
                }
            }
            this.h = null;
            if (this.k.hasCallbacks(this.m)) {
                this.k.removeCallbacks(this.m);
            }
        }
    }
    
    private final void q(final efl efl, final Runnable runnable) {
        if (this.f) {
            return;
        }
        final efe efe = new efe(this, runnable);
        synchronized (efk.a) {
            this.b.execute(new efc(this, efl, efe));
            if (this.k.hasCallbacks(this.m)) {
                this.k.removeCallbacks(this.m);
            }
        }
    }
    
    private final boolean r(final efl efl) {
        synchronized (efk.a) {
            return !this.n && !this.o && !this.l.contains(efl.b());
        }
    }
    
    @Override
    public final void bh() {
        this.j.c(this.e);
    }
    
    @Override
    public final void bi() {
        this.o = true;
        final Object a = efk.a;
        monitorenter(a);
        try {
            final PriorityQueue d = this.d;
            int i = 0;
            for (efl[] array = d.toArray(new efl[0]); i < array.length; ++i) {
                final efl efl = array[i];
                if (!efl.n()) {
                    this.h(efl);
                }
            }
            monitorexit(a);
            this.p();
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void bj() {
        this.o = false;
        final niz g = this.g();
        if (g.g()) {
            this.n((efl)g.c());
        }
    }
    
    @Override
    public final void d(final boolean g) {
        synchronized (efk.a) {
            this.g = g;
            this.b.execute(new efj(this));
        }
    }
    
    @Override
    public final krc e(final efl efl) {
        synchronized (efk.a) {
            efl.i(new Date());
            if (this.d.contains(efl)) {
                if (efl.equals(this.h)) {
                    synchronized (efk.a) {
                        final efl h = this.h;
                        if (h != null && !h.m()) {
                            this.k.removeCallbacks(this.m);
                            this.k.postDelayed(this.m, (long)this.h.a());
                            this.b.execute(new efb(this, this.h, 1));
                        }
                    }
                }
                return new efg(this, efl, 1);
            }
            if (efl.l() && (!this.r(efl) || (this.h != null && (efn.a(efl.p()) <= efn.a(this.h.p()) || this.h.k())))) {
                return bqx.g;
            }
            this.d.add(efl);
            if (this.r(efl)) {
                if (this.h == null) {
                    this.n(efl);
                }
                else if (efl.equals(this.d.peek())) {
                    if (this.h.k()) {
                        this.q(this.h, aas.g);
                    }
                    else {
                        this.p();
                        this.n(efl);
                    }
                }
            }
            monitorexit(efk.a);
            return new efg(this, efl);
        }
    }
    
    @Override
    public final krc f(final efo efo) {
        this.k(efo);
        return new efh(this, efo);
    }
    
    public final niz g() {
        final Object a = efk.a;
        monitorenter(a);
        try {
            if (!this.n && !this.o) {
                final PriorityQueue<efl> priorityQueue = new PriorityQueue<efl>(this.d);
                for (efl efl = priorityQueue.peek(); efl != null; efl = priorityQueue.peek()) {
                    if (this.r(efl)) {
                        final niz i = niz.i(efl);
                        monitorexit(a);
                        return i;
                    }
                    priorityQueue.poll();
                }
                monitorexit(a);
                return nii.a;
            }
            final nii a2 = nii.a;
            monitorexit(a);
            return a2;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void h(final efl efl) {
        synchronized (efk.a) {
            if (efl.equals(this.h)) {
                if (this.h.k()) {
                    this.q(this.h, new efb(this, efl, 2));
                    this.f = true;
                }
                else {
                    this.p();
                    this.d.remove(efl);
                    final niz g = this.g();
                    if (g.g()) {
                        this.n((efl)g.c());
                    }
                }
            }
            else {
                this.d.remove(efl);
            }
        }
    }
    
    @Override
    public final void i(final Object o) {
        final Object a = efk.a;
        monitorenter(a);
        try {
            final PriorityQueue d = this.d;
            int i = 0;
            for (efl[] array = d.toArray(new efl[0]); i < array.length; ++i) {
                final efl efl = array[i];
                if (o.equals(efl.c())) {
                    this.h(efl);
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void j() {
        synchronized (efk.a) {
            this.n = true;
            if (this.h != null) {
                this.p();
            }
        }
    }
    
    @Override
    public final void k(final efo efo) {
        synchronized (efk.a) {
            this.l.add(efo);
            final efl h = this.h;
            if (h != null && this.l.contains(h.b())) {
                this.p();
                final niz g = this.g();
                if (g.g()) {
                    this.n((efl)g.c());
                }
            }
        }
    }
    
    @Override
    public final void l(final efo efo) {
        synchronized (efk.a) {
            this.l.remove(efo);
            final niz g = this.g();
            if (g.g() && !g.c().equals(this.h)) {
                this.p();
                this.n((efl)g.c());
            }
        }
    }
    
    @Override
    public final void m() {
        synchronized (efk.a) {
            this.n = false;
            this.l.clear();
            final efl efl = this.d.peek();
            final efl h = this.h;
            if (h == null && efl != null) {
                this.n(efl);
            }
            else if (efl != null && !efl.equals(h)) {
                this.p();
                this.n(efl);
            }
        }
    }
    
    public final void n(final efl h) {
        synchronized (efk.a) {
            this.b.execute(new efb(this, h));
            this.h = h;
            if (!h.m()) {
                final efj m = new efj(this, 2);
                this.m = m;
                this.k.postDelayed((Runnable)m, (long)h.a());
            }
        }
    }
    
    @Override
    public final void o(final int i) {
        synchronized (efk.a) {
            this.i = i;
            this.b.execute(new efd(this, i));
        }
    }
}
