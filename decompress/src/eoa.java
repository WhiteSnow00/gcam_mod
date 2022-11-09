import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class eoa extends fvs
{
    final /* synthetic */ eok a;
    
    public eoa(final eok a) {
        this.a = a;
    }
    
    @Override
    public final void A() {
        this.a.F.b();
        this.a.v(false);
    }
    
    @Override
    public final void D(final float n) {
        if (n == 0.0f) {
            this.a.B(false);
            this.a.v.Q();
        }
        this.a.O.e(n);
        this.a.v.D((int)(100.0f * n));
        this.a.h.c();
        if (n == 1.0f) {
            this.a.E(false);
            this.a.v.m();
            final CountDownTimer m = this.a.M;
            if (m != null) {
                m.onFinish();
            }
        }
    }
    
    @Override
    public final void E(final float n, final int i) {
        if (n == 0.0f) {
            this.a.B(true);
            this.a.O.g();
        }
        final fme o = this.a.o;
        final int n2 = (int)(100.0f * n);
        final iys b = o.b;
        b.i = i;
        b.b(n2);
        if (n2 >= 100) {
            o.a.c = true;
        }
        else {
            o.a.c = false;
        }
        this.a.v.D(n2);
        this.a.h.c();
        if (n == 1.0f) {
            this.a.O.a();
            this.a.E(true);
        }
    }
    
    @Override
    public final void F(final float n, long n2) {
        final boolean n3 = this.a.z.n();
        if (n == 0.0f) {
            this.a.B(n3);
            if (n3) {
                final cud f = this.a.F;
                f.c = false;
                if (f.d.g()) {
                    final CameraCoachHudView cameraCoachHudView = (CameraCoachHudView)f.d.c();
                    if (cameraCoachHudView.b.g()) {
                        cameraCoachHudView.post((Runnable)new cue(cameraCoachHudView, 1));
                    }
                    if (cameraCoachHudView.c.g()) {
                        cameraCoachHudView.post((Runnable)new cue(cameraCoachHudView));
                    }
                    if (cameraCoachHudView.d.g()) {
                        cameraCoachHudView.post((Runnable)new cue(cameraCoachHudView, 2));
                    }
                }
                this.a.O.g();
                n2 += 500L;
                (this.a.M = new enz(this, n2, TimeUnit.SECONDS.toMillis(1L), n)).start();
            }
            else {
                this.a.v.Q();
                if (n == 0.0f) {
                    this.a.D.f(new eny(this));
                }
            }
        }
        if (!n3) {
            if (this.a.D.j()) {
                this.a.O.e(n);
            }
        }
        else {
            this.a.o.f((int)(n * 100.0f));
        }
        this.a.v.E((int)(100.0f * n), n2, n3);
        this.a.h.c();
        if (n == 1.0f) {
            this.a.E(n3);
            if (n3) {
                this.a.F.b();
                this.a.O.a();
            }
            else {
                this.a.P.a(n2);
                this.a.v.m();
                this.a.D.e();
            }
            final CountDownTimer m = this.a.M;
            if (m != null) {
                m.onFinish();
            }
        }
    }
}
