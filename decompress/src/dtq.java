import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.InterleavedImageU8;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtq implements dwb
{
    final /* synthetic */ dwt a;
    final /* synthetic */ dtv b;
    final /* synthetic */ dtx c;
    
    public dtq(final dtv b, final dwt a, final dtx c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a(final InterleavedImageU8 a, final ShotMetadata d) {
        this.b.k.f("RgbCallback");
        final dwt a2 = this.a;
        a2.a = a;
        a2.d = d;
        dtv.c(this.b, this.c, a2.a());
        this.b.k.g();
    }
}
