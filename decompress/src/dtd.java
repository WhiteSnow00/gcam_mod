import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtd
{
    public final eha a;
    public final boolean b;
    public final boolean c;
    
    public dtd(final eha a, final fxu fxu, final lfg lfg) {
        this.a = a;
        final lfu l = lfg.l();
        final lfu b = lfu.b;
        final boolean b2 = true;
        this.b = (l == b);
        final Integer n = (Integer)fxu.m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        this.c = (n != null && n.equals(1) && b2);
    }
    
    public final void a(final lgq lgq) {
        synchronized (this) {
            lgq.b(this.a.a() + 1L, Long.MAX_VALUE, new dtc(this));
        }
    }
}
