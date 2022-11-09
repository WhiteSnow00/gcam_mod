import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bfc implements aza, ayw
{
    protected final Drawable a;
    
    public bfc(final Drawable a) {
        bit.a(a);
        this.a = a;
    }
    
    @Override
    public void d() {
        final Drawable a = this.a;
        if (a instanceof BitmapDrawable) {
            ((BitmapDrawable)a).getBitmap().prepareToDraw();
            return;
        }
        if (a instanceof bfk) {
            ((bfk)a).a().prepareToDraw();
        }
    }
    
    public final Drawable f() {
        final Drawable$ConstantState constantState = this.a.getConstantState();
        if (constantState == null) {
            return this.a;
        }
        return constantState.newDrawable();
    }
}
