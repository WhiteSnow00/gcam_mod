import android.graphics.ColorFilter;
import j$.util.Objects;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uu extends Drawable
{
    final Paint a;
    public int b;
    private Drawable c;
    private final RectF d;
    
    public uu() {
        this.d = new RectF();
        (this.a = new Paint()).setAntiAlias(true);
    }
    
    private final void b() {
        if (this.c == null) {
            return;
        }
        final Rect bounds = this.getBounds();
        if (!bounds.isEmpty()) {
            final Drawable c = this.c;
            final int width = bounds.width();
            final int height = bounds.height();
            final Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmap);
            final int intrinsicWidth = c.getIntrinsicWidth();
            final int intrinsicHeight = c.getIntrinsicHeight();
            if (intrinsicWidth > intrinsicHeight) {
                final int n = ((int)(width * (intrinsicWidth / (float)intrinsicHeight)) - width) / 2;
                c.setBounds(-n, 0, width + n, height);
            }
            else {
                final int n2 = ((int)(height * (intrinsicHeight / (float)intrinsicWidth)) - height) / 2;
                c.setBounds(0, -n2, width, height + n2);
            }
            c.draw(canvas);
            this.a.setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
        }
    }
    
    public final void a(final Drawable c) {
        if (Objects.equals((Object)this.c, (Object)c)) {
            return;
        }
        this.c = c;
        this.b();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        if (this.c != null && !bounds.isEmpty()) {
            canvas.save();
            canvas.translate((float)bounds.left, (float)bounds.top);
            final RectF d = this.d;
            final float n = (float)this.b;
            canvas.drawRoundRect(d, n, n, this.a);
            canvas.restore();
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.d.right = (float)rect.width();
        this.d.bottom = (float)rect.height();
        this.b();
    }
    
    public final void setAlpha(final int alpha) {
        this.a.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
