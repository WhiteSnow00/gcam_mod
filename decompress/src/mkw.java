import android.os.storage.StorageVolume;
import android.app.usage.StorageStats;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.IOException;
import android.os.Process;
import java.util.UUID;
import android.app.usage.StorageStatsManager;
import android.os.storage.StorageManager;
import android.content.pm.PackageStats;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class mkw
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO");
    }
    
    static PackageStats a(Context ex) {
        mrm.b();
        final StorageManager storageManager = (StorageManager)((Context)ex).getSystemService((Class)StorageManager.class);
        if (storageManager == null) {
            a.l(mkw.a.b(), "StorageManager is not available", '\u0c49');
            return null;
        }
        try {
            final StorageStatsManager storageStatsManager = (StorageStatsManager)((Context)ex).getSystemService((Class)StorageStatsManager.class);
            final String packageName = ((Context)ex).getPackageName();
            final PackageStats packageStats = new PackageStats(packageName);
            final Iterator iterator = storageManager.getStorageVolumes().iterator();
            while (iterator.hasNext()) {
                ex = (IllegalArgumentException)iterator.next();
                if (((StorageVolume)ex).getState().equals("mounted")) {
                    final String uuid = ((StorageVolume)ex).getUuid();
                    Label_0118: {
                        if (uuid != null) {
                            break Label_0118;
                        }
                        try {
                            ex = (IllegalArgumentException)StorageManager.UUID_DEFAULT;
                            break Label_0118;
                            ex = (IllegalArgumentException)UUID.fromString(uuid);
                        }
                        catch (IllegalArgumentException ex) {
                            a.n(mkw.a.c(), "Invalid UUID format: '%s'", uuid, '\u0c4b', ex);
                            ex = null;
                        }
                    }
                    if (ex == null) {
                        continue;
                    }
                    try {
                        final StorageStats queryStatsForPackage = storageStatsManager.queryStatsForPackage((UUID)ex, packageName, Process.myUserHandle());
                        if (StorageManager.UUID_DEFAULT.equals(ex)) {
                            packageStats.codeSize += queryStatsForPackage.getAppBytes();
                            packageStats.dataSize += queryStatsForPackage.getDataBytes() - queryStatsForPackage.getCacheBytes();
                            packageStats.cacheSize += queryStatsForPackage.getCacheBytes();
                            continue;
                        }
                        packageStats.externalCodeSize += queryStatsForPackage.getAppBytes();
                        packageStats.externalDataSize += queryStatsForPackage.getDataBytes() - queryStatsForPackage.getCacheBytes();
                        packageStats.externalCacheSize += queryStatsForPackage.getCacheBytes();
                        continue;
                    }
                    catch (final RuntimeException ex) {}
                    catch (final IOException ex) {}
                    catch (final PackageManager$NameNotFoundException ex2) {}
                    mkw.a.c().h(ex).E(3143).o("queryStatsForPackage() call failed");
                }
            }
            return packageStats;
        }
        catch (final Error ex) {}
        catch (final RuntimeException ex3) {}
        a.m(mkw.a.c(), "StorageStatsManager is not available", '\u0c48', ex);
        return null;
    }
}
