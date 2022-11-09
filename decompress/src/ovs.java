import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovs implements ovr
{
    public static final mqd a;
    
    static {
        final mqi d = new mqi().c().e().d();
        try {
            d.b("14", oky.q(pso.d, new byte[] { 16, 0, 24, 2 }), mqe.h);
            a = d.a("45350519", false);
            d.a("37", true);
            d.a("33", false);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"14\"");
        }
    }
    
    @Override
    public final boolean a(final Context context) {
        return (boolean)ovs.a.b(context);
    }
}
