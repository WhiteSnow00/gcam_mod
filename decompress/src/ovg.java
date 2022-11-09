import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovg implements ovf
{
    public static final mqd a;
    public static final mqd b;
    public static final mqd c;
    
    static {
        final mqi d = new mqi().c().e().d();
        d.g("24", "/primes/analytics");
        try {
            a = d.b("45352879", oky.q(ouu.d, new byte[] { 8, 0, 18, 62, 112, 114, 105, 109, 101, 115, 47, 102, 101, 100, 101, 114, 97, 116, 101, 100, 95, 113, 117, 101, 114, 121, 47, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 47, 100, 105, 114, 101, 99, 116, 111, 114, 121, 95, 112, 97, 116, 104, 115, 47, 116, 101, 97, 109, 102, 111, 111, 100, 26, 17, 47, 112, 114, 105, 109, 101, 115, 47, 97, 110, 97, 108, 121, 116, 105, 99, 115 }), mqe.d);
            try {
                b = d.b("45352881", oky.q(ouu.d, new byte[] { 8, 0, 18, 65, 112, 114, 105, 109, 101, 115, 47, 102, 101, 100, 101, 114, 97, 116, 101, 100, 95, 113, 117, 101, 114, 121, 47, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 47, 101, 120, 99, 101, 112, 116, 105, 111, 110, 95, 109, 101, 115, 115, 97, 103, 101, 115, 47, 116, 101, 97, 109, 102, 111, 111, 100, 26, 35, 47, 112, 114, 105, 109, 101, 115, 47, 97, 110, 97, 108, 121, 116, 105, 99, 115, 95, 101, 120, 99, 101, 112, 116, 105, 111, 110, 95, 109, 101, 115, 115, 97, 103, 101 }), mqe.d);
                d.g("30", "/primes/analytics_exception_message");
                d.f("27", 346117902L);
                d.g("32", "/primes/analytics_network");
                try {
                    c = d.b("45352880", oky.q(ouu.d, new byte[] { 8, 0, 18, 56, 112, 114, 105, 109, 101, 115, 47, 102, 101, 100, 101, 114, 97, 116, 101, 100, 95, 113, 117, 101, 114, 121, 47, 37, 80, 65, 67, 75, 65, 71, 69, 95, 78, 65, 77, 69, 37, 47, 114, 112, 99, 95, 112, 97, 116, 104, 115, 47, 116, 101, 97, 109, 102, 111, 111, 100, 26, 25, 47, 112, 114, 105, 109, 101, 115, 47, 97, 110, 97, 108, 121, 116, 105, 99, 115, 95, 110, 101, 116, 119, 111, 114, 107 }), mqe.d);
                    d.g("26", "primes/federated_query/teamfood");
                    d.g("22", "allowlist_session");
                    d.a("23", false);
                    d.a("29", false);
                    d.a("31", false);
                }
                catch (final olm olm) {
                    throw new AssertionError((Object)"Could not parse proto flag \"45352880\"");
                }
            }
            catch (final olm olm2) {
                throw new AssertionError((Object)"Could not parse proto flag \"45352881\"");
            }
        }
        catch (final olm olm3) {
            throw new AssertionError((Object)"Could not parse proto flag \"45352879\"");
        }
    }
    
    @Override
    public final ouu a(final Context context) {
        return (ouu)ovg.a.b(context);
    }
    
    @Override
    public final ouu b(final Context context) {
        return (ouu)ovg.b.b(context);
    }
    
    @Override
    public final ouu c(final Context context) {
        return (ouu)ovg.c.b(context);
    }
}
