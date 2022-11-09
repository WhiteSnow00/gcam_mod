// 
// Decompiled by Procyon v0.6.0
// 

final class ehr implements oen
{
    final /* synthetic */ ehs a;
    
    public ehr(final ehs a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        a.m(ehu.a.b().g(ntf.a, "KeplerController"), "Encoder writing failed", '\u04a9', t);
        synchronized (this.a.c) {
            this.a.a.e.a(t);
            final ehs a = this.a;
            a.c.j.remove(a.a.a);
        }
    }
    
    @Override
    public final void b(final Object o) {
        final nsx a = ntf.a;
        synchronized (this.a.c) {
            this.a.a.e.o(true);
            final ehs a2 = this.a;
            a2.c.j.remove(a2.a.a);
        }
    }
}
