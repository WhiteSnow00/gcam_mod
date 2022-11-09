import android.content.Context;
import android.opengl.GLSurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebc extends GLSurfaceView
{
    public ebb a;
    
    public ebc(final Context context) {
        super(context);
        this.a = null;
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.surfaceChanged(this.getHolder(), 3, this.getWidth(), this.getHeight());
        final ebb a = this.a;
        if (a != null) {
            a.a();
        }
    }
}
