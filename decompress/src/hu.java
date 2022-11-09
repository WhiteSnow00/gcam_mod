import android.util.Log;
import android.view.SubMenu;
import android.view.MenuItem;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hu
{
    public mx a;
    
    public abstract View a();
    
    public View b(final MenuItem menuItem) {
        return this.a();
    }
    
    public void c(final SubMenu subMenu) {
        throw null;
    }
    
    public boolean d() {
        throw null;
    }
    
    public boolean e() {
        return true;
    }
    
    public boolean f() {
        throw null;
    }
    
    public boolean g() {
        return false;
    }
    
    public void h(final mx a) {
        if (this.a != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(this.getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.a = a;
    }
}
