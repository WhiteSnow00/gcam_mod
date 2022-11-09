import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class own implements owm
{
    public static final mqd a;
    
    static {
        final mqi d = new mqi().c().e().d();
        try {
            a = d.b("9", oky.q(pso.d, new byte[] { 16, -24, 7, 24, 4 }), mqe.o);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"9\"");
        }
    }
    
    @Override
    public final pso a(final Context context) {
        return (pso)own.a.b(context);
    }
}
