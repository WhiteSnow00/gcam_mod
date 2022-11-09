// 
// Decompiled by Procyon v0.6.0
// 

final class cca implements oen
{
    final /* synthetic */ cce a;
    private final /* synthetic */ int b;
    
    public cca(final cce a) {
        this.a = a;
    }
    
    public cca(final cce a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private final void c() {
        synchronized (this.a.f) {
            this.a.c();
            if (this.a.z == ccd.b) {
                return;
            }
            njo.o(this.a.z == ccd.d);
            this.a.m(ccd.a);
            if (this.a.n.g()) {
                ((ifj)this.a.n.c()).a();
            }
        }
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.b) {
            default: {
                this.c();
                return;
            }
            case 1: {
                return;
            }
            case 0: {
                final cce a = this.a;
                synchronized (a.f) {
                    cce.a.b().h(t).E(343).o("Failed to startRecording: ");
                    if (a.z != ccd.a && a.z != ccd.b) {
                        final ccs y = a.y;
                        if (y != null) {
                            y.close();
                            a.y = null;
                        }
                        a.c.execute(new cbv(a, 3));
                        a.m(ccd.a);
                    }
                    return;
                }
                break;
            }
        }
    }
}
