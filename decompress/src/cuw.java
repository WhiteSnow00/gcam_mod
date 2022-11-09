import java.util.concurrent.Executor;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cuw implements liq, hpc, hox
{
    public static final double a;
    private static final nsd u;
    private final cvb A;
    private niz B;
    private boolean C;
    public final niz b;
    public final gkw c;
    public final cux d;
    public final float[] e;
    public final jdl f;
    public final jdk g;
    public final float[] h;
    public final jdl i;
    public final jdk j;
    public final cwm k;
    public final AtomicBoolean l;
    public niz m;
    public niz n;
    public boolean o;
    public boolean p;
    public boolean q;
    public niz r;
    public niz s;
    public cuv t;
    private final ScheduledExecutorService v;
    private final klv w;
    private final boolean x;
    private final cvk y;
    private final cwh z;
    
    static {
        u = nsd.g("com/google/android/apps/camera/coach/CameraLockIndicator");
        a = Math.toRadians(5.0);
    }
    
    public cuw(final niz b, final cux d, final gkw c, final klv w, final ScheduledExecutorService v, final cxl cxl, final cvk y, final cvb a, final cwh z, final eyt eyt) {
        this.e = new float[16];
        this.f = new jdl();
        this.g = new jdk();
        this.h = new float[16];
        this.i = new jdl();
        this.j = new jdk();
        boolean x = false;
        this.l = new AtomicBoolean(false);
        this.m = nii.a;
        this.n = nii.a;
        this.B = nii.a;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = nii.a;
        this.s = nii.a;
        this.C = false;
        this.t = cuq.a;
        this.b = b;
        this.v = v;
        this.c = c;
        this.d = d;
        this.w = w;
        this.k = new cwo(6, eyt);
        if (cxl.k(cww.p) && cxl.k(cww.n)) {
            x = true;
        }
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public static boolean i(final float n, final float n2) {
        return Math.toDegrees(Math.abs(n)) < 0.5 && Math.toDegrees(Math.abs(n2)) < 0.5;
    }
    
    private final boolean k() {
        return this.x && (this.A.a().g() && ((cva)this.A.a().c()).b.l() == lfu.b);
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void aY(final kra kra) {
        this.v.execute(new cut(this, 1));
    }
    
    @Override
    public final void b(final hph hph) {
    }
    
    public final void c() {
        if (this.n.g() && this.m.g()) {
            if (this.o) {
                final cud cud = (cud)this.n.c();
                if (cud.d.g()) {
                    final CameraCoachHudView cameraCoachHudView = (CameraCoachHudView)cud.d.c();
                    if (cameraCoachHudView.d.g()) {
                        cameraCoachHudView.post((Runnable)new cue(cameraCoachHudView, 3));
                    }
                }
                ((efm)this.m.c()).l(efo.e);
                this.o = false;
                this.p = false;
                this.t = cuq.b;
                this.l.set(false);
                this.q = false;
                this.k.g();
            }
        }
    }
    
    @Override
    public final void d() {
        if (this.o) {
            if (this.p) {
                this.k.c(nze.c);
                return;
            }
            this.k.c(nze.b);
        }
    }
    
    public final void e() {
        if (this.k()) {
            if (this.k()) {
                this.y.u();
                this.z.u();
            }
            this.d.a = false;
            this.r = nii.a;
            this.c();
            this.C = false;
            this.t = cuq.c;
            this.l.set(false);
        }
    }
    
    public final void f(final cuv t) {
        if (this.k()) {
            if (this.k()) {
                this.y.t();
                this.z.t();
            }
            this.d.a = true;
            if (!this.s.g()) {
                a.l(cuw.u.c(), "No camera pose data available.", '\u025b');
                return;
            }
            if (!this.r.g()) {
                this.r = this.s;
            }
            this.C = true;
            this.t = t;
        }
    }
    
    public final void g() {
        synchronized (this) {
            if (this.B.g()) {
                ((kjk)this.B.c()).close();
            }
            final kjk kjk = new kjk();
            if (this.n.g()) {
                final cud cud = (cud)this.n.c();
                kjk.c(cud.e(new cuu(this), this.v));
            }
            kjk.c(this.w.a(new cus(this), this.v));
            this.c.g(this);
            kjk.c(new cur(this));
            this.k.a();
            kjk.c(new cwe(this.k, 1));
            this.B = niz.i(kjk);
            this.d.a();
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.c();
            if (this.B.g()) {
                ((kjk)this.B.c()).close();
                this.B = nii.a;
            }
            this.d.a();
        }
    }
    
    public final boolean j() {
        return this.l.get();
    }
    
    @Override
    public final void t() {
        if (!this.C) {
            this.v.execute(new cut(this, 2));
        }
    }
    
    @Override
    public final void u() {
        this.v.execute(new cut(this));
    }
}
