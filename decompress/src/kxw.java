import java.util.Map;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxw
{
    public final lbd a;
    public final kzq b;
    private final lhl c;
    
    public kxw(final lhl c, final lbd a, final kzq b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final krc a() {
        return this.c.c();
    }
    
    public final oey b(final Set set) {
        monitorenter(this);
        try {
            final kjk kjk = new kjk();
            try {
                kjk.c(this.a());
                final kxv kxv = new kxv(this);
                for (final kzl kzl : set) {
                    for (final ldk ldk : kzl.a) {
                        if (!kxv.b.contains(ldk)) {
                            final lbd a = kxv.d.a;
                            final lhk b = a.b(ldk);
                            oey g;
                            if (b == null) {
                                g = ldk.b.a.g(1L);
                            }
                            else {
                                g = null;
                            }
                            nov.A(ldk.d > 0L);
                            final lhk a2 = a.a(ldk.d);
                            oey g2;
                            if (a2 == null) {
                                g2 = a.a.g(ldk.d);
                            }
                            else {
                                g2 = null;
                            }
                            oey oey;
                            if (b != null && a2 != null) {
                                oey = ofi.n(led.f(a2, b));
                            }
                            else {
                                oey n;
                                if ((n = g) == null) {
                                    b.getClass();
                                    n = ofi.n(b);
                                }
                                oey n2;
                                if ((n2 = g2) == null) {
                                    a2.getClass();
                                    n2 = ofi.n(a2);
                                }
                                oey = knf.c(n, n2, new lbc());
                            }
                            kxv.a.add(odg.h(oey, new kxt(ldk), odx.a));
                            kxv.b.add(ldk);
                        }
                    }
                    for (final ldm ldm : kzl.b) {
                        if (!kxv.b.contains(ldm)) {
                            final long b2 = ldm.b;
                            if (b2 > 0L) {
                                final lbd a3 = kxv.d.a;
                                nov.A(b2 > 0L);
                                final lhk a4 = a3.a(ldm.b);
                                oey oey2;
                                if (a4 == null) {
                                    oey2 = odg.h(a3.a.g(ldm.b), new fzt(17), odx.a);
                                }
                                else {
                                    oey2 = ofi.n(led.f(a4, null));
                                }
                                kxv.a.add(odg.h(oey2, new kxu(ldm), odx.a));
                            }
                            else {
                                kxv.a.add(ofi.n(ldn.g(ldm)));
                            }
                            kxv.b.add(ldm);
                        }
                    }
                    kxv.c.add(kzl);
                }
                final oey h = odg.h(ofi.j(kxv.a), new kxs(kxv), odx.a);
                kjk.close();
                monitorexit(this);
                return h;
            }
            finally {
                try {
                    kjk.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)set).addSuppressed(t);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Set c(Set d) {
        synchronized (this) {
            d = this.d(d, nqr.a);
            return d;
        }
    }
    
    public final Set d(final Set set, final Set set2) {
        monitorenter(this);
        try {
            final kjk kjk = new kjk();
            try {
                kjk.c(this.a());
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                final ArrayList list3 = new ArrayList();
                final ArrayList list4 = new ArrayList();
                for (final kzp kzp : set2) {
                    for (final leb leb : kzp.a) {
                        final kwz d = leb.d();
                        if (!list4.contains(d)) {
                            list4.add(d);
                            list.add(leb);
                        }
                        else {
                            njo.d(list.contains(leb));
                        }
                    }
                    final kzl c = kzp.c;
                    njo.o(true ^ list3.contains(c));
                    list3.add(c);
                    list2.add(kzp);
                }
            Label_0229:
                for (final kzl kzl : set) {
                    if (!list3.contains(kzl)) {
                        list3.add(kzl);
                        final ArrayList list5 = new ArrayList();
                        while (true) {
                        Label_0619:
                            while (true) {
                                for (final ldk ldk : kzl.a) {
                                    if (!list4.contains(ldk)) {
                                        kjk.c(ldk.b.a());
                                        final lbd a = this.a;
                                        final lhk b = a.b(ldk);
                                        led f;
                                        if (b == null) {
                                            f = null;
                                        }
                                        else {
                                            nov.A(ldk.d > 0L);
                                            final lhk a2 = a.a(ldk.d);
                                            lhk d2;
                                            if ((d2 = a2) == null) {
                                                d2 = a2;
                                                if (ldk.i()) {
                                                    d2 = a.a.d(ldk.d);
                                                }
                                            }
                                            if (d2 == null) {
                                                b.close();
                                                f = null;
                                            }
                                            else {
                                                f = led.f(d2, b);
                                            }
                                        }
                                        if (f == null) {
                                            final ArrayList list6 = list5;
                                            for (int size = list6.size(), i = 0; i < size; ++i) {
                                                try (final krc a3 = ((leb)list6.get(i)).a()) {}
                                            }
                                            continue Label_0229;
                                        }
                                        list5.add(ldv.e(ldk, f));
                                    }
                                }
                                for (final ldm ldm : kzl.b) {
                                    if (!list4.contains(ldm)) {
                                        final long b2 = ldm.b;
                                        if (b2 > 0L) {
                                            final lbd a4 = this.a;
                                            njo.d(b2 > 0L);
                                            final lhk a5 = a4.a(ldm.b);
                                            led f2;
                                            if (a5 == null) {
                                                f2 = null;
                                            }
                                            else {
                                                f2 = led.f(a5, null);
                                            }
                                            final ArrayList list6 = list5;
                                            if (f2 == null) {
                                                continue Label_0619;
                                            }
                                            list5.add(ldn.e(ldm, f2));
                                        }
                                        else {
                                            list5.add(ldn.g(ldm));
                                        }
                                    }
                                }
                                break;
                            }
                            for (int size2 = list5.size(), j = 0; j < size2; ++j) {
                                final leb leb2 = (leb)list5.get(j);
                                njo.o(list.contains(leb2) ^ true);
                                list4.add(leb2.d());
                                list.add(leb2);
                            }
                            continue;
                        }
                    }
                }
                final kzq b3 = this.b;
                final ArrayMap arrayMap = new ArrayMap();
                for (final leb leb3 : list) {
                    ((Map<kwz, leb>)arrayMap).put(leb3.d(), leb3);
                }
                final nog d3 = noi.D();
                for (final kzl kzl2 : list3) {
                    final Iterator iterator8 = list2.iterator();
                    Object o = null;
                    while (iterator8.hasNext()) {
                        final kzp kzp2 = (kzp)iterator8.next();
                        if (kzp2.c == kzl2) {
                            o = kzp2;
                        }
                    }
                    if (o != null) {
                        d3.g(o);
                    }
                    else {
                        final nog d4 = noi.D();
                        final nrv bn = kzl2.c.bN();
                        while (bn.hasNext()) {
                            final kwz kwz = bn.next();
                            leb f3;
                            if ((f3 = ((Map<kwz, leb>)arrayMap).get(kwz)) == null) {
                                if (kwz instanceof ldk) {
                                    final led g = led.g();
                                    f3 = new ldv(kwz, g);
                                    g.e((krc)f3);
                                }
                                else {
                                    nov.A(kwz instanceof ldm);
                                    f3 = ldn.f(kwz);
                                }
                                ((Map<kwz, leb>)arrayMap).put(kwz, f3);
                            }
                            d4.g(f3);
                        }
                        d3.g(kzp.n(b3, kzl2, d4.f()));
                    }
                }
                final noi f4 = d3.f();
                kjk.close();
                monitorexit(this);
                return f4;
            }
            finally {
                try {
                    kjk.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)set).addSuppressed(t);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
