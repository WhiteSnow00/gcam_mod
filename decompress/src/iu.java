import android.view.WindowInsets;

// 
// Decompiled by Procyon v0.6.0
// 

class iu extends it
{
    private gw c;
    
    public iu(final ix ix, final WindowInsets windowInsets) {
        super(ix, windowInsets);
        this.c = null;
    }
    
    @Override
    public final ix b(final int n, final int n2, final int n3, final int n4) {
        return ix.l(this.a.inset(n, n2, n3, n4));
    }
    
    @Override
    public final gw m() {
        if (this.c == null) {
            this.c = gw.d(this.a.getMandatorySystemGestureInsets());
        }
        return this.c;
    }
}
