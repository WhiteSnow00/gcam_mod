import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase_Impl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddb extends ar
{
    final /* synthetic */ ShotDatabase_Impl b;
    
    public ddb(final ShotDatabase_Impl b) {
        this.b = b;
        super(9);
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
        final HashMap hashMap = new HashMap(12);
        hashMap.put("shot_id", new bg("shot_id", "INTEGER", true, 1, null, 1));
        hashMap.put("title", new bg("title", "TEXT", false, 0, null, 1));
        hashMap.put("start_millis", new bg("start_millis", "INTEGER", true, 0, null, 1));
        hashMap.put("persisted_millis", new bg("persisted_millis", "INTEGER", true, 0, null, 1));
        hashMap.put("canceled_millis", new bg("canceled_millis", "INTEGER", true, 0, null, 1));
        hashMap.put("deleted_millis", new bg("deleted_millis", "INTEGER", true, 0, null, 1));
        hashMap.put("most_recent_event_millis", new bg("most_recent_event_millis", "INTEGER", true, 0, null, 1));
        hashMap.put("capture_session_type", new bg("capture_session_type", "TEXT", false, 0, null, 1));
        hashMap.put("capture_session_shot_id", new bg("capture_session_shot_id", "TEXT", false, 0, null, 1));
        hashMap.put("pid", new bg("pid", "INTEGER", true, 0, null, 1));
        hashMap.put("stuck", new bg("stuck", "INTEGER", true, 0, null, 1));
        hashMap.put("failed", new bg("failed", "INTEGER", true, 0, null, 1));
        final bk bk = new bk("shots", hashMap, new HashSet(0), new HashSet(0));
        final bk a = bk.a(afh, "shots");
        if (!bk.equals(a)) {
            final String value = String.valueOf(bk);
            final String value2 = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 91 + String.valueOf(value2).length());
            sb.append("shots(com.google.android.apps.camera.debug.shottracker.db.ShotEntity).\n Expected:\n");
            sb.append(value);
            sb.append("\n Found:\n");
            sb.append(value2);
            return new as(false, sb.toString());
        }
        final HashMap hashMap2 = new HashMap(4);
        hashMap2.put("sequence", new bg("sequence", "INTEGER", true, 1, null, 1));
        hashMap2.put("shot_id", new bg("shot_id", "INTEGER", true, 0, null, 1));
        hashMap2.put("time_millis", new bg("time_millis", "INTEGER", true, 0, null, 1));
        hashMap2.put("message", new bg("message", "TEXT", false, 0, null, 1));
        final HashSet set = new HashSet(1);
        set.add(new bh("shots", "CASCADE", "NO ACTION", Arrays.asList("shot_id"), Arrays.asList("shot_id")));
        final HashSet set2 = new HashSet(1);
        set2.add(new bj("index_shot_log_shot_id_sequence", false, Arrays.asList("shot_id", "sequence")));
        final bk bk2 = new bk("shot_log", hashMap2, set, set2);
        final bk a2 = bk.a(afh, "shot_log");
        if (!bk2.equals(a2)) {
            final String value3 = String.valueOf(bk2);
            final String value4 = String.valueOf(a2);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 97 + String.valueOf(value4).length());
            sb2.append("shot_log(com.google.android.apps.camera.debug.shottracker.db.ShotLogEntity).\n Expected:\n");
            sb2.append(value3);
            sb2.append("\n Found:\n");
            sb2.append(value4);
            return new as(false, sb2.toString());
        }
        return new as(true, null);
    }
    
    @Override
    public final void c(final afh afh) {
        afh.g("CREATE TABLE IF NOT EXISTS `shots` (`shot_id` INTEGER NOT NULL, `title` TEXT, `start_millis` INTEGER NOT NULL, `persisted_millis` INTEGER NOT NULL, `canceled_millis` INTEGER NOT NULL, `deleted_millis` INTEGER NOT NULL, `most_recent_event_millis` INTEGER NOT NULL, `capture_session_type` TEXT, `capture_session_shot_id` TEXT, `pid` INTEGER NOT NULL, `stuck` INTEGER NOT NULL, `failed` INTEGER NOT NULL, PRIMARY KEY(`shot_id`))");
        afh.g("CREATE TABLE IF NOT EXISTS `shot_log` (`sequence` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `shot_id` INTEGER NOT NULL, `time_millis` INTEGER NOT NULL, `message` TEXT, FOREIGN KEY(`shot_id`) REFERENCES `shots`(`shot_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        afh.g("CREATE INDEX IF NOT EXISTS `index_shot_log_shot_id_sequence` ON `shot_log` (`shot_id`, `sequence`)");
        afh.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        afh.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd5a320f0e030e16072c0c60f65398e1d')");
    }
    
    @Override
    public final void d(final afh afh) {
        afh.g("DROP TABLE IF EXISTS `shots`");
        afh.g("DROP TABLE IF EXISTS `shot_log`");
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
