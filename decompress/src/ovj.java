import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovj implements ovi
{
    public static final mqd a;
    public static final mqd b;
    
    static {
        final mqi d = new mqi().c().e().d();
        a = d.a("45352228", false);
        try {
            b = d.b("45352241", oky.q(pqy.b, new byte[0]), mqe.e);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"45352241\"");
        }
    }
    
    @Override
    public final pqy a(final Context context) {
        return (pqy)ovj.b.b(context);
    }
    
    @Override
    public final boolean b(final Context context) {
        return (boolean)ovj.a.b(context);
    }
}
