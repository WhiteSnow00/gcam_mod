import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kav
{
    private static final Method a;
    private static final Method b;
    
    static {
        final Method method = null;
        Method declaredMethod;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        }
        catch (final NoSuchMethodException ex) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                declaredMethod = null;
            }
            else {
                declaredMethod = null;
            }
        }
        a = declaredMethod;
        Method declaredMethod2;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", (Class<?>[])new Class[0]);
        }
        catch (final NoSuchMethodException ex2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
                declaredMethod2 = method;
            }
            else {
                declaredMethod2 = method;
            }
        }
        b = declaredMethod2;
    }
    
    public static void a(Context ex, final JobInfo jobInfo) {
        final JobScheduler jobScheduler = (JobScheduler)((Context)ex).getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (kav.a != null && ((Context)ex).checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            ex = (InvocationTargetException)kav.b;
            int intValue = 0;
            Label_0103: {
                Label_0101: {
                    if (ex != null) {
                        try {
                            ex = (InvocationTargetException)((Method)ex).invoke(UserHandle.class, new Object[0]);
                            if (ex != null) {
                                intValue = (int)ex;
                                break Label_0103;
                            }
                            break Label_0101;
                        }
                        catch (final InvocationTargetException ex) {}
                        catch (final IllegalAccessException ex2) {}
                        if (Log.isLoggable("JobSchedulerCompat", 6)) {
                            Log.e("JobSchedulerCompat", "myUserId invocation illegal", (Throwable)ex);
                            intValue = 0;
                            break Label_0103;
                        }
                        intValue = 0;
                        break Label_0103;
                    }
                }
                intValue = 0;
            }
            ex = (InvocationTargetException)kav.a;
            if (ex != null) {
                try {
                    ex = (InvocationTargetException)((Method)ex).invoke(jobScheduler, jobInfo, "com.google.android.gms", intValue, "DispatchAlarm");
                    if (ex != null) {
                        ((Integer)ex).intValue();
                    }
                    return;
                }
                catch (final InvocationTargetException ex) {}
                catch (final IllegalAccessException ex3) {}
                Log.e("DispatchAlarm", "error calling scheduleAsPackage", (Throwable)ex);
            }
            jobScheduler.schedule(jobInfo);
            return;
        }
        jobScheduler.schedule(jobInfo);
    }
}
