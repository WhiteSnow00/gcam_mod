import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dzv implements oen
{
    final /* synthetic */ jdb a;
    final /* synthetic */ dxx b;
    final /* synthetic */ long c;
    final /* synthetic */ jcw d;
    final /* synthetic */ dzw e;
    
    public dzv(final dzw e, final jdb a, final dxx b, final long c, final jcw d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final Throwable t) {
        this.a.close();
        this.e.f(this.c, nii.a);
    }
}
