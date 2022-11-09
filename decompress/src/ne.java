import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ActionProvider;
import android.content.Context;
import java.lang.reflect.Method;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ne extends mj implements MenuItem
{
    public final hf c;
    public Method d;
    
    public ne(final Context context, final hf c) {
        super(context);
        if (c != null) {
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public final boolean collapseActionView() {
        return this.c.collapseActionView();
    }
    
    public final boolean expandActionView() {
        return this.c.expandActionView();
    }
    
    public final ActionProvider getActionProvider() {
        final hu a = this.c.a();
        if (a instanceof mz) {
            return ((mz)a).b;
        }
        return null;
    }
    
    public final View getActionView() {
        View actionView;
        final View view = actionView = this.c.getActionView();
        if (view instanceof nb) {
            actionView = (View)((nb)view).a;
        }
        return actionView;
    }
    
    public final int getAlphabeticModifiers() {
        return this.c.getAlphabeticModifiers();
    }
    
    public final char getAlphabeticShortcut() {
        return this.c.getAlphabeticShortcut();
    }
    
    public final CharSequence getContentDescription() {
        return this.c.getContentDescription();
    }
    
    public final int getGroupId() {
        return this.c.getGroupId();
    }
    
    public final Drawable getIcon() {
        return this.c.getIcon();
    }
    
    public final ColorStateList getIconTintList() {
        return this.c.getIconTintList();
    }
    
    public final PorterDuff$Mode getIconTintMode() {
        return this.c.getIconTintMode();
    }
    
    public final Intent getIntent() {
        return this.c.getIntent();
    }
    
    public final int getItemId() {
        return this.c.getItemId();
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public final int getNumericModifiers() {
        return this.c.getNumericModifiers();
    }
    
    public final char getNumericShortcut() {
        return this.c.getNumericShortcut();
    }
    
    public final int getOrder() {
        return this.c.getOrder();
    }
    
    public final SubMenu getSubMenu() {
        return this.c.getSubMenu();
    }
    
    public final CharSequence getTitle() {
        return this.c.getTitle();
    }
    
    public final CharSequence getTitleCondensed() {
        return this.c.getTitleCondensed();
    }
    
    public final CharSequence getTooltipText() {
        return this.c.getTooltipText();
    }
    
    public final boolean hasSubMenu() {
        return this.c.hasSubMenu();
    }
    
    public final boolean isActionViewExpanded() {
        return this.c.isActionViewExpanded();
    }
    
    public final boolean isCheckable() {
        return this.c.isCheckable();
    }
    
    public final boolean isChecked() {
        return this.c.isChecked();
    }
    
    public final boolean isEnabled() {
        return this.c.isEnabled();
    }
    
    public final boolean isVisible() {
        return this.c.isVisible();
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        final na na = new na(actionProvider);
        final hf c = this.c;
        na na2;
        if (actionProvider != null) {
            na2 = na;
        }
        else {
            na2 = null;
        }
        c.c(na2);
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final int actionView) {
        this.c.setActionView(actionView);
        final View actionView2 = this.c.getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            this.c.setActionView((View)new nb(actionView2));
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final View view) {
        Object actionView = view;
        if (view instanceof CollapsibleActionView) {
            actionView = new nb(view);
        }
        this.c.setActionView((View)actionView);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        this.c.setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.c.setAlphabeticShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean checkable) {
        this.c.setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean checked) {
        this.c.setChecked(checked);
        return (MenuItem)this;
    }
    
    public final MenuItem setContentDescription(final CharSequence charSequence) {
        this.c.b(charSequence);
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean enabled) {
        this.c.setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int icon) {
        this.c.setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable icon) {
        this.c.setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintList(final ColorStateList iconTintList) {
        this.c.setIconTintList(iconTintList);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintMode(final PorterDuff$Mode iconTintMode) {
        this.c.setIconTintMode(iconTintMode);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent intent) {
        this.c.setIntent(intent);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char numericShortcut) {
        this.c.setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c, final int n) {
        this.c.setNumericShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        final hf c = this.c;
        Object onActionExpandListener;
        if (menuItem$OnActionExpandListener != null) {
            onActionExpandListener = new nc(this, menuItem$OnActionExpandListener);
        }
        else {
            onActionExpandListener = null;
        }
        c.setOnActionExpandListener((MenuItem$OnActionExpandListener)onActionExpandListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        final hf c = this.c;
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new nd(this, menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        c.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.c.setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.c.setShortcut(c, c2, n, n2);
        return (MenuItem)this;
    }
    
    public final void setShowAsAction(final int showAsAction) {
        this.c.setShowAsAction(showAsAction);
    }
    
    public final MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        this.c.setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int title) {
        this.c.setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence title) {
        this.c.setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        this.c.setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public final MenuItem setTooltipText(final CharSequence charSequence) {
        this.c.d(charSequence);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean visible) {
        final hf c = this.c;
        c.setVisible(visible);
        return (MenuItem)c;
    }
}
