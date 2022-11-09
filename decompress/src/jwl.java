import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Intent;
import java.util.NoSuchElementException;
import android.content.ServiceConnection;
import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwl
{
    private static final Object b;
    private static volatile jwl c;
    public final ConcurrentHashMap a;
    
    static {
        b = new Object();
    }
    
    private jwl() {
        this.a = new ConcurrentHashMap();
    }
    
    public static jwl a() {
        if (jwl.c == null) {
            synchronized (jwl.b) {
                if (jwl.c == null) {
                    jwl.c = new jwl();
                }
            }
        }
        final jwl c = jwl.c;
        jvu.a(c);
        return c;
    }
    
    private static void d(final Context context, final ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        }
        catch (final NoSuchElementException ex) {}
        catch (final IllegalStateException ex2) {}
        catch (final IllegalArgumentException ex3) {}
    }
    
    private static boolean e(final ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof jvf);
    }
    
    public final void b(final Context context, final ServiceConnection serviceConnection) {
        if (e(serviceConnection) && this.a.containsKey((Object)serviceConnection)) {
            try {
                d(context, (ServiceConnection)this.a.get((Object)serviceConnection));
                return;
            }
            finally {
                this.a.remove((Object)serviceConnection);
            }
        }
        d(context, serviceConnection);
    }
    
    public final boolean c(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n) {
        final ComponentName component = intent.getComponent();
        final boolean b = false;
        if (component != null) {
            final String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((jwu.b(context).b(packageName, 0).flags & 0x200000) != 0x0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return b;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {}
        }
        if (e(serviceConnection)) {
            final ServiceConnection serviceConnection2 = (ServiceConnection)this.a.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, s, intent.getAction()));
            }
            try {
                boolean b2 = context.bindService(intent, serviceConnection, n);
                if (!b2) {
                    this.a.remove((Object)serviceConnection, (Object)serviceConnection);
                    b2 = b;
                    return b2;
                }
                return b2;
            }
            finally {
                this.a.remove((Object)serviceConnection, (Object)serviceConnection);
            }
        }
        return context.bindService(intent, serviceConnection, n);
    }
}
