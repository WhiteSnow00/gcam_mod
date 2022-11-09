import java.util.Iterator;
import java.util.ArrayList;
import android.database.Cursor;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajr
{
    static {
        aiy.b("Schedulers");
    }
    
    static ajq a(final Context context, final akh akh) {
        final alb alb = new alb(context, akh);
        anv.a(context, SystemJobService.class, true);
        aiy.a().d(new Throwable[0]);
        return alb;
    }
    
    public static void b(final ail ail, WorkDatabase workDatabase, final List list) {
        if (list != null) {
            if (list.size() != 0) {
                final anb s = workDatabase.s();
                workDatabase.h();
                try {
                    final int e = ail.e;
                    Object o = at.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
                    ((at)o).e(1, 20L);
                    ((anl)s).a.g();
                    Object o2 = gz.s(((anl)s).a, (aff)o, false);
                    try {
                        final int v = gz.v((Cursor)o2, "required_network_type");
                        final int v2 = gz.v((Cursor)o2, "requires_charging");
                        final int v3 = gz.v((Cursor)o2, "requires_device_idle");
                        final int v4 = gz.v((Cursor)o2, "requires_battery_not_low");
                        final int v5 = gz.v((Cursor)o2, "requires_storage_not_low");
                        final int v6 = gz.v((Cursor)o2, "trigger_content_update_delay");
                        final int v7 = gz.v((Cursor)o2, "trigger_max_content_delay");
                        final int v8 = gz.v((Cursor)o2, "content_uri_triggers");
                        final int v9 = gz.v((Cursor)o2, "id");
                        final int v10 = gz.v((Cursor)o2, "state");
                        final int v11 = gz.v((Cursor)o2, "worker_class_name");
                        final int v12 = gz.v((Cursor)o2, "input_merger_class_name");
                        final int v13 = gz.v((Cursor)o2, "input");
                        final anl anl = (anl)s;
                        final int v14 = gz.v((Cursor)o2, "output");
                        try {
                            final int v15 = gz.v((Cursor)o2, "initial_delay");
                            final int v16 = gz.v((Cursor)o2, "interval_duration");
                            final int v17 = gz.v((Cursor)o2, "flex_duration");
                            final int v18 = gz.v((Cursor)o2, "run_attempt_count");
                            final int v19 = gz.v((Cursor)o2, "backoff_policy");
                            final int v20 = gz.v((Cursor)o2, "backoff_delay_duration");
                            final int v21 = gz.v((Cursor)o2, "period_start_time");
                            final int v22 = gz.v((Cursor)o2, "minimum_retention_duration");
                            final int v23 = gz.v((Cursor)o2, "schedule_requested_at");
                            final int v24 = gz.v((Cursor)o2, "run_in_foreground");
                            final int v25 = gz.v((Cursor)o2, "out_of_quota_policy");
                            final ArrayList list2 = new ArrayList(((Cursor)o2).getCount());
                            while (((Cursor)o2).moveToNext()) {
                                final String string = ((Cursor)o2).getString(v9);
                                final String string2 = ((Cursor)o2).getString(v11);
                                final ain i = new ain();
                                i.i = cxa.e(((Cursor)o2).getInt(v));
                                i.b = (((Cursor)o2).getInt(v2) != 0);
                                i.c = (((Cursor)o2).getInt(v3) != 0);
                                i.d = (((Cursor)o2).getInt(v4) != 0);
                                i.e = (((Cursor)o2).getInt(v5) != 0);
                                i.f = ((Cursor)o2).getLong(v6);
                                i.g = ((Cursor)o2).getLong(v7);
                                i.h = cxa.b(((Cursor)o2).getBlob(v8));
                                final ana ana = new ana(string, string2);
                                ana.p = cxa.g(((Cursor)o2).getInt(v10));
                                ana.c = ((Cursor)o2).getString(v12);
                                ana.d = aiq.a(((Cursor)o2).getBlob(v13));
                                ana.e = aiq.a(((Cursor)o2).getBlob(v14));
                                ana.f = ((Cursor)o2).getLong(v15);
                                ana.g = ((Cursor)o2).getLong(v16);
                                ana.h = ((Cursor)o2).getLong(v17);
                                ana.j = ((Cursor)o2).getInt(v18);
                                ana.q = cxa.d(((Cursor)o2).getInt(v19));
                                ana.k = ((Cursor)o2).getLong(v20);
                                ana.l = ((Cursor)o2).getLong(v21);
                                ana.m = ((Cursor)o2).getLong(v22);
                                ana.n = ((Cursor)o2).getLong(v23);
                                ana.o = (((Cursor)o2).getInt(v24) != 0);
                                ana.r = cxa.f(((Cursor)o2).getInt(v25));
                                ana.i = i;
                                list2.add((Object)ana);
                            }
                            ((Cursor)o2).close();
                            ((at)o).j();
                            o2 = anl.i();
                            if (list2.size() > 0) {
                                final long currentTimeMillis = System.currentTimeMillis();
                                o = list2.iterator();
                                while (((Iterator)o).hasNext()) {
                                    anl.j(((ana)((Iterator)o).next()).a, currentTimeMillis);
                                }
                            }
                            workDatabase.j();
                            workDatabase.i();
                            if (list2.size() > 0) {
                                workDatabase = (WorkDatabase)list2.toArray((Object[])new ana[list2.size()]);
                                for (final ajq ajq : list) {
                                    if (ajq.d()) {
                                        ajq.c((ana[])(Object)workDatabase);
                                    }
                                }
                            }
                            if (((List)o2).size() > 0) {
                                final ana[] array = (ana[])((List)o2).toArray(new ana[((List)o2).size()]);
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    workDatabase = (WorkDatabase)iterator2.next();
                                    if (!((ajq)workDatabase).d()) {
                                        ((ajq)workDatabase).c(array);
                                    }
                                }
                            }
                            return;
                        }
                        finally {}
                    }
                    finally {}
                    ((Cursor)o2).close();
                    ((at)o).j();
                }
                finally {
                    workDatabase.i();
                }
            }
        }
    }
}
