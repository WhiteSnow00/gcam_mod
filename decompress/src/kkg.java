// 
// Decompiled by Procyon v0.6.0
// 

public final class kkg
{
    private final kjm a;
    
    public kkg(final kjm a) {
        this.a = a;
    }
    
    public static void a(final Throwable t) {
        new kkg(new kjm()).b(t);
    }
    
    public final void b(final Throwable t) {
        this.a.execute(new jzd(t, 4, (char[])null));
    }
}
