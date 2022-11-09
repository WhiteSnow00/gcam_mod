import androidx.viewpager2.widget.ViewPager2;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class agx implements jl
{
    final /* synthetic */ agy a;
    private final /* synthetic */ int b;
    
    public agx(final agy a) {
        this.a = a;
    }
    
    public agx(final agy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean a(final View view) {
        switch (this.b) {
            default: {
                this.a.C(((ViewPager2)view).c + 1);
                return true;
            }
            case 0: {
                this.a.C(((ViewPager2)view).c - 1);
                return true;
            }
        }
    }
}
