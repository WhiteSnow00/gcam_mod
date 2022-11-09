// 
// Decompiled by Procyon v0.6.0
// 

public final class zc implements Cloneable
{
    public static final Object a;
    public boolean b;
    public int[] c;
    public Object[] d;
    public int e;
    
    static {
        a = new Object();
    }
    
    public zc() {
        this.b = false;
        final int d = yx.d(10);
        this.c = new int[d];
        this.d = new Object[d];
    }
    
    public final int a(final int n) {
        if (this.b) {
            this.f();
        }
        return this.c[n];
    }
    
    public final int b() {
        if (this.b) {
            this.f();
        }
        return this.e;
    }
    
    public final zc c() {
        try {
            final zc zc = (zc)super.clone();
            zc.c = this.c.clone();
            zc.d = this.d.clone();
            return zc;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final Object d(int a) {
        a = yx.a(this.c, this.e, a);
        if (a >= 0) {
            final Object[] d = this.d;
            if (d[a] != zc.a) {
                return d[a];
            }
        }
        return null;
    }
    
    public final Object e(final int n) {
        if (this.b) {
            this.f();
        }
        return this.d[n];
    }
    
    public final void f() {
        final int e = this.e;
        final int[] c = this.c;
        final Object[] d = this.d;
        int i = 0;
        int e2 = 0;
        while (i < e) {
            final Object o = d[i];
            int n = e2;
            if (o != zc.a) {
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
    
    public final void g(final int n, final Object o) {
        final int a = yx.a(this.c, this.e, n);
        if (a >= 0) {
            this.d[a] = o;
            return;
        }
        final int n2 = ~a;
        final int e = this.e;
        if (n2 < e) {
            final Object[] d = this.d;
            if (d[n2] == zc.a) {
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
                n3 = ~yx.a(this.c, this.e, n);
            }
        }
        final int e2 = this.e;
        if (e2 >= this.c.length) {
            final int d2 = yx.d(e2 + 1);
            final int[] c = new int[d2];
            final Object[] d3 = new Object[d2];
            final int[] c2 = this.c;
            System.arraycopy(c2, 0, c, 0, c2.length);
            final Object[] d4 = this.d;
            System.arraycopy(d4, 0, d3, 0, d4.length);
            this.c = c;
            this.d = d3;
        }
        final int n4 = this.e - n3;
        if (n4 != 0) {
            final int[] c3 = this.c;
            final int n5 = n3 + 1;
            System.arraycopy(c3, n3, c3, n5, n4);
            final Object[] d5 = this.d;
            System.arraycopy(d5, n3, d5, n5, this.e - n3);
        }
        this.c[n3] = n;
        this.d[n3] = o;
        ++this.e;
    }
    
    @Override
    public final String toString() {
        if (this.b() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.a(i));
            sb.append('=');
            final Object e = this.e(i);
            if (e != this) {
                sb.append(e);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
