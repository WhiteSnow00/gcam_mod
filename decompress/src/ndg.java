import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndg implements Runnable
{
    public boolean a;
    public int b;
    final /* synthetic */ BottomSheetBehavior c;
    private final View d;
    
    public ndg(final BottomSheetBehavior c, final View d, final int b) {
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final abq t = this.c.t;
        if (t != null && t.l()) {
            ik.A(this.d, this);
        }
        else {
            this.c.F(this.b);
        }
        this.a = false;
    }
}
