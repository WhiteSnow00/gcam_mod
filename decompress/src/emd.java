// 
// Decompiled by Procyon v0.6.0
// 

public final class emd implements pii
{
    private final pii a;
    private final /* synthetic */ int b;
    
    private emd(final pii a) {
        a.getClass();
        this.a = a;
    }
    
    private emd(final pii a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public static pii b(final pii pii) {
        return new emd(pii);
    }
    
    public static pii c(final pii pii) {
        return new emd(pii, 1);
    }
    
    public final niz a() {
        switch (this.b) {
            default: {
                return niz.i(this.a.get());
            }
            case 0: {
                return niz.i(this.a);
            }
        }
    }
}
