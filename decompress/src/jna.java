import android.app.job.JobScheduler;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.app.AlarmManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jna extends jmc
{
    public boolean a;
    public boolean c;
    private final AlarmManager d;
    private Integer e;
    
    protected jna(final jmf jmf) {
        super(jmf);
        this.d = (AlarmManager)this.d().getSystemService("alarm");
    }
    
    @Override
    protected final void a() {
        try {
            this.c();
            if (jmv.b() > 0L) {
                final Context d = this.d();
                final ActivityInfo receiverInfo = d.getPackageManager().getReceiverInfo(new ComponentName(d, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    this.q("Receiver registered for local dispatch.");
                    this.a = true;
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {}
    }
    
    public final int b() {
        if (this.e == null) {
            final String value = String.valueOf(this.d().getPackageName());
            String concat;
            if (value.length() != 0) {
                concat = "analytics".concat(value);
            }
            else {
                concat = new String("analytics");
            }
            this.e = concat.hashCode();
        }
        return this.e;
    }
    
    public final void c() {
        this.c = false;
        final AlarmManager d = this.d;
        final Context d2 = this.d();
        d.cancel(kau.b(d2, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(d2, "com.google.android.gms.analytics.AnalyticsReceiver")), kau.a));
        final JobScheduler jobScheduler = (JobScheduler)this.d().getSystemService("jobscheduler");
        final int b = this.b();
        this.r("Cancelling job. JobID", b);
        jobScheduler.cancel(b);
    }
}
