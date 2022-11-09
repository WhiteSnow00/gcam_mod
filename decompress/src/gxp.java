import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxp implements gxr, gxz
{
    private static final kre l;
    protected final ExecutorService a;
    protected final ExecutorService b;
    protected final ExecutorService c;
    protected final ExecutorService d;
    public final Map e;
    public final Map f;
    public final Set g;
    public int h;
    public int i;
    public int j;
    public final gxw k;
    private final gyu m;
    private final kse n;
    private final kre o;
    private final gxa p;
    
    static {
        l = new kre(512, 384);
    }
    
    public gxp(final ExecutorService a, final ExecutorService b, final ExecutorService c, final ExecutorService d, final gyu m, final gxa p8, final kse n, final int n2) {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.m = m;
        this.k = new gxw();
        this.p = p8;
        this.n = n;
        this.e = new HashMap();
        this.f = new HashMap();
        this.o = new kre(n2, n2);
        this.g = new HashSet();
    }
    
    public final void a(final gyp gyp) {
        synchronized (this.f) {
            this.f.remove(gyp);
        }
    }
    
    @Override
    public final void b(final lju lju, final Executor executor) {
        synchronized (this.e) {
            final gxm gxm = this.e.get(lju);
            if (gxm != null && gxm.b() > 0) {
                gxm.a(-1);
                --this.h;
                if (gxm.b() == 0) {
                    this.e.remove(lju);
                    this.g.retainAll(this.e.keySet());
                    if (gxm.b) {
                        final gxl gxl = new gxl(this, lju);
                        if (executor == null) {
                            gxl.run();
                        }
                        else {
                            executor.execute(gxl);
                        }
                    }
                    if (gxm.a) {
                        gxm.d();
                    }
                }
                else {
                    this.e.put(lju, gxm);
                }
                return;
            }
            throw new RuntimeException("ERROR: Task implementation did NOT balance its release.");
        }
    }
    
    public final void c(final Set set, final gxo gxo) {
        final Map f = this.f;
        monitorenter(f);
        try {
            for (final gyp gyp : set) {
                this.f.put(gyp, gxo);
                final gxn gxn = new gxn(this, gxo, gyp, this.n);
                switch (gyp.h - 1) {
                    default: {
                        this.d.execute(gxn);
                        continue;
                    }
                    case 2: {
                        this.c.execute(gxn);
                        continue;
                    }
                    case 1: {
                        this.b.execute(gxn);
                        continue;
                    }
                    case 0: {
                        this.a.execute(gxn);
                        continue;
                    }
                }
            }
            monitorexit(f);
        }
        finally {
            monitorexit(f);
            while (true) {}
        }
    }
    
    public final boolean d(hhy f, final Set set, final boolean b, final boolean b2, niz iterator) {
        f.getClass();
        if (set.size() > 0) {
            final HashMap hashMap = new HashMap();
            final Iterator iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                final lju a = ((gyp)iterator2.next()).f.a;
                final Integer n = (Integer)hashMap.get(a);
                if (n == null) {
                    hashMap.put(a, 1);
                }
                else {
                    hashMap.put(a, n + 1);
                }
            }
            final Set keySet = hashMap.keySet();
            final gwo gwo = new gwo();
            gwo.e(set.size());
            final gxy gxy = new gxy(gwo, f, iterator);
            f = (hhy)this.f;
            synchronized (f) {
                final Iterator iterator3 = set.iterator();
                while (iterator3.hasNext()) {
                    njo.p(this.f.get(iterator3.next()) == null, "Overlap of Shadow Task association.  You've possibly submitted the same task twice?");
                }
                monitorexit(f);
                final gxo gxo = new gxo(gxy, keySet);
                final HashSet set2 = new HashSet(hashMap.keySet().size());
                iterator = (niz)hashMap.keySet().iterator();
                while (((Iterator)iterator).hasNext()) {
                    final lju lju = ((Iterator<lju>)iterator).next();
                    final int intValue = (int)hashMap.get(lju);
                    synchronized (this.e) {
                        njo.p(this.e.get(lju) == null, "Image is already being processed by another task.");
                        final gxm gxm = new gxm(b, b2);
                        gxm.e(intValue);
                        this.e.put(lju, gxm);
                        this.h += intValue;
                        ++this.i;
                        monitorexit(this.e);
                        set2.add((Object)gxm);
                        continue;
                    }
                    break;
                }
                this.p.a(gxo.a);
                this.c(set, gxo);
                final Iterator iterator4 = set2.iterator();
                while (iterator4.hasNext()) {
                    f = (hhy)iterator4.next();
                    if (((gxm)f).a) {
                        ((gwo)f).c();
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void e(final gyb gyb, final Executor executor, final Set set, final hhy hhy, niz i) {
        final HashSet set2 = new HashSet();
        if (set.contains(gxq.b)) {
            final gyk gyk = new gyk(gyb, executor, this, hhy, this.m);
            if (set.contains(gxq.a)) {
                set2.add(new gyr(gyb, executor, this, hhy, gxp.l, niz.i(gyk), this.n));
            }
            else {
                set2.add(gyk);
            }
        }
        else if (set.contains(gxq.a)) {
            set2.add(new gyr(gyb, executor, this, hhy, gxp.l, nii.a, this.n));
        }
        if (set.contains(gxq.c)) {
            set2.add(new gyl(gyb, executor, this, 3, hhy, this.o, 3, this.n));
        }
        final njd njd = (njd)i;
        i = niz.i(new gxk(this, (gxv)njd.a));
        if (this.d(hhy, set2, set.contains(gxq.d), set.contains(gxq.e), i)) {
            final gxw k = this.k;
            final gxv gxv = (gxv)njd.a;
            final lju a = gyb.a;
            synchronized (k.a) {
                k.a.size();
                if (!k.a.contains(gxv)) {
                    k.a.add(gxv);
                }
                if (a == null) {
                    k.b.put(gxv, null);
                }
                else {
                    k.b.put(gxv, a.d());
                }
                k.a.size();
            }
        }
    }
    
    @Override
    public final String toString() {
        final int size = this.f.size();
        final int size2 = this.e.size();
        final int h = this.h;
        final gxw k = this.k;
        Object o = k.a;
        synchronized (o) {
            final int size3 = k.b.size();
            monitorexit(o);
            final gxw i = this.k;
            o = i.a;
            synchronized (o) {
                final int size4 = i.a.size();
                monitorexit(o);
                o = new StringBuilder(229);
                ((StringBuilder)o).append("ImageBackend Status BEGIN:\nShadow Image Map Size = ");
                ((StringBuilder)o).append(size);
                ((StringBuilder)o).append("\nImage Semaphore Map Size = ");
                ((StringBuilder)o).append(size2);
                ((StringBuilder)o).append("\nOutstandingImageRefs = ");
                ((StringBuilder)o).append(h);
                ((StringBuilder)o).append("\nProxy Listener Map Size = ");
                ((StringBuilder)o).append(size3);
                ((StringBuilder)o).append("\nProxy Listener = ");
                ((StringBuilder)o).append(size4);
                ((StringBuilder)o).append("\nImageBackend Status END:\n");
                return ((StringBuilder)o).toString();
            }
        }
    }
}
