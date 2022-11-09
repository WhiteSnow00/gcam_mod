import androidx.viewpager2.widget.ViewPager2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agu extends aal
{
    final /* synthetic */ ViewPager2 a;
    
    public agu(final ViewPager2 a) {
        this.a = a;
    }
    
    @Override
    public final void f(final int n) {
        this.a.clearFocus();
        if (this.a.hasFocus()) {
            this.a.e.requestFocus(2);
        }
    }
}
