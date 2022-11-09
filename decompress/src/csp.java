import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase_Impl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csp extends ar
{
    final /* synthetic */ CameraFatalErrorTrackerDatabase_Impl b;
    
    public csp(final CameraFatalErrorTrackerDatabase_Impl b) {
        this.b = b;
        super(5);
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
        final HashMap hashMap = new HashMap(7);
        hashMap.put("cameraId", new bg("cameraId", "TEXT", true, 1, null, 1));
        hashMap.put("failuresBeforeRebootDuringOpen", new bg("failuresBeforeRebootDuringOpen", "INTEGER", true, 0, null, 1));
        hashMap.put("failuresAfterRebootDuringOpen", new bg("failuresAfterRebootDuringOpen", "INTEGER", true, 0, null, 1));
        hashMap.put("failuresBeforeRebootDuringSession", new bg("failuresBeforeRebootDuringSession", "INTEGER", true, 0, null, 1));
        hashMap.put("failuresAfterRebootDuringSession", new bg("failuresAfterRebootDuringSession", "INTEGER", true, 0, null, 1));
        hashMap.put("lastFatalErrorTimestamp", new bg("lastFatalErrorTimestamp", "INTEGER", true, 0, null, 1));
        hashMap.put("rebootCount", new bg("rebootCount", "INTEGER", true, 0, null, 1));
        final bk bk = new bk("FatalErrorCounts", hashMap, new HashSet(0), new HashSet(0));
        final bk a = bk.a(afh, "FatalErrorCounts");
        if (!bk.equals(a)) {
            final String value = String.valueOf(bk);
            final String value2 = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 104 + String.valueOf(value2).length());
            sb.append("FatalErrorCounts(com.google.android.apps.camera.camerafatalerror.FatalErrorCounts).\n Expected:\n");
            sb.append(value);
            sb.append("\n Found:\n");
            sb.append(value2);
            return new as(false, sb.toString());
        }
        final HashMap hashMap2 = new HashMap(5);
        hashMap2.put("errorCode", new bg("errorCode", "INTEGER", true, 1, null, 1));
        hashMap2.put("failuresBeforeReboot", new bg("failuresBeforeReboot", "INTEGER", true, 0, null, 1));
        hashMap2.put("failuresAfterReboot", new bg("failuresAfterReboot", "INTEGER", true, 0, null, 1));
        hashMap2.put("rebootCount", new bg("rebootCount", "INTEGER", true, 0, null, 1));
        hashMap2.put("lastFailureTimestamp", new bg("lastFailureTimestamp", "INTEGER", true, 0, null, 1));
        final bk bk2 = new bk("EnumerationErrorCounts", hashMap2, new HashSet(0), new HashSet(0));
        final bk a2 = bk.a(afh, "EnumerationErrorCounts");
        if (!bk2.equals(a2)) {
            final String value3 = String.valueOf(bk2);
            final String value4 = String.valueOf(a2);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 116 + String.valueOf(value4).length());
            sb2.append("EnumerationErrorCounts(com.google.android.apps.camera.camerafatalerror.EnumerationErrorCounts).\n Expected:\n");
            sb2.append(value3);
            sb2.append("\n Found:\n");
            sb2.append(value4);
            return new as(false, sb2.toString());
        }
        final HashMap hashMap3 = new HashMap(4);
        hashMap3.put("reason", new bg("reason", "INTEGER", false, 1, null, 1));
        hashMap3.put("impressionsBeforeReboot", new bg("impressionsBeforeReboot", "INTEGER", true, 0, null, 1));
        hashMap3.put("impressionsAfterReboot", new bg("impressionsAfterReboot", "INTEGER", true, 0, null, 1));
        hashMap3.put("rebootCount", new bg("rebootCount", "INTEGER", true, 0, null, 1));
        final bk bk3 = new bk("HardwareHelpDialogCounts", hashMap3, new HashSet(0), new HashSet(0));
        final bk a3 = bk.a(afh, "HardwareHelpDialogCounts");
        if (!bk3.equals(a3)) {
            final String value5 = String.valueOf(bk3);
            final String value6 = String.valueOf(a3);
            final StringBuilder sb3 = new StringBuilder(String.valueOf(value5).length() + 120 + String.valueOf(value6).length());
            sb3.append("HardwareHelpDialogCounts(com.google.android.apps.camera.camerafatalerror.HardwareHelpDialogCounts).\n Expected:\n");
            sb3.append(value5);
            sb3.append("\n Found:\n");
            sb3.append(value6);
            return new as(false, sb3.toString());
        }
        return new as(true, null);
    }
    
    @Override
    public final void c(final afh afh) {
        afh.g("CREATE TABLE IF NOT EXISTS `FatalErrorCounts` (`cameraId` TEXT NOT NULL, `failuresBeforeRebootDuringOpen` INTEGER NOT NULL, `failuresAfterRebootDuringOpen` INTEGER NOT NULL, `failuresBeforeRebootDuringSession` INTEGER NOT NULL, `failuresAfterRebootDuringSession` INTEGER NOT NULL, `lastFatalErrorTimestamp` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, PRIMARY KEY(`cameraId`))");
        afh.g("CREATE TABLE IF NOT EXISTS `EnumerationErrorCounts` (`errorCode` INTEGER NOT NULL, `failuresBeforeReboot` INTEGER NOT NULL, `failuresAfterReboot` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, `lastFailureTimestamp` INTEGER NOT NULL, PRIMARY KEY(`errorCode`))");
        afh.g("CREATE TABLE IF NOT EXISTS `HardwareHelpDialogCounts` (`reason` INTEGER, `impressionsBeforeReboot` INTEGER NOT NULL, `impressionsAfterReboot` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, PRIMARY KEY(`reason`))");
        afh.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        afh.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e7b45086cd950266a3a3a8f0da0a57b0')");
    }
    
    @Override
    public final void d(final afh afh) {
        afh.g("DROP TABLE IF EXISTS `FatalErrorCounts`");
        afh.g("DROP TABLE IF EXISTS `EnumerationErrorCounts`");
        afh.g("DROP TABLE IF EXISTS `HardwareHelpDialogCounts`");
        final List e = this.b.e;
        if (e != null) {
            for (int size = e.size(), i = 0; i < size; ++i) {
                final cp cp = this.b.e.get(i);
            }
        }
    }
    
    @Override
    public final void e(final afh i) {
        this.b.i = i;
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
