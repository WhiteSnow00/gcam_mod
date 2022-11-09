import android.app.PendingIntent;
import android.app.AlarmManager;
import androidx.work.impl.WorkDatabase;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class akp
{
    static {
        aiy.b("Alarms");
    }
    
    public static void a(final Context context, final akh akh, final String s) {
        final amp w = akh.d.w();
        final amm a = w.a(s);
        if (a != null) {
            c(context, s, a.b);
            final aiy a2 = aiy.a();
            String.format("Removing SystemIdInfo for workSpecId (%s)", s);
            a2.d(new Throwable[0]);
            w.c(s);
        }
    }
    
    public static void b(final Context context, final akh akh, final String s, final long n) {
        final WorkDatabase d = akh.d;
        final amp w = d.w();
        final amm a = w.a(s);
        if (a != null) {
            c(context, s, a.b);
            d(context, s, a.b, n);
            return;
        }
        final anu anu = new anu(d);
        synchronized (anu.class) {
            final int a2 = anu.a("next_alarm_manager_id");
            monitorexit(anu.class);
            w.b(new amm(s, a2));
            d(context, s, a2, n);
        }
    }
    
    private static void c(final Context context, final String s, final int n) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final PendingIntent service = PendingIntent.getService(context, n, akq.c(context, s), 536870912);
        if (service != null && alarmManager != null) {
            final aiy a = aiy.a();
            String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", s, n);
            a.d(new Throwable[0]);
            alarmManager.cancel(service);
        }
    }
    
    private static void d(final Context context, final String s, final int n, final long n2) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final PendingIntent service = PendingIntent.getService(context, n, akq.c(context, s), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, n2, service);
        }
    }
}
