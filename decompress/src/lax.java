import java.util.ArrayList;
import java.util.List;
import android.hardware.camera2.CameraAccessException;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lax
{
    private final kwg a;
    private final kzx b;
    private final kyd c;
    private final lcr d;
    private final lar e;
    private final Set f;
    private final noi g;
    private final Set h;
    private final kxc i;
    
    public lax(final kwg a, final kzx b, final kyd c, final kxp kxp, final kyb kyb, final kxc i, final lcr d, final lar e, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = kyb.b();
        this.g = kxp.a();
        this.i = i;
        this.h = new HashSet();
    }
    
    private final lda i(final kwv kwv, Set a, final Set set, final Set set2, final Set set3) {
        final Iterator iterator = set3.iterator();
        while (iterator.hasNext()) {
            njo.d(set2.contains(((kzp)iterator.next()).c));
        }
        final nog nog = new nog();
        final Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            nog.i(((kzl)iterator2.next()).c);
        }
        final HashMap hashMap = new HashMap();
        final nrv bn = this.a.h.bN();
        while (bn.hasNext()) {
            final kws kws = bn.next();
            hashMap.put(kws.a, kws);
        }
        final Iterator iterator3 = set2.iterator();
        while (iterator3.hasNext()) {
            for (final kws kws2 : ((kzl)iterator3.next()).d) {
                if (hashMap.containsKey(kws2.a)) {
                    final kws kws3 = hashMap.get(kws2.a);
                    kws3.getClass();
                    if (kws2.equals(kws3)) {
                        continue;
                    }
                    final String value = String.valueOf(kws2.a);
                    final String value2 = String.valueOf(kws2.b);
                    final String value3 = String.valueOf(kws3.b);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 53 + String.valueOf(value2).length() + String.valueOf(value3).length());
                    sb.append("Conflicting parameter value for ");
                    sb.append(value);
                    sb.append(": ");
                    sb.append(value2);
                    sb.append(" and ");
                    sb.append(value3);
                    sb.append(" do not match.");
                    throw new IllegalStateException(sb.toString());
                }
                else {
                    hashMap.put(kws2.a, kws2);
                }
            }
        }
        for (final kws kws4 : a) {
            if (!hashMap.containsKey(kws4.a)) {
                hashMap.put(kws4.a, kws4);
            }
        }
        final nns b = kwv.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final kws kws5 = b.get(i);
            if (!hashMap.containsKey(kws5.a)) {
                hashMap.put(kws5.a, kws5);
            }
        }
        final lar e = this.e;
        a = e.a();
        try {
            final Set f = lar.f(e.a);
            ((krc)a).close();
            final Iterator iterator6 = f.iterator();
            while (iterator6.hasNext()) {
                a = iterator6.next();
                if (!hashMap.containsKey(((kws)a).a)) {
                    hashMap.put(((kws)a).a, a);
                }
            }
            a = new nog();
            ((nog)a).i(set);
            final kyd c = this.c;
            final kxw kxw = (kxw)c.a.get();
            kxw.getClass();
            final kyb kyb = (kyb)c.b.get();
            kyb.getClass();
            final kzx kzx = (kzx)c.c.get();
            kzx.getClass();
            set3.getClass();
            ((nog)a).g(new kyc(kxw, kyb, kzx, set2, set3));
            ((nog)a).g(this.b);
            return new lda(kwv.a, noi.F(hashMap.values()), ((nog)a).f(), nog.f());
        }
        finally {
            Label_0764: {
                try {
                    ((krc)a).close();
                    break Label_0764;
                }
                finally {
                    final Throwable t;
                    ((Throwable)kwv).addSuppressed(t);
                }
            }
            while (true) {}
        }
    }
    
    private final lda j(final Set set, final Set set2, final Set set3, final Set set4) {
        kwv kwv;
        if (n(set3)) {
            kwv = this.a.f;
        }
        else {
            kwv = this.a.e;
        }
        return this.i(kwv, set, set2, set3, set4);
    }
    
    private final void k() {
        monitorenter(this);
        try {
            final Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                final kzp kzp = (kzp)iterator.next();
                if (kzp.k()) {
                    iterator.remove();
                    kzp.g();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void l() {
        monitorenter(this);
        try {
            this.k();
            for (final kzp kzp : this.h) {
                kzp.f();
                kzp.g();
            }
            this.h.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void m(final Set set) {
        synchronized (this) {
            this.k();
            this.h.addAll(set);
        }
    }
    
    private static final boolean n(final Set set) {
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final Iterator<Object> iterator2 = ((kzl)iterator.next()).c.iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().e()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final kyh a() {
        synchronized (this) {
            final kyh kyh = new kyh(new HashMap(), new HashSet(nqr.a), new HashSet(nqr.a));
            kyh.a.addAll(this.f);
            kyh.e(this.g);
            kyh.g(this.i);
            return kyh;
        }
    }
    
    public final lda b(final Set set, final Set set2, final Set set3, final Set set4) {
        kwv kwv;
        if (n(set3)) {
            kwv = this.a.d;
        }
        else {
            kwv = this.a.c;
        }
        return this.i(kwv, set, set2, set3, set4);
    }
    
    public final void c() {
        monitorenter(this);
        try {
            lcr d = this.d;
            final lcr a;
            final lcq lcq;
            synchronized (d) {
                Label_0309: {
                    if (((lcq)d).d) {
                        monitorexit(d);
                        break Label_0309;
                    }
                    a = ((lcq)d).a;
                    if (a == null) {
                        ((lcq)d).a();
                        monitorexit(d);
                        break Label_0309;
                    }
                    ((lcq)d).c = true;
                    ((lcq)d).b = a;
                    ((lcq)d).a = null;
                    monitorexit(d);
                    ((ldh)a).a.f("captureSession#abortCaptures");
                    ((ldh)a).c.a.g.a(new Object[0]);
                    monitorenter(a);
                    try {
                        ((ldh)a).f = true;
                        final nnx n = nnx.n(((ldh)a).e);
                        ((ldh)a).e.clear();
                        monitorexit(a);
                        try {
                            ((ldh)a).d.a();
                            final nrv bn = n.t().bN();
                            while (bn.hasNext()) {
                                final ljh ljh = bn.next();
                                final long longValue = ldh.b(ljh);
                                final ldg ldg = (ldg)n.get(ljh);
                                if (ldg != null) {
                                    final krr b = ((ldh)a).b;
                                    final StringBuilder sb = new StringBuilder(57);
                                    sb.append("Aborting ");
                                    sb.append(longValue);
                                    sb.append(" by invoking onCaptureFailed");
                                    b.f(sb.toString());
                                    ((ldh)a).g(ljh, ldg);
                                }
                            }
                            synchronized (a) {
                                ((ldh)a).f = false;
                                monitorexit(a);
                                ((ldh)a).a.g();
                                this.l();
                                return;
                            }
                        }
                        finally {
                            final nrv bn2 = n.t().bN();
                            while (bn2.hasNext()) {
                                final ljh ljh2 = bn2.next();
                                final long longValue2 = ldh.b(ljh2);
                                final ldg ldg2 = (ldg)n.get(ljh2);
                                if (ldg2 != null) {
                                    final krr b2 = ((ldh)a).b;
                                    final StringBuilder sb2 = new StringBuilder(57);
                                    sb2.append("Aborting ");
                                    sb2.append(longValue2);
                                    sb2.append(" by invoking onCaptureFailed");
                                    b2.f(sb2.toString());
                                    ((ldh)a).g(ljh2, ldg2);
                                }
                            }
                            synchronized (a) {
                                ((ldh)a).f = false;
                            }
                        }
                    }
                    finally {
                        d = lcq;
                        final ldh ldh = (ldh)a;
                        monitorexit(ldh);
                    }
                }
            }
            try {
                d = lcq;
                final ldh ldh = (ldh)a;
                monitorexit(ldh);
            }
            catch (final ljd d) {}
            catch (final CameraAccessException ex) {}
        }
        catch (final ljd ljd) {}
        catch (final CameraAccessException ex2) {}
        finally {
            final lcr d;
            throw new kuw((Throwable)d);
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.d.d();
        }
    }
    
    public final void e(final List list, final List list2) {
        monitorenter(this);
        try {
            final boolean empty = list.isEmpty();
            boolean b = true;
            njo.d(empty ^ true);
            final int size = list.size();
            final int size2 = list2.size();
            int i = 0;
            if (size != size2) {
                b = false;
            }
            njo.d(b);
            final ArrayList list3 = new ArrayList(list.size());
            while (i < list.size()) {
                final kyi kyi = list.get(i);
                final Set set = list2.get(i);
                list3.add(this.b(kyi.a, kyi.b, kyi.c, set));
                this.m(set);
                ++i;
            }
            this.d.f(list3);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(final kyi kyi) {
        synchronized (this) {
            this.d.c(this.j(kyi.a, kyi.b, kyi.c, nqr.a));
        }
    }
    
    public final void g(final kyi kyi, final Set set) {
        synchronized (this) {
            final lda b = this.b(kyi.a, kyi.b, kyi.c, set);
            this.m(set);
            this.d.e(b);
        }
    }
    
    public final void h(final kyi kyi) {
        synchronized (this) {
            this.d.e(this.j(kyi.a, kyi.b, kyi.c, nqr.a));
        }
    }
}
