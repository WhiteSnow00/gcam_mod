import android.view.View;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem;
import java.lang.reflect.Constructor;
import android.util.Log;
import android.view.SubMenu;
import android.view.Menu;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

final class ma
{
    hu A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D;
    public PorterDuff$Mode E;
    final /* synthetic */ mb F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;
    
    public ma(final mb f, final Menu a) {
        this.F = f;
        this.D = null;
        this.E = null;
        this.a = a;
        this.c();
    }
    
    public static final char e(final String s) {
        if (s == null) {
            return '\0';
        }
        return s.charAt(0);
    }
    
    public final SubMenu a() {
        this.h = true;
        final SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        this.d(addSubMenu.getItem());
        return addSubMenu;
    }
    
    public final Object b(final String s, final Class[] array, final Object[] array2) {
        try {
            final Constructor<?> constructor = Class.forName(s, false, this.F.e.getClassLoader()).getConstructor((Class<?>[])array);
            constructor.setAccessible(true);
            return constructor.newInstance(array2);
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot instantiate class: ");
            sb.append(s);
            Log.w("SupportMenuInflater", sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }
    
    public final void d(final MenuItem menuItem) {
        final MenuItem setEnabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        final int r = this.r;
        boolean b = false;
        setEnabled.setCheckable(r > 0).setTitleCondensed(this.l).setIcon(this.m);
        final int v = this.v;
        if (v >= 0) {
            menuItem.setShowAsAction(v);
        }
        if (this.z != null) {
            if (this.F.e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            final mb f = this.F;
            if (f.f == null) {
                f.f = f.a(f.e);
            }
            menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new lz(f.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof my) {
                ((my)menuItem).j(true);
            }
            else if (menuItem instanceof ne) {
                final ne ne = (ne)menuItem;
                try {
                    if (ne.d == null) {
                        ne.d = ne.c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    ne.d.invoke(ne.c, true);
                }
                catch (final Exception ex) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", (Throwable)ex);
                }
            }
        }
        final String x = this.x;
        if (x != null) {
            menuItem.setActionView((View)this.b(x, mb.a, this.F.c));
            b = true;
        }
        final int w = this.w;
        if (w > 0) {
            if (!b) {
                menuItem.setActionView(w);
            }
            else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        final hu a = this.A;
        if (a != null) {
            if (menuItem instanceof hf) {
                ((hf)menuItem).c(a);
            }
            else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        final CharSequence b2 = this.B;
        final boolean b3 = menuItem instanceof hf;
        if (b3) {
            ((hf)menuItem).b(b2);
        }
        else {
            menuItem.setContentDescription(b2);
        }
        final CharSequence c = this.C;
        if (b3) {
            ((hf)menuItem).d(c);
        }
        else {
            menuItem.setTooltipText(c);
        }
        final char n = this.n;
        final int o = this.o;
        if (b3) {
            ((hf)menuItem).setAlphabeticShortcut(n, o);
        }
        else {
            menuItem.setAlphabeticShortcut(n, o);
        }
        final char p = this.p;
        final int q = this.q;
        if (b3) {
            ((hf)menuItem).setNumericShortcut(p, q);
        }
        else {
            menuItem.setNumericShortcut(p, q);
        }
        final PorterDuff$Mode e = this.E;
        if (e != null) {
            if (b3) {
                ((hf)menuItem).setIconTintMode(e);
            }
            else {
                menuItem.setIconTintMode(e);
            }
        }
        final ColorStateList d = this.D;
        if (d != null) {
            if (b3) {
                ((hf)menuItem).setIconTintList(d);
                return;
            }
            menuItem.setIconTintList(d);
        }
    }
}
