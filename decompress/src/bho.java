// 
// Decompiled by Procyon v0.6.0
// 

public final class bho extends bhf
{
    private static bho t;
    
    public static bho a() {
        if (bho.t == null) {
            final bho t = (bho)new bho().A(bdt.b, new bdj());
            t.M();
            bho.t = t;
        }
        return bho.t;
    }
    
    public static bho b(final Class clazz) {
        return (bho)new bho().m(clazz);
    }
    
    public static bho c(final ayg ayg) {
        return (bho)new bho().n(ayg);
    }
}
