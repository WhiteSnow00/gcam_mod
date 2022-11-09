// 
// Decompiled by Procyon v0.6.0
// 

final class kdr implements Runnable
{
    final /* synthetic */ keg a;
    final /* synthetic */ kds b;
    
    public kdr(final kds b, final keg a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (((kem)this.a).d) {
            final kem b = this.b.b;
            synchronized (b.a) {
                if (b.c) {
                    return;
                }
                b.c = true;
                b.d = true;
                monitorexit(b.a);
                b.b.b(b);
                return;
            }
        }
        try {
            this.b.b.l(this.b.a.a(this.a));
        }
        catch (final Exception ex) {
            this.b.b.k(ex);
        }
        catch (final kef kef) {
            if (kef.getCause() instanceof Exception) {
                this.b.b.k((Exception)kef.getCause());
                return;
            }
            this.b.b.k(kef);
        }
    }
}
