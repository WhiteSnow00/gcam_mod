import com.google.googlex.gcam.InterleavedImageU16;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtt implements dvy
{
    final /* synthetic */ ofn a;
    final /* synthetic */ dtv b;
    
    public dtt(final dtv b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final InterleavedImageU16 interleavedImageU16) {
        this.b.k.f("MergedPdCallback");
        this.a.o(interleavedImageU16);
        this.b.k.g();
    }
    
    @Override
    public final void b(final dvv dvv) {
        this.a.a(new kuw("Error merging PD data", dvv));
    }
}
