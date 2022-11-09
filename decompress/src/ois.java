import android.util.Log;
import com.google.lens.sdk.LensApi$LensLaunchStatusCallback;
import android.app.KeyguardManager$KeyguardDismissCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ois extends KeyguardManager$KeyguardDismissCallback
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ LensApi$LensLaunchStatusCallback b;
    
    public ois(final Runnable a, final LensApi$LensLaunchStatusCallback b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onDismissCancelled() {
        final LensApi$LensLaunchStatusCallback b = this.b;
        if (b != null) {
            b.onLaunchStatusFetched(1);
        }
    }
    
    public final void onDismissError() {
        final LensApi$LensLaunchStatusCallback b = this.b;
        if (b != null) {
            b.onLaunchStatusFetched(1);
        }
        Log.e("LensApi", "Error dismissing keyguard");
    }
    
    public final void onDismissSucceeded() {
        this.a.run();
        final LensApi$LensLaunchStatusCallback b = this.b;
        if (b != null) {
            b.onLaunchStatusFetched(0);
        }
    }
}
