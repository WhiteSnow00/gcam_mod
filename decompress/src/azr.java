import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class azr implements azi
{
    private final azn a;
    private final azq b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;
    
    public azr() {
        this.a = new azn();
        this.b = new azq();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }
    
    public azr(final int e) {
        this.a = new azn();
        this.b = new azq();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = e;
    }
    
    private final azh f(final Class clazz) {
        azh azh = this.d.get(clazz);
        if (azh == null) {
            if (clazz.equals(int[].class)) {
                azh = new azo();
            }
            else {
                if (!clazz.equals(byte[].class)) {
                    final String value = String.valueOf(clazz.getSimpleName());
                    String concat;
                    if (value.length() != 0) {
                        concat = "No array pool found for: ".concat(value);
                    }
                    else {
                        concat = new String("No array pool found for: ");
                    }
                    throw new IllegalArgumentException(concat);
                }
                azh = new azo(1);
            }
            this.d.put(clazz, azh);
        }
        return azh;
    }
    
    private final Object g(final azp azp, final Class clazz) {
        final azh f = this.f(clazz);
        final Object a = this.a.a(azp);
        if (a != null) {
            this.f -= f.a(a) * f.b();
            this.i(f.a(a), clazz);
        }
        if (a == null) {
            return f.c(azp.a);
        }
        return a;
    }
    
    private final NavigableMap h(final Class clazz) {
        NavigableMap navigableMap;
        if ((navigableMap = this.c.get(clazz)) == null) {
            navigableMap = new TreeMap();
            this.c.put(clazz, navigableMap);
        }
        return navigableMap;
    }
    
    private final void i(final int n, final Class clazz) {
        final NavigableMap h = this.h(clazz);
        final Integer value = n;
        final Integer n2 = (Integer)h.get(value);
        if (n2 == null) {
            final String value2 = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 56);
            sb.append("Tried to decrement empty size, size: ");
            sb.append(n);
            sb.append(", this: ");
            sb.append(value2);
            throw new NullPointerException(sb.toString());
        }
        if (n2 == 1) {
            h.remove(value);
            return;
        }
        h.put(value, n2 - 1);
    }
    
    private final void j(final int n) {
        while (this.f > n) {
            final Object b = this.a.b();
            bit.a(b);
            final azh f = this.f(b.getClass());
            this.f -= f.a(b) * f.b();
            this.i(f.a(b), b.getClass());
        }
    }
    
    @Override
    public final Object a(final int n, final Class clazz) {
        synchronized (this) {
            final Integer n2 = this.h(clazz).ceilingKey(n);
            Label_0079: {
                if (n2 != null) {
                    final int f = this.f;
                    if (f != 0) {
                        if (this.e / f < 2) {
                            if (n2 > n * 8) {
                                break Label_0079;
                            }
                        }
                    }
                    final azp azp = this.b.d(n2, clazz);
                    return this.g(azp, clazz);
                }
            }
            final azp azp = this.b.d(n, clazz);
            return this.g(azp, clazz);
        }
    }
    
    @Override
    public final void b() {
        synchronized (this) {
            this.j(0);
        }
    }
    
    @Override
    public final void c(final Object o) {
        synchronized (this) {
            final Class<?> class1 = o.getClass();
            final azh f = this.f(class1);
            final int a = f.a(o);
            final int n = f.b() * a;
            final int e = this.e;
            int n2 = 1;
            if (n <= e >> 1) {
                final azp d = this.b.d(a, class1);
                this.a.c(d, o);
                final NavigableMap h = this.h(class1);
                final Integer n3 = (Integer)h.get(d.a);
                final int a2 = d.a;
                if (n3 != null) {
                    n2 = 1 + n3;
                }
                h.put(a2, n2);
                this.f += n;
                this.j(this.e);
            }
        }
    }
    
    @Override
    public final void d(final int n) {
        monitorenter(this);
        Label_0019: {
            if (n < 40) {
                break Label_0019;
            }
            try {
                this.b();
                monitorexit(this);
            }
            finally {
                monitorexit(this);
                while (true) {}
                iftrue(Label_0037:)(n >= 20 || n == 15);
                while (true) {
                    monitorexit(this);
                    return;
                    Label_0037: {
                        this.j(this.e >> 1);
                    }
                    continue;
                }
            }
        }
    }
    
    @Override
    public final Object e(final Class clazz) {
        synchronized (this) {
            return this.g(this.b.d(8, clazz), clazz);
        }
    }
}
