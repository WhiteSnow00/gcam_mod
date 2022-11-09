import java.util.SortedSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Collection;
import android.net.Uri;
import java.util.HashMap;
import java.util.Comparator;
import j$.util.Comparator$_EL;
import j$.util.function.Function;
import j$.util.Comparator$_CC;
import java.util.Map;
import java.util.TreeSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class dad implements Iterable
{
    private static final nsd a;
    private final TreeSet b;
    private final Map c;
    private final Map d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/data/NavigableFilmstripData");
    }
    
    public dad() {
        this.b = new TreeSet(Comparator$_EL.reversed(Comparator$_EL.thenComparing(Comparator$_CC.comparing((Function)cdd.h), (Function)cdd.i)));
        this.c = new HashMap();
        this.d = new HashMap();
    }
    
    private final niz l(final bqs bqs) {
        monitorenter(this);
        try {
            final him d = bqs.d();
            final Uri c = bqs.c();
            final boolean b = false;
            njo.r(d != null || !c.equals((Object)Uri.EMPTY), "At least one of shotId or Uri should be set: %s", bqs);
            bqr bqr;
            if (d != null) {
                bqr = this.c.get(d);
            }
            else {
                bqr = null;
            }
            final bqr bqr2 = this.d.get(c);
            if (bqr != null && bqr2 != null) {
                njo.s(bqr == bqr2 || b, "Maps out of sync, byUri:%s, byShotId: %s", bqr2, bqr);
                final niz i = niz.i(bqr);
                monitorexit(this);
                return i;
            }
            if (bqr != null) {
                final niz j = niz.i(bqr);
                monitorexit(this);
                return j;
            }
            niz niz;
            if (bqr2 != null) {
                niz = niz.i(bqr2);
            }
            else {
                niz = nii.a;
            }
            monitorexit(this);
            return niz;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void m(final bqr bqr) {
        synchronized (this) {
            final niz l = this.l(bqr.a());
            if (!l.g()) {
                return;
            }
            final bqr bqr2 = (bqr)l.c();
            final him d = bqr2.a().d();
            final Uri c = bqr2.a().c();
            if (d != null) {
                ((bqr)this.c.remove(d)).getClass();
            }
            if (!c.equals((Object)Uri.EMPTY)) {
                ((bqr)this.d.remove(c)).getClass();
            }
            njo.s(this.b.remove(bqr2), "Couldn't remove %s from filmstripItems=%s", bqr2, this.b);
        }
    }
    
    final int a() {
        synchronized (this) {
            return this.b.size();
        }
    }
    
    final bqr b() {
        monitorenter(this);
        try {
            bqr bqr;
            if (!this.b.isEmpty()) {
                bqr = this.b.first();
            }
            else {
                bqr = null;
            }
            monitorexit(this);
            return bqr;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final bqr c(final Uri uri) {
        synchronized (this) {
            return this.d.get(uri);
        }
    }
    
    final bqr d(final him him) {
        synchronized (this) {
            return this.c.get(him);
        }
    }
    
    final bqr e(bqr bqr) {
        synchronized (this) {
            final niz l = this.l(bqr.a());
            if (l.g()) {
                bqr = (bqr)l.c();
                return bqr;
            }
            this.k(bqr);
            return bqr;
        }
    }
    
    final bqr f() {
        monitorenter(this);
        try {
            bqr bqr;
            if (!this.b.isEmpty()) {
                bqr = this.b.last();
            }
            else {
                bqr = null;
            }
            monitorexit(this);
            return bqr;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void g(final Collection collection) {
        monitorenter(this);
        try {
            final int c = ((nql)collection).c;
            njo.q(this.b.size() == 0, "addAll must be called on an empty list. filmstripItems contains: %s", this.b.size());
            njo.q(this.d.size() == 0, "addAll must be called on an empty list. uriFilmstripItemMap contains: %s", this.d.size());
            njo.q(this.c.size() == 0, "addAll must be called on an empty list. shotToFilmStripMap contains: %s", this.c.size());
            this.b.addAll(collection);
            final nrw t = ((nns)collection).t();
            while (t.hasNext()) {
                final bqr bqr = t.next();
                final him d = bqr.a().d();
                final Uri c2 = bqr.a().c();
                if (!c2.equals((Object)Uri.EMPTY)) {
                    njo.p(this.d.containsKey(c2) ^ true, String.format(Locale.ROOT, "Multiple entries for uri: %s. %s & %s", c2, this.d.get(c2), bqr));
                    this.d.put(c2, bqr);
                }
                if (d != null) {
                    njo.p(this.c.containsKey(d) ^ true, String.format(Locale.ROOT, "Multiple entries for shotId: %s. %s & %s", d, this.c.get(d), bqr));
                    this.c.put(d, bqr);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void h() {
        synchronized (this) {
            this.c.clear();
            this.d.clear();
            this.b.clear();
        }
    }
    
    final void i(final Uri uri) {
        synchronized (this) {
            final bqr c = this.c(uri);
            if (c == null) {
                a.k(dad.a.c(), "Uri %s not found in filmstrip", uri, '\u02a6');
                return;
            }
            this.m(c);
        }
    }
    
    @Override
    public final Iterator iterator() {
        synchronized (this) {
            return new TreeSet(this.b).iterator();
        }
    }
    
    final void j(final bqr bqr) {
        synchronized (this) {
            this.m(bqr);
        }
    }
    
    final void k(bqr bqr) {
        synchronized (this) {
            final bqs a = bqr.a();
            final him d = a.d();
            final Uri c = a.c();
            boolean b = true;
            if (d == null) {
                if (c.equals((Object)Uri.EMPTY)) {
                    b = false;
                }
            }
            njo.r(b, "At least one of shotId or Uri should be set: %s", bqr);
            final niz l = this.l(a);
            if (l.g()) {
                bqr = (bqr)l.c();
                this.b.remove(bqr);
                bqr.f(a);
            }
            if (d != null) {
                this.c.put(d, bqr);
            }
            if (!c.equals((Object)Uri.EMPTY)) {
                this.d.put(c, bqr);
            }
            this.b.add(bqr);
            l.g();
        }
    }
}
