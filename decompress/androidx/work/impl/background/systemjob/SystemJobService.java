// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemjob;

import java.util.Arrays;
import android.text.TextUtils;
import android.app.Application;
import android.os.PersistableBundle;
import android.app.job.JobParameters;
import java.util.HashMap;
import java.util.Map;
import android.app.job.JobService;

public class SystemJobService extends JobService implements ajm
{
    private static final String a;
    private akh b;
    private final Map c;
    
    static {
        a = aiy.b("SystemJobService");
    }
    
    public SystemJobService() {
        this.c = new HashMap();
    }
    
    private static String b(final JobParameters jobParameters) {
        try {
            final PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
        }
        catch (final NullPointerException ex) {}
        return null;
    }
    
    public final void a(final String s, final boolean b) {
        final aiy a = aiy.a();
        String.format("%s executed on JobScheduler", s);
        a.d(new Throwable[0]);
        synchronized (this.c) {
            final JobParameters jobParameters = this.c.remove(s);
            monitorexit(this.c);
            if (jobParameters != null) {
                this.jobFinished(jobParameters, b);
            }
        }
    }
    
    public final void onCreate() {
        super.onCreate();
        try {
            final akh e = akh.e(this.getApplicationContext());
            this.b = e;
            e.f.b(this);
        }
        catch (final IllegalStateException ex) {
            if (Application.class.equals(this.getApplication().getClass())) {
                aiy.a();
                aiy.g(SystemJobService.a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final akh b = this.b;
        if (b != null) {
            b.f.c(this);
        }
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        if (this.b == null) {
            aiy.a().d(new Throwable[0]);
            this.jobFinished(jobParameters, true);
            return false;
        }
        final String b = b(jobParameters);
        if (TextUtils.isEmpty((CharSequence)b)) {
            aiy.a();
            aiy.e(SystemJobService.a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        Object c = this.c;
        synchronized (c) {
            if (this.c.containsKey(b)) {
                final aiy a = aiy.a();
                String.format("Job is already being executed by SystemJobService: %s", b);
                a.d(new Throwable[0]);
                return false;
            }
            final aiy a2 = aiy.a();
            String.format("onStartJob for %s", b);
            a2.d(new Throwable[0]);
            this.c.put(b, jobParameters);
            monitorexit(c);
            c = new cxa();
            if (jobParameters.getTriggeredContentUris() != null) {
                Arrays.asList(jobParameters.getTriggeredContentUris());
            }
            if (jobParameters.getTriggeredContentAuthorities() != null) {
                Arrays.asList(jobParameters.getTriggeredContentAuthorities());
            }
            jobParameters.getNetwork();
            this.b.i(b, (cxa)c);
            return true;
        }
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        if (this.b == null) {
            aiy.a().d(new Throwable[0]);
            return true;
        }
        final String b = b(jobParameters);
        if (TextUtils.isEmpty((CharSequence)b)) {
            aiy.a();
            aiy.e(SystemJobService.a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        final aiy a = aiy.a();
        String.format("onStopJob for %s", b);
        a.d(new Throwable[0]);
        synchronized (this.c) {
            this.c.remove(b);
            monitorexit(this.c);
            this.b.h(b);
            final ajp f = this.b.f;
            final Object g = f.g;
            synchronized (this.c) {
                final boolean contains = f.f.contains(b);
                monitorexit(this.c);
                return !contains;
            }
        }
    }
}
