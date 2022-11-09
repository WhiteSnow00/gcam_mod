import android.app.KeyguardManager$KeyguardDismissCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class iou extends KeyguardManager$KeyguardDismissCallback
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ ofn b;
    
    public iou(final Runnable a, final ofn b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onDismissCancelled() {
        this.b.o(false);
    }
    
    public final void onDismissError() {
        a.l(iov.a.b(), "Error dismissing keyguard", '\u0ae8');
        this.b.o(false);
    }
    
    public final void onDismissSucceeded() {
        this.a.run();
        this.b.o(true);
    }
}
