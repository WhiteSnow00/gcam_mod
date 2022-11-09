import java.util.Arrays;
import java.util.List;
import java.nio.ByteOrder;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kuz
{
    public final kvk[] a;
    public byte[] b;
    public final ArrayList c;
    public final ByteOrder d;
    
    public kuz(final ByteOrder d) {
        this.a = new kvk[5];
        this.c = new ArrayList();
        this.d = d;
    }
    
    protected final int a() {
        return this.c.size();
    }
    
    public final kvk b(final int n) {
        if (kvh.f(n)) {
            return this.a[n];
        }
        return null;
    }
    
    protected final List c() {
        final ArrayList list = new ArrayList();
        final kvk[] a = this.a;
        for (int i = 0; i < 5; ++i) {
            final kvk kvk = a[i];
            if (kvk != null) {
                for (final kvh kvh : kvk.d()) {
                    if (kvh != null) {
                        list.add(kvh);
                    }
                }
            }
        }
        return list;
    }
    
    public final void d(final kvk kvk) {
        this.a[kvk.b] = kvk;
    }
    
    public final void e() {
        this.b = null;
        this.c.clear();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof kuz) {
            final kuz kuz = (kuz)o;
            if (kuz.d == this.d && kuz.c.size() == this.c.size() && Arrays.equals(kuz.b, this.b)) {
                for (int i = 0; i < this.c.size(); ++i) {
                    if (!Arrays.equals((byte[])kuz.c.get(i), (byte[])this.c.get(i))) {
                        return false;
                    }
                }
                for (int j = 0; j < 5; ++j) {
                    final kvk b = kuz.b(j);
                    final kvk b2 = this.b(j);
                    if (b != null && !b.equals(b2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public final boolean f() {
        return this.b != null;
    }
    
    public final boolean g() {
        return this.c.size() != 0;
    }
    
    public final boolean h(final short n, final int n2) {
        final kvk kvk = this.a[n2];
        if (kvk == null) {
            return false;
        }
        kvk.c(n);
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { Arrays.hashCode(this.a), Arrays.hashCode(this.b), this.c, this.d });
    }
    
    protected final byte[] i(final int n) {
        return this.c.get(n);
    }
    
    public final void j(final kvh kvh) {
        if (kvh != null) {
            final int e = kvh.e;
            if (kvh.f(e)) {
                kvk kvk = this.a[e];
                if (kvk == null) {
                    kvk = new kvk(e);
                    this.a[e] = kvk;
                }
                kvk.e(kvh);
            }
        }
    }
}
