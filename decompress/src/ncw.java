import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

final class ncw implements Runnable
{
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    
    public ncw(final SwipeDismissBehavior a, final View b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final abq a = this.a.a;
        if (a != null && a.l()) {
            ik.A(this.b, this);
        }
    }
}
