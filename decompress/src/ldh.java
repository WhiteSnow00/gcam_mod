import java.util.ArrayList;
import android.util.ArrayMap;
import java.util.Iterator;
import java.util.Collection;
import android.view.Surface;
import android.hardware.camera2.CameraAccessException;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import android.os.Handler;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldh implements lcr
{
    public final kse a;
    public final krr b;
    public final lbk c;
    public final lcs d;
    public final Map e;
    public boolean f;
    private final ldj g;
    private final Handler h;
    private long i;
    private long j;
    private Set k;
    private ljh l;
    
    public ldh(final lcs d, final ldj g, final Handler h, final kse a, final krr krr, final lbk c) {
        this.i = 0L;
        this.j = 0L;
        this.e = new HashMap();
        this.d = d;
        this.g = g;
        this.h = h;
        this.a = a;
        this.c = c;
        this.b = krr.a("SimpleReqProcessor");
        this.k = new HashSet();
    }
    
    public static Long b(final ljh ljh) {
        final Object b = ljh.b();
        b.getClass();
        return (Long)b;
    }
    
    private final int i(final List list, final ldg ldg, final boolean b) {
        synchronized (this) {
            this.c.b(list.size(), false);
            this.a.f("captureSession#captureBurst");
            try {
                try {
                    final int e = this.d.e(list, ldg, this.h, b);
                    this.a.g();
                    if (e < 0) {
                        this.m(list, ldg);
                    }
                    return e;
                }
                finally {}
            }
            catch (final CameraAccessException ex) {}
            catch (final ljd ljd) {}
            final krr b2 = this.b;
            final String value = String.valueOf(list);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 27);
            sb.append("Failed to submit repeating ");
            sb.append(value);
            final CameraAccessException ex;
            b2.e(sb.toString(), (Throwable)ex);
            throw new kuw((Throwable)ex);
            this.a.g();
            this.m(list, ldg);
        }
    }
    
    private final int j(final ljh l, final ldg ldg, final boolean b, final boolean b2) {
        monitorenter(this);
        Label_0029: {
            if (!b) {
                break Label_0029;
            }
            try {
                this.c.b(1, true);
                this.a.f("captureSession#setRepeatingRequest");
            Label_0082_Outer:
                while (true) {
                    int n = -1;
                    while (true) {
                        if (b) {
                            final CameraAccessException ex;
                            Label_0301: {
                                try {
                                    n = this.d.f(l, ldg, this.h, b2);
                                    while (true) {
                                        try {
                                            monitorenter(this);
                                            Label_0130: {
                                                if (!b) {
                                                    break Label_0130;
                                                }
                                                try {
                                                    this.e.remove(this.l);
                                                    this.l = l;
                                                    this.e.put(l, ldg);
                                                    monitorexit(this);
                                                    this.a.g();
                                                    if (n < 0) {
                                                        final krr b3 = this.b;
                                                        final String value = String.valueOf(l);
                                                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 52);
                                                        sb.append("Capture failed: ");
                                                        sb.append(value);
                                                        sb.append(" with invalid sequenceId ");
                                                        sb.append(n);
                                                        b3.h(sb.toString());
                                                        this.g(l, ldg);
                                                    }
                                                    return n;
                                                }
                                                finally {
                                                    monitorexit(this);
                                                }
                                            }
                                        }
                                        catch (final CameraAccessException ex) {}
                                        catch (final IllegalArgumentException ex) {}
                                        n = this.d.d(l, ldg, this.h, b2);
                                        continue Label_0082_Outer;
                                    }
                                }
                                catch (final CameraAccessException ex2) {}
                                catch (final IllegalArgumentException ex3) {}
                                finally {
                                    break Label_0301;
                                }
                                try {
                                    throw new kuw((Throwable)ex);
                                }
                                finally {}
                            }
                            this.a.g();
                            if (n < 0) {
                                final krr b4 = this.b;
                                final String value2 = String.valueOf(l);
                                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 52);
                                sb2.append("Capture failed: ");
                                sb2.append(value2);
                                sb2.append(" with invalid sequenceId ");
                                sb2.append(n);
                                b4.h(sb2.toString());
                                this.g(l, ldg);
                            }
                            throw ex;
                        }
                        continue;
                    }
                    this.c.b(1, false);
                    this.a.f("captureSession#capture");
                    continue Label_0082_Outer;
                }
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    private final ljh k(final lda lda, final nol nol, final Map map, final boolean b) {
        final HashMap hashMap = new HashMap();
        for (final kwz kwz : lda.c) {
            if (!hashMap.containsKey(kwz)) {
                final Surface g = ((ldw)kwz).g();
                final boolean f = this.g.f(g);
                if (g != null && g.isValid() && f) {
                    hashMap.put(kwz, g);
                }
                else if (g != null && g.isValid() && !f) {
                    final krr b2 = this.b;
                    final String value = String.valueOf(kwz);
                    final String value2 = String.valueOf(lda);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 73 + String.valueOf(value2).length());
                    sb.append("Failed to add ");
                    sb.append(value);
                    sb.append(" to CaptureRequest for ");
                    sb.append(value2);
                    sb.append(".  The surface is not yet available.");
                    b2.h(sb.toString());
                }
                else {
                    final krr b3 = this.b;
                    final String value3 = String.valueOf(kwz);
                    final String value4 = String.valueOf(lda);
                    final String value5 = String.valueOf(g);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 68 + String.valueOf(value4).length() + String.valueOf(value5).length());
                    sb2.append("Failed to add ");
                    sb2.append(value3);
                    sb2.append(" to CaptureRequest for ");
                    sb2.append(value4);
                    sb2.append(". The surface (");
                    sb2.append(value5);
                    sb2.append(") was not valid.");
                    b3.h(sb2.toString());
                }
            }
        }
        if (!hashMap.isEmpty()) {
            try {
                final leo c = this.d.c(lda);
                final Long l = this.l();
                c.a.setTag((Object)l);
                for (final Map.Entry<K, Surface> entry : hashMap.entrySet()) {
                    c.a.addTarget((Surface)entry.getValue());
                    map.put(entry.getValue(), entry.getKey());
                }
                for (final kws kws : lda.b) {
                    c.b(kws.a, kws.b);
                }
                kxc b4 = kwc.b(lda.d);
                if (!b) {
                    b4 = new kwy(b4, null, null);
                }
                nol.c(l, b4);
                this.h.post((Runnable)new ldc(lda, l, hashMap.keySet()));
                return c.a();
            }
            catch (final kuw kuw) {
                final krr b5 = this.b;
                final String value6 = String.valueOf(lda);
                final int a = lda.a;
                final StringBuilder sb3 = new StringBuilder(String.valueOf(value6).length() + 53);
                sb3.append("Failed to create a CaptureRequest using ");
                sb3.append(value6);
                sb3.append("(");
                sb3.append(a);
                sb3.append(")");
                b5.d(sb3.toString());
                throw kuw;
            }
        }
        final krr b6 = this.b;
        final String value7 = String.valueOf(lda);
        final StringBuilder sb4 = new StringBuilder(String.valueOf(value7).length() + 78);
        sb4.append("Failed to submit a CaptureRequest for ");
        sb4.append(value7);
        sb4.append(": There were no surfaces on the request.");
        b6.h(sb4.toString());
        leg.b(lda, this.h);
        return null;
    }
    
    private final Long l() {
        synchronized (this) {
            final long j = this.j;
            this.j = 1L + j;
            return j;
        }
    }
    
    private final void m(final List list, final ldg ldg) {
        final krr b = this.b;
        final String value = String.valueOf(list);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 22);
        sb.append("Burst Capture failed: ");
        sb.append(value);
        b.h(sb.toString());
        this.h.post((Runnable)new ldf(list, ldg));
    }
    
    private static final boolean n(final lda lda) {
        return lda.a == 3;
    }
    
    private static final boolean o(final lda lda, final ldg ldg) {
        return ldg.b.size() > 1 && n(lda);
    }
    
    public final long a() {
        synchronized (this) {
            final long i = this.i;
            this.i = 1L + i;
            return i;
        }
    }
    
    @Override
    public final void c(final lda lda) {
        this.a.f("SimpleRequestProcessor#setRepeating");
        this.c.b(1, true);
        try {
            try {
                final nol a = non.a();
                final ArrayMap arrayMap = new ArrayMap();
                final ljh k = this.k(lda, a, (Map)arrayMap, true);
                if (k != null) {
                    synchronized (this) {
                        if (!this.k.equals(lda.c)) {
                            final krr b = this.b;
                            final String value = String.valueOf(lda);
                            final String value2 = String.valueOf(lda.c);
                            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 23 + String.valueOf(value2).length());
                            sb.append("Submit repeating ");
                            sb.append(value);
                            sb.append(" with ");
                            sb.append(value2);
                            b.f(sb.toString());
                            this.k = noi.F(lda.c);
                        }
                        monitorexit(this);
                        final ldg ldg = new ldg(this, a.a(), (Map)arrayMap);
                        this.h.post((Runnable)new ldd(ldg, this.j(k, ldg, true, o(lda, ldg))));
                    }
                }
                this.a.g();
                return;
            }
            finally {}
        }
        catch (final Exception ex) {
            throw new kuw(ex);
        }
        this.a.g();
    }
    
    @Override
    public final void d() {
        try {
            this.d.b();
        }
        catch (final CameraAccessException ex) {
            throw new kuw((Throwable)ex);
        }
    }
    
    @Override
    public final void e(final lda lda) {
        this.a.f("SimpleRequestProcessor#submit");
        try {
            try {
                final nol a = non.a();
                final ArrayMap arrayMap = new ArrayMap();
                final ljh k = this.k(lda, a, (Map)arrayMap, false);
                if (k != null) {
                    final krr b = this.b;
                    final String value = String.valueOf(lda);
                    final String value2 = String.valueOf(lda.c);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 13 + String.valueOf(value2).length());
                    sb.append("Submit ");
                    sb.append(value);
                    sb.append(" with ");
                    sb.append(value2);
                    b.f(sb.toString());
                    final ldg ldg = new ldg(this, a.a(), (Map)arrayMap);
                    this.j(k, ldg, false, o(lda, ldg));
                }
                this.a.g();
                return;
            }
            finally {}
        }
        catch (final Exception ex) {
            final krr b2 = this.b;
            final String value3 = String.valueOf(lda);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 17);
            sb2.append("Failed to submit ");
            sb2.append(value3);
            b2.e(sb2.toString(), ex);
            throw ex;
        }
        this.a.g();
    }
    
    @Override
    public final void f(final List list) {
        this.a.f("SimpleRequestProcessor#submit-burst");
        try {
            try {
                final nol a = non.a();
                final ArrayMap arrayMap = new ArrayMap();
                final ArrayList list2 = new ArrayList(list.size());
                final Iterator iterator = list.iterator();
                boolean b;
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    b = false;
                    if (!hasNext) {
                        break;
                    }
                    final ljh k = this.k((lda)iterator.next(), a, (Map)arrayMap, false);
                    if (k == null) {
                        continue;
                    }
                    list2.add(k);
                }
                if (list2.size() > 0) {
                    final krr b2 = this.b;
                    final String value = String.valueOf(list);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
                    sb.append("Submit burst of ");
                    sb.append(value);
                    b2.f(sb.toString());
                    final ldg ldg = new ldg(this, a.a(), (Map)arrayMap);
                    if (ldg.b.size() > 1) {
                        for (int i = 0; i < list.size(); ++i) {
                            if (n((lda)list.get(i))) {
                                b = true;
                                break;
                            }
                        }
                    }
                    ldg.a(this.i(list2, ldg, b));
                    synchronized (this) {
                        final Iterator iterator2 = list2.iterator();
                        while (iterator2.hasNext()) {
                            this.e.put(iterator2.next(), ldg);
                        }
                    }
                }
                this.a.g();
            }
            finally {
                this.a.g();
                while (true) {}
            }
        }
        catch (final Exception ex) {}
    }
    
    public final void g(final ljh ljh, final ldg ldg) {
        this.h.post((Runnable)new lde(ldg, ljh));
    }
    
    public final void h(final long n) {
        monitorenter(this);
        try {
            for (final ljh ljh : this.e.keySet()) {
                if (b(ljh) == n) {
                    this.e.remove(ljh);
                    final krr b = this.b;
                    final StringBuilder sb = new StringBuilder(42);
                    sb.append("removeInflightRequest ");
                    sb.append(n);
                    b.b(sb.toString());
                    break;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
