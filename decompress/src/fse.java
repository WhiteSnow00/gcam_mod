import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class fse implements dvu
{
    final /* synthetic */ fvd a;
    final /* synthetic */ long b;
    final /* synthetic */ ljm c;
    final /* synthetic */ lgb d;
    final /* synthetic */ fus e;
    final /* synthetic */ fsh f;
    
    public fse(final fsh f, final fvd a, final long b, final ljm c, final lgb d, final fus e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        final lju b = this.f.d.b(new fsi(this.a.a, this.b, ofi.n(this.c), this.a.b), hardwareBuffer, shotMetadata);
        this.d.l();
        this.e.c(b);
    }
}
