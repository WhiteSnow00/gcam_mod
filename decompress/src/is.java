import android.view.WindowInsets;

// 
// Decompiled by Procyon v0.6.0
// 

class is extends ir
{
    private gw c;
    
    public is(final ix ix, final WindowInsets windowInsets) {
        super(ix, windowInsets);
        this.c = null;
    }
    
    @Override
    public final gw g() {
        if (this.c == null) {
            this.c = gw.c(this.a.getStableInsetLeft(), this.a.getStableInsetTop(), this.a.getStableInsetRight(), this.a.getStableInsetBottom());
        }
        return this.c;
    }
    
    @Override
    public final ix h() {
        return ix.l(this.a.consumeStableInsets());
    }
    
    @Override
    public final ix i() {
        return ix.l(this.a.consumeSystemWindowInsets());
    }
    
    @Override
    public final boolean j() {
        return this.a.isConsumed();
    }
}
