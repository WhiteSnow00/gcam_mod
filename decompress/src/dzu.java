// 
// Decompiled by Procyon v0.6.0
// 

final class dzu implements oen
{
    final /* synthetic */ long a;
    final /* synthetic */ dzw b;
    
    public dzu(final dzw b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        dzx.b.c().h(t).E(1043).q("Portrait effect failed for shot %d", this.a);
        dzw.h(this.b);
        this.b.f(this.a, nii.a);
    }
}
