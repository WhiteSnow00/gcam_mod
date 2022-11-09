import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owk implements owj
{
    public static final mqd a;
    
    static {
        final mqi d = new mqi().c().e().d();
        try {
            a = d.b("17", oky.q(pso.d, new byte[] { 16, -24, 7, 24, 3 }), mqe.n);
            d.a("38", false);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"17\"");
        }
    }
    
    @Override
    public final pso a(final Context context) {
        return (pso)owk.a.b(context);
    }
}
