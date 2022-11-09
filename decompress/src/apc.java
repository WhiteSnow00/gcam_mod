import androidx.work.impl.workers.ConstraintTrackingWorker;

// 
// Decompiled by Procyon v0.6.0
// 

final class apc implements Runnable
{
    final /* synthetic */ oey a;
    final /* synthetic */ ConstraintTrackingWorker b;
    
    public apc(final ConstraintTrackingWorker b, final oey a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.b.h) {
            if (this.b.i) {
                this.b.i();
            }
            else {
                this.b.k.g(this.a);
            }
        }
    }
}
