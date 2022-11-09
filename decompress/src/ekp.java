import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

// 
// Decompiled by Procyon v0.6.0
// 

final class ekp implements iuj
{
    final /* synthetic */ ekw a;
    
    public ekp(final ekw a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.f.j(hvu.o, CameraActivityTiming.a);
    }
    
    @Override
    public final void b() {
        final ekw a = this.a;
        final CameraActivityTiming f = a.f;
        if (f.l(hvu.o) && !f.l(hvu.p)) {
            f.j(hvu.p, CameraActivityTiming.a);
            f.g.a();
            f.g = ksh.b;
            a.R.o(buj.a);
        }
    }
}
