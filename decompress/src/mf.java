import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ActionProvider;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mf implements hf
{
    private CharSequence a;
    private CharSequence b;
    private Intent c;
    private char d;
    private int e;
    private char f;
    private int g;
    private Drawable h;
    private final Context i;
    private CharSequence j;
    private CharSequence k;
    private ColorStateList l;
    private PorterDuff$Mode m;
    private boolean n;
    private boolean o;
    private int p;
    
    public mf(final Context i, final CharSequence a) {
        this.e = 4096;
        this.g = 4096;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.p = 16;
        this.i = i;
        this.a = a;
    }
    
    private final void e() {
        final Drawable h = this.h;
        if (h != null && (this.n || this.o)) {
            final Drawable mutate = h.mutate();
            this.h = mutate;
            if (this.n) {
                mutate.setTintList(this.l);
            }
            if (this.o) {
                this.h.setTintMode(this.m);
            }
        }
    }
    
    @Override
    public final hu a() {
        return null;
    }
    
    @Override
    public final void b(final CharSequence j) {
        this.j = j;
    }
    
    @Override
    public final void c(final hu hu) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean collapseActionView() {
        return false;
    }
    
    @Override
    public final void d(final CharSequence k) {
        this.k = k;
    }
    
    @Override
    public final boolean expandActionView() {
        return false;
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final View getActionView() {
        return null;
    }
    
    @Override
    public final int getAlphabeticModifiers() {
        return this.g;
    }
    
    public final char getAlphabeticShortcut() {
        return this.f;
    }
    
    @Override
    public final CharSequence getContentDescription() {
        return this.j;
    }
    
    public final int getGroupId() {
        return 0;
    }
    
    public final Drawable getIcon() {
        return this.h;
    }
    
    @Override
    public final ColorStateList getIconTintList() {
        return this.l;
    }
    
    @Override
    public final PorterDuff$Mode getIconTintMode() {
        return this.m;
    }
    
    public final Intent getIntent() {
        return this.c;
    }
    
    public final int getItemId() {
        return 16908332;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    @Override
    public final int getNumericModifiers() {
        return this.e;
    }
    
    public final char getNumericShortcut() {
        return this.d;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public final SubMenu getSubMenu() {
        return null;
    }
    
    public final CharSequence getTitle() {
        return this.a;
    }
    
    public final CharSequence getTitleCondensed() {
        final CharSequence b = this.b;
        if (b != null) {
            return b;
        }
        return this.a;
    }
    
    @Override
    public final CharSequence getTooltipText() {
        return this.k;
    }
    
    public final boolean hasSubMenu() {
        return false;
    }
    
    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }
    
    public final boolean isCheckable() {
        return (this.p & 0x1) != 0x0;
    }
    
    public final boolean isChecked() {
        return (this.p & 0x2) != 0x0;
    }
    
    public final boolean isEnabled() {
        return (this.p & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        return (this.p & 0x8) == 0x0;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        this.f = Character.toLowerCase(c);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        this.p = ((b ? 1 : 0) | (this.p & 0xFFFFFFFE));
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        final int p = this.p;
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 2;
        }
        this.p = (n | (p & 0xFFFFFFFD));
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        final int p = this.p;
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 16;
        }
        this.p = (n | (p & 0xFFFFFFEF));
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int n) {
        this.h = aah.a(this.i, n);
        this.e();
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable h) {
        this.h = h;
        this.e();
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintList(final ColorStateList l) {
        this.l = l;
        this.n = true;
        this.e();
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintMode(final PorterDuff$Mode m) {
        this.m = m;
        this.o = true;
        this.e();
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent c) {
        this.c = c;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c) {
        this.d = c;
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setNumericShortcut(final char c, final int n) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.d = c;
        this.f = Character.toLowerCase(c2);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(n);
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(n2);
        return (MenuItem)this;
    }
    
    @Override
    public final void setShowAsAction(final int n) {
    }
    
    public final MenuItem setTitle(final int n) {
        this.a = this.i.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence a) {
        this.a = a;
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence b) {
        this.b = b;
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        final int p = this.p;
        int n = 8;
        if (b) {
            n = 0;
        }
        this.p = ((p & 0x8) | n);
        return (MenuItem)this;
    }
}
