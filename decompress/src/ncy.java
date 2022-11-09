import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncy implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ BottomSheetBehavior c;
    
    public ncy(final BottomSheetBehavior c, final View a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.G(this.a, this.b);
    }
}
