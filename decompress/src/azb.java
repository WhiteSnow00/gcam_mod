import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class azb implements axw, awo
{
    private final axv a;
    private final axx b;
    private int c;
    private int d;
    private awc e;
    private List f;
    private int g;
    private volatile bbv h;
    private File i;
    private azc j;
    
    public azb(final axx b, final axv a) {
        this.d = -1;
        this.b = b;
        this.a = a;
    }
    
    private final boolean d() {
        return this.g < this.f.size();
    }
    
    @Override
    public final void a() {
        final bbv h = this.h;
        if (h != null) {
            h.c.aI();
        }
    }
    
    @Override
    public final void b(final Object o) {
        this.a.e(this.e, o, this.h.c, 4, this.j);
    }
    
    @Override
    public final boolean c() {
        try {
            final List e = this.b.e();
            final boolean empty = e.isEmpty();
            boolean b = false;
            if (empty) {
                return false;
            }
            final axx b2 = this.b;
            final auu c = b2.c.c;
            final Class<?> class1 = b2.d.getClass();
            final Class g = b2.g;
            final Class j = b2.j;
            final bha f = c.f;
            bis bis = f.a.getAndSet(null);
            if (bis == null) {
                bis = new bis(class1, g, j);
            }
            else {
                bis.a(class1, g, j);
            }
            Object b3 = f.b;
            synchronized (b3) {
                final List list = (List)f.b.get(bis);
                monitorexit(b3);
                f.a.set(bis);
                final List list3;
                Label_0372: {
                    if (list == null) {
                        final ArrayList list2 = new ArrayList();
                        final Iterator iterator = c.a.a(class1).iterator();
                        while (iterator.hasNext()) {
                            final Iterator iterator2 = c.c.b((Class)iterator.next(), g).iterator();
                            while (iterator2.hasNext()) {
                                b3 = iterator2.next();
                                if (!c.e.b((Class)b3, j).isEmpty() && !list2.contains(b3)) {
                                    list2.add(b3);
                                }
                            }
                        }
                        final bha f2 = c.f;
                        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list2);
                        synchronized (f2.b) {
                            final yu b4 = f2.b;
                            b3 = new bis(class1, g, j);
                            b4.put(b3, unmodifiableList);
                            break Label_0372;
                        }
                    }
                    list3 = list;
                }
                if (!list3.isEmpty()) {
                    while (this.f == null || !this.d()) {
                        if (++this.d >= list3.size()) {
                            if (++this.c >= e.size()) {
                                return false;
                            }
                            this.d = 0;
                        }
                        final awc e2 = e.get(this.c);
                        final Class clazz = list3.get(this.d);
                        final awk a = this.b.a(clazz);
                        final azi c2 = this.b.c();
                        final axx b5 = this.b;
                        this.j = new azc(c2, e2, b5.m, b5.e, b5.f, a, clazz, b5.h);
                        final File a2 = this.b.d().a(this.j);
                        if ((this.i = a2) != null) {
                            this.e = e2;
                            this.f = this.b.g(a2);
                            this.g = 0;
                        }
                    }
                    this.h = null;
                    while (!b && this.d()) {
                        final bbw bbw = this.f.get(this.g++);
                        final File i = this.i;
                        final axx b6 = this.b;
                        this.h = bbw.a(i, b6.e, b6.f, b6.h);
                        if (this.h != null && this.b.h(this.h.c.a())) {
                            this.h.c.f(this.b.n, this);
                            b = true;
                        }
                    }
                    return b;
                }
                if (File.class.equals(this.b.j)) {
                    return false;
                }
                final String value = String.valueOf(this.b.d.getClass());
                final String value2 = String.valueOf(this.b.j);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 38 + String.valueOf(value2).length());
                sb.append("Failed to find any load path from ");
                sb.append(value);
                sb.append(" to ");
                sb.append(value2);
                throw new IllegalStateException(sb.toString());
            }
        }
        finally {
            while (true) {}
        }
    }
    
    @Override
    public final void e(final Exception ex) {
        this.a.d(this.j, ex, this.h.c, 4);
    }
}
