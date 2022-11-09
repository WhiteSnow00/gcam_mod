// 
// Decompiled by Procyon v0.6.0
// 

final class axn implements Runnable
{
    final /* synthetic */ axq a;
    
    public axn(final axq a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final axq a = this.a;
        while (true) {
            final boolean c = a.c;
            try {
                a.c((axp)a.b.remove());
                final axo d = a.d;
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
