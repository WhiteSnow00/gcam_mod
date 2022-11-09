import android.view.View;
import android.view.MenuItem;
import android.view.ActionProvider;
import android.view.ActionProvider$VisibilityListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class na extends mz implements ActionProvider$VisibilityListener
{
    private mx c;
    
    public na(final ActionProvider actionProvider) {
        super(actionProvider);
    }
    
    public final View b(final MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }
    
    public final boolean e() {
        return this.b.isVisible();
    }
    
    public final boolean g() {
        return this.b.overridesItemVisibility();
    }
    
    public final void h(final mx c) {
        this.c = c;
        this.b.setVisibilityListener((ActionProvider$VisibilityListener)this);
    }
    
    public final void onActionProviderVisibilityChanged(final boolean b) {
        final mx c = this.c;
        if (c != null) {
            c.a.j.C();
        }
    }
}
