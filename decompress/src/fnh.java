// 
// Decompiled by Procyon v0.6.0
// 

public final class fnh implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public fnh(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public fnh(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final bjx a() {
        switch (this.c) {
            default: {
                final cxl cxl = (cxl)this.a.get();
                final pii b = this.b;
                final cxm a = cxk.a;
                cxl.b();
                return ((blm)b).a();
            }
            case 0: {
                final cxl cxl2 = (cxl)this.a.get();
                final pii b2 = this.b;
                final cxm a2 = cxk.a;
                cxl2.b();
                return ((bmh)b2).a();
            }
        }
    }
}
