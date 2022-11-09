import android.hardware.camera2.CameraCharacteristics;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlw implements dkx
{
    public Rect a;
    public boa b;
    public final dmm c;
    
    public dlw(final dmm c) {
        this.c = c;
    }
    
    public final void a(final lfg lfg, final boa b) {
        synchronized (this) {
            final Rect a = (Rect)lfg.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            a.getClass();
            this.a = a;
            this.b = b;
        }
    }
    
    @Override
    public final void b(kvs a, final kwz kwz) {
        a = a.a();
        if (a != null) {
            a.j(new dlv(this, a, kwz));
        }
    }
}
