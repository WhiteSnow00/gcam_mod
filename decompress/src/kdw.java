// 
// Decompiled by Procyon v0.6.0
// 

final class kdw implements Runnable
{
    final /* synthetic */ keg a;
    final /* synthetic */ kdx b;
    
    public kdw(final kdx b, final keg a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.b.a) {
            final kdy b = this.b.b;
            if (b != null) {
                b.a(this.a);
            }
        }
    }
}
