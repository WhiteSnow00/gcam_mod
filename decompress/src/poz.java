// 
// Decompiled by Procyon v0.6.0
// 

final class poz extends poy
{
    private final ppb a;
    private final ppa f;
    private final pnm g;
    private final Object h;
    
    public poz(final ppb a, final ppa f, final pnm g, final Object h) {
        f.getClass();
        g.getClass();
        this.a = a;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void c(final Throwable t) {
        final ppb a = this.a;
        final ppa f = this.f;
        final pnm g = this.g;
        final Object h = this.h;
        final boolean a2 = pod.a;
        final pnm f2 = ppb.F(g);
        if (f2 != null && a.E(f, f2, h)) {
            return;
        }
        a.f(a.u(f, h));
    }
}
