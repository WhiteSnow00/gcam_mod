import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovp implements ovo
{
    public static final mqd a;
    
    static {
        final mqi d = new mqi().c().e().d();
        try {
            a = d.b("15", oky.q(pso.d, new byte[] { 16, 0, 24, 2 }), mqe.g);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"15\"");
        }
    }
    
    @Override
    public final pso a(final Context context) {
        return (pso)ovp.a.b(context);
    }
}
