// 
// Decompiled by Procyon v0.6.0
// 

public final class yz implements Cloneable
{
    public static final Object a;
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;
    
    static {
        a = new Object();
    }
    
    public yz() {
        this.b = false;
        final int e = yx.e(10);
        this.c = new long[e];
        this.d = new Object[e];
    }
    
    public final int a() {
        if (this.b) {
            this.f();
        }
        return this.e;
    }
    
    public final yz b() {
        try {
            final yz yz = (yz)super.clone();
            yz.c = this.c.clone();
            yz.d = this.d.clone();
            return yz;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final Object c(final long n) {
        final int b = yx.b(this.c, this.e, n);
        if (b >= 0) {
            final Object[] d = this.d;
            if (d[b] != yz.a) {
                return d[b];
            }
        }
        return null;
    }
    
    public final Object d(final int n) {
        if (this.b) {
            this.f();
        }
        return this.d[n];
    }
    
    public final void e() {
        final int e = this.e;
        final Object[] d = this.d;
        for (int i = 0; i < e; ++i) {
            d[i] = null;
        }
        this.e = 0;
        this.b = false;
    }
    
    public final void f() {
        final int e = this.e;
        final long[] c = this.c;
        final Object[] d = this.d;
        int i = 0;
        int e2 = 0;
        while (i < e) {
            final Object o = d[i];
            int n = e2;
            if (o != yz.a) {
                if (i != e2) {
                    c[e2] = c[i];
                    d[e2] = o;
                    d[i] = null;
                }
                n = e2 + 1;
            }
            ++i;
            e2 = n;
        }
        this.b = false;
        this.e = e2;
    }
    
    public final void g(final long n, final Object o) {
        final int b = yx.b(this.c, this.e, n);
        if (b >= 0) {
            this.d[b] = o;
            return;
        }
        final int n2 = ~b;
        final int e = this.e;
        if (n2 < e) {
            final Object[] d = this.d;
            if (d[n2] == yz.a) {
                this.c[n2] = n;
                d[n2] = o;
                return;
            }
        }
        int n3 = n2;
        if (this.b) {
            n3 = n2;
            if (e >= this.c.length) {
                this.f();
                n3 = ~yx.b(this.c, this.e, n);
            }
        }
        final int e2 = this.e;
        if (e2 >= this.c.length) {
            final int e3 = yx.e(e2 + 1);
            final long[] c = new long[e3];
            final Object[] d2 = new Object[e3];
            final long[] c2 = this.c;
            System.arraycopy(c2, 0, c, 0, c2.length);
            final Object[] d3 = this.d;
            System.arraycopy(d3, 0, d2, 0, d3.length);
            this.c = c;
            this.d = d2;
        }
        final int n4 = this.e - n3;
        if (n4 != 0) {
            final long[] c3 = this.c;
            final int n5 = n3 + 1;
            System.arraycopy(c3, n3, c3, n5, n4);
            final Object[] d4 = this.d;
            System.arraycopy(d4, n3, d4, n5, this.e - n3);
        }
        this.c[n3] = n;
        this.d[n3] = o;
        ++this.e;
    }
    
    @Override
    public final String toString() {
        if (this.a() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.b) {
                this.f();
            }
            sb.append(this.c[i]);
            sb.append('=');
            final Object d = this.d(i);
            if (d != this) {
                sb.append(d);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
