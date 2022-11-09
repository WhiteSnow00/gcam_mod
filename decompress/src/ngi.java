import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngi implements agj
{
    public int a;
    public int b;
    private final WeakReference c;
    
    public ngi(final TabLayout tabLayout) {
        this.c = new WeakReference((T)tabLayout);
    }
    
    @Override
    public final void a(final int b) {
        this.a = this.b;
        this.b = b;
    }
    
    @Override
    public final void b(final int n, final float n2) {
        final TabLayout tabLayout = (TabLayout)this.c.get();
        if (tabLayout != null) {
            tabLayout.j(n, n2, true, true);
        }
    }
}
