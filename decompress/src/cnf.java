import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

final class cnf
{
    private final BottomBarController a;
    private final ivj b;
    private final jjb c;
    private final gjj d;
    private final dgn e;
    
    public cnf(final BottomBarController a, final ivj b, final jjb c, final gjj d, final dgn e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        this.a.resumeRecording();
        this.b.w();
    }
    
    public final void b() {
        this.d.j();
        final jjq jjq = (jjq)this.c;
        jjq.C.setSoundEffectsEnabled(false);
        jjq.B.setSoundEffectsEnabled(false);
        this.e.e();
    }
    
    public final void c() {
        this.a.pauseRecording();
        this.b.s();
    }
    
    public final void d() {
        this.d.i();
        final jjq jjq = (jjq)this.c;
        jjq.C.setSoundEffectsEnabled(true);
        jjq.B.setSoundEffectsEnabled(true);
        this.e.h();
    }
}
