import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfj extends Drawable$ConstantState
{
    final bfr a;
    
    public bfj(final bfr a) {
        this.a = a;
    }
    
    public final int getChangingConfigurations() {
        return 0;
    }
    
    public final Drawable newDrawable() {
        return new bfk(this);
    }
    
    public final Drawable newDrawable(final Resources resources) {
        return this.newDrawable();
    }
}
