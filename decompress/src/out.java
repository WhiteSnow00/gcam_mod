// 
// Decompiled by Procyon v0.6.0
// 

public final class out implements pii
{
    private static final Object a;
    private volatile pii b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private out(final pii b) {
        this.c = out.a;
        this.b = b;
    }
    
    public static pii a(final pii pii) {
        if (!(pii instanceof out) && !(pii instanceof oum)) {
            pii.getClass();
            return new out(pii);
        }
        return pii;
    }
    
    @Override
    public final Object get() {
        Object c = this.c;
        if (c == out.a) {
            final pii b = this.b;
            if (b == null) {
                c = this.c;
            }
            else {
                c = b.get();
                this.c = c;
                this.b = null;
            }
        }
        return c;
    }
}
