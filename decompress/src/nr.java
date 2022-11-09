import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.content.Context;
import android.view.SubMenu;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nr extends mv implements SubMenu
{
    public final mv j;
    public final my k;
    
    public nr(final Context context, final mv j, final my k) {
        super(context);
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final mv a() {
        return this.j.a();
    }
    
    public final String d() {
        final int a = this.k.a;
        if (a == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("android:menu:actionviewstates:");
        sb.append(a);
        return sb.toString();
    }
    
    public final MenuItem getItem() {
        return (MenuItem)this.k;
    }
    
    @Override
    public final void p(final mt mt) {
        this.j.p(mt);
    }
    
    @Override
    public final void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        this.j.setGroupDividerEnabled(groupDividerEnabled);
    }
    
    public final SubMenu setHeaderIcon(final int n) {
        super.q(0, null, n, null, null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int n) {
        super.q(n, null, 0, null, null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View view) {
        super.q(0, null, 0, null, view);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        this.k.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        this.k.setIcon(icon);
        return (SubMenu)this;
    }
    
    @Override
    public final void setQwertyMode(final boolean qwertyMode) {
        this.j.setQwertyMode(qwertyMode);
    }
    
    @Override
    public final boolean t(final my my) {
        return this.j.t(my);
    }
    
    @Override
    public final boolean u(final mv mv, final MenuItem menuItem) {
        return super.u(mv, menuItem) || this.j.u(mv, menuItem);
    }
    
    @Override
    public final boolean v(final my my) {
        return this.j.v(my);
    }
    
    @Override
    public final boolean w() {
        return this.j.w();
    }
    
    @Override
    public final boolean x() {
        return this.j.x();
    }
    
    @Override
    public final boolean y() {
        return this.j.y();
    }
}
