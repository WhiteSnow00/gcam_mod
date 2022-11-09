import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agd implements Runnable
{
    final /* synthetic */ ViewPager a;
    
    public agd(final ViewPager a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.a(0);
    }
}
