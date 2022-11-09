import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$OnScaleGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jaz implements ScaleGestureDetector$OnScaleGestureListener
{
    final /* synthetic */ jjb a;
    
    public jaz(final jjb a) {
        this.a = a;
    }
    
    public final boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        this.a.k(scaleGestureDetector.getScaleFactor());
        return true;
    }
    
    public final boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        this.a.l();
        return true;
    }
    
    public final void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getScaleFactor();
        final jjq jjq = (jjq)this.a;
        jjq.z.n();
        if (!jjq.l) {
            jjq.z.w();
        }
        jjq.z.z(4, jjq.O, (float)jjq.g.aQ());
    }
}
