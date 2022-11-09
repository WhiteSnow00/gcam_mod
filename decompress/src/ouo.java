// 
// Decompiled by Procyon v0.6.0
// 

public final class ouo implements oun, oui
{
    public final Object a;
    
    static {
        new ouo(null);
    }
    
    private ouo(final Object a) {
        this.a = a;
    }
    
    public static oun a(final Object o) {
        o.getClass();
        return new ouo(o);
    }
    
    @Override
    public final Object get() {
        return this.a;
    }
}
