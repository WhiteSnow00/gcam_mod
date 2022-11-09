import android.os.PowerManager$WakeLock;
import androidx.work.impl.WorkDatabase;
import android.os.Bundle;
import java.util.Iterator;
import android.content.Context;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

final class akv implements Runnable
{
    final /* synthetic */ akz a;
    
    public akv(final akz a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        Object o = this.a.g;
        monitorenter(o);
        try {
            final akz a = this.a;
            a.h = (Intent)a.g.get(0);
            monitorexit(o);
            o = this.a.h;
            if (o != null) {
                o = ((Intent)o).getAction();
                final int intExtra = this.a.h.getIntExtra("KEY_START_ID", 0);
                final aiy a2 = aiy.a();
                final Intent h = this.a.h;
                final Integer value = intExtra;
                String.format("Processing command %s, %s", h, value);
                a2.d(new Throwable[0]);
                Object o2 = aod.a(this.a.b, String.format("%s (%s)", o, value));
                try {
                    final aiy a3 = aiy.a();
                    String.format("Acquiring operation wake lock (%s) %s", o, o2);
                    a3.d(new Throwable[0]);
                    ((PowerManager$WakeLock)o2).acquire();
                    final akz a4 = this.a;
                    final akq f = a4.f;
                    final Intent h2 = a4.h;
                    final String action = h2.getAction();
                    Label_1648: {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
                            final aiy a5 = aiy.a();
                            String.format("Handling constraints changed %s", h2);
                            a5.d(new Throwable[0]);
                            final int a6 = akt.a;
                            final Context b = f.b;
                            final alf alf = new alf(b, a4.j, null);
                            final List c = a4.e.d.s().c();
                            akr.a(b, c);
                            alf.a(c);
                            final ArrayList list = new ArrayList(c.size());
                            final long currentTimeMillis = System.currentTimeMillis();
                            for (final ana ana : c) {
                                final String a7 = ana.a;
                                if (currentTimeMillis >= ana.a() && (!ana.b() || alf.c(a7))) {
                                    list.add((Object)ana);
                                }
                            }
                            for (int size = list.size(), i = 0; i < size; ++i) {
                                final String a8 = ((ana)list.get(i)).a;
                                final Intent c2 = akq.c(b, a8);
                                final aiy a9 = aiy.a();
                                String.format("Creating a delay_met command for workSpec with id (%s)", a8);
                                a9.d(new Throwable[0]);
                                a4.d(new akw(a4, c2, intExtra));
                            }
                            alf.b();
                        }
                        else if ("ACTION_RESCHEDULE".equals(action)) {
                            final aiy a10 = aiy.a();
                            String.format("Handling reschedule %s, %s", h2, value);
                            a10.d(new Throwable[0]);
                            a4.e.f();
                        }
                        else {
                            final Bundle extras = h2.getExtras();
                            Label_1614: {
                                if (extras != null) {
                                    if (!extras.isEmpty()) {
                                        for (int j = 0; j <= 0; ++j) {
                                            if (extras.get((new String[] { "KEY_WORKSPEC_ID" })[j]) == null) {
                                                break Label_1614;
                                            }
                                        }
                                        if ("ACTION_SCHEDULE_WORK".equals(action)) {
                                            final String string = h2.getExtras().getString("KEY_WORKSPEC_ID");
                                            final aiy a11 = aiy.a();
                                            String.format("Handling schedule work for %s", string);
                                            a11.d(new Throwable[0]);
                                            final WorkDatabase d = a4.e.d;
                                            d.h();
                                            try {
                                                final ana a12 = d.s().a(string);
                                                if (a12 == null) {
                                                    aiy.a();
                                                    final String a13 = akq.a;
                                                    final StringBuilder sb = new StringBuilder();
                                                    sb.append("Skipping scheduling ");
                                                    sb.append(string);
                                                    sb.append(" because it's no longer in the DB");
                                                    aiy.g(a13, sb.toString(), new Throwable[0]);
                                                }
                                                else if (cwz.f(a12.p)) {
                                                    aiy.a();
                                                    final String a14 = akq.a;
                                                    final StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("Skipping scheduling ");
                                                    sb2.append(string);
                                                    sb2.append("because it is finished.");
                                                    aiy.g(a14, sb2.toString(), new Throwable[0]);
                                                }
                                                else {
                                                    final long a15 = a12.a();
                                                    if (!a12.b()) {
                                                        final aiy a16 = aiy.a();
                                                        String.format("Setting up Alarms for %s at %s", string, a15);
                                                        a16.d(new Throwable[0]);
                                                        akp.b(f.b, a4.e, string, a15);
                                                    }
                                                    else {
                                                        final aiy a17 = aiy.a();
                                                        String.format("Opportunistically setting an alarm for %s at %s", string, a15);
                                                        a17.d(new Throwable[0]);
                                                        akp.b(f.b, a4.e, string, a15);
                                                        a4.d(new akw(a4, akq.b(f.b), intExtra));
                                                    }
                                                    d.j();
                                                }
                                                break Label_1648;
                                            }
                                            finally {
                                                d.i();
                                            }
                                        }
                                        if ("ACTION_DELAY_MET".equals(action)) {
                                            final Bundle extras2 = h2.getExtras();
                                            synchronized (f.d) {
                                                final String string2 = extras2.getString("KEY_WORKSPEC_ID");
                                                final aiy a18 = aiy.a();
                                                String.format("Handing delay met for %s", string2);
                                                a18.d(new Throwable[0]);
                                                if (!f.c.containsKey(string2)) {
                                                    final aku aku = new aku(f.b, intExtra, string2, a4);
                                                    f.c.put(string2, aku);
                                                    aku.f = aod.a(aku.a, String.format("%s (%s)", aku.c, aku.b));
                                                    final aiy a19 = aiy.a();
                                                    String.format("Acquiring wakelock %s for WorkSpec %s", aku.f, aku.c);
                                                    a19.d(new Throwable[0]);
                                                    aku.f.acquire();
                                                    final ana a20 = aku.d.e.d.s().a(aku.c);
                                                    if (a20 == null) {
                                                        aku.c();
                                                    }
                                                    else if (!(aku.g = a20.b())) {
                                                        final aiy a21 = aiy.a();
                                                        String.format("No constraints for %s", aku.c);
                                                        a21.d(new Throwable[0]);
                                                        aku.e(Collections.singletonList(aku.c));
                                                    }
                                                    else {
                                                        aku.e.a(Collections.singletonList(a20));
                                                    }
                                                }
                                                else {
                                                    final aiy a22 = aiy.a();
                                                    String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2);
                                                    a22.d(new Throwable[0]);
                                                }
                                                break Label_1648;
                                            }
                                        }
                                        if ("ACTION_STOP_WORK".equals(action)) {
                                            final String string3 = h2.getExtras().getString("KEY_WORKSPEC_ID");
                                            final aiy a23 = aiy.a();
                                            String.format("Handing stopWork work for %s", string3);
                                            a23.d(new Throwable[0]);
                                            a4.e.h(string3);
                                            akp.a(f.b, a4.e, string3);
                                            a4.a(string3, false);
                                            break Label_1648;
                                        }
                                        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                                            final Bundle extras3 = h2.getExtras();
                                            final String string4 = extras3.getString("KEY_WORKSPEC_ID");
                                            final boolean boolean1 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                                            final aiy a24 = aiy.a();
                                            String.format("Handling onExecutionCompleted %s, %s", h2, intExtra);
                                            a24.d(new Throwable[0]);
                                            f.a(string4, boolean1);
                                            break Label_1648;
                                        }
                                        aiy.a();
                                        aiy.g(akq.a, String.format("Ignoring intent %s", h2), new Throwable[0]);
                                        break Label_1648;
                                    }
                                }
                            }
                            aiy.a();
                            aiy.e(akq.a, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
                        }
                    }
                    final aiy a25 = aiy.a();
                    String.format("Releasing operation wake lock (%s) %s", o, o2);
                    a25.d(new Throwable[0]);
                    ((PowerManager$WakeLock)o2).release();
                    o2 = this.a;
                    o = new aky((akz)o2);
                    ((akz)o2).d((Runnable)o);
                }
                finally {
                    try {
                        aiy.a();
                        final Throwable t;
                        aiy.e(akz.a, "Unexpected error in onHandleIntent", t);
                        final aiy a26 = aiy.a();
                        String.format("Releasing operation wake lock (%s) %s", o, o2);
                        a26.d(new Throwable[0]);
                        ((PowerManager$WakeLock)o2).release();
                        o2 = this.a;
                        o = new aky((akz)o2);
                    }
                    finally {
                        final aiy a27 = aiy.a();
                        String.format("Releasing operation wake lock (%s) %s", o, o2);
                        a27.d(new Throwable[0]);
                        ((PowerManager$WakeLock)o2).release();
                        o = this.a;
                        ((akz)o).d(new aky((akz)o));
                    }
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
