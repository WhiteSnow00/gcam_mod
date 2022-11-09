// 
// Decompiled by Procyon v0.6.0
// 

public final class omd
{
    public final omc a;
    
    private omd(final onv onv, final Object o, final onv onv2, final Object o2) {
        this.a = new omc(onv, o, onv2, o2);
    }
    
    public static int a(final omc omc, final Object o, final Object o2) {
        return okp.a(omc.a, 1, o) + okp.a(omc.c, 2, o2);
    }
    
    public static omd b(final onv onv, final Object o, final onv onv2, final Object o2) {
        return new omd(onv, o, onv2, o2);
    }
    
    static void c(final okg okg, final omc omc, final Object o, final Object o2) {
        okp.g(okg, omc.a, 1, o);
        okp.g(okg, omc.c, 2, o2);
    }
}
