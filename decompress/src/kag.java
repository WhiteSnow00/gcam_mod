import android.util.Log;
import android.app.job.JobInfo$Builder;
import android.content.ComponentName;
import android.os.PersistableBundle;
import android.app.job.JobScheduler;
import android.app.job.JobParameters;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kag
{
    private static final long a;
    
    static {
        a = TimeUnit.MINUTES.toMillis(15L);
    }
    
    public static void a(final Context context, final JobParameters jobParameters) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        final PersistableBundle extras = new PersistableBundle(jobParameters.getExtras());
        extras.putLong("debug_rescheduled_because_non_idle", System.currentTimeMillis());
        final long long1 = extras.getLong("non_idle_retry_minimum_latency_ms", kag.a);
        final JobInfo$Builder setRequiredNetworkType = new JobInfo$Builder(jobParameters.getJobId(), new ComponentName(context, "com.google.android.gms.learning.internal.training.InAppJobService")).setRequiredNetworkType(extras.getInt("job_info_required_network_type", 2));
        final int int1 = extras.getInt("job_info_requires_device_idle", 1);
        final boolean b = false;
        final JobInfo$Builder setMinimumLatency = setRequiredNetworkType.setRequiresDeviceIdle(int1 == 1).setRequiresCharging(extras.getInt("job_info_requires_charging", 1) == 1).setExtras(extras).setMinimumLatency(long1);
        final long long2 = extras.getLong("job_info_override_deadline_ms", 0L);
        if (long2 > 0L) {
            setMinimumLatency.setOverrideDeadline(long2);
        }
        if (zv.s(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            setMinimumLatency.setPersisted(extras.getInt("job_info_persisted", 1) == 1 || b);
        }
        if (jobScheduler.schedule(setMinimumLatency.build()) != 1 && Log.isLoggable("brella.InAppJobSvc", 5)) {
            final int jobId = jobParameters.getJobId();
            final StringBuilder sb = new StringBuilder(36);
            sb.append("Failed to reschedule job ");
            sb.append(jobId);
            Log.w("brella.InAppJobSvc", sb.toString());
        }
    }
}
