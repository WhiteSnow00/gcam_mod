import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public class ink
{
    int a;
    boolean b;
    final Paint c;
    
    public ink(final Paint c) {
        this.c = c;
    }
    
    public final void a(final int alpha) {
        this.c.setAlpha(alpha);
    }
    
    public void b(final Canvas canvas, final RectF rectF) {
        if (!this.b) {
            canvas.drawLine(rectF.left, rectF.top + this.a, rectF.right, rectF.top + this.a, this.c);
        }
    }
}
