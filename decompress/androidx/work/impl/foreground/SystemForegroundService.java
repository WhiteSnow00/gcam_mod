// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.foreground;

import java.util.UUID;
import android.text.TextUtils;
import android.content.Intent;
import android.app.Notification;
import android.os.Looper;
import android.os.Handler;
import android.app.NotificationManager;

public class SystemForegroundService extends n implements amb
{
    amc a;
    public NotificationManager b;
    private Handler c;
    private boolean d;
    
    static {
        aiy.b("SystemFgService");
    }
    
    private final void e() {
        this.c = new Handler(Looper.getMainLooper());
        this.b = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        final amc a = new amc(this.getApplicationContext());
        this.a = a;
        if (a.i != null) {
            aiy.a();
            aiy.e(amc.a, "A callback already exists.", new Throwable[0]);
            return;
        }
        a.i = this;
    }
    
    @Override
    public final void a(final int n) {
        this.c.post((Runnable)new amf(this, n));
    }
    
    @Override
    public final void b(final int n, final Notification notification) {
        this.c.post((Runnable)new ame(this, n, notification));
    }
    
    @Override
    public final void c(final int n, final int n2, final Notification notification) {
        this.c.post((Runnable)new amd(this, n, notification, n2));
    }
    
    @Override
    public final void d() {
        this.d = true;
        aiy.a().d(new Throwable[0]);
        this.stopForeground(true);
        this.stopSelf();
    }
    
    @Override
    public final void onCreate() {
        super.onCreate();
        this.e();
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.a.h();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.d) {
            aiy.a();
            aiy.f(new Throwable[0]);
            this.a.h();
            this.e();
            this.d = false;
        }
        if (intent != null) {
            final amc a = this.a;
            final String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                aiy.a();
                String.format("Started foreground service %s", intent);
                aiy.f(new Throwable[0]);
                a.j.a(new ama(a, a.b.d, intent.getStringExtra("KEY_WORKSPEC_ID")));
            }
            else if (!"ACTION_NOTIFY".equals(action)) {
                if ("ACTION_CANCEL_WORK".equals(action)) {
                    aiy.a();
                    String.format("Stopping foreground work for %s", intent);
                    aiy.f(new Throwable[0]);
                    final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra != null && !TextUtils.isEmpty((CharSequence)stringExtra)) {
                        final akh b = a.b;
                        b.j.a(new anp(b, UUID.fromString(stringExtra)));
                        return 3;
                    }
                    return 3;
                }
                else {
                    if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                        return 3;
                    }
                    aiy.a();
                    aiy.f(new Throwable[0]);
                    final amb i = a.i;
                    if (i != null) {
                        i.d();
                        return 3;
                    }
                    return 3;
                }
            }
            a.g(intent);
        }
        return 3;
    }
}
