import com.google.android.apps.camera.coach.CameraCoachHudView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izl implements jap
{
    private final cub a;
    private final efm b;
    private final pii c;
    private final cxl d;
    
    public izl(final cub a, final efm b, final pii c, final cxl d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
        final CameraCoachHudView cameraCoachHudView = (CameraCoachHudView)((ixw)this.c.get()).c.c(2131427506);
        final cxl d = this.d;
        final cxo a = cww.a;
        d.e();
        final niz a2 = this.d.a(cww.a);
        if (a2.g()) {
            final int intValue = (int)a2.c();
            if (cameraCoachHudView.d.g()) {
                ((cuz)cameraCoachHudView.d.c()).m = (float)intValue;
            }
        }
        if (this.d.k(cww.o) && cameraCoachHudView.b.g()) {
            ((cvp)cameraCoachHudView.b.c()).m = true;
        }
        final cub a3 = this.a;
        final efm b = this.b;
        final cud f = a3.f;
        f.d = niz.i(cameraCoachHudView);
        final gkw a4 = f.a;
        final bmz e = f.e;
        a4.g(f);
        e.i().c(new cuc(f, a4));
        if (f.d.g()) {
            ((CameraCoachHudView)f.d.c()).a = (float)a4.c().e;
        }
        final cvk a5 = a3.a;
        final cud f2 = a3.f;
        a5.g = niz.i(b);
        a5.f = niz.i(f2);
        final cwh b2 = a3.b;
        final cud f3 = a3.f;
        b2.e = niz.i(b);
        b2.f = niz.i(f3);
        a3.c.h = niz.i(a3.d);
        final cuw e2 = a3.e;
        final cud f4 = a3.f;
        e2.m = niz.i(b);
        e2.n = niz.i(f4);
    }
}
