import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anl implements anb
{
    public final aq a;
    public final ai b;
    public final ba c;
    public final ba d;
    public final ba e;
    private final ba f;
    private final ba g;
    private final ba h;
    private final ba i;
    
    public anl(final aq a) {
        this.a = a;
        this.b = new anc(a);
        this.f = new and(a);
        this.g = new ane(a);
        this.h = new anf(a);
        this.c = new ang(a);
        this.d = new anh(a);
        this.i = new ani(a);
        this.e = new anj(a);
        new ank(a);
    }
    
    @Override
    public final ana a(final String s) {
        final at a = at.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (s == null) {
            a.f(1);
        }
        else {
            a.g(1, s);
        }
        this.a.g();
        final Cursor s2 = gz.s(this.a, a, false);
        try {
            final int v = gz.v(s2, "required_network_type");
            final int v2 = gz.v(s2, "requires_charging");
            final int v3 = gz.v(s2, "requires_device_idle");
            final int v4 = gz.v(s2, "requires_battery_not_low");
            final int v5 = gz.v(s2, "requires_storage_not_low");
            final int v6 = gz.v(s2, "trigger_content_update_delay");
            final int v7 = gz.v(s2, "trigger_max_content_delay");
            final int v8 = gz.v(s2, "content_uri_triggers");
            final int v9 = gz.v(s2, "id");
            final int v10 = gz.v(s2, "state");
            final int v11 = gz.v(s2, "worker_class_name");
            final int v12 = gz.v(s2, "input_merger_class_name");
            final int v13 = gz.v(s2, "input");
            final int v14 = gz.v(s2, "output");
            try {
                final int v15 = gz.v(s2, "initial_delay");
                final int v16 = gz.v(s2, "interval_duration");
                final int v17 = gz.v(s2, "flex_duration");
                final int v18 = gz.v(s2, "run_attempt_count");
                final int v19 = gz.v(s2, "backoff_policy");
                final int v20 = gz.v(s2, "backoff_delay_duration");
                final int v21 = gz.v(s2, "period_start_time");
                final int v22 = gz.v(s2, "minimum_retention_duration");
                final int v23 = gz.v(s2, "schedule_requested_at");
                final int v24 = gz.v(s2, "run_in_foreground");
                final int v25 = gz.v(s2, "out_of_quota_policy");
                ana ana;
                if (s2.moveToFirst()) {
                    final String string = s2.getString(v9);
                    final String string2 = s2.getString(v11);
                    final ain i = new ain();
                    i.i = cxa.e(s2.getInt(v));
                    i.b = (s2.getInt(v2) != 0);
                    i.c = (s2.getInt(v3) != 0);
                    i.d = (s2.getInt(v4) != 0);
                    i.e = (s2.getInt(v5) != 0);
                    i.f = s2.getLong(v6);
                    i.g = s2.getLong(v7);
                    i.h = cxa.b(s2.getBlob(v8));
                    ana = new ana(string, string2);
                    ana.p = cxa.g(s2.getInt(v10));
                    ana.c = s2.getString(v12);
                    ana.d = aiq.a(s2.getBlob(v13));
                    ana.e = aiq.a(s2.getBlob(v14));
                    ana.f = s2.getLong(v15);
                    ana.g = s2.getLong(v16);
                    ana.h = s2.getLong(v17);
                    ana.j = s2.getInt(v18);
                    ana.q = cxa.d(s2.getInt(v19));
                    ana.k = s2.getLong(v20);
                    ana.l = s2.getLong(v21);
                    ana.m = s2.getLong(v22);
                    ana.n = s2.getLong(v23);
                    ana.o = (s2.getInt(v24) != 0);
                    ana.r = cxa.f(s2.getInt(v25));
                    ana.i = i;
                }
                else {
                    ana = null;
                }
                s2.close();
                a.j();
                return ana;
            }
            finally {}
        }
        finally {}
        s2.close();
        a.j();
    }
    
    @Override
    public final List b() {
        final at a = at.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.g();
        final Cursor s = gz.s(this.a, a, false);
        try {
            final int v = gz.v(s, "required_network_type");
            final int v2 = gz.v(s, "requires_charging");
            final int v3 = gz.v(s, "requires_device_idle");
            final int v4 = gz.v(s, "requires_battery_not_low");
            final int v5 = gz.v(s, "requires_storage_not_low");
            final int v6 = gz.v(s, "trigger_content_update_delay");
            final int v7 = gz.v(s, "trigger_max_content_delay");
            final int v8 = gz.v(s, "content_uri_triggers");
            final int v9 = gz.v(s, "id");
            final int v10 = gz.v(s, "state");
            final int v11 = gz.v(s, "worker_class_name");
            final int v12 = gz.v(s, "input_merger_class_name");
            final int v13 = gz.v(s, "input");
            final int v14 = gz.v(s, "output");
            try {
                final int v15 = gz.v(s, "initial_delay");
                final int v16 = gz.v(s, "interval_duration");
                final int v17 = gz.v(s, "flex_duration");
                final int v18 = gz.v(s, "run_attempt_count");
                final int v19 = gz.v(s, "backoff_policy");
                final int v20 = gz.v(s, "backoff_delay_duration");
                final int v21 = gz.v(s, "period_start_time");
                final int v22 = gz.v(s, "minimum_retention_duration");
                final int v23 = gz.v(s, "schedule_requested_at");
                final int v24 = gz.v(s, "run_in_foreground");
                final int v25 = gz.v(s, "out_of_quota_policy");
                final ArrayList list = new ArrayList(s.getCount());
                while (s.moveToNext()) {
                    final String string = s.getString(v9);
                    final String string2 = s.getString(v11);
                    final ain i = new ain();
                    i.i = cxa.e(s.getInt(v));
                    i.b = (s.getInt(v2) != 0);
                    i.c = (s.getInt(v3) != 0);
                    i.d = (s.getInt(v4) != 0);
                    i.e = (s.getInt(v5) != 0);
                    i.f = s.getLong(v6);
                    i.g = s.getLong(v7);
                    i.h = cxa.b(s.getBlob(v8));
                    final ana ana = new ana(string, string2);
                    ana.p = cxa.g(s.getInt(v10));
                    ana.c = s.getString(v12);
                    ana.d = aiq.a(s.getBlob(v13));
                    ana.e = aiq.a(s.getBlob(v14));
                    ana.f = s.getLong(v15);
                    ana.g = s.getLong(v16);
                    ana.h = s.getLong(v17);
                    ana.j = s.getInt(v18);
                    ana.q = cxa.d(s.getInt(v19));
                    ana.k = s.getLong(v20);
                    ana.l = s.getLong(v21);
                    ana.m = s.getLong(v22);
                    ana.n = s.getLong(v23);
                    ana.o = (s.getInt(v24) != 0);
                    ana.r = cxa.f(s.getInt(v25));
                    ana.i = i;
                    list.add((Object)ana);
                }
                s.close();
                a.j();
                return list;
            }
            finally {}
        }
        finally {}
        s.close();
        a.j();
        throw;
    }
    
    @Override
    public final List c() {
        final at a = at.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.g();
        final Cursor s = gz.s(this.a, a, false);
        try {
            final int v = gz.v(s, "required_network_type");
            final int v2 = gz.v(s, "requires_charging");
            final int v3 = gz.v(s, "requires_device_idle");
            final int v4 = gz.v(s, "requires_battery_not_low");
            final int v5 = gz.v(s, "requires_storage_not_low");
            final int v6 = gz.v(s, "trigger_content_update_delay");
            final int v7 = gz.v(s, "trigger_max_content_delay");
            final int v8 = gz.v(s, "content_uri_triggers");
            final int v9 = gz.v(s, "id");
            final int v10 = gz.v(s, "state");
            final int v11 = gz.v(s, "worker_class_name");
            final int v12 = gz.v(s, "input_merger_class_name");
            final int v13 = gz.v(s, "input");
            final int v14 = gz.v(s, "output");
            try {
                final int v15 = gz.v(s, "initial_delay");
                final int v16 = gz.v(s, "interval_duration");
                final int v17 = gz.v(s, "flex_duration");
                final int v18 = gz.v(s, "run_attempt_count");
                final int v19 = gz.v(s, "backoff_policy");
                final int v20 = gz.v(s, "backoff_delay_duration");
                final int v21 = gz.v(s, "period_start_time");
                final int v22 = gz.v(s, "minimum_retention_duration");
                final int v23 = gz.v(s, "schedule_requested_at");
                final int v24 = gz.v(s, "run_in_foreground");
                final int v25 = gz.v(s, "out_of_quota_policy");
                final ArrayList list = new ArrayList(s.getCount());
                while (s.moveToNext()) {
                    final String string = s.getString(v9);
                    final String string2 = s.getString(v11);
                    final ain i = new ain();
                    i.i = cxa.e(s.getInt(v));
                    i.b = (s.getInt(v2) != 0);
                    i.c = (s.getInt(v3) != 0);
                    i.d = (s.getInt(v4) != 0);
                    i.e = (s.getInt(v5) != 0);
                    i.f = s.getLong(v6);
                    i.g = s.getLong(v7);
                    i.h = cxa.b(s.getBlob(v8));
                    final ana ana = new ana(string, string2);
                    ana.p = cxa.g(s.getInt(v10));
                    ana.c = s.getString(v12);
                    ana.d = aiq.a(s.getBlob(v13));
                    ana.e = aiq.a(s.getBlob(v14));
                    ana.f = s.getLong(v15);
                    ana.g = s.getLong(v16);
                    ana.h = s.getLong(v17);
                    ana.j = s.getInt(v18);
                    ana.q = cxa.d(s.getInt(v19));
                    ana.k = s.getLong(v20);
                    ana.l = s.getLong(v21);
                    ana.m = s.getLong(v22);
                    ana.n = s.getLong(v23);
                    ana.o = (s.getInt(v24) != 0);
                    ana.r = cxa.f(s.getInt(v25));
                    ana.i = i;
                    list.add((Object)ana);
                }
                s.close();
                a.j();
                return list;
            }
            finally {}
        }
        finally {}
        s.close();
        a.j();
        throw;
    }
    
    @Override
    public final List d(String s) {
        final at a = at.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (s == null) {
            a.f(1);
        }
        else {
            a.g(1, s);
        }
        this.a.g();
        s = (String)gz.s(this.a, a, false);
        try {
            final int v = gz.v((Cursor)s, "id");
            final int v2 = gz.v((Cursor)s, "state");
            final ArrayList list = new ArrayList(((Cursor)s).getCount());
            while (((Cursor)s).moveToNext()) {
                final amy amy = new amy();
                amy.a = ((Cursor)s).getString(v);
                amy.b = cxa.g(((Cursor)s).getInt(v2));
                list.add(amy);
            }
            ((Cursor)s).close();
            a.j();
            return list;
        }
        finally {
            ((Cursor)s).close();
            a.j();
            while (true) {}
        }
    }
    
    @Override
    public final void e(final String s) {
        this.a.g();
        final afn e = this.f.e();
        if (s == null) {
            e.f(1);
        }
        else {
            e.g(1, s);
        }
        this.a.h();
        try {
            e.a();
            this.a.j();
        }
        finally {
            this.a.i();
            this.f.f(e);
        }
    }
    
    @Override
    public final void f(final String s, final aiq aiq) {
        this.a.g();
        final afn e = this.g.e();
        final byte[] c = aiq.c(aiq);
        if (c == null) {
            e.f(1);
        }
        else {
            e.c(1, c);
        }
        if (s == null) {
            e.f(2);
        }
        else {
            e.g(2, s);
        }
        this.a.h();
        try {
            e.a();
            this.a.j();
        }
        finally {
            this.a.i();
            this.g.f(e);
        }
    }
    
    @Override
    public final void g(final String s, final long n) {
        this.a.g();
        final afn e = this.h.e();
        e.e(1, n);
        if (s == null) {
            e.f(2);
        }
        else {
            e.g(2, s);
        }
        this.a.h();
        try {
            e.a();
            this.a.j();
        }
        finally {
            this.a.i();
            this.h.f(e);
        }
    }
    
    @Override
    public final int h(String s) {
        final at a = at.a("SELECT state FROM workspec WHERE id=?", 1);
        if (s == null) {
            a.f(1);
        }
        else {
            a.g(1, s);
        }
        this.a.g();
        final aq a2 = this.a;
        int g = 0;
        s = (String)gz.s(a2, a, false);
        try {
            if (((Cursor)s).moveToFirst()) {
                g = cxa.g(((Cursor)s).getInt(0));
            }
            return g;
        }
        finally {
            ((Cursor)s).close();
            a.j();
        }
    }
    
    @Override
    public final List i() {
        final at a = at.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        a.e(1, 200L);
        this.a.g();
        final Cursor s = gz.s(this.a, a, false);
        try {
            final int v = gz.v(s, "required_network_type");
            final int v2 = gz.v(s, "requires_charging");
            final int v3 = gz.v(s, "requires_device_idle");
            final int v4 = gz.v(s, "requires_battery_not_low");
            final int v5 = gz.v(s, "requires_storage_not_low");
            final int v6 = gz.v(s, "trigger_content_update_delay");
            final int v7 = gz.v(s, "trigger_max_content_delay");
            final int v8 = gz.v(s, "content_uri_triggers");
            final int v9 = gz.v(s, "id");
            final int v10 = gz.v(s, "state");
            final int v11 = gz.v(s, "worker_class_name");
            final int v12 = gz.v(s, "input_merger_class_name");
            final int v13 = gz.v(s, "input");
            final int v14 = gz.v(s, "output");
            try {
                final int v15 = gz.v(s, "initial_delay");
                final int v16 = gz.v(s, "interval_duration");
                final int v17 = gz.v(s, "flex_duration");
                final int v18 = gz.v(s, "run_attempt_count");
                final int v19 = gz.v(s, "backoff_policy");
                final int v20 = gz.v(s, "backoff_delay_duration");
                final int v21 = gz.v(s, "period_start_time");
                final int v22 = gz.v(s, "minimum_retention_duration");
                final int v23 = gz.v(s, "schedule_requested_at");
                final int v24 = gz.v(s, "run_in_foreground");
                final int v25 = gz.v(s, "out_of_quota_policy");
                final ArrayList list = new ArrayList(s.getCount());
                while (s.moveToNext()) {
                    final String string = s.getString(v9);
                    final String string2 = s.getString(v11);
                    final ain i = new ain();
                    i.i = cxa.e(s.getInt(v));
                    i.b = (s.getInt(v2) != 0);
                    i.c = (s.getInt(v3) != 0);
                    i.d = (s.getInt(v4) != 0);
                    i.e = (s.getInt(v5) != 0);
                    i.f = s.getLong(v6);
                    i.g = s.getLong(v7);
                    i.h = cxa.b(s.getBlob(v8));
                    final ana ana = new ana(string, string2);
                    ana.p = cxa.g(s.getInt(v10));
                    ana.c = s.getString(v12);
                    ana.d = aiq.a(s.getBlob(v13));
                    ana.e = aiq.a(s.getBlob(v14));
                    ana.f = s.getLong(v15);
                    ana.g = s.getLong(v16);
                    ana.h = s.getLong(v17);
                    ana.j = s.getInt(v18);
                    ana.q = cxa.d(s.getInt(v19));
                    ana.k = s.getLong(v20);
                    ana.l = s.getLong(v21);
                    ana.m = s.getLong(v22);
                    ana.n = s.getLong(v23);
                    ana.o = (s.getInt(v24) != 0);
                    ana.r = cxa.f(s.getInt(v25));
                    ana.i = i;
                    list.add((Object)ana);
                }
                s.close();
                a.j();
                return list;
            }
            finally {}
        }
        finally {}
        s.close();
        a.j();
        throw;
    }
    
    @Override
    public final void j(final String s, final long n) {
        this.a.g();
        final afn e = this.i.e();
        e.e(1, n);
        if (s == null) {
            e.f(2);
        }
        else {
            e.g(2, s);
        }
        this.a.h();
        try {
            e.a();
            this.a.j();
        }
        finally {
            this.a.i();
            this.i.f(e);
        }
    }
    
    @Override
    public final void k(int n, final String... array) {
        this.a.g();
        final StringBuilder a = bo.a();
        a.append("UPDATE workspec SET state=? WHERE id IN (");
        bo.b(a, 1);
        a.append(")");
        final afn m = this.a.m(a.toString());
        m.e(1, cxa.c(n));
        n = 2;
        for (int i = 0; i <= 0; i = 1) {
            final String s = array[0];
            if (s == null) {
                m.f(n);
            }
            else {
                m.g(n, s);
            }
            ++n;
        }
        this.a.h();
        try {
            m.a();
            this.a.j();
            this.a.i();
        }
        finally {
            this.a.i();
            while (true) {}
        }
    }
    
    public final void l(final yu yu) {
        final Set keySet = yu.keySet();
        if (!keySet.isEmpty()) {
            if (yu.j > 999) {
                yu yu2 = new yu(999);
                final int j = yu.j;
                int i = 0;
                int n = 0;
                while (i < j) {
                    yu2.put(yu.f(i), yu.i(i));
                    final int n2 = i + 1;
                    final int n3 = n + 1;
                    i = n2;
                    if ((n = n3) == 999) {
                        this.l(yu2);
                        yu2 = new yu(999);
                        n = 0;
                        i = n2;
                    }
                }
                if (n > 0) {
                    this.l(yu2);
                }
                return;
            }
            final StringBuilder a = bo.a();
            a.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            final int size = keySet.size();
            bo.b(a, size);
            a.append(")");
            final at a2 = at.a(a.toString(), size);
            final Iterator iterator = keySet.iterator();
            int n4 = 1;
            while (iterator.hasNext()) {
                final String s = (String)iterator.next();
                if (s == null) {
                    a2.f(n4);
                }
                else {
                    a2.g(n4, s);
                }
                ++n4;
            }
            final Cursor s2 = gz.s(this.a, a2, false);
            try {
                final int u = gz.u(s2, "work_spec_id");
                if (u != -1) {
                    while (s2.moveToNext()) {
                        if (!s2.isNull(u)) {
                            final ArrayList list = (ArrayList)yu.get(s2.getString(u));
                            if (list == null) {
                                continue;
                            }
                            list.add(aiq.a(s2.getBlob(0)));
                        }
                    }
                }
            }
            finally {
                s2.close();
            }
        }
    }
    
    public final void m(final yu yu) {
        final Set keySet = yu.keySet();
        if (!keySet.isEmpty()) {
            if (yu.j > 999) {
                yu yu2 = new yu(999);
                final int j = yu.j;
                int i = 0;
                int n = 0;
                while (i < j) {
                    yu2.put(yu.f(i), yu.i(i));
                    final int n2 = i + 1;
                    final int n3 = n + 1;
                    i = n2;
                    if ((n = n3) == 999) {
                        this.m(yu2);
                        yu2 = new yu(999);
                        n = 0;
                        i = n2;
                    }
                }
                if (n > 0) {
                    this.m(yu2);
                }
                return;
            }
            final StringBuilder a = bo.a();
            a.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            final int size = keySet.size();
            bo.b(a, size);
            a.append(")");
            final at a2 = at.a(a.toString(), size);
            final Iterator iterator = keySet.iterator();
            int n4 = 1;
            while (iterator.hasNext()) {
                final String s = (String)iterator.next();
                if (s == null) {
                    a2.f(n4);
                }
                else {
                    a2.g(n4, s);
                }
                ++n4;
            }
            final Cursor s2 = gz.s(this.a, a2, false);
            try {
                final int u = gz.u(s2, "work_spec_id");
                if (u != -1) {
                    while (s2.moveToNext()) {
                        if (!s2.isNull(u)) {
                            final ArrayList list = (ArrayList)yu.get(s2.getString(u));
                            if (list == null) {
                                continue;
                            }
                            list.add(s2.getString(0));
                        }
                    }
                }
            }
            finally {
                s2.close();
            }
        }
    }
}
