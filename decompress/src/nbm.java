import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbm implements oxe
{
    final /* synthetic */ nbn a;
    public final /* synthetic */ org b;
    
    public nbm(final nbn a, final org b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final oxd oxd) {
        final nbn a = this.a;
        if (a.b != null) {
            throw new IllegalStateException("RxTransferListener subscriptions may not exceed 0 twice".toString());
        }
        a.b = new pcl(oxd);
        final oxd b = this.a.b;
        if (b != null) {
            oyj.i((AtomicReference)((pcl)b).a, new oyh(new nbl(this)));
        }
    }
}
