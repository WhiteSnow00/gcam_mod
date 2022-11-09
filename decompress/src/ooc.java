// 
// Decompiled by Procyon v0.6.0
// 

public final class ooc
{
    public static final oni a;
    public static final oni b;
    public static final ThreadLocal c;
    
    static {
        final okt m = oni.c.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oni oni = (oni)m.b;
        oni.a = -62135596800L;
        oni.b = 0;
        a = (oni)m.h();
        final okt i = oni.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oni oni2 = (oni)i.b;
        oni2.a = 253402300799L;
        oni2.b = 999999999;
        b = (oni)i.h();
        final okt j = oni.c.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final oni oni3 = (oni)j.b;
        oni3.a = 0L;
        oni3.b = 0;
        final oni oni4 = (oni)j.h();
        c = new oob();
    }
    
    public static long a(final oni oni) {
        d(oni);
        return och.j(och.k(oni.a, 1000L), oni.b / 1000000L);
    }
    
    public static oni b(final long n) {
        return c(n / 1000L, (int)(n % 1000L * 1000000L));
    }
    
    public static oni c(long a, int b) {
        final long n = b;
        if (n <= -1000000000L || n >= 1000000000L) {
            a = och.j(a, n / 1000000000L);
            b = (int)(n % 1000000000L);
        }
        if (b < 0) {
            b += (int)1000000000L;
            a = och.l(a, 1L);
        }
        final okt m = oni.c.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oni oni = (oni)m.b;
        oni.a = a;
        oni.b = b;
        final oni oni2 = (oni)m.h();
        d(oni2);
        return oni2;
    }
    
    public static void d(final oni oni) {
        final long a = oni.a;
        final int b = oni.b;
        if (a >= -62135596800L && a <= 253402300799L && b >= 0 && b < 1000000000L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", a, b));
    }
}
