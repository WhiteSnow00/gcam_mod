// 
// Decompiled by Procyon v0.6.0
// 

final class kke implements Runnable
{
    final /* synthetic */ kkf a;
    
    public kke(final kkf a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a.a) {
            final kkf a = this.a;
            final Runnable b = a.b;
            if (b != null) {
                a.b = null;
                monitorexit(this.a.a);
                b.run();
            }
        }
    }
}
