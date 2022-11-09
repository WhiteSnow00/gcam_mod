import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owe implements owd
{
    public static final mqd a;
    
    static {
        final mqi d = new mqi().c().e().d();
        try {
            a = d.b("12", oky.q(pso.d, new byte[] { 16, 0, 24, 2 }), mqe.l);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"12\"");
        }
    }
    
    @Override
    public final pso a(final Context context) {
        return (pso)owe.a.b(context);
    }
}
