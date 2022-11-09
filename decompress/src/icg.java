import java.util.concurrent.Executor;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class icg
{
    public static final nsd a;
    public final BroadcastReceiver b;
    public final bqm c;
    public final Executor d;
    public final kjk e;
    public final kjm f;
    public final iru g;
    public final hyi h;
    public final hzg i;
    public final icy j;
    public kc k;
    public final hxd l;
    public ibr m;
    public final hyl n;
    
    static {
        a = nsd.g("com/google/android/apps/camera/timelapse/TimelapseStateMonitor");
    }
    
    public icg(final bqm c, final Executor d, final kjk e, final kjm f, final iru g, final hyi h, final hxd l, final hyl n, final hzg i, final icy j) {
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.l = l;
        this.n = n;
        this.i = i;
        this.e = e;
        this.j = j;
        this.b = new icf(this);
    }
    
    final void a(final hyj hyj, final boolean b) {
        if (hyj.c()) {
            return;
        }
        this.f.b(new ice(this, b));
        this.m.a.c();
    }
}
