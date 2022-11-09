import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ekv implements ats
{
    final /* synthetic */ ekw a;
    
    public ekv(final ekw a) {
        this.a = a;
    }
    
    private final void d() {
        final ekw a = this.a;
        if (a.w) {
            return;
        }
        a.w = true;
        if (a.z) {
            a.v("CameraActivityController: Fatal error during onPause!");
            return;
        }
        a.d.e();
    }
    
    @Override
    public final void a(final int n) {
        ekw.a.b().E(1266).p("Camera error callback. error=%d", n);
    }
    
    @Override
    public final void b(final RuntimeException ex, final String s, final int n, final int n2) {
        a.m(ekw.a.b(), "Camera Exception", '\u04f3', ex);
        this.a.s.O(5, s, ex, n, n2, 0, nns.l(), nns.l(), kst.m, false);
        this.d();
    }
    
    @Override
    public final void c(final RuntimeException ex) {
        a.m(ekw.a.b(), "DispatchThread Exception", '\u04f4', ex);
        this.a.s.O(6, null, ex, -1, -1, 0, nns.l(), nns.l(), kst.m, false);
        this.d();
    }
}
