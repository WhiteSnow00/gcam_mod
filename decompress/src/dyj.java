// 
// Decompiled by Procyon v0.6.0
// 

final class dyj implements oen
{
    final /* synthetic */ long a;
    final /* synthetic */ dyk b;
    
    public dyj(final dyk b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        dyl.a.c().g(ntf.a, "FalconPostProcImgSaver").h(t).E(1017).q("FD effect failed for shot %d", this.a);
        final okt i = this.b.i;
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nyy nyy = (nyy)i.b;
        final nyy d = nyy.d;
        nyy.c = 3;
        nyy.a |= 0x2;
        dyk.f(this.b);
        this.b.e(this.a);
    }
}
