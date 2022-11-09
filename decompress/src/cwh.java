import java.util.concurrent.Executor;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwh implements liq, hpc, hox
{
    public final niz a;
    public final gkw b;
    public final cwk c;
    public final cwm d;
    public niz e;
    public niz f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final ScheduledExecutorService j;
    private final klv k;
    private niz l;
    
    public cwh(final niz a, final cwk c, final gkw b, final klv k, final ScheduledExecutorService j, final eyt eyt) {
        this.e = nii.a;
        this.f = nii.a;
        this.l = nii.a;
        this.g = false;
        this.h = false;
        this.i = false;
        this.a = a;
        this.j = j;
        this.b = b;
        this.c = c;
        this.k = k;
        this.d = new cwo(4, eyt);
    }
    
    public static final boolean g(final float n, final float n2) {
        return Math.toDegrees(Math.abs(n)) < 0.5 && Math.toDegrees(Math.abs(n2)) < 0.5;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void aY(final kra kra) {
        this.j.execute(new cwg(this, 1));
    }
    
    @Override
    public final void b(final hph hph) {
    }
    
    public final void c() {
        if (this.g) {
            final cud cud = (cud)this.f.c();
            if (cud.d.g()) {
                final CameraCoachHudView cameraCoachHudView = (CameraCoachHudView)cud.d.c();
                if (cameraCoachHudView.c.g()) {
                    cameraCoachHudView.post((Runnable)new cue(cameraCoachHudView, 5));
                }
            }
            ((efm)this.e.c()).l(efo.e);
            this.g = false;
            this.h = false;
            this.i = false;
            this.d.g();
        }
    }
    
    @Override
    public final void d() {
        if (this.g) {
            if (this.h) {
                this.d.c(nze.c);
                return;
            }
            this.d.c(nze.b);
        }
    }
    
    public final void e() {
        synchronized (this) {
            if (this.l.g()) {
                ((kjk)this.l.c()).close();
            }
            final kjk kjk = new kjk();
            if (this.f.g()) {
                final cud cud = (cud)this.f.c();
                kjk.c(cud.e(new cwg(this), this.j));
            }
            kjk.c(this.k.a(new cwf(this), this.j));
            this.b.g(this);
            kjk.c(new cwd(this));
            this.d.a();
            kjk.c(new cwe(this.d));
            this.l = niz.i(kjk);
            this.c.b();
        }
    }
    
    public final void f() {
        synchronized (this) {
            this.c();
            if (this.l.g()) {
                ((kjk)this.l.c()).close();
                this.l = nii.a;
            }
            this.c.b();
        }
    }
    
    @Override
    public final void t() {
        this.j.execute(new cwg(this, 2));
    }
    
    @Override
    public final void u() {
        this.j.execute(new cwg(this, 3));
    }
}
