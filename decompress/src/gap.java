import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class gap implements gdf
{
    private final Map a;
    private final Map b;
    private final gbg c;
    
    public gap(final gbg c) {
        this.c = c;
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    private final void b() {
        final Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((lju)iterator.next()).close();
        }
        final Iterator iterator2 = this.b.values().iterator();
        while (iterator2.hasNext()) {
            ((lju)iterator2.next()).close();
        }
    }
    
    private static final void c(final long n, final Map map) {
        final ArrayList list = new ArrayList();
        for (final long longValue : map.keySet()) {
            if (longValue < n) {
                final Long value = longValue;
                ((lju)map.get(value)).close();
                list.add(value);
            }
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            map.remove(list.get(i));
        }
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
        final Map b = this.b;
        final long d = lju.d();
        final gaa gaa = new gaa(lju);
        final fzy a = fzz.a;
        oey.getClass();
        gaa.a.put(a, oey);
        b.put(d, gaa);
        niz niz;
        if (this.b.isEmpty()) {
            niz = nii.a;
        }
        else {
            final Iterator iterator = this.b.values().iterator();
            int n = 0;
            long n2 = 0L;
            while (iterator.hasNext()) {
                final long d2 = ((lju)iterator.next()).d();
                long n3 = 0L;
                Label_0144: {
                    if (n != 0) {
                        n3 = n2;
                        if (d2 <= n2) {
                            break Label_0144;
                        }
                    }
                    n3 = d2;
                }
                n = 1;
                n2 = n3;
            }
            if (n == 0) {
                niz = nii.a;
            }
            else {
                niz = niz.i(n2);
            }
        }
        if (niz.g()) {
            c((long)niz.c(), this.b);
            c((long)niz.c(), this.a);
        }
    }
    
    @Override
    public final void close() {
        try {
            final oey m = ofi.m(new kuw());
            final boolean empty = this.b.isEmpty();
            Object o = null;
            gaa gaa;
            if (empty) {
                gaa = null;
            }
            else {
                final Iterator iterator = this.b.values().iterator();
                gaa gaa2 = null;
                while (true) {
                    gaa = gaa2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final gaa gaa3 = (gaa)iterator.next();
                    if (gaa2 != null && gaa3.d() <= gaa2.d()) {
                        continue;
                    }
                    gaa2 = gaa3;
                }
            }
            oey k = m;
            if (gaa != null) {
                this.b.remove(gaa.d());
                k = gaa.k();
                k.getClass();
            }
            if (gaa != null) {
                final lju lju = this.a.get(gaa.d());
                if ((o = lju) != null) {
                    this.a.remove(lju.d());
                    o = lju;
                }
            }
            final gbg c = this.c;
            final niz h = niz.h(gaa);
            final niz h2 = niz.h(o);
            try {
                if (h2.g()) {
                    ((lju)h2.c()).close();
                }
                final HashSet set = new HashSet();
                set.add(gxq.a);
                set.add(gxq.c);
                set.add(gxq.b);
                set.add(gxq.e);
                Label_0482: {
                    if (h.g()) {
                        c.e.b.add(k);
                        try {
                            final gxp b = c.d.b;
                            final gya a = gyb.a((lju)h.c());
                            a.d = k;
                            a.c = c.b;
                            a.f = c.d.c;
                            a.b(c.a.d());
                            b.e(a.a(), c.d.d, set, c.a, niz.i(c.c));
                            break Label_0482;
                        }
                        catch (final InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    final dgi dgi = new dgi("received an image, but it did not have any image data!");
                    gbh.a.b().E(1804).r("%s", dgi.getMessage());
                    c.a.C(iwx.a, dgi);
                }
                c.e.close();
                this.b();
            }
            finally {
                c.e.close();
            }
        }
        finally {
            this.b();
            while (true) {}
        }
    }
}
