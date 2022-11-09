// 
// Decompiled by Procyon v0.6.0
// 

final class lvq implements oen
{
    final /* synthetic */ lxh a;
    
    public lvq(final lxh a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        this.a.l(lwi.a(t));
    }
    
    @Override
    public final void b(final Object o) {
        if (o == null) {
            this.a.l(lwi.a(new NullPointerException("Function output is null")));
            return;
        }
        this.a.k(o);
    }
}
