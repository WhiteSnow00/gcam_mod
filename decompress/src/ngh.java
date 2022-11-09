import com.google.android.material.tabs.TabLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngh
{
    public CharSequence a;
    public CharSequence b;
    public int c;
    public View d;
    public final int e;
    public TabLayout f;
    public ngk g;
    public int h;
    
    public ngh() {
        this.c = -1;
        this.e = 1;
        this.h = -1;
    }
    
    public final void a() {
        final TabLayout f = this.f;
        if (f != null) {
            f.h(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
    
    public final void b() {
        final ngk g = this.g;
        if (g != null) {
            g.b();
        }
    }
}
