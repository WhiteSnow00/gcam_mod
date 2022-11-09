import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.view.animation.LinearInterpolator;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vm extends Drawable
{
    private static final Property b;
    private static final TimeInterpolator c;
    public final ObjectAnimator a;
    private final RectF d;
    private final Paint e;
    
    static {
        b = new vl(Integer.class);
        c = (TimeInterpolator)vk.a;
    }
    
    public vm() {
        this.d = new RectF();
        final Paint e = new Paint();
        (this.e = e).setAntiAlias(true);
        e.setStyle(Paint$Style.STROKE);
        final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)this, vm.b, new int[] { 0, 10000 });
        (this.a = ofInt).setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ofInt.setDuration(6000L);
        ofInt.setInterpolator((TimeInterpolator)new LinearInterpolator());
    }
    
    private static float a(final float n, final float n2, final float n3) {
        if (n != n2) {
            return (n3 - n) / (n2 - n);
        }
        return 0.0f;
    }
    
    public final void draw(final Canvas canvas) {
        canvas.save();
        this.d.set(this.getBounds());
        this.d.inset(0.0f, 0.0f);
        this.e.setStrokeWidth(0.0f);
        this.e.setColor(0);
        final int level = this.getLevel();
        final float n = (level - level / 2000 * 2000) / 2000.0f;
        float n2;
        if (n < 0.5f) {
            n2 = vm.c.getInterpolation(a(0.0f, 0.5f, n)) * 306.0f;
        }
        else {
            n2 = (1.0f - vm.c.getInterpolation(a(0.5f, 1.0f, n))) * 306.0f;
        }
        final float max = Math.max(1.0f, n2);
        final float n3 = level * 1.0E-4f;
        canvas.rotate((n3 + n3) * 360.0f - 90.0f + 54.0f * n, this.d.centerX(), this.d.centerY());
        final RectF d = this.d;
        float n4;
        if (n < 0.5f) {
            n4 = 0.0f;
        }
        else {
            n4 = 306.0f - max;
        }
        canvas.drawArc(d, n4, max, false, this.e);
        canvas.restore();
    }
    
    public final int getOpacity() {
        return -1;
    }
    
    protected final boolean onLevelChange(final int n) {
        return true;
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
