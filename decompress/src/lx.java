import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import android.content.Context;
import android.view.ActionMode$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lx implements lt
{
    public final ActionMode$Callback a;
    public final Context b;
    final ArrayList c;
    final zb d;
    
    public lx(final Context b, final ActionMode$Callback a) {
        this.b = b;
        this.a = a;
        this.c = new ArrayList();
        this.d = new zb();
    }
    
    @Override
    public final void a(final lu lu) {
        throw null;
    }
    
    @Override
    public final boolean b(final lu lu, final MenuItem menuItem) {
        throw null;
    }
    
    @Override
    public final boolean c(final lu lu, final Menu menu) {
        throw null;
    }
    
    @Override
    public final void d(final lu lu, final Menu menu) {
        throw null;
    }
    
    public final ActionMode e(final lu lu) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final ly ly = this.c.get(i);
            if (ly != null && ly.b == lu) {
                return ly;
            }
        }
        final ly ly2 = new ly(this.b, lu);
        this.c.add(ly2);
        return ly2;
    }
    
    public final Menu f(final Menu menu) {
        Object o;
        if ((o = this.d.get(menu)) == null) {
            o = new nm(this.b, (he)menu);
            this.d.put(menu, o);
        }
        return (Menu)o;
    }
}
