// 
// Decompiled by Procyon v0.6.0
// 

public final class pw
{
    long a;
    pw b;
    
    public pw() {
        this.a = 0L;
    }
    
    private final void h() {
        if (this.b == null) {
            this.b = new pw();
        }
    }
    
    final int a(final int n) {
        final pw b = this.b;
        if (b == null) {
            if (n >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & (1L << n) - 1L);
        }
        else {
            if (n < 64) {
                return Long.bitCount(this.a & (1L << n) - 1L);
            }
            return b.a(n - 64) + Long.bitCount(this.a);
        }
    }
    
    final void b(final int n) {
        if (n >= 64) {
            final pw b = this.b;
            if (b != null) {
                b.b(n - 64);
            }
            return;
        }
        this.a &= ~(1L << n);
    }
    
    final void c(final int n, final boolean b) {
        if (n >= 64) {
            this.h();
            this.b.c(n - 64, b);
            return;
        }
        final long a = this.a;
        final boolean b2 = (Long.MIN_VALUE & a) != 0x0L;
        final long n2 = (1L << n) - 1L;
        final long n3 = (-1L ^ n2) & a;
        this.a = ((a & n2) | n3 + n3);
        if (b) {
            this.e(n);
        }
        else {
            this.b(n);
        }
        if (!b2 && this.b == null) {
            return;
        }
        this.h();
        this.b.c(0, b2);
    }
    
    public final void d() {
        this.a = 0L;
        final pw b = this.b;
        if (b != null) {
            b.d();
        }
    }
    
    public final void e(final int n) {
        if (n >= 64) {
            this.h();
            this.b.e(n - 64);
            return;
        }
        this.a |= 1L << n;
    }
    
    final boolean f(final int n) {
        if (n >= 64) {
            this.h();
            return this.b.f(n - 64);
        }
        return (this.a & 1L << n) != 0x0L;
    }
    
    final boolean g(final int n) {
        if (n >= 64) {
            this.h();
            return this.b.g(n - 64);
        }
        final long n2 = 1L << n;
        final long a = this.a;
        final boolean b = (a & n2) != 0x0L;
        final long a2 = a & ~n2;
        this.a = a2;
        final long n3 = n2 - 1L;
        this.a = (Long.rotateRight(~n3 & a2, 1) | (a2 & n3));
        final pw b2 = this.b;
        if (b2 != null) {
            if (b2.f(0)) {
                this.e(63);
            }
            this.b.g(0);
        }
        return b;
    }
    
    @Override
    public final String toString() {
        String s;
        if (this.b == null) {
            s = Long.toBinaryString(this.a);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.a));
            s = sb.toString();
        }
        return s;
    }
}
