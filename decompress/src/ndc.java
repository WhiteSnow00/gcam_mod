import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndc implements jl
{
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;
    
    public ndc(final BottomSheetBehavior b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean a(final View view) {
        this.b.E(this.a);
        return true;
    }
}
