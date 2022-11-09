import android.graphics.Matrix;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class def extends View
{
    public final ksl d;
    
    public def(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new ksl();
    }
    
    protected final Matrix c() {
        return this.d.a();
    }
    
    protected final boolean d() {
        return this.d.b != null;
    }
    
    public final void layout(final int n, final int n2, final int n3, final int n4) {
        super.layout(n, n2, n3, n4);
        this.d.b(n, n2, n3, n4, kra.e(iwu.a(this.getContext())));
    }
}
