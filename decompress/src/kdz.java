// 
// Decompiled by Procyon v0.6.0
// 

final class kdz implements Runnable
{
    final /* synthetic */ keg a;
    final /* synthetic */ kea b;
    
    public kdz(final kea b, final keg a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.b.a) {
            final keb b = this.b.b;
            if (b != null) {
                final Exception b2 = this.a.b();
                jvu.a(b2);
                b.a(b2);
            }
        }
    }
}
