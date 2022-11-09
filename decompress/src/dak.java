// 
// Decompiled by Procyon v0.6.0
// 

public final class dak implements oun
{
    private final pii a;
    
    public dak(final pii a) {
        this.a = a;
    }
    
    public static krq b(final krr krr) {
        krq krq;
        if (krr instanceof krq) {
            krq = (krq)krr;
        }
        else {
            krq = new dan(krr);
        }
        return krq;
    }
    
    public final krq a() {
        return b(((krp)this.a).a());
    }
}
