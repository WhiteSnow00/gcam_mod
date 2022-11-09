import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class oda extends ocp
{
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    
    static {
        Label_0024: {
            try {
                final Unsafe unsafe = Unsafe.getUnsafe();
                break Label_0024;
            }
            catch (final SecurityException ex) {
                final ocz ocz = new(ocz.class)();
                final ocz ocz3;
                final ocz ocz2 = ocz3 = ocz;
                new ocz();
                final ocz ocz4 = ocz2;
                final Unsafe unsafe2 = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)ocz4);
                final Unsafe unsafe;
                final Unsafe unsafe3 = unsafe = unsafe2;
            }
            try {
                final ocz ocz = new(ocz.class)();
                final ocz ocz3;
                final ocz ocz2 = ocz3 = ocz;
                new ocz();
                final ocz ocz4 = ocz2;
                final Unsafe unsafe2 = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)ocz4);
                final Unsafe unsafe = unsafe2;
                try {
                    c = unsafe.objectFieldOffset(odc.class.getDeclaredField("waiters"));
                    b = unsafe.objectFieldOffset(odc.class.getDeclaredField("listeners"));
                    d = unsafe.objectFieldOffset(odc.class.getDeclaredField("value"));
                    e = unsafe.objectFieldOffset(odb.class.getDeclaredField("thread"));
                    f = unsafe.objectFieldOffset(odb.class.getDeclaredField("next"));
                    a = unsafe;
                }
                catch (final Exception ex2) {
                    njt.d(ex2);
                    throw new RuntimeException(ex2);
                }
            }
            catch (final PrivilegedActionException ex3) {
                throw new RuntimeException("Could not initialize intrinsics", ex3.getCause());
            }
        }
    }
    
    public oda() {
    }
    
    @Override
    public final void a(final odb odb, final odb odb2) {
        oda.a.putObject(odb, oda.f, odb2);
    }
    
    @Override
    public final void b(final odb odb, final Thread thread) {
        oda.a.putObject(odb, oda.e, thread);
    }
    
    @Override
    public final boolean c(final odc odc, final oct oct, final oct oct2) {
        return oda.a.compareAndSwapObject(odc, oda.b, oct, oct2);
    }
    
    @Override
    public final boolean d(final odc odc, final Object o, final Object o2) {
        return oda.a.compareAndSwapObject(odc, oda.d, o, o2);
    }
    
    @Override
    public final boolean e(final odc odc, final odb odb, final odb odb2) {
        return oda.a.compareAndSwapObject(odc, oda.c, odb, odb2);
    }
}
