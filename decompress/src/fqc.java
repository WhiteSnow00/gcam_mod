import java.util.Iterator;
import java.util.HashMap;
import java.util.Comparator;
import j$.util.List$_EL;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqc implements fsb
{
    private final fva a;
    private final oui b;
    private final hae c;
    private final fqx d;
    private final List e;
    
    public fqc(final hae c, final oui b, final fva a, final fqx d) {
        this.e = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private final fqb d(final long n) {
        had c;
        if ((c = this.c.c(n)) == null) {
            c = new had(n, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, false, nii.a, nii.a, nii.a);
        }
        return new fqb(c);
    }
    
    private static final fqa e(final fqb fqb) {
        return new fqa(fqb);
    }
    
    @Override
    public final int a(final List list) {
        monitorenter(this);
        try {
            this.e.clear();
            final ArrayList list2 = new ArrayList(list);
            List$_EL.sort((List)list2, (Comparator)bzj.f);
            final nns j = nns.j(list2);
            final int size = j.size();
            final int b = this.d.b();
            int n = this.d.a();
            if (size < b) {
                n = Math.max(1, n - b + size);
            }
            final int a = this.a.a();
            final int n2 = 0;
            if (a == 1) {
                monitorexit(this);
                return 0;
            }
            final kvx b2 = j.get(j.size() - 1).b();
            b2.getClass();
            final long a2 = b2.a;
            final int max = Math.max(j.size() - n, 0);
            final kvx b3 = j.get(max).b();
            b3.getClass();
            final nqe e = nqe.e(b3.a, a2);
            final HashMap hashMap = new HashMap();
            for (int i = 0; i < j.size(); ++i) {
                final kvx b4 = j.get(i).b();
                b4.getClass();
                final fqb d = this.d(b4.a);
                hashMap.put(j.get(i), d);
                this.e.add(d);
            }
            final List e2 = this.e;
            final ArrayList list3 = new ArrayList();
            final ArrayList list4 = new ArrayList();
            for (final fqb fqb : e2) {
                if (!e.k(fqb.a.a)) {
                    list3.add(fqb.a);
                }
                else {
                    list4.add(0.0f);
                }
            }
            final ArrayList list5 = new ArrayList();
            for (final had had : list3) {
                final float n3 = har.a(had, list3) * 5.0E-4f;
                final long a3 = had.a;
                list5.add(new hab(n3, n3));
            }
            final ArrayList list6 = new ArrayList();
            final Iterator iterator3 = list5.iterator();
            while (iterator3.hasNext()) {
                list6.add(((hab)iterator3.next()).b);
            }
            list6.addAll(list4);
            for (int k = 0; k < this.e.size(); ++k) {
                final fqb fqb2 = this.e.get(k);
                final fey fey = (fey)this.b.get();
                final Long value = fqb2.a.a;
                float n4;
                if (!fey.b(nqe.e(value, value))) {
                    n4 = 0.0f;
                }
                else {
                    n4 = -1000.0f;
                }
                final fey fey2 = (fey)this.b.get();
                final Long value2 = fqb2.a.a;
                float n5 = n4;
                if (!fey2.a(nqe.e(value2, value2))) {
                    n5 = n4 - 1000.0f;
                }
                fqb2.b += (float)list6.get(k) + n5;
                fqb2.c += n5;
            }
            for (int l = max; l < j.size(); ++l) {
                final lbe lbe = j.get(l);
                if (hashMap.containsKey(lbe)) {
                    final fqb fqb3 = (fqb)hashMap.get(lbe);
                    fqb3.b += 10000.0f;
                }
            }
            float n6 = Float.MAX_VALUE;
            int n7 = 0;
            float n9;
            for (int n8 = n2; n8 < j.size(); ++n8, n6 = n9) {
                final fqb fqb4 = (fqb)hashMap.get(j.get(n8));
                fqb4.getClass();
                final float b5 = fqb4.b;
                if (b5 < n6) {
                    n7 = n8;
                }
                n9 = n6;
                if (b5 < n6) {
                    n9 = b5;
                }
            }
            this.e.remove(n7);
            monitorexit(this);
            return n7;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final List b() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                list.add(e((fqb)iterator.next()));
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final fqa c(final long n) {
        return e(this.d(n));
    }
}
