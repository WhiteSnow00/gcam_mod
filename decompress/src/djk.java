import android.graphics.Matrix;
import android.util.AttributeSet;
import android.content.Context;
import android.view.SurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public class djk extends SurfaceView
{
    public final ksl b;
    
    public djk(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new ksl();
    }
    
    protected final Matrix c() {
        return this.b.a();
    }
    
    public final void layout(final int n, final int n2, final int n3, final int n4) {
        super.layout(n, n2, n3, n4);
        this.b.b(n, n2, n3, n4, kra.e(iwu.a(this.getContext())));
    }
}
