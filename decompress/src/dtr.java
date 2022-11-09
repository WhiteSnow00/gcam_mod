import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtr implements dvu
{
    final /* synthetic */ dwt a;
    final /* synthetic */ dtv b;
    final /* synthetic */ dtx c;
    
    public dtr(final dtv b, final dwt a, final dtx c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a(final HardwareBuffer c, final ShotMetadata d) {
        this.b.k.f("RgbHardwareCallback");
        final dwt a = this.a;
        a.c = c;
        a.d = d;
        dtv.c(this.b, this.c, a.a());
        this.b.k.g();
    }
}
