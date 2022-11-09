import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import android.app.NotificationManager$Policy;
import android.app.NotificationManager;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itk implements itm
{
    private static final nsd a;
    private final ScheduledExecutorService b;
    private final NotificationManager c;
    private final Object d;
    private boolean e;
    private NotificationManager$Policy f;
    private NotificationManager$Policy g;
    private ScheduledFuture h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/screenon/DnDRingtoneController");
    }
    
    public itk(final ScheduledExecutorService b, final NotificationManager c) {
        this.d = new Object();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        synchronized (this.d) {
            if (!this.e) {
                if (this.c.getCurrentInterruptionFilter() == 1) {
                    try {
                        this.f = this.c.getNotificationPolicy();
                        this.c.setNotificationPolicy(new NotificationManager$Policy(192, 0, 0, 0));
                        this.g = this.c.getNotificationPolicy();
                        this.c.setInterruptionFilter(2);
                        this.h = this.b.schedule(iey.e, 100L, TimeUnit.MILLISECONDS);
                        this.e = true;
                    }
                    catch (final SecurityException ex) {
                        itk.a.b().h(ex).E(2935).o("Error");
                    }
                }
                else {
                    this.e = false;
                }
            }
        }
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d() {
        synchronized (this.d) {
            final ScheduledFuture h = this.h;
            Label_0077: {
                if (h != null) {
                    try {
                        h.get(100L, TimeUnit.MILLISECONDS);
                        break Label_0077;
                    }
                    catch (final TimeoutException h) {}
                    catch (final ExecutionException h) {}
                    catch (final InterruptedException ex) {}
                    itk.a.b().h((Throwable)h).E(2939).o("Error");
                }
            }
            if (this.e) {
                final NotificationManager$Policy notificationPolicy = this.c.getNotificationPolicy();
                final NotificationManager$Policy g = this.g;
                g.getClass();
                if (notificationPolicy.equals((Object)g)) {
                    if (this.c.getCurrentInterruptionFilter() == 2) {
                        try {
                            this.c.setInterruptionFilter(1);
                            final NotificationManager c = this.c;
                            final NotificationManager$Policy f = this.f;
                            f.getClass();
                            c.setNotificationPolicy(f);
                            this.e = false;
                        }
                        catch (final SecurityException ex2) {
                            itk.a.b().h(ex2).E(2937).o("Error");
                        }
                    }
                }
            }
        }
    }
}
