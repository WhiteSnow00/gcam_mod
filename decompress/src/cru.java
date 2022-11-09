// 
// Decompiled by Procyon v0.6.0
// 

final class cru implements oen
{
    final /* synthetic */ lfu a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ crv d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    
    public cru(final crv d, final lfu a, final int e, final int f, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Throwable t) {
        throw new dfx("Failed to open any of the available camera", kst.m, new lfu[] { this.a });
    }
}
