// 
// Decompiled by Procyon v0.6.0
// 

public final class kej
{
    public final kem a;
    
    public kej() {
        this.a = new kem();
    }
    
    public final void a(final Exception ex) {
        this.a.k(ex);
    }
    
    public final void b(final Object o) {
        this.a.l(o);
    }
    
    public final void c(final Exception f) {
        final kem a = this.a;
        jvu.j(f, "Exception must not be null");
        synchronized (a.a) {
            if (a.c) {
                return;
            }
            a.c = true;
            a.f = f;
            monitorexit(a.a);
            a.b.b(a);
        }
    }
    
    public final void d(final Object e) {
        final kem a = this.a;
        synchronized (a.a) {
            if (a.c) {
                return;
            }
            a.c = true;
            a.e = e;
            monitorexit(a.a);
            a.b.b(a);
        }
    }
}
