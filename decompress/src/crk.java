// 
// Decompiled by Procyon v0.6.0
// 

final class crk implements oen
{
    final /* synthetic */ crl a;
    private final /* synthetic */ int b;
    
    public crk(final crl a) {
        this.a = a;
    }
    
    public crk(final crl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.b) {
            default: {
                throw new dfx("Failed to open any of the available camera", kst.m, new lfu[] { lfu.b, lfu.a });
            }
            case 0: {
                throw new lfq();
            }
        }
    }
}
