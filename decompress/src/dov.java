import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dov implements dou
{
    private final ShapeDrawable a;
    private float b;
    
    public dov(final ShapeDrawable a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Canvas canvas) {
        final float b = this.b;
        if (b > 0.0f) {
            bo.h(canvas, (Drawable)this.a, b, 0.0f);
        }
    }
    
    @Override
    public final void b(final int n, final int n2) {
        this.a.setBounds(0, 0, n, n2);
    }
    
    @Override
    public final void c(final float b) {
        njo.d(b > 0.0f);
        this.b = b;
    }
    
    @Override
    public final void d(final float n) {
        this.a.setAlpha((int)(n * 255.0f));
    }
}
