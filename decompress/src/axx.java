import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axx
{
    public final List a;
    public final List b;
    public auk c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public awg h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public awc m;
    public auo n;
    public ayg o;
    public boolean p;
    public boolean q;
    public ayl r;
    
    public axx() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    final awk a(final Class clazz) {
        awk awk2;
        final awk awk = awk2 = this.i.get(clazz);
        Label_0085: {
            if (awk == null) {
                final Iterator iterator = this.i.entrySet().iterator();
                Map.Entry<Class, V> entry;
                do {
                    awk2 = awk;
                    if (!iterator.hasNext()) {
                        break Label_0085;
                    }
                    entry = (Map.Entry<Class, V>)iterator.next();
                } while (!entry.getKey().isAssignableFrom(clazz));
                awk2 = (awk)entry.getValue();
            }
        }
        if (awk2 != null) {
            return awk2;
        }
        if (this.i.isEmpty() && this.p) {
            final String value = String.valueOf(clazz);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 115);
            sb.append("Missing transformation for ");
            sb.append(value);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return bdb.b;
    }
    
    final ayy b(final Class clazz) {
        final auu c = this.c.c;
        final Class g = this.g;
        final Class j = this.j;
        final bgz g2 = c.g;
        final AtomicReference c2 = g2.c;
        final ayy ayy = null;
        bis bis;
        if ((bis = c2.getAndSet(null)) == null) {
            bis = new bis();
        }
        bis.a(clazz, g, j);
        Object b = g2.b;
        monitorenter(b);
        try {
            final ayy ayy2 = (ayy)g2.b.get(bis);
            monitorexit(b);
            g2.c.set(bis);
            final bgz g3 = c.g;
            ayy ayy3;
            if (bgz.a.equals(ayy2)) {
                ayy3 = ayy;
            }
            else {
                if (ayy2 == null) {
                    final ArrayList list = new ArrayList();
                    for (final Class clazz2 : c.c.b(clazz, g)) {
                        final Iterator iterator2 = c.e.b(clazz2, j).iterator();
                        while (iterator2.hasNext()) {
                            b = iterator2.next();
                            list.add(new ayc(clazz, clazz2, (Class)b, c.c.a(clazz, clazz2), c.e.a(clazz2, (Class)b), c.h));
                        }
                    }
                    if (list.isEmpty()) {
                        ayy3 = null;
                    }
                    else {
                        ayy3 = new ayy(clazz, g, j, list, c.h);
                    }
                    final bgz g4 = c.g;
                    synchronized (g4.b) {
                        final yu b2 = g4.b;
                        final bis bis2 = new bis(clazz, g, j);
                        ayy a;
                        if (ayy3 != null) {
                            a = ayy3;
                        }
                        else {
                            a = bgz.a;
                        }
                        b2.put(bis2, a);
                        return ayy3;
                    }
                }
                ayy3 = ayy2;
            }
            return ayy3;
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    final azi c() {
        return this.c.b;
    }
    
    final azz d() {
        return this.r.a();
    }
    
    final List e() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            final List f = this.f();
            for (int size = f.size(), i = 0; i < size; ++i) {
                final bbv bbv = f.get(i);
                int j;
                if (!this.b.contains(bbv.a)) {
                    this.b.add(bbv.a);
                    j = 0;
                }
                else {
                    j = 0;
                }
                while (j < bbv.b.size()) {
                    if (!this.b.contains(bbv.b.get(j))) {
                        this.b.add(bbv.b.get(j));
                    }
                    ++j;
                }
            }
        }
        return this.b;
    }
    
    final List f() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            final List c = this.c.c.c(this.d);
            for (int size = c.size(), i = 0; i < size; ++i) {
                final bbv a = c.get(i).a(this.d, this.e, this.f, this.h);
                if (a != null) {
                    this.a.add(a);
                }
            }
        }
        return this.a;
    }
    
    final List g(final File file) {
        return this.c.c.c(file);
    }
    
    final boolean h(final Class clazz) {
        return this.b(clazz) != null;
    }
}
