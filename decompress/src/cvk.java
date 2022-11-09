import java.util.concurrent.Executor;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvk implements liq, hpc, hox
{
    public static final long a;
    public final niz b;
    public final cwm c;
    public final cvn d;
    public final gkw e;
    public niz f;
    public niz g;
    public boolean h;
    public boolean i;
    public boolean j;
    public niz k;
    public long l;
    private final ScheduledExecutorService m;
    private final klv n;
    private niz o;
    
    static {
        final double n = (double)TimeUnit.SECONDS.toMillis(1L);
        Double.isNaN(n);
        a = (long)(n / 30.0);
    }
    
    public cvk(final niz b, final cvn d, final gkw e, final klv n, final ScheduledExecutorService m, final eyt eyt) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = nii.a;
        this.o = nii.a;
        this.m = m;
        this.b = b;
        this.d = d;
        this.n = n;
        this.e = e;
        this.c = new cwo(3, eyt);
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void aY(final kra kra) {
        this.m.execute(new cvj(this, 1));
    }
    
    @Override
    public final void b(final hph hph) {
    }
    
    public final void c() {
        synchronized (this) {
            this.i = false;
            this.j = false;
            if (this.h) {
                final cud cud = (cud)((njd)this.f).a;
                if (cud.d.g()) {
                    final CameraCoachHudView cameraCoachHudView = (CameraCoachHudView)cud.d.c();
                    if (cameraCoachHudView.b.g()) {
                        cameraCoachHudView.post((Runnable)new cue(cameraCoachHudView, 4));
                    }
                }
                ((efm)((njd)this.g).a).l(efo.e);
                this.h = false;
            }
        }
    }
    
    @Override
    public final void d() {
        if (this.h) {
            if (this.j) {
                this.c.c(nze.c);
                return;
            }
            this.c.c(nze.b);
        }
    }
    
    final void e() {
        synchronized (this) {
            njo.o(true);
            if (this.o.g()) {
                ((kjk)this.o.c()).close();
            }
            final kjk kjk = new kjk();
            final cud cud = (cud)((njd)this.f).a;
            kjk.c(cud.e(new cvj(this, 2), this.m));
            kjk.c(this.n.a(new cvi(this), this.m));
            this.e.g(this);
            kjk.c(new cvh(this));
            this.c.a();
            this.o = niz.i(kjk);
            this.d.b();
        }
    }
    
    public final void f() {
        synchronized (this) {
            this.c();
            if (this.o.g()) {
                ((kjk)this.o.c()).close();
                this.o = nii.a;
            }
            this.c.b();
            this.d.b();
        }
    }
    
    @Override
    public final void t() {
        this.m.execute(new cvj(this));
    }
    
    @Override
    public final void u() {
        this.m.execute(new cvj(this, 3));
    }
}
