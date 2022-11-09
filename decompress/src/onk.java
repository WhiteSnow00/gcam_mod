import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class onk
{
    public static final onk a;
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;
    
    static {
        a = new onk(0, new int[0], new Object[0], false);
    }
    
    private onk() {
        this(0, new int[8], new Object[8], true);
    }
    
    private onk(final int b, final int[] c, final Object[] d, final boolean f) {
        this.e = -1;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    
    static onk b(final onk onk, final onk onk2) {
        final int n = onk.b + onk2.b;
        final int[] copy = Arrays.copyOf(onk.c, n);
        System.arraycopy(onk2.c, 0, copy, onk.b, onk2.b);
        final Object[] copy2 = Arrays.copyOf(onk.d, n);
        System.arraycopy(onk2.d, 0, copy2, onk.b, onk2.b);
        return new onk(n, copy, copy2, true);
    }
    
    public static onk c() {
        return new onk(0, new int[8], new Object[8], true);
    }
    
    public final int a() {
        final int e = this.e;
        if (e == -1) {
            int i = 0;
            int e2 = 0;
            while (i < this.b) {
                final int n = this.c[i];
                final int a = onx.a(n);
                switch (onx.b(n)) {
                    default: {
                        throw new IllegalStateException(olm.a());
                    }
                    case 5: {
                        ((Integer)this.d[i]).intValue();
                        e2 += okg.ax(a);
                        break;
                    }
                    case 3: {
                        final int ab = okg.ab(a);
                        e2 += ab + ab + ((onk)this.d[i]).a();
                        break;
                    }
                    case 2: {
                        e2 += okg.H(a, (ojw)this.d[i]);
                        break;
                    }
                    case 1: {
                        ((Long)this.d[i]).longValue();
                        e2 += okg.ay(a);
                        break;
                    }
                    case 0: {
                        e2 += okg.ae(a, (long)this.d[i]);
                        break;
                    }
                }
                ++i;
            }
            return this.e = e2;
        }
        return e;
    }
    
    public final void d() {
        this.f = false;
    }
    
    public final void e(final int n, final Object o) {
        if (this.f) {
            final int b = this.b;
            final int[] c = this.c;
            if (b == c.length) {
                int n2;
                if (b < 4) {
                    n2 = 8;
                }
                else {
                    n2 = b >> 1;
                }
                final int n3 = b + n2;
                this.c = Arrays.copyOf(c, n3);
                this.d = Arrays.copyOf(this.d, n3);
            }
            final int[] c2 = this.c;
            final int b2 = this.b;
            c2[b2] = n;
            this.d[b2] = o;
            this.b = b2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof onk)) {
            return false;
        }
        final onk onk = (onk)o;
        final int b = this.b;
        if (b == onk.b) {
            final int[] c = this.c;
            final int[] c2 = onk.c;
            for (int i = 0; i < b; ++i) {
                if (c[i] != c2[i]) {
                    return false;
                }
            }
            final Object[] d = this.d;
            final Object[] d2 = onk.d;
            for (int b2 = this.b, j = 0; j < b2; ++j) {
                if (!d[j].equals(d2[j])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final void f(final okh okh) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; ++i) {
                final int n = this.c[i];
                final Object o = this.d[i];
                final int a = onx.a(n);
                switch (onx.b(n)) {
                    default: {
                        throw new RuntimeException(olm.a());
                    }
                    case 5: {
                        okh.e(a, (int)o);
                        break;
                    }
                    case 3: {
                        okh.a.A(a, 3);
                        ((onk)o).f(okh);
                        okh.a.A(a, 4);
                        break;
                    }
                    case 2: {
                        okh.b(a, (ojw)o);
                        break;
                    }
                    case 1: {
                        okh.f(a, (long)o);
                        break;
                    }
                    case 0: {
                        okh.j(a, (long)o);
                        break;
                    }
                }
            }
        }
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        final int[] c = this.c;
        final int n = 0;
        int n2 = 17;
        int i = 0;
        int n3 = 17;
        while (i < b) {
            n3 = n3 * 31 + c[i];
            ++i;
        }
        final Object[] d = this.d;
        for (int b2 = this.b, j = n; j < b2; ++j) {
            n2 = n2 * 31 + d[j].hashCode();
        }
        return ((b + 527) * 31 + n3) * 31 + n2;
    }
}
