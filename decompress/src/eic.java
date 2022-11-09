// 
// Decompiled by Procyon v0.6.0
// 

final class eic implements oen
{
    final /* synthetic */ eid a;
    final /* synthetic */ eie b;
    
    public eic(final eie b, final eid a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        this.b.j(this.a.b, t.getMessage());
    }
}
