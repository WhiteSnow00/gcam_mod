import android.hardware.camera2.CameraCharacteristics;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwh
{
    public final boa a;
    public final Rect b;
    public final boolean c;
    
    public bwh(final lit lit, final lfg lfg) {
        final boolean c = lfg.l() == lfu.a;
        this.c = c;
        this.a = new boa(lit, lfg.f(), c);
        final Rect b = (Rect)lfg.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        nov.z(b);
        this.b = b;
    }
}
