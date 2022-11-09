import android.view.DisplayCutout;
import j$.util.Objects;
import android.view.WindowInsets;

// 
// Decompiled by Procyon v0.6.0
// 

class it extends is
{
    public it(final ix ix, final WindowInsets windowInsets) {
        super(ix, windowInsets);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof it)) {
            return false;
        }
        final it it = (it)o;
        if (Objects.equals((Object)this.a, (Object)it.a)) {
            final gw b = it.b;
            if (Objects.equals((Object)null, (Object)null)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final hx k() {
        final DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new hx(displayCutout);
    }
    
    @Override
    public final ix l() {
        return ix.l(this.a.consumeDisplayCutout());
    }
}
