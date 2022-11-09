import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngm extends aal
{
    private final WeakReference a;
    private int b;
    private int c;
    
    public ngm(final TabLayout tabLayout) {
        this.a = new WeakReference((T)tabLayout);
        this.c = 0;
        this.b = 0;
    }
    
    @Override
    public final void d(final int c) {
        this.b = this.c;
        this.c = c;
    }
    
    @Override
    public final void e(final int n, final float n2, int c) {
        final TabLayout tabLayout = (TabLayout)this.a.get();
        if (tabLayout != null) {
            c = this.c;
            boolean b = false;
            final boolean b2 = c != 2 || this.b == 1;
            if (c == 2) {
                if (this.b != 0) {
                    b = true;
                }
            }
            else {
                b = true;
            }
            tabLayout.j(n, n2, b2, b);
        }
    }
    
    @Override
    public final void f(final int n) {
        final TabLayout tabLayout = (TabLayout)this.a.get();
        if (tabLayout != null && tabLayout.a() != n && n < tabLayout.b()) {
            final int c = this.c;
            boolean b = false;
            if (c != 0) {
                if (c == 2 && this.b == 0) {
                    b = true;
                }
            }
            else {
                b = true;
            }
            tabLayout.i(tabLayout.c(n), b);
        }
    }
}
