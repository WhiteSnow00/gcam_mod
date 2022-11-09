import android.app.KeyguardManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import android.app.NotificationManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egl implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public egl(final pii a) {
        this.a = a;
    }
    
    public egl(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static NotificationManager a(final egi egi) {
        final NotificationManager notificationManager = (NotificationManager)egi.a(egi.i);
        pqf.k(notificationManager);
        return notificationManager;
    }
    
    public static egl b(final pii pii) {
        return new egl(pii, 13);
    }
    
    public static egl c(final pii pii) {
        return new egl(pii, 14);
    }
    
    public static egl d(final pii pii) {
        return new egl(pii, 15);
    }
    
    public static egl e(final pii pii) {
        return new egl(pii, 16);
    }
    
    public static egl f(final pii pii) {
        return new egl(pii, 18);
    }
}
