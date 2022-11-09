import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

// 
// Decompiled by Procyon v0.6.0
// 

final class fsf implements dwd
{
    final /* synthetic */ fvd a;
    final /* synthetic */ long b;
    final /* synthetic */ ljm c;
    final /* synthetic */ lju d;
    final /* synthetic */ lgb e;
    final /* synthetic */ fus f;
    final /* synthetic */ fsh g;
    
    public fsf(final fsh g, final fvd a, final long b, final ljm c, final lju d, final lgb e, final fus f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void a(final YuvImage yuvImage, final ShotMetadata shotMetadata) {
        final lju a = this.g.d.a(new fsi(this.a.a, this.b, ofi.n(this.c), this.a.b), yuvImage, this.d, shotMetadata);
        this.e.l();
        this.f.c(a);
    }
}
