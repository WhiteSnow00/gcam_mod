import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class qj extends lq
{
    public boolean b;
    
    public qj(final Drawable drawable) {
        super(drawable);
        this.b = true;
    }
    
    @Override
    public final void draw(final Canvas canvas) {
        if (this.b) {
            super.draw(canvas);
        }
    }
    
    @Override
    public final void setHotspot(final float n, final float n2) {
        if (this.b) {
            super.setHotspot(n, n2);
        }
    }
    
    @Override
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        if (this.b) {
            super.setHotspotBounds(n, n2, n3, n4);
        }
    }
    
    @Override
    public final boolean setState(final int[] state) {
        return this.b && super.setState(state);
    }
    
    @Override
    public final boolean setVisible(final boolean b, final boolean b2) {
        return this.b && super.setVisible(b, b2);
    }
}
