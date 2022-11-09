import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import android.os.Process;
import android.content.Context;
import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mfs
{
    static volatile boolean a;
    private static volatile ActivityManager c;
    
    static {
        mfs.c = null;
    }
    
    private mfs() {
    }
    
    public static ActivityManager a(final Context context) {
        if (mfs.c == null) {
            synchronized (mfs.class) {
                if (mfs.c == null) {
                    final Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    mfs.c = (ActivityManager)systemService;
                }
            }
        }
        return mfs.c;
    }
    
    public static String b() {
        final int myPid = Process.myPid();
        Object line = null;
        String trim = null;
        final String s = null;
        if (myPid <= 0) {
            trim = s;
        }
        else {
            Object o;
            try {
                final StringBuilder sb = new StringBuilder(25);
                sb.append("/proc/");
                sb.append(myPid);
                sb.append("/cmdline");
                final BufferedReader bufferedReader = new BufferedReader(new FileReader(sb.toString()));
                try {
                    line = bufferedReader.readLine();
                    ((IOException)line).getClass();
                    line = (trim = ((String)line).trim());
                    try {
                        bufferedReader.close();
                        return trim;
                    }
                    catch (final IOException ex) {
                        return trim;
                    }
                }
                catch (final IOException line) {}
            }
            catch (final IOException ex2) {
                o = null;
            }
            finally {
                o = line;
            }
            try {
                ((BufferedReader)o).close();
                goto Label_0144;
            }
            catch (final IOException ex3) {}
            if (o != null) {
                ((BufferedReader)o).close();
                trim = s;
            }
        }
        return trim;
    }
    
    public static boolean c(final Context context) {
        final Object systemService = context.getSystemService("activity");
        systemService.getClass();
        final List runningAppProcesses = ((ActivityManager)systemService).getRunningAppProcesses();
        boolean b = true;
        if (runningAppProcesses != null) {
            final String packageName = context.getPackageName();
            final String concat = String.valueOf(packageName).concat(":");
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.importance == 100 && (activityManager$RunningAppProcessInfo.processName.equals(packageName) || activityManager$RunningAppProcessInfo.processName.startsWith(concat))) {
                    return b;
                }
            }
        }
        b = false;
        return b;
    }
}
