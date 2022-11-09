import android.app.job.JobScheduler;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class cac implements hub, exn
{
    private final kjm a;
    public final Context f;
    protected final Executor g;
    protected final String h;
    public final ewy i;
    
    public cac(final Context f, final Executor g, final kjm a, final ewy i, final String s) {
        this.f = f;
        this.g = g;
        this.a = a;
        this.i = i;
        String concat;
        if (s.length() != 0) {
            concat = "camera/".concat(s);
        }
        else {
            concat = new String("camera/");
        }
        this.h = concat;
    }
    
    public final void c() {
        final JobScheduler jobScheduler = (JobScheduler)this.f.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(351853807);
            jobScheduler.cancel(10281993);
            jobScheduler.cancel(216934020);
        }
    }
    
    @Override
    public final void run() {
        this.a.execute(new cab(this));
    }
}
