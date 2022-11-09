import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovy implements ovx
{
    public static final mqd a;
    
    static {
        final mqi d = new mqi().c().e().d();
        d.a("5", true);
        try {
            a = d.b("8", oky.q(pso.d, new byte[] { 16, 0, 24, 2 }), mqe.k);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"8\"");
        }
    }
    
    @Override
    public final pso a(final Context context) {
        return (pso)ovy.a.b(context);
    }
}
