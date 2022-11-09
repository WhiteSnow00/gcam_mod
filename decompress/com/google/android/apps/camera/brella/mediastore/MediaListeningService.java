// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.brella.mediastore;

import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.ArrayList;
import android.app.job.JobParameters;
import android.app.job.JobInfo$Builder;
import android.content.ComponentName;
import android.app.job.JobScheduler;
import android.app.job.JobInfo$TriggerContentUri;
import android.provider.MediaStore$Images$Media;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import android.app.job.JobService;

public class MediaListeningService extends JobService
{
    private static final nsd d;
    public cai a;
    public ExecutorService b;
    
    static {
        d = nsd.g("com/google/android/apps/camera/brella/mediastore/MediaListeningService");
    }
    
    public static boolean a(final Context context) {
        final JobInfo$TriggerContentUri jobInfo$TriggerContentUri = new JobInfo$TriggerContentUri(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, 1);
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            a.l(MediaListeningService.d.c(), "Cannot get scheduler for media listener service.", '\u011d');
            return false;
        }
        return jobScheduler.schedule(new JobInfo$Builder(371692952, new ComponentName(context, (Class)MediaListeningService.class)).addTriggerContentUri(jobInfo$TriggerContentUri).setTriggerContentUpdateDelay(60000L).setTriggerContentMaxDelay(300000L).build()) == 1;
    }
    
    public final void onCreate() {
        super.onCreate();
        final Context applicationContext = this.getApplicationContext();
        applicationContext.getClass();
        ((cak)((egp)applicationContext).c(cak.class)).bm(this);
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        final Uri[] triggeredContentUris = jobParameters.getTriggeredContentUris();
        int i = 0;
        if (triggeredContentUris != null) {
            final int length = triggeredContentUris.length;
            if (length != 0) {
                final ArrayList list = new ArrayList();
                while (i < length) {
                    final Uri uri = triggeredContentUris[i];
                    uri.getQuery();
                    uri.getAuthority();
                    final niz a = this.a.a(uri);
                    if (a.g()) {
                        list.add(a.c());
                    }
                    ++i;
                }
                ofi.w(oet.q(this.a.b(list)), new caj(this, jobParameters), this.b);
                return true;
            }
        }
        a(this.getApplicationContext());
        return false;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return true;
    }
}
