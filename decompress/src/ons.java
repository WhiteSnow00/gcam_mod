import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.lang.reflect.Field;
import libcore.io.Memory;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class ons
{
    public static final boolean a;
    public static final boolean b;
    static final long c;
    static final boolean d;
    private static final Unsafe e;
    private static final Class f;
    private static final boolean g;
    private static final boolean h;
    private static final onr i;
    private static final long j;
    
    static {
        final Unsafe unsafe = e = j();
        f = Memory.class;
        final boolean b2 = g = v(Long.TYPE);
        final boolean b3 = h = v(Integer.TYPE);
        onr k = null;
        if (unsafe != null) {
            if (b2) {
                k = new onq(unsafe);
            }
            else if (b3) {
                k = new onp(unsafe);
            }
        }
        i = k;
        final boolean b4 = true;
        boolean a2;
        if (k == null) {
            a2 = false;
        }
        else {
            final Unsafe a3 = k.a;
            if (a3 == null) {
                a2 = false;
            }
            else {
                try {
                    final Class<? extends Unsafe> class1 = a3.getClass();
                    class1.getMethod("objectFieldOffset", Field.class);
                    class1.getMethod("getLong", Object.class, Long.TYPE);
                    if (i() == null) {}
                }
                finally {
                    final Throwable t;
                    l(t);
                    a2 = false;
                }
            }
        }
        a = a2;
        final onr l = ons.i;
        boolean b5;
        if (l == null) {
            b5 = false;
        }
        else {
            final Unsafe a4 = l.a;
            if (a4 == null) {
                b5 = false;
            }
            else {
                try {
                    final Class<? extends Unsafe> class2 = a4.getClass();
                    class2.getMethod("objectFieldOffset", Field.class);
                    class2.getMethod("arrayBaseOffset", Class.class);
                    class2.getMethod("arrayIndexScale", Class.class);
                    class2.getMethod("getInt", Object.class, Long.TYPE);
                    class2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                    class2.getMethod("getLong", Object.class, Long.TYPE);
                    class2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                    class2.getMethod("getObject", Object.class, Long.TYPE);
                    class2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                }
                finally {
                    final Throwable t2;
                    l(t2);
                    b5 = false;
                }
            }
        }
        b = b5;
        c = z(byte[].class);
        z(boolean[].class);
        B(boolean[].class);
        z(int[].class);
        B(int[].class);
        z(long[].class);
        B(long[].class);
        z(float[].class);
        B(float[].class);
        z(double[].class);
        B(double[].class);
        z(Object[].class);
        B(Object[].class);
        final Field m = i();
        long m2 = -1L;
        if (m != null) {
            final onr i2 = ons.i;
            if (i2 != null) {
                m2 = i2.m(m);
            }
        }
        j = m2;
        d = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN && b4);
    }
    
    private ons() {
    }
    
    private static Field A(final Class clazz, final String s) {
        Field field;
        try {
            clazz.getDeclaredField(s);
        }
        finally {
            field = null;
        }
        return field;
    }
    
    private static void B(final Class clazz) {
        if (ons.b) {
            ons.i.r(clazz);
        }
    }
    
    static byte a(final long n) {
        return ons.i.a(n);
    }
    
    static double b(final Object o, final long n) {
        return ons.i.b(o, n);
    }
    
    static float c(final Object o, final long n) {
        return ons.i.c(o, n);
    }
    
    static int d(final Object o, final long n) {
        return ons.i.k(o, n);
    }
    
    static long e(final ByteBuffer byteBuffer) {
        return ons.i.l(byteBuffer, ons.j);
    }
    
    static long f(final Object o, final long n) {
        return ons.i.l(o, n);
    }
    
    static Object g(final Class clazz) {
        try {
            return ons.e.allocateInstance(clazz);
        }
        catch (final InstantiationException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    static Object h(final Object o, final long n) {
        return ons.i.n(o, n);
    }
    
    public static Field i() {
        Field a;
        if ((a = A(Buffer.class, "effectiveDirectAddress")) == null) {
            final Field a2 = A(Buffer.class, "address");
            if (a2 != null && a2.getType() == Long.TYPE) {
                return a2;
            }
            a = null;
        }
        return a;
    }
    
    static Unsafe j() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new ono());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    static void k(final long n, final byte[] array, final long n2, final long n3) {
        ons.i.d(n, array, n2, n3);
    }
    
    public static void l(final Throwable t) {
        final Logger logger = Logger.getLogger(ons.class.getName());
        final Level warning = Level.WARNING;
        final String value = String.valueOf(t);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(value);
        logger.logp(warning, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
    
    static void m(final Object o, final long n, final boolean b) {
        ons.i.e(o, n, b);
    }
    
    static void n(final byte[] array, final long n, final byte b) {
        ons.i.f(array, ons.c + n, b);
    }
    
    public static void o(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int n3 = (~(int)n & 0x3) << 3;
        s(o, n2, (b & 0xFF) << n3 | (d(o, n2) & ~(255 << n3)));
    }
    
    public static void p(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int n3 = ((int)n & 0x3) << 3;
        s(o, n2, (b & 0xFF) << n3 | (d(o, n2) & ~(255 << n3)));
    }
    
    static void q(final Object o, final long n, final double n2) {
        ons.i.g(o, n, n2);
    }
    
    static void r(final Object o, final long n, final float n2) {
        ons.i.h(o, n, n2);
    }
    
    static void s(final Object o, final long n, final int n2) {
        ons.i.o(o, n, n2);
    }
    
    static void t(final Object o, final long n, final long n2) {
        ons.i.p(o, n, n2);
    }
    
    static void u(final Object o, final long n, final Object o2) {
        ons.i.q(o, n, o2);
    }
    
    static boolean v(final Class clazz) {
        try {
            final Class f = ons.f;
            f.getMethod("peekLong", clazz, Boolean.TYPE);
            f.getMethod("pokeLong", clazz, Long.TYPE, Boolean.TYPE);
            f.getMethod("pokeInt", clazz, Integer.TYPE, Boolean.TYPE);
            f.getMethod("peekInt", clazz, Boolean.TYPE);
            f.getMethod("pokeByte", clazz, Byte.TYPE);
            f.getMethod("peekByte", clazz);
            f.getMethod("pokeByteArray", clazz, byte[].class, Integer.TYPE, Integer.TYPE);
            f.getMethod("peekByteArray", clazz, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        }
        finally {
            return false;
        }
    }
    
    static boolean w(final Object o, final long n) {
        return ons.i.i(o, n);
    }
    
    public static boolean x(final Object o, final long n) {
        return (byte)(d(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((~n & 0x3L) << 3) & 0xFF) != 0;
    }
    
    public static boolean y(final Object o, final long n) {
        return (byte)(d(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3) & 0xFF) != 0;
    }
    
    private static int z(final Class clazz) {
        if (ons.b) {
            return ons.i.j(clazz);
        }
        return -1;
    }
}
