import android.view.MenuItem;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

class mj
{
    final Context a;
    public zb b;
    
    public mj(final Context a) {
        this.a = a;
    }
    
    final MenuItem a(MenuItem menuItem) {
        Object o = menuItem;
        if (menuItem instanceof hf) {
            final hf hf = (hf)menuItem;
            if (this.b == null) {
                this.b = new zb();
            }
            menuItem = (MenuItem)this.b.get(menuItem);
            if ((o = menuItem) == null) {
                o = new ne(this.a, hf);
                this.b.put(hf, o);
            }
        }
        return (MenuItem)o;
    }
}
