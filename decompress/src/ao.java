import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.BitSet;
import java.util.List;
import android.app.ActivityManager;
import java.util.Set;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ao
{
    public ArrayList a;
    public Executor b;
    public afc c;
    private final Class d;
    private final String e;
    private final Context f;
    private Executor g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final ap k;
    private Set l;
    
    public ao(final Context f, final Class d, final String e) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.i = true;
        this.k = new ap();
    }
    
    public final aq a() {
        if (this.f == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        final Executor b = this.b;
        if (b == null && this.g == null) {
            final Executor a = ww.a;
            this.g = a;
            this.b = a;
        }
        else if (b != null && this.g == null) {
            this.g = b;
        }
        else if (b == null) {
            final Executor g = this.g;
            if (g != null) {
                this.b = g;
            }
        }
        afc c;
        if ((c = this.c) == null) {
            c = new afl();
        }
        final Context f = this.f;
        final String e = this.e;
        final ap k = this.k;
        final ArrayList a2 = this.a;
        final boolean h = this.h;
        final ActivityManager activityManager = (ActivityManager)f.getSystemService("activity");
        int n = 2;
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            n = 3;
        }
        final af af = new af(f, e, c, k, a2, h, n, this.b, this.g, this.i, this.j);
        final aq aq = (aq)cp.e(this.d);
        aq.b = aq.b(af);
        final Set d = aq.d();
        final BitSet set = new BitSet();
        final Iterator iterator = d.iterator();
    Label_0235:
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final int n2 = -1;
            if (hasNext) {
                final Class clazz = (Class)iterator.next();
                int i = af.g.size() - 1;
                while (true) {
                    while (i >= 0) {
                        if (clazz.isAssignableFrom(af.g.get(i).getClass())) {
                            set.set(i);
                            if (i >= 0) {
                                aq.f.put(clazz, af.g.get(i));
                                continue Label_0235;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("A required auto migration spec (");
                            sb.append(clazz.getCanonicalName());
                            sb.append(") is missing in the database configuration.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                        else {
                            --i;
                        }
                    }
                    i = n2;
                    continue;
                }
            }
            for (int j = af.g.size() - 1; j >= 0; --j) {
                if (!set.get(j)) {
                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                }
            }
            final Map f2 = aq.f;
            final Iterator iterator2 = aq.n().iterator();
            boolean b2;
            while (true) {
                final boolean hasNext2 = iterator2.hasNext();
                b2 = false;
                if (!hasNext2) {
                    break;
                }
                final be be = (be)iterator2.next();
                if (Collections.unmodifiableMap((Map<?, ?>)af.d.a).containsKey(be.a)) {
                    continue;
                }
                af.d.a(be);
            }
            if (aq.q(az.class, aq.b) == null) {
                if (aq.q(ae.class, aq.b) == null) {
                    if (af.m == 3) {
                        b2 = true;
                    }
                    final afd b3 = aq.b;
                    Object a3 = ((afk)b3).a;
                    synchronized (a3) {
                        final afj b4 = ((afk)b3).b;
                        if (b4 != null) {
                            b4.setWriteAheadLoggingEnabled(b2);
                        }
                        ((afk)b3).c = b2;
                        monitorexit(a3);
                        aq.e = af.e;
                        aq.a = af.i;
                        new bc(af.j);
                        aq.d = af.h;
                        final Map c2 = aq.c();
                        a3 = new BitSet();
                        for (final Map.Entry<Class, V> entry : c2.entrySet()) {
                            final Class clazz2 = entry.getKey();
                        Label_0740:
                            for (final Class clazz3 : (List)entry.getValue()) {
                                int l = af.f.size() - 1;
                                while (true) {
                                    while (l >= 0) {
                                        if (clazz3.isAssignableFrom(af.f.get(l).getClass())) {
                                            ((BitSet)a3).set(l);
                                            if (l >= 0) {
                                                aq.h.put(clazz3, af.f.get(l));
                                                continue Label_0740;
                                            }
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("A required type converter (");
                                            sb2.append(clazz3);
                                            sb2.append(") for ");
                                            sb2.append(clazz2.getCanonicalName());
                                            sb2.append(" is missing in the database configuration.");
                                            throw new IllegalArgumentException(sb2.toString());
                                        }
                                        else {
                                            --l;
                                        }
                                    }
                                    l = -1;
                                    continue;
                                }
                            }
                        }
                        for (int n3 = af.f.size() - 1; n3 >= 0; --n3) {
                            if (!((BitSet)a3).get(n3)) {
                                final Object value = af.f.get(n3);
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Unexpected type converter ");
                                sb3.append(value);
                                sb3.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        }
                        return aq;
                    }
                }
                throw null;
            }
            throw null;
        }
    }
    
    public final void b(final be... array) {
        final Set l = this.l;
        int i = 0;
        if (l == null) {
            this.l = new HashSet();
        }
        while (i <= 0) {
            final be be = array[i];
            this.l.add(be.a);
            this.l.add(be.b);
            ++i;
        }
        this.k.a(array);
    }
    
    public final void c() {
        this.h = true;
    }
    
    public final void d() {
        this.i = false;
        this.j = true;
    }
}
