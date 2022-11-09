// 
// Decompiled by Procyon v0.6.0
// 

final class gac implements oen
{
    final /* synthetic */ ofn a;
    final /* synthetic */ gie b;
    final /* synthetic */ gae c;
    
    public gac(final gae c, final ofn a, final gie b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        this.a.a(t);
        this.b.close();
        this.c.b();
    }
    
    @Override
    public final void b(final Object o) {
        this.a.o(o);
        this.b.close();
        this.c.b();
    }
}
