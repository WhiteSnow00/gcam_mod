// 
// Decompiled by Procyon v0.6.0
// 

public final class efp
{
    private final oui a;
    
    public efp(final oui a) {
        this.a = a;
    }
    
    public static efp a(final oui oui) {
        return new efp(oui);
    }
    
    public final Object b() {
        return ((niz)this.a.get()).c();
    }
    
    public final boolean c() {
        return ((niz)this.a.get()).g();
    }
}
