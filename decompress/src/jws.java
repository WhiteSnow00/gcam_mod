import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import android.util.Log;
import android.os.WorkSource;
import android.os.Process;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jws
{
    private static final Method a;
    private static final Method b;
    
    static {
        Process.myUid();
        final Method method = null;
        Method method2;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE);
        }
        catch (final Exception ex) {
            method2 = null;
        }
        a = method2;
        Method method3;
        try {
            method3 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        }
        catch (final Exception ex2) {
            method3 = method;
        }
        b = method3;
        try {
            WorkSource.class.getMethod("size", (Class<?>[])new Class[0]);
        }
        catch (final Exception ex3) {}
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        }
        catch (final Exception ex4) {}
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        }
        catch (final Exception ex5) {}
        try {
            WorkSource.class.getMethod("createWorkChain", (Class<?>[])new Class[0]);
        }
        catch (final Exception ex6) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", (Throwable)ex6);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        }
        catch (final Exception ex7) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", (Throwable)ex7);
        }
    }
    
    public static WorkSource a(Context context, String a) {
        if (context != null && context.getPackageManager() != null && a != null) {
            try {
                final ApplicationInfo b = jwu.b(context).b((String)a, 0);
                if (b == null) {
                    String concat;
                    if (((String)a).length() != 0) {
                        concat = "Could not get applicationInfo from package: ".concat((String)a);
                    }
                    else {
                        concat = new String("Could not get applicationInfo from package: ");
                    }
                    Log.e("WorkSourceUtil", concat);
                    return null;
                }
                final int uid = b.uid;
                context = (Context)new WorkSource();
                final Method b2 = jws.b;
                if (b2 != null) {
                    try {
                        b2.invoke(context, uid, a);
                    }
                    catch (final Exception a) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)a);
                    }
                }
                else {
                    a = (Exception)jws.a;
                    if (a != null) {
                        try {
                            ((Method)a).invoke(context, uid);
                        }
                        catch (final Exception a) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)a);
                        }
                    }
                }
                return (WorkSource)context;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                String concat2;
                if (((String)a).length() != 0) {
                    concat2 = "Could not find package: ".concat((String)a);
                }
                else {
                    concat2 = new String("Could not find package: ");
                }
                Log.e("WorkSourceUtil", concat2);
                return null;
            }
        }
        return null;
    }
    
    public static boolean b(final Context context) {
        return context != null && context.getPackageManager() != null && jwu.b(context).a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }
}
