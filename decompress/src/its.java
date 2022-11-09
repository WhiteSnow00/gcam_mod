import android.os.PowerManager$WakeLock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import android.os.PowerManager;
import android.content.Intent;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class its implements itn, exn, exb, exl, exh, exj, krc, ewb, ewg
{
    private static final nsd b;
    public int a;
    private final Window c;
    private final kkd d;
    private final Runnable e;
    private final Intent f;
    private final PowerManager g;
    private final eiq h;
    private final itm i;
    private final krc j;
    private boolean k;
    private boolean l;
    private int m;
    
    static {
        b = nsd.g("com/google/android/apps/camera/ui/screenon/ScreenOnControllerImpl");
    }
    
    public its(final kjm kjm, final Window c, final eiq h, final itm i, final ScheduledExecutorService scheduledExecutorService, final brk brk, final Intent f, final PowerManager g) {
        this.k = false;
        this.l = true;
        this.m = 1;
        this.a = 1;
        this.c = c;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.d = new kkd(scheduledExecutorService, 120000L, TimeUnit.MILLISECONDS);
        this.j = brk.a(new ito(this, kjm));
        this.e = new itr(kjm, new itq(this));
    }
    
    private final void j(final Intent intent) {
        if (intent != null && intent.getBooleanExtra("extra_turn_screen_on", false)) {
            final PowerManager$WakeLock wakeLock = this.g.newWakeLock(268435466, "camera_screen_on");
            wakeLock.acquire();
            wakeLock.release();
        }
    }
    
    private final void k() {
        if (!this.l) {
            this.i();
        }
    }
    
    @Override
    public final void F() {
        this.h();
        this.j(this.f);
        final eiq h = this.h;
        final itp itp = new itp(this);
        synchronized (h.e) {
            h.c.add(itp);
        }
    }
    
    @Override
    public final void a() {
        if (this.m != 3) {
            this.h();
        }
    }
    
    @Override
    public final void bi() {
        this.l = true;
        this.a = 1;
        this.f();
        this.i();
        this.i.b();
    }
    
    @Override
    public final void bj() {
        this.l = false;
        this.i();
        this.i.c();
    }
    
    @Override
    public final void bk() {
        this.h();
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.k = true;
            this.j.close();
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            if (this.k) {
                a.l(its.b.c(), "session closed. will NOT mute ringtone.", '\u0b7d');
                return;
            }
            this.i.a();
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            if (this.k) {
                a.l(its.b.c(), "session closed. will NOT restore ringtone.", '\u0b7e');
                return;
            }
            this.i.d();
        }
    }
    
    @Override
    public final void g() {
        this.a = 3;
        this.k();
    }
    
    @Override
    public final void h() {
        this.a = 2;
        this.k();
    }
    
    public final void i() {
        kjm.a();
        if (this.a == 1 && this.m != 1) {
            this.c.clearFlags(128);
        }
        if (this.a != 1 && this.m == 1) {
            this.c.addFlags(128);
        }
        this.d.b();
        if (this.a == 2) {
            this.d.execute(this.e);
        }
        this.m = this.a;
    }
    
    @Override
    public final void z(final Intent intent) {
        this.j(intent);
    }
}
