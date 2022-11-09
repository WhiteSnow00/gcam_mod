import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class kl extends ip
{
    final /* synthetic */ kw a;
    
    public kl(final kw a) {
        this.a = a;
    }
    
    @Override
    public final void b() {
        this.a.m.setAlpha(1.0f);
        this.a.p.d(null);
        this.a.p = null;
    }
    
    @Override
    public final void c() {
        this.a.m.setVisibility(0);
        this.a.m.sendAccessibilityEvent(32);
        if (this.a.m.getParent() instanceof View) {
            ik.D((View)this.a.m.getParent());
        }
    }
}
