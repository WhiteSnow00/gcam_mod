import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

final class ino extends ink
{
    public ino(final Paint paint) {
        super(paint);
    }
    
    @Override
    public final void b(final Canvas canvas, final RectF rectF) {
        if (!this.b) {
            canvas.drawLine(rectF.left + this.a, rectF.top, rectF.left + this.a, rectF.bottom, this.c);
        }
    }
}
