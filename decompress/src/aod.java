import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aod
{
    private static final String a;
    private static final WeakHashMap b;
    
    static {
        a = aiy.b("WakeLocks");
        b = new WeakHashMap();
    }
    
    public static PowerManager$WakeLock a(Context b, String string) {
        final PowerManager powerManager = (PowerManager)b.getApplicationContext().getSystemService("power");
        final StringBuilder sb = new StringBuilder();
        sb.append("WorkManager: ");
        sb.append(string);
        string = sb.toString();
        final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, string);
        b = (Context)aod.b;
        synchronized (b) {
            ((WeakHashMap<PowerManager$WakeLock, String>)b).put(wakeLock, string);
            return wakeLock;
        }
    }
    
    public static void b() {
        final HashMap hashMap = new HashMap();
        Object o = aod.b;
        monitorenter(o);
        try {
            hashMap.putAll((Map)o);
            monitorexit(o);
            o = hashMap.keySet().iterator();
            while (((Iterator)o).hasNext()) {
                final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)((Iterator)o).next();
                if (powerManager$WakeLock != null && powerManager$WakeLock.isHeld()) {
                    final String format = String.format("WakeLock held for %s", hashMap.get(powerManager$WakeLock));
                    aiy.a();
                    aiy.g(aod.a, format, new Throwable[0]);
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
