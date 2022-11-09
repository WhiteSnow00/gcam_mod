import android.os.SystemClock;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnm extends jgp
{
    final /* synthetic */ oey a;
    
    public hnm(final oey a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final PointF pointF) {
        final hnr hnr = (hnr)knf.d(this.a);
        if (hnr == null) {
            return false;
        }
        kjm.a();
        final float[] array = { pointF.x, pointF.y };
        hnr.k.mapPoints(array);
        hnr.h(new hnk(array));
        hnr.t = Math.max(hnr.t, SystemClock.elapsedRealtime() + 1000L);
        return false;
    }
}
