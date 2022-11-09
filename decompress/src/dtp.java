import java.util.List;
import com.google.googlex.gcam.ShotMetadata;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtp implements dwa
{
    final /* synthetic */ gen a;
    final /* synthetic */ dtv b;
    
    public dtp(final dtv b, final gen a) {
        this.b = b;
        this.a = a;
    }
    
    private final void c(final ogm ogm, final ShotMetadata shotMetadata, final List list) {
        final dws c = ((dwq)this.b.e.b()).c(this.a);
        c.b(ogm, shotMetadata, list);
        c.close();
    }
    
    @Override
    public final void a(final dxh dxh, final ogm ogm, final ShotMetadata shotMetadata) {
        this.b.l.b("Got RAW image from primary shot.");
        this.c(ogm, shotMetadata, dxh.e);
    }
    
    @Override
    public final void b(final dvv dvv) {
        this.b.l.e("Error getting RAW image from primary shot.", dvv);
        this.c(null, null, nns.l());
    }
}
