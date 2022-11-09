import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cud implements liq
{
    public final gkw a;
    public boolean b;
    public boolean c;
    public niz d;
    public final bmz e;
    
    public cud(final gkw a, final bmz e) {
        this.b = false;
        this.c = true;
        this.d = nii.a;
        this.e = e;
        this.a = a;
    }
    
    static final krc e(final Runnable runnable, final ScheduledExecutorService scheduledExecutorService) {
        return new cdu(scheduledExecutorService.scheduleAtFixedRate(runnable, 0L, 33L, TimeUnit.MILLISECONDS), 2);
    }
    
    @Override
    public final void aY(final kra kra) {
        if (this.d.g()) {
            ((CameraCoachHudView)this.d.c()).a = (float)kra.e;
        }
    }
    
    public final void b() {
        this.c = true;
    }
    
    public final void c(final boolean e) {
        if (this.d.g()) {
            ((CameraCoachHudView)this.d.c()).e = e;
        }
    }
    
    public final void d() {
        this.b = true;
    }
}
