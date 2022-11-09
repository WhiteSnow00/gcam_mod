// 
// Decompiled by Procyon v0.6.0
// 

public final class bxo implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public bxo(final pii a) {
        this.a = a;
    }
    
    public bxo(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static bxo b(final pii pii) {
        return new bxo(pii, 1);
    }
    
    public final Integer a() {
        switch (this.b) {
            default: {
                return ((dug)this.a.get()).c;
            }
            case 4: {
                return ((dug)this.a.get()).f;
            }
            case 3: {
                return ((dug)this.a.get()).e;
            }
            case 2: {
                return (int)((cxl)this.a.get()).a(cxg.b).c();
            }
            case 1: {
                int n;
                if (!((fzw)this.a).a().C()) {
                    n = 4;
                }
                else {
                    n = 2;
                }
                return n;
            }
            case 0: {
                final cxl cxl = (cxl)this.a.get();
                int intValue;
                if (cxl.a(cxr.r).g()) {
                    intValue = (int)cxl.a(cxr.r).c();
                }
                else {
                    intValue = 60;
                }
                return intValue;
            }
        }
    }
}
