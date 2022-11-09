import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class hc extends Drawable
{
    final Bitmap a;
    public final Paint b;
    public final BitmapShader c;
    public float d;
    final Rect e;
    private int f;
    private final int g;
    private final Matrix h;
    private final RectF i;
    private boolean j;
    private final int k;
    private final int l;
    
    public hc(final Resources resources, final Bitmap a) {
        this.f = 160;
        this.g = 119;
        this.b = new Paint(3);
        this.h = new Matrix();
        this.e = new Rect();
        this.i = new RectF();
        this.j = true;
        if (resources != null) {
            this.f = resources.getDisplayMetrics().densityDpi;
        }
        BitmapShader c;
        if ((this.a = a) != null) {
            this.k = a.getScaledWidth(this.f);
            this.l = a.getScaledHeight(this.f);
            c = new BitmapShader(a, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
        }
        else {
            this.l = -1;
            this.k = -1;
            c = null;
        }
        this.c = c;
    }
    
    public static boolean c(final float n) {
        return n > 0.05f;
    }
    
    public void a(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
        throw null;
    }
    
    final void b() {
        if (this.j) {
            this.a(this.g, this.k, this.l, this.getBounds(), this.e);
            this.i.set(this.e);
            if (this.c != null) {
                this.h.setTranslate(this.i.left, this.i.top);
                this.h.preScale(this.i.width() / this.a.getWidth(), this.i.height() / this.a.getHeight());
                this.c.setLocalMatrix(this.h);
                this.b.setShader((Shader)this.c);
            }
            this.j = false;
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Bitmap a = this.a;
        if (a == null) {
            return;
        }
        this.b();
        if (this.b.getShader() == null) {
            canvas.drawBitmap(a, (Rect)null, this.e, this.b);
            return;
        }
        final RectF i = this.i;
        final float d = this.d;
        canvas.drawRoundRect(i, d, d, this.b);
    }
    
    public final int getAlpha() {
        return this.b.getAlpha();
    }
    
    public final ColorFilter getColorFilter() {
        return this.b.getColorFilter();
    }
    
    public final int getIntrinsicHeight() {
        return this.l;
    }
    
    public final int getIntrinsicWidth() {
        return this.k;
    }
    
    public final int getOpacity() {
        if (this.g == 119) {
            final Bitmap a = this.a;
            if (a != null && !a.hasAlpha() && this.b.getAlpha() >= 255) {
                if (!c(this.d)) {
                    return -1;
                }
            }
        }
        return -3;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
    }
    
    public final void setAlpha(final int alpha) {
        if (alpha != this.b.getAlpha()) {
            this.b.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final void setDither(final boolean dither) {
        this.b.setDither(dither);
        this.invalidateSelf();
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.b.setFilterBitmap(filterBitmap);
        this.invalidateSelf();
    }
}
