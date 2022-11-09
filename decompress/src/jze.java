import android.app.job.JobParameters;

// 
// Decompiled by Procyon v0.6.0
// 

final class jze implements oen
{
    final /* synthetic */ JobParameters a;
    final /* synthetic */ jzf b;
    
    public jze(final jzf b, final JobParameters a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        if (t instanceof jzr) {
            return;
        }
        final jzf b = this.b;
        b.a(b.getApplicationContext()).c.execute(new jzd(t));
    }
}
