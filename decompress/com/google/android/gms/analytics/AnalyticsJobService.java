// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.analytics;

import android.content.Intent;
import android.app.job.JobParameters;
import android.content.Context;
import android.app.job.JobService;

public final class AnalyticsJobService extends JobService implements jnt
{
    private jnu a;
    
    private final jnu c() {
        if (this.a == null) {
            this.a = new jnu((Context)this);
        }
        return this.a;
    }
    
    public final boolean a(final int n) {
        return this.stopSelfResult(n);
    }
    
    public final void b(final JobParameters jobParameters) {
        this.jobFinished(jobParameters, false);
    }
    
    public final void onCreate() {
        super.onCreate();
        this.c().a();
    }
    
    public final void onDestroy() {
        this.c().b();
        super.onDestroy();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        this.c().e(intent, n2);
        return 2;
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        final jnu c = this.c();
        final jmf c2 = jmf.c(c.b);
        final jnj d = c2.d();
        final String string = jobParameters.getExtras().getString("action");
        final jmv c3 = c2.c;
        d.r("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            c.c(new jnr(c, d, jobParameters));
        }
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return false;
    }
}
