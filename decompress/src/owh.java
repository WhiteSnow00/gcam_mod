import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owh implements owg
{
    public static final mqd a;
    public static final mqd b;
    public static final mqd c;
    
    static {
        final mqi d = new mqi().c().e().d();
        a = d.a("45350020", false);
        d.a("2", true);
        b = d.a("3", false);
        try {
            c = d.b("19", oky.q(pso.d, new byte[] { 16, 0, 24, 2 }), mqe.m);
        }
        catch (final olm olm) {
            throw new AssertionError((Object)"Could not parse proto flag \"19\"");
        }
    }
    
    @Override
    public final pso a(final Context context) {
        return (pso)owh.c.b(context);
    }
    
    @Override
    public final boolean b(final Context context) {
        return (boolean)owh.a.b(context);
    }
    
    @Override
    public final boolean c(final Context context) {
        return (boolean)owh.b.b(context);
    }
}
