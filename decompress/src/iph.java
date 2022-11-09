import java.util.concurrent.Callable;
import com.google.android.apps.camera.ui.mars.MarsSwitch;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iph implements exn, exj
{
    public static final nsd a;
    public final Context b;
    public final kjm c;
    public final Executor d;
    public final hkd e;
    public final ioy f;
    public final cxl g;
    public boolean h;
    public MarsSwitch i;
    public jci j;
    public isg k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/mars/MarsSwitchController");
    }
    
    public iph(final Context b, final hkd e, final ioy f, final kjm c, final Executor d, final cxl g) {
        this.h = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static oey a(final Executor executor, final Context context) {
        return ofi.q(new mqy(context, 1), executor);
    }
    
    public final void b() {
        final MarsSwitch i = this.i;
        if (i != null) {
            i.a.b();
        }
        final jci j = this.j;
        if (j != null) {
            j.c();
        }
    }
    
    @Override
    public final void bj() {
        ofi.w(a(this.d, this.b), new ipf(this), this.d);
    }
    
    public final void d() {
        final jci j = this.j;
        if (j != null) {
            j.d();
        }
    }
    
    public final void e() {
        final kjm c = this.c;
        c.getClass();
        c.b(new ipd(this));
    }
    
    public final void f(final boolean h) {
        final isg k = this.k;
        if (k != null) {
            hip hip;
            if (h) {
                hip = hip.b;
            }
            else {
                hip = hip.a;
            }
            k.e(hip);
            return;
        }
        this.h = h;
    }
}
