import android.widget.OverScroller;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class ncn implements Runnable
{
    final /* synthetic */ nco a;
    private final CoordinatorLayout b;
    private final View c;
    
    public ncn(final nco a, final CoordinatorLayout b, final View c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.c != null) {
            final OverScroller b = this.a.b;
            if (b != null) {
                if (b.computeScrollOffset()) {
                    final nco a = this.a;
                    a.z(this.b, this.c, a.b.getCurrY(), Integer.MAX_VALUE);
                    ik.A(this.c, this);
                    return;
                }
                this.a.y(this.c);
            }
        }
    }
}
