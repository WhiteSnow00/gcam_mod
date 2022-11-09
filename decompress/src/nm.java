import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import android.content.Context;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nm extends mj implements Menu
{
    private final he c;
    
    public nm(final Context context, final he c) {
        super(context);
        this.c = c;
    }
    
    public final MenuItem add(final int n) {
        return this.a(this.c.add(n));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.a(this.c.add(n, n2, n3, n4));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(((mv)this.c).c(n, n2, n3, charSequence));
    }
    
    public final MenuItem add(final CharSequence charSequence) {
        return this.a(this.c.add(charSequence));
    }
    
    public final int addIntentOptions(int i, int addIntentOptions, int length, final ComponentName componentName, final Intent[] array, final Intent intent, final int n, final MenuItem[] array2) {
        MenuItem[] array3;
        if (array2 != null) {
            array3 = new MenuItem[array2.length];
        }
        else {
            array3 = null;
        }
        addIntentOptions = this.c.addIntentOptions(i, addIntentOptions, length, componentName, array, intent, n, array3);
        if (array3 != null) {
            for (length = array3.length, i = 0; i < length; ++i) {
                array2[i] = this.a(array3[i]);
            }
        }
        return addIntentOptions;
    }
    
    public final SubMenu addSubMenu(final int n) {
        return this.c.addSubMenu(n);
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.c.addSubMenu(n, n2, n3, n4);
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.c.addSubMenu(n, n2, n3, charSequence);
    }
    
    public final SubMenu addSubMenu(final CharSequence charSequence) {
        return this.c.addSubMenu(charSequence);
    }
    
    public final void clear() {
        final zb b = super.b;
        if (b != null) {
            b.clear();
        }
        this.c.clear();
    }
    
    public final void close() {
        this.c.close();
    }
    
    public final MenuItem findItem(final int n) {
        return this.a(this.c.findItem(n));
    }
    
    public final MenuItem getItem(final int n) {
        return this.a(this.c.getItem(n));
    }
    
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }
    
    public final boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.c.isShortcutKey(n, keyEvent);
    }
    
    public final boolean performIdentifierAction(final int n, final int n2) {
        return this.c.performIdentifierAction(n, n2);
    }
    
    public final boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        return this.c.performShortcut(n, keyEvent, n2);
    }
    
    public final void removeGroup(final int n) {
        if (super.b != null) {
            int n2 = 0;
            while (true) {
                final zb b = super.b;
                if (n2 >= b.j) {
                    break;
                }
                int n3 = n2;
                if (((hf)b.f(n2)).getGroupId() == n) {
                    super.b.g(n2);
                    n3 = n2 - 1;
                }
                n2 = n3 + 1;
            }
        }
        this.c.removeGroup(n);
    }
    
    public final void removeItem(final int n) {
        if (super.b != null) {
            int n2 = 0;
            while (true) {
                final zb b = super.b;
                if (n2 >= b.j) {
                    break;
                }
                if (((hf)b.f(n2)).getItemId() == n) {
                    super.b.g(n2);
                    break;
                }
                ++n2;
            }
        }
        this.c.removeItem(n);
    }
    
    public final void setGroupCheckable(final int n, final boolean b, final boolean b2) {
        this.c.setGroupCheckable(n, b, b2);
    }
    
    public final void setGroupEnabled(final int n, final boolean b) {
        this.c.setGroupEnabled(n, b);
    }
    
    public final void setGroupVisible(final int n, final boolean b) {
        this.c.setGroupVisible(n, b);
    }
    
    public final void setQwertyMode(final boolean qwertyMode) {
        this.c.setQwertyMode(qwertyMode);
    }
    
    public final int size() {
        return this.c.size();
    }
}
