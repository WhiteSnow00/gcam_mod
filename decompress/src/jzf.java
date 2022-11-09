import java.util.concurrent.Executor;
import android.app.job.JobParameters;
import android.app.job.JobInfo;
import android.util.Log;
import android.app.job.JobInfo$Builder;
import android.content.ComponentName;
import android.app.job.JobScheduler;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.app.job.JobService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jzf extends JobService
{
    private static final long a;
    
    static {
        a = TimeUnit.DAYS.toMillis(1L);
    }
    
    public static boolean b(final Context context, final Class clazz) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return false;
        }
        final JobInfo pendingJob = jobScheduler.getPendingJob(216934020);
        final JobInfo$Builder setRequiresCharging = new JobInfo$Builder(216934020, new ComponentName(context, clazz)).setPersisted(true).setRequiresCharging(true);
        final long a = jzf.a;
        final JobInfo build = setRequiresCharging.setPeriodic(a).build();
        if (pendingJob != null && pendingJob.isRequireCharging() == build.isRequireCharging()) {
            if (pendingJob.getIntervalMillis() == a) {
                return true;
            }
        }
        try {
            return jobScheduler.schedule(build) == 1;
        }
        catch (final IllegalArgumentException ex) {
            Log.e("ExampleStrDataTtlSvc", "Buggy schedule() implementation!", (Throwable)ex);
            return false;
        }
    }
    
    protected abstract jzm a(final Context p0);
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        ofi.w(this.a((Context)this).b.a(new kpe(TimeUnit.DAYS.toMillis(30L), 1)), new jze(this, jobParameters), odx.a);
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return true;
    }
}
