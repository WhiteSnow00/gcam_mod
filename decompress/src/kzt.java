import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzt
{
    private final ArrayList a;
    private int b;
    
    public kzt() {
        this.b = 0;
        this.a = new ArrayList();
    }
    
    private final Object f(final kwz kwz, final kqs kqs) {
        monitorenter(this);
        Label_0145: {
            if (kwz == null) {
                break Label_0145;
            }
            try {
                Object a = kqs.a();
                int n = 1;
                Object a2 = null;
            Label_0119:
                while (true) {
                    a2 = a;
                    if (a != null) {
                        break;
                    }
                    a2 = a;
                    if (n == 0) {
                        break;
                    }
                    final int size = this.a.size();
                    n = 0;
                    for (int i = 0; i < size; ++i) {
                        final kxz kxz = this.a.get((this.b + i) % size);
                        if (kxz.h.c.contains(kwz) && kxz.t()) {
                            a2 = kqs.a();
                            if (a2 != null) {
                                this.b = i + 1;
                                break Label_0119;
                            }
                            n = 1;
                            a = a2;
                        }
                    }
                }
                monitorexit(this);
                return a2;
                while (true) {
                    while (true) {
                    Block_13:
                        while (true) {
                            int n2 = 0;
                            final kxz kxz2 = this.a.get(n2);
                            iftrue(Label_0246:)(kxz2.r() <= 0L || !kxz2.t());
                            break Block_13;
                            ++n2;
                            final int size2;
                            iftrue(Label_0252:)(n2 >= size2);
                            continue;
                        }
                        final Object o = kqs.a();
                        iftrue(Label_0242:)(o != null);
                        final int n3 = 1;
                        continue;
                    }
                    final Object o = kqs.a();
                    int n3 = 1;
                    Label_0155: {
                        break Label_0155;
                        Label_0255: {
                            monitorexit(this);
                        }
                        return o;
                    }
                    iftrue(Label_0255:)(o != null || n3 == 0);
                    Block_10: {
                        break Block_10;
                        Label_0242: {
                            monitorexit(this);
                        }
                        return o;
                    }
                    Collections.sort((List<Object>)this.a, aab.c);
                    final int size2 = this.a.size();
                    n3 = 0;
                    int n2 = 0;
                    continue;
                }
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    public final Object a(final kqs kqs) {
        synchronized (this) {
            return this.f(null, kqs);
        }
    }
    
    public final Object b(final kwz kwz, final kqs kqs) {
        synchronized (this) {
            return this.f(kwz, kqs);
        }
    }
    
    final void c(final kxz kxz) {
        synchronized (this) {
            this.a.add(kxz);
        }
    }
    
    final void d(final kxz kxz) {
        synchronized (this) {
            this.a.remove(kxz);
        }
    }
    
    public final void e(final kwz kwz) {
        synchronized (this) {
            this.f(kwz, kzs.a);
        }
    }
}
