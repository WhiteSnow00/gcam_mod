import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dot implements dos
{
    private final GradientDrawable a;
    private float b;
    private float c;
    
    public dot() {
        final GradientDrawable a = new GradientDrawable();
        (this.a = a).setShape(1);
    }
    
    @Override
    public final void a(final Canvas canvas) {
        final float b = this.b;
        if (b > 0.0f) {
            bo.h(canvas, (Drawable)this.a, b, this.c);
        }
    }
    
    @Override
    public final void b(final int n, final int n2) {
        this.a.setBounds(0, 0, n, n2);
    }
    
    @Override
    public final void c(final float cornerRadius) {
        this.a.setCornerRadius(cornerRadius);
    }
    
    @Override
    public final void d(final float b) {
        njo.d(b > 0.0f);
        this.b = b;
    }
    
    @Override
    public final void e(final float n) {
        this.a.setAlpha((int)(n * 255.0f));
    }
    
    @Override
    public final void f(final float c) {
        this.c = c;
        this.a.setStroke((int)c, -1);
    }
}
