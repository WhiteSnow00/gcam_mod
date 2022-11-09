// 
// Decompiled by Procyon v0.6.0
// 

final class aro implements Runnable
{
    final /* synthetic */ byte[] a;
    final /* synthetic */ arp b;
    
    public aro(final arp b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.b.a(this.a);
    }
}
