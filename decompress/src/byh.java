import java.util.concurrent.Executor;
import android.app.job.JobParameters;
import java.util.concurrent.ExecutorService;
import java.util.Iterator;
import android.app.job.JobInfo$Builder;
import android.content.ComponentName;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.app.job.JobService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class byh extends JobService
{
    private static final long a;
    
    static {
        a = TimeUnit.DAYS.toMillis(1L);
    }
    
    public static boolean f(final Context context, final Class clazz) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return false;
        }
        while (true) {
            for (final JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                if (jobInfo.getId() == 216934020) {
                    final JobInfo$Builder setRequiresCharging = new JobInfo$Builder(216934020, new ComponentName(context, clazz)).setPersisted(true).setRequiresCharging(true);
                    final long a = byh.a;
                    final JobInfo build = setRequiresCharging.setPeriodic(a).build();
                    return (jobInfo != null && jobInfo.isRequireCharging() == build.isRequireCharging() && jobInfo.getIntervalMillis() == a) || jobScheduler.schedule(build) == 1;
                }
            }
            JobInfo jobInfo = null;
            continue;
        }
    }
    
    public abstract oey c();
    
    public abstract oey d();
    
    protected abstract ExecutorService e();
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        ofi.w(odg.i(oet.q(this.c()), new byf(this), this.e()), new byg(this, jobParameters), this.e());
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return true;
    }
}
