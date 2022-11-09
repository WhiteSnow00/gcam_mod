import android.graphics.Outline;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ym extends Drawable
{
    public final float a;
    public float b;
    public boolean c;
    public boolean d;
    private final Paint e;
    private final RectF f;
    private final Rect g;
    private final ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff$Mode k;
    
    public ym(final ColorStateList list, final float a) {
        this.c = false;
        this.d = true;
        this.k = PorterDuff$Mode.SRC_IN;
        this.a = a;
        final Paint e = new Paint(5);
        this.e = e;
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        this.h = value;
        e.setColor(value.getColorForState(this.getState(), value.getDefaultColor()));
        this.f = new RectF();
        this.g = new Rect();
    }
    
    private final PorterDuffColorFilter b(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public final void a(final Rect rect) {
        Rect bounds = rect;
        if (rect == null) {
            bounds = this.getBounds();
        }
        this.f.set((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom);
        this.g.set(bounds);
        if (this.c) {
            this.g.inset((int)Math.ceil(yn.a(this.b, this.a, this.d)), (int)Math.ceil(yn.b(this.b, this.a, this.d)));
            this.f.set(this.g);
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Paint e = this.e;
        final PorterDuffColorFilter i = this.i;
        boolean b = false;
        if (i != null && e.getColorFilter() == null) {
            e.setColorFilter((ColorFilter)this.i);
            b = true;
        }
        final RectF f = this.f;
        final float a = this.a;
        canvas.drawRoundRect(f, a, a, e);
        if (b) {
            e.setColorFilter((ColorFilter)null);
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        outline.setRoundRect(this.g, this.a);
    }
    
    public final boolean isStateful() {
        final ColorStateList j = this.j;
        if (j == null || !j.isStateful()) {
            final ColorStateList h = this.h;
            if ((h == null || !h.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.a(rect);
    }
    
    protected final boolean onStateChange(final int[] array) {
        final ColorStateList h = this.h;
        final int colorForState = h.getColorForState(array, h.getDefaultColor());
        final boolean b = colorForState != this.e.getColor();
        if (b) {
            this.e.setColor(colorForState);
        }
        final ColorStateList j = this.j;
        if (j != null) {
            final PorterDuff$Mode k = this.k;
            if (k != null) {
                this.i = this.b(j, k);
                return true;
            }
        }
        return b;
    }
    
    public final void setAlpha(final int alpha) {
        this.e.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }
    
    public final void setTintList(final ColorStateList j) {
        this.j = j;
        this.i = this.b(j, this.k);
        this.invalidateSelf();
    }
    
    public final void setTintMode(final PorterDuff$Mode k) {
        this.k = k;
        this.i = this.b(this.j, k);
        this.invalidateSelf();
    }
}
