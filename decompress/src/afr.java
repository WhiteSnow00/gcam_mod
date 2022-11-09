import android.graphics.PorterDuff$Mode;
import android.graphics.Region;
import android.graphics.Rect;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afr extends Drawable
{
    Drawable a;
    
    public afr() {
    }
    
    public final void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable a = this.a;
        if (a != null) {
            a.applyTheme(resources$Theme);
        }
    }
    
    public final void clearColorFilter() {
        final Drawable a = this.a;
        if (a != null) {
            a.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }
    
    public final Drawable getCurrent() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getCurrent();
        }
        return super.getCurrent();
    }
    
    public final int getMinimumHeight() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }
    
    public final boolean getPadding(final Rect rect) {
        final Drawable a = this.a;
        if (a != null) {
            return a.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public final int[] getState() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getState();
        }
        return super.getState();
    }
    
    public final Region getTransparentRegion() {
        final Drawable a = this.a;
        if (a != null) {
            return a.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public final void jumpToCurrentState() {
        final Drawable a = this.a;
        if (a != null) {
            a.jumpToCurrentState();
        }
    }
    
    protected void onBoundsChange(final Rect bounds) {
        final Drawable a = this.a;
        if (a != null) {
            a.setBounds(bounds);
            return;
        }
        super.onBoundsChange(bounds);
    }
    
    protected final boolean onLevelChange(final int level) {
        final Drawable a = this.a;
        if (a != null) {
            return a.setLevel(level);
        }
        return super.onLevelChange(level);
    }
    
    public final void setChangingConfigurations(final int n) {
        final Drawable a = this.a;
        if (a != null) {
            a.setChangingConfigurations(n);
            return;
        }
        super.setChangingConfigurations(n);
    }
    
    public final void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        final Drawable a = this.a;
        if (a != null) {
            a.setColorFilter(n, porterDuff$Mode);
            return;
        }
        super.setColorFilter(n, porterDuff$Mode);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        final Drawable a = this.a;
        if (a != null) {
            a.setFilterBitmap(filterBitmap);
        }
    }
    
    public final void setHotspot(final float n, final float n2) {
        final Drawable a = this.a;
        if (a != null) {
            a.setHotspot(n, n2);
        }
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Drawable a = this.a;
        if (a != null) {
            a.setHotspotBounds(n, n2, n3, n4);
        }
    }
    
    public final boolean setState(final int[] array) {
        final Drawable a = this.a;
        if (a != null) {
            return a.setState(array);
        }
        return super.setState(array);
    }
}
