import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;
import android.app.NotificationManager;
import java.lang.ref.WeakReference;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifj
{
    private static final Duration a;
    private static final nsd b;
    private final WeakReference c;
    private final NotificationManager d;
    private final bqm e;
    private final eyt f;
    private final AtomicBoolean g;
    private final efm h;
    
    static {
        a = Duration.ofSeconds(6L);
        b = nsd.g("com/google/android/apps/camera/toast/app/startup/DnDAccessToastController");
    }
    
    public ifj(final WeakReference c, final NotificationManager d, final bqm e, final eyt f, final efm h) {
        this.g = new AtomicBoolean();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
    }
    
    public final void a() {
        if (this.g.get()) {
            return;
        }
        final Activity activity = (Activity)this.c.get();
        if (activity == null) {
            a.l(ifj.b.c(), "Activity reference returns null, skipping", '\u0a9c');
            return;
        }
        final Resources resources = activity.getResources();
        final ViewGroup b = (ViewGroup)activity.findViewById(2131427411);
        if (!this.d.isNotificationPolicyAccessGranted() && this.g.compareAndSet(false, true)) {
            final efm h = this.h;
            final ieu ieu = new ieu();
            ieu.b = b;
            ieu.d = resources.getString(2131951920);
            ieu.e = resources.getString(2131952288);
            ieu.a = ifj.a;
            ieu.f = new ifi(this);
            ieu.l = 8;
            ieu.j = this.h;
            h.e(ieu.a());
            this.f.V(2);
        }
    }
    
    public final void b() {
        this.f.V(3);
        try {
            this.e.o(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        }
        catch (final ActivityNotFoundException ex) {
            a.m(ifj.b.b(), "Failed to launch notification policy access settings", '\u0a9e', (Throwable)ex);
        }
    }
}
