import java.util.Set;
import java.util.Map;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import androidx.work.impl.WorkDatabase_Impl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akg extends ar
{
    final /* synthetic */ WorkDatabase_Impl b;
    
    public akg(final WorkDatabase_Impl b) {
        this.b = b;
        super(12);
    }
    
    @Override
    public final void a() {
        final List e = this.b.e;
        if (e != null) {
            for (int size = e.size(), i = 0; i < size; ++i) {
                final cp cp = this.b.e.get(i);
            }
        }
    }
    
    @Override
    public final as b(final afh afh) {
        final HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new bg("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new bg("prerequisite_id", "TEXT", true, 2, null, 1));
        final HashSet set = new HashSet(2);
        set.add(new bh("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        set.add(new bh("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        final HashSet set2 = new HashSet(2);
        set2.add(new bj("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        set2.add(new bj("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        final bk bk = new bk("Dependency", hashMap, set, set2);
        final bk a = bk.a(afh, "Dependency");
        if (!bk.equals(a)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            sb.append(bk);
            sb.append("\n Found:\n");
            sb.append(a);
            return new as(false, sb.toString());
        }
        final HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new bg("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new bg("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new bg("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new bg("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new bg("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new bg("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new bg("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new bg("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new bg("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new bg("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new bg("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new bg("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new bg("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new bg("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new bg("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new bg("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new bg("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new bg("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new bg("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new bg("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new bg("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new bg("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new bg("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new bg("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new bg("content_uri_triggers", "BLOB", false, 0, null, 1));
        final HashSet set3 = new HashSet(0);
        final HashSet set4 = new HashSet(2);
        set4.add(new bj("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        set4.add(new bj("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        final bk bk2 = new bk("WorkSpec", hashMap2, set3, set4);
        final bk a2 = bk.a(afh, "WorkSpec");
        if (!bk2.equals(a2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            sb2.append(bk2);
            sb2.append("\n Found:\n");
            sb2.append(a2);
            return new as(false, sb2.toString());
        }
        final HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new bg("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new bg("work_spec_id", "TEXT", true, 2, null, 1));
        final HashSet set5 = new HashSet(1);
        set5.add(new bh("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        final HashSet set6 = new HashSet(1);
        set6.add(new bj("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        final bk bk3 = new bk("WorkTag", hashMap3, set5, set6);
        final bk a3 = bk.a(afh, "WorkTag");
        if (!bk3.equals(a3)) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
            sb3.append(bk3);
            sb3.append("\n Found:\n");
            sb3.append(a3);
            return new as(false, sb3.toString());
        }
        final HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new bg("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new bg("system_id", "INTEGER", true, 0, null, 1));
        final HashSet set7 = new HashSet(1);
        set7.add(new bh("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        final bk bk4 = new bk("SystemIdInfo", hashMap4, set7, new HashSet(0));
        final bk a4 = bk.a(afh, "SystemIdInfo");
        if (!bk4.equals(a4)) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            sb4.append(bk4);
            sb4.append("\n Found:\n");
            sb4.append(a4);
            return new as(false, sb4.toString());
        }
        final HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new bg("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new bg("work_spec_id", "TEXT", true, 2, null, 1));
        final HashSet set8 = new HashSet(1);
        set8.add(new bh("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        final HashSet set9 = new HashSet(1);
        set9.add(new bj("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        final bk bk5 = new bk("WorkName", hashMap5, set8, set9);
        final bk a5 = bk.a(afh, "WorkName");
        if (!bk5.equals(a5)) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
            sb5.append(bk5);
            sb5.append("\n Found:\n");
            sb5.append(a5);
            return new as(false, sb5.toString());
        }
        final HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new bg("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new bg("progress", "BLOB", true, 0, null, 1));
        final HashSet set10 = new HashSet(1);
        set10.add(new bh("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        final bk bk6 = new bk("WorkProgress", hashMap6, set10, new HashSet(0));
        final bk a6 = bk.a(afh, "WorkProgress");
        if (!bk6.equals(a6)) {
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
            sb6.append(bk6);
            sb6.append("\n Found:\n");
            sb6.append(a6);
            return new as(false, sb6.toString());
        }
        final HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new bg("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new bg("long_value", "INTEGER", false, 0, null, 1));
        final bk bk7 = new bk("Preference", hashMap7, new HashSet(0), new HashSet(0));
        final bk a7 = bk.a(afh, "Preference");
        if (!bk7.equals(a7)) {
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
            sb7.append(bk7);
            sb7.append("\n Found:\n");
            sb7.append(a7);
            return new as(false, sb7.toString());
        }
        return new as(true, null);
    }
    
    @Override
    public final void c(final afh afh) {
        afh.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        afh.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        afh.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        afh.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        afh.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        afh.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        afh.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        afh.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        afh.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        afh.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        afh.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        afh.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        afh.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        afh.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        afh.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
    
    @Override
    public final void d(final afh afh) {
        afh.g("DROP TABLE IF EXISTS `Dependency`");
        afh.g("DROP TABLE IF EXISTS `WorkSpec`");
        afh.g("DROP TABLE IF EXISTS `WorkTag`");
        afh.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        afh.g("DROP TABLE IF EXISTS `WorkName`");
        afh.g("DROP TABLE IF EXISTS `WorkProgress`");
        afh.g("DROP TABLE IF EXISTS `Preference`");
        final List e = this.b.e;
        if (e != null) {
            for (int size = e.size(), i = 0; i < size; ++i) {
                final cp cp = this.b.e.get(i);
            }
        }
    }
    
    @Override
    public final void e(final afh i) {
        (this.b.i = i).g("PRAGMA foreign_keys = ON");
        this.b.p(i);
        final List e = this.b.e;
        if (e != null) {
            for (int size = e.size(), j = 0; j < size; ++j) {
                ((cp)this.b.e.get(j)).c(i);
            }
        }
    }
    
    @Override
    public final void f(final afh afh) {
    }
    
    @Override
    public final void g(final afh afh) {
        gz.t(afh);
    }
}
