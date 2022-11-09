// 
// Decompiled by Procyon v0.6.0
// 

final class fwo extends kxc
{
    final /* synthetic */ fwp a;
    
    public fwo(final fwp a) {
        this.a = a;
    }
    
    @Override
    public final void b(final ljm ljm) {
        synchronized (this.a.a) {
            monitorexit(this.a.a);
        }
    }
}
