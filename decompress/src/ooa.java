// 
// Decompiled by Procyon v0.6.0
// 

public final class ooa
{
    public static final okj a;
    public static final okj b;
    
    static {
        final okt m = okj.c.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final okj okj = (okj)m.b;
        okj.a = -315576000000L;
        okj.b = -999999999;
        a = (okj)m.h();
        final okt i = okj.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final okj okj2 = (okj)i.b;
        okj2.a = 315576000000L;
        okj2.b = 999999999;
        b = (okj)i.h();
        final okt j = okj.c.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final okj okj3 = (okj)j.b;
        okj3.a = 0L;
        okj3.b = 0;
        final okj okj4 = (okj)j.h();
    }
    
    public static okj a(final long n) {
        return b(n / 1000000000L, (int)(n % 1000000000L));
    }
    
    public static okj b(long j, int b) {
        final long n = b;
        if (n <= -1000000000L || n >= 1000000000L) {
            j = och.j(j, n / 1000000000L);
            b = (int)(n % 1000000000L);
        }
        if (j > 0L && b < 0) {
            b += (int)1000000000L;
            --j;
        }
        if (j < 0L && b > 0) {
            b -= (int)1000000000L;
            ++j;
        }
        final okt m = okj.c.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final okj okj = (okj)m.b;
        okj.a = j;
        okj.b = b;
        final okj okj2 = (okj)m.h();
        c(okj2);
        return okj2;
    }
    
    public static void c(final okj okj) {
        final long a = okj.a;
        final int b = okj.b;
        if (a >= -315576000000L && a <= 315576000000L) {
            final long n = b;
            if (n >= -999999999L && n < 1000000000L && ((a >= 0L && b >= 0) || (a <= 0L && b <= 0))) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", a, b));
    }
    
    public static okj d() {
        final okt m = okj.c.m();
        final long k = och.k(1L, 3600L);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final okj okj = (okj)m.b;
        okj.a = k;
        okj.b = 0;
        return (okj)m.h();
    }
}
