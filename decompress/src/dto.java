import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

// 
// Decompiled by Procyon v0.6.0
// 

final class dto implements dwd
{
    final /* synthetic */ dwt a;
    final /* synthetic */ dtv b;
    final /* synthetic */ dtx c;
    
    public dto(final dtv b, final dwt a, final dtx c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a(final YuvImage yuvImage, final ShotMetadata d) {
        this.b.k.f("YuvCallback");
        final Long e = this.a.e;
        if (e != null) {
            final dxs b = new dxs(yuvImage, e);
            final dwt a = this.a;
            a.b = b;
            a.d = d;
            dtv.c(this.b, this.c, a.a());
            this.b.k.g();
            return;
        }
        throw new IllegalStateException("Property \"timestampNs\" has not been set");
    }
}
