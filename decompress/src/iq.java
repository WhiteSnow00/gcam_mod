import android.view.WindowInsets;
import android.view.WindowInsets$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iq
{
    public final WindowInsets$Builder a;
    
    public iq() {
    }
    
    public iq(final ix ix) {
        this();
        final WindowInsets n = ix.n();
        WindowInsets$Builder a;
        if (n != null) {
            a = new WindowInsets$Builder(n);
        }
        else {
            a = new WindowInsets$Builder();
        }
        this.a = a;
    }
    
    public iq(final byte[] array) {
        new ix((ix)null);
        this();
        this.a = new WindowInsets$Builder();
    }
}
