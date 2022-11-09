import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovv implements ovu
{
    public static final mqd a;
    public static final mqd b;
    public static final mqd c;
    public static final mqd d;
    public static final mqd e;
    
    static {
        final mqi d2 = new mqi().c().e().d();
        a = d2.a("25", false);
        b = d2.a("34", false);
        d2.f("45351156", 10L);
        try {
            c = d2.b("40", oky.q(miv.c, new byte[] { 10, 45, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 114, 105, 109, 101, 115, 45, 106, 97, 110, 107, 45, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 18, 35, 8, 2, 18, 31, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 109, 105, 115, 115, 101, 100, 65, 112, 112, 70, 114, 97, 109, 101, 115, 18, 31, 8, 3, 18, 27, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 116, 111, 116, 97, 108, 70, 114, 97, 109, 101, 115, 18, 38, 8, 5, 18, 34, 74, 60, 37, 69, 86, 69, 78, 84, 95, 78, 65, 77, 69, 37, 62, 35, 109, 97, 120, 70, 114, 97, 109, 101, 84, 105, 109, 101, 77, 105, 108, 108, 105, 115 }), mqe.i);
            try {
                d = d2.b("13", oky.q(pso.d, new byte[] { 16, 0, 24, 2 }), mqe.j);
                d2.g("39", "com.google.android.primes-jank-%PACKAGE_NAME%");
                e = d2.a("45351799", false);
            }
            catch (final olm olm) {
                throw new AssertionError((Object)"Could not parse proto flag \"13\"");
            }
        }
        catch (final olm olm2) {
            throw new AssertionError((Object)"Could not parse proto flag \"40\"");
        }
    }
    
    @Override
    public final miv a(final Context context) {
        return (miv)ovv.c.b(context);
    }
    
    @Override
    public final pso b(final Context context) {
        return (pso)ovv.d.b(context);
    }
    
    @Override
    public final boolean c(final Context context) {
        return (boolean)ovv.a.b(context);
    }
    
    @Override
    public final boolean d(final Context context) {
        return (boolean)ovv.b.b(context);
    }
    
    @Override
    public final boolean e(final Context context) {
        return (boolean)ovv.e.b(context);
    }
}
