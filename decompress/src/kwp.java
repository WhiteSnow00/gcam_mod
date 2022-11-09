import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class kwp
{
    private static String g(final long n, final int n2) {
        return njo.c(Long.toString(n), n2);
    }
    
    public static void i(final kvs kvs, final kwo kwo) {
        kvs.j(new kwj(kwo, kvs));
    }
    
    public static void j(final kvs kvs) {
        if (!kvs.e() && !kvs.f()) {
            final kwm kwm = new kwm();
            kvs.j(kwm);
            kwm.g();
        }
    }
    
    public static void k(final kvs kvs) {
        if (!kvs.e() && !kvs.h() && !kvs.f()) {
            final kwl kwl = new kwl();
            kvs.j(kwl);
            kwl.g();
        }
    }
    
    public static void l(final lbe lbe, final kwo kwo) {
        final kvs a = lbe.a();
        if (a != null) {
            i(a, kwo);
        }
    }
    
    public static boolean m(final short n) {
        return (n & 0xFFFFFFF0) == 0xFFFFFFC0 && n != -60 && n != -56 && n != -52;
    }
    
    public static String n(final long n) {
        return g(n % 1000L, 3);
    }
    
    public static String o(final long n) {
        return g(n, 2);
    }
    
    public void a() {
    }
    
    public void b() {
    }
    
    public void c() {
    }
    
    public void d(final ljm ljm) {
    }
    
    public void e() {
    }
    
    public Executor f() {
        return null;
    }
}
