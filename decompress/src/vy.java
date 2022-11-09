import android.graphics.ColorFilter;
import android.graphics.Path$Direction;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Handler;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vy extends Drawable
{
    private final Path a;
    
    public vy() {
        new Handler(Looper.getMainLooper());
        new xo();
        new Rect();
        this.a = new Path();
        new vx(this);
    }
    
    public final void draw(final Canvas canvas) {
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.a.reset();
        this.a.addOval((float)rect.left, (float)rect.top, (float)rect.right, (float)rect.bottom, Path$Direction.CW);
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
