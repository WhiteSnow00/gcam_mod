import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class fqt implements fuj
{
    final /* synthetic */ lgb a;
    final /* synthetic */ fvd b;
    final /* synthetic */ long c;
    final /* synthetic */ ljm d;
    final /* synthetic */ lju e;
    final /* synthetic */ lju f;
    final /* synthetic */ fus g;
    final /* synthetic */ krr h;
    final /* synthetic */ fqu i;
    
    public fqt(final fqu i, final lgb a, final fvd b, final long c, final ljm d, final lju e, final lju f, final fus g, final krr h) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private final lju e(final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        return this.i.a.b(new fsi(this.b.a, this.c, ofi.n(this.d), this.b.b), hardwareBuffer, shotMetadata);
    }
    
    @Override
    public final void a(final RuntimeException ex) {
        this.a.l();
        this.f.close();
        this.h.e("Couldn't retrieve Rgb result from FastMomentsHdr", ex);
        this.g.b(ex);
    }
    
    @Override
    public final void b(final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        this.a.l();
        final lju e = this.e(hardwareBuffer, shotMetadata);
        this.f.close();
        this.g.c(e);
    }
    
    @Override
    public final void c(final YuvImage yuvImage, final ShotMetadata shotMetadata) {
        this.a.l();
        final lju a = this.i.a.a(new fsi(this.b.a, this.c, ofi.n(this.d), this.b.b), yuvImage, this.e, shotMetadata);
        this.f.close();
        this.g.c(a);
    }
    
    @Override
    public final void d(final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        this.a.l();
        final lju e = this.e(hardwareBuffer, shotMetadata);
        this.f.close();
        this.g.c(e);
    }
}
