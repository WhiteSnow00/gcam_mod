// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import androidx.work.impl.WorkDatabase;
import android.database.Cursor;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import androidx.work.WorkerParameters;
import android.content.Context;
import androidx.work.Worker;

public class DiagnosticsWorker extends Worker
{
    static {
        aiy.b("DiagnosticsWrkr");
    }
    
    public DiagnosticsWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    private static void i(final ams ams, final ano ano, final amp amp, final List list) {
        String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id");
        for (final ana ana : list) {
            final amm a = amp.a(ana.a);
            Integer value;
            if (a != null) {
                value = a.b;
            }
            else {
                value = null;
            }
            final String a2 = ana.a;
            Object o = at.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (a2 == null) {
                ((at)o).f(1);
            }
            else {
                ((at)o).g(1, a2);
            }
            ams.a.g();
            Object o2 = gz.s(ams.a, (aff)o, false);
            try {
                final ArrayList list2 = new ArrayList(((Cursor)o2).getCount());
                while (((Cursor)o2).moveToNext()) {
                    list2.add((Object)((Cursor)o2).getString(0));
                }
                ((Cursor)o2).close();
                ((at)o).j();
                o2 = ano.a(ana.a);
                o = TextUtils.join((CharSequence)",", (Iterable)list2);
                o2 = TextUtils.join((CharSequence)",", (Iterable)o2);
                final String a3 = ana.a;
                final String b = ana.b;
                final int p4 = ana.p;
                final String e = cwz.e(p4);
                if (p4 != 0) {
                    String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", a3, b, value, e, o, o2);
                    continue;
                }
                throw null;
            }
            finally {
                ((Cursor)o2).close();
                ((at)o).j();
            }
            break;
        }
    }
    
    @Override
    public final cwx h() {
        final WorkDatabase d = akh.e(super.a).d;
        final anb s = d.s();
        final ams x = d.x();
        final ano z = d.z();
        final amp w = d.w();
        final long currentTimeMillis = System.currentTimeMillis();
        final long millis = TimeUnit.DAYS.toMillis(1L);
        Object o = at.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        ((at)o).e(1, currentTimeMillis - millis);
        final anl anl = (anl)s;
        anl.a.g();
        Object o2 = gz.s(anl.a, (aff)o, false);
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
                final ArrayList list = new ArrayList(((Cursor)o2).getCount());
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
                    list.add((Object)ana);
                }
                ((Cursor)o2).close();
                ((at)o).j();
                o = s.b();
                o2 = s.i();
                if (!list.isEmpty()) {
                    aiy.a();
                    aiy.f(new Throwable[0]);
                    aiy.a();
                    i(x, z, w, list);
                    aiy.f(new Throwable[0]);
                }
                if (!((List)o).isEmpty()) {
                    aiy.a();
                    aiy.f(new Throwable[0]);
                    aiy.a();
                    i(x, z, w, (List)o);
                    aiy.f(new Throwable[0]);
                }
                if (!((List)o2).isEmpty()) {
                    aiy.a();
                    aiy.f(new Throwable[0]);
                    aiy.a();
                    i(x, z, w, (List)o2);
                    aiy.f(new Throwable[0]);
                }
                return cwx.f();
            }
            finally {}
        }
        finally {}
        ((Cursor)o2).close();
        ((at)o).j();
        throw;
    }
}
