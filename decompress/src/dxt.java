import com.google.googlex.gcam.ShotMetadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxt implements gab
{
    final /* synthetic */ jcw a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ShotMetadata d;
    final /* synthetic */ int e;
    final /* synthetic */ hhy f;
    final /* synthetic */ dxy g;
    
    public dxt(final dxy g, final jcw a, final int b, final boolean c, final ShotMetadata d, final int e, final hhy f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final oey a() {
        final ofn f = ofn.f();
        final dxy g = this.g;
        g.e.execute(new dxw(g, this.a, f, this.b, this.c, this.d, this.e, this.f.m()));
        return f;
    }
    
    @Override
    public final oey b() {
        return ofi.m(new kuw("RGB image couldn't be encoded into jpeg."));
    }
}
