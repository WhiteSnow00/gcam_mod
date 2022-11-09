import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$OnScaleGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jgr implements ScaleGestureDetector$OnScaleGestureListener
{
    final /* synthetic */ ScaleGestureDetector$OnScaleGestureListener a;
    final /* synthetic */ jgn b;
    final /* synthetic */ jgu c;
    
    public jgr(final jgu c, final ScaleGestureDetector$OnScaleGestureListener a, final jgn b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        this.a.onScale(scaleGestureDetector);
        return true;
    }
    
    public final boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        this.c.k = true;
        this.a.onScaleBegin(scaleGestureDetector);
        this.b.g();
        return true;
    }
    
    public final void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        this.a.onScaleEnd(scaleGestureDetector);
    }
}
