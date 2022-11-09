import android.view.SubMenu;
import android.view.View;
import android.view.ActionProvider;

// 
// Decompiled by Procyon v0.6.0
// 

class mz extends hu
{
    final ActionProvider b;
    
    public mz(final ActionProvider b) {
        this.b = b;
    }
    
    @Override
    public final View a() {
        return this.b.onCreateActionView();
    }
    
    @Override
    public final void c(final SubMenu subMenu) {
        this.b.onPrepareSubMenu(subMenu);
    }
    
    @Override
    public final boolean d() {
        return this.b.hasSubMenu();
    }
    
    @Override
    public final boolean f() {
        return this.b.onPerformDefaultAction();
    }
}
