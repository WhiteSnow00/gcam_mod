import java.util.List;
import com.google.googlex.gcam.ShotMetadata;

// 
// Decompiled by Procyon v0.6.0
// 

final class gtw implements dwa
{
    final /* synthetic */ gen a;
    final /* synthetic */ gty b;
    
    public gtw(final gty b, final gen a) {
        this.b = b;
        this.a = a;
    }
    
    private final void c(final ogm ogm, final ShotMetadata shotMetadata, final List list) {
        final dws c = ((dwq)this.b.b.c()).c(this.a);
        c.d(ogm, shotMetadata, list);
        c.close();
    }
    
    @Override
    public final void a(final dxh dxh, final ogm ogm, final ShotMetadata shotMetadata) {
        dxh.a();
        this.c(ogm, shotMetadata, dxh.e);
    }
    
    @Override
    public final void b(final dvv dvv) {
        a.k(gty.a.c(), "Error getting RAW image from secondary shot: %s", dvv.getMessage(), '\u0825');
        this.c(null, null, nns.l());
    }
}
