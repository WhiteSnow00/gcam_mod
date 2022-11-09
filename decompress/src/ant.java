import androidx.work.impl.WorkDatabase;
import java.util.Map;
import android.content.BroadcastReceiver$PendingResult;
import java.util.List;
import java.util.Iterator;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteAccessPermException;
import android.app.ApplicationExitInfo;
import android.app.ActivityManager;
import java.io.File;
import java.util.HashMap;
import android.text.TextUtils;
import android.content.ComponentName;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import android.content.Intent;
import android.app.PendingIntent;
import android.app.AlarmManager;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ant implements Runnable
{
    private static final String a;
    private static final long b;
    private final Context c;
    private final akh d;
    private int e;
    
    static {
        a = aiy.b("ForceStopRunnable");
        b = TimeUnit.DAYS.toMillis(3650L);
    }
    
    public ant(final Context context, final akh d) {
        this.c = context.getApplicationContext();
        this.d = d;
        this.e = 0;
    }
    
    public static void a(final Context context) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n;
        if (!aah.b()) {
            n = 134217728;
        }
        else {
            n = 167772160;
        }
        final PendingIntent b = b(context, n);
        final long currentTimeMillis = System.currentTimeMillis();
        final long b2 = ant.b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis + b2, b);
        }
    }
    
    private static PendingIntent b(final Context context, final int n) {
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class)ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, n);
    }
    
    @Override
    public final void run() {
        final akh d = this.d;
        if (d.k == null) {
            synchronized (akh.a) {
                if (d.k == null) {
                    try {
                        d.k = (cxb)Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, akh.class).newInstance(d.b, d);
                    }
                    finally {
                        final Throwable t;
                        aiy.a().d(t);
                    }
                    if (d.k == null) {
                        if (!TextUtils.isEmpty((CharSequence)null)) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                }
            }
        }
        Object o = null;
        if (d.k != null) {
            aiy.a().d(new Throwable[0]);
            final boolean a = anx.a(this.c);
            o = aiy.a();
            String.format("Is default app process = %s", a);
            ((aiy)o).d(new Throwable[0]);
            if (!a) {
                return;
            }
        }
        while (true) {
            final Context c = this.c;
            if (akf.a(c).exists()) {
                aiy.a().d(new Throwable[0]);
                o = new HashMap<Object, File>();
                final File a2 = akf.a(c);
                final File file = new File(c.getNoBackupFilesDir(), "androidx.work.workdb");
                ((Map<File, File>)o).put(a2, file);
                final String[] b = akf.b;
                final int length = b.length;
                for (int i = 0; i < 3; ++i) {
                    final String s = b[i];
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a2.getPath());
                    sb.append(s);
                    final File file2 = new File(sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(file.getPath());
                    sb2.append(s);
                    ((Map<File, File>)o).put(file2, new File(sb2.toString()));
                }
                for (final File file3 : ((Map<File, File>)o).keySet()) {
                    final File file4 = ((Map<Object, File>)o).get(file3);
                    if (file3.exists() && file4 != null) {
                        if (file4.exists()) {
                            final String format = String.format("Over-writing contents of %s", file4);
                            aiy.a();
                            aiy.g(akf.a, format, new Throwable[0]);
                        }
                        if (file3.renameTo(file4)) {
                            String.format("Migrated %s to %s", file3, file4);
                        }
                        else {
                            String.format("Renaming %s to %s failed", file3, file4);
                        }
                        aiy.a().d(new Throwable[0]);
                    }
                }
            }
            aiy.a().d(new Throwable[0]);
            try {
                final boolean f = alb.f(this.c, this.d);
                o = this.d.d;
                final anb s2 = ((WorkDatabase)o).s();
                Object o2 = ((WorkDatabase)o).y();
                ((aq)o).h();
                try {
                    final List b2 = s2.b();
                    final boolean b3 = b2.isEmpty() ^ true;
                    if (b3) {
                        for (final ana ana : b2) {
                            s2.k(1, ana.a);
                            s2.j(ana.a, -1L);
                        }
                    }
                    ((amx)o2).a.g();
                    final afn e = ((amx)o2).c.e();
                    ((amx)o2).a.h();
                    try {
                        e.a();
                        ((amx)o2).a.j();
                        ((amx)o2).a.i();
                        ((amx)o2).c.f(e);
                        ((aq)o).j();
                        ((aq)o).i();
                        final boolean b4 = b3 || f;
                        o = this.d.g.a.v().a("reschedule_needed");
                        Label_1043: {
                            if (o != null && (long)o == 1L) {
                                aiy.a().d(new Throwable[0]);
                                this.d.f();
                                o2 = this.d.g;
                                o = new amj("reschedule_needed", 0L);
                                ((anw)o2).a.v().b((amj)o);
                            }
                            else {
                                Label_1026: {
                                    try {
                                        int n;
                                        if (!aah.b()) {
                                            n = 536870912;
                                        }
                                        else {
                                            n = 570425344;
                                        }
                                        o = b(this.c, n);
                                        if (o != null) {
                                            ((PendingIntent)o).cancel();
                                        }
                                        o = ((ActivityManager)this.c.getSystemService("activity")).getHistoricalProcessExitReasons((String)null, 0, 0);
                                        if (o != null && !((List)o).isEmpty()) {
                                            for (int j = 0; j < ((List)o).size(); ++j) {
                                                if (((ApplicationExitInfo)((List)o).get(j)).getReason() == 10) {
                                                    break Label_1026;
                                                }
                                            }
                                        }
                                        if (b4) {
                                            aiy.a().d(new Throwable[0]);
                                            o = this.d;
                                            ajr.b(((akh)o).c, ((akh)o).d, ((akh)o).e);
                                        }
                                        break Label_1043;
                                    }
                                    catch (final IllegalStateException o) {}
                                    catch (final SecurityException ex) {}
                                    aiy.a();
                                    aiy.g(ant.a, "Ignoring exception", (Throwable)o);
                                }
                                aiy.a().d(new Throwable[0]);
                                this.d.f();
                            }
                        }
                        o2 = this.d;
                        synchronized (akh.a) {
                            ((akh)o2).h = true;
                            final BroadcastReceiver$PendingResult k = ((akh)o2).i;
                            if (k != null) {
                                k.finish();
                                ((akh)o2).i = null;
                            }
                            return;
                        }
                    }
                    finally {
                        ((amx)o2).a.i();
                        ((amx)o2).c.f(e);
                    }
                }
                finally {
                    ((aq)o).i();
                }
            }
            catch (final SQLiteAccessPermException o) {}
            catch (final SQLiteConstraintException o) {}
            catch (final SQLiteTableLockedException o) {}
            catch (final SQLiteDatabaseLockedException o) {}
            catch (final SQLiteDatabaseCorruptException o) {}
            catch (final SQLiteCantOpenDatabaseException ex2) {}
            final int e2 = this.e + 1;
            this.e = e2;
            if (e2 >= 3) {
                break;
            }
            final aiy a3 = aiy.a();
            String.format("Retrying after %s", e2 * 300L);
            a3.d((Throwable)o);
            final long n2 = this.e;
            try {
                Thread.sleep(n2 * 300L);
            }
            catch (final InterruptedException o) {}
        }
        aiy.a();
        aiy.e(ant.a, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", (Throwable)o);
        throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", (Throwable)o);
    }
}
