import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.Animatable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bhw extends bib
{
    private Animatable c;
    
    public bhw(final ImageView imageView) {
        super((View)imageView);
    }
    
    private final void n(final Object o) {
        this.l(o);
        if (o instanceof Animatable) {
            (this.c = (Animatable)o).start();
            return;
        }
        this.c = null;
    }
    
    @Override
    public final void a(final Drawable drawable) {
        super.b.c();
        final Animatable c = this.c;
        if (c != null) {
            c.stop();
        }
        this.n(null);
        this.m(drawable);
    }
    
    @Override
    public final void b(final Object o) {
        this.n(o);
    }
    
    @Override
    public final void e(final Drawable drawable) {
        this.n(null);
        this.m(drawable);
    }
    
    @Override
    public final void f(final Drawable drawable) {
        this.n(null);
        this.m(drawable);
    }
    
    @Override
    public final void h() {
        final Animatable c = this.c;
        if (c != null) {
            c.start();
        }
    }
    
    @Override
    public final void i() {
        final Animatable c = this.c;
        if (c != null) {
            c.stop();
        }
    }
    
    protected abstract void l(final Object p0);
    
    public final void m(final Drawable imageDrawable) {
        ((ImageView)this.a).setImageDrawable(imageDrawable);
    }
}
