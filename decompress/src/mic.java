import android.app.Activity;
import java.util.HashSet;
import java.util.List;
import android.content.SharedPreferences;
import android.app.Application;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mic extends mhz implements mgx, mfl
{
    private static final nsd a;
    private final mgu b;
    private final Context c;
    private final mfp d;
    private final Executor e;
    private final mhw f;
    private final pii g;
    private final oui h;
    private final pii i;
    private final pii j;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl");
    }
    
    public mic(final mgv mgv, final Context c, final mfp d, final Executor e, final mhw f, final pii g, final oui h, final pii i, final pii j) {
        this.b = mgv.a(e, h, null);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public void c(final Activity activity) {
        this.d.b(this);
        this.q();
    }
    
    @Override
    public void k() {
        this.d.a(this);
    }
    
    public void q() {
        ofi.r(new mib(this), this.e);
    }
}
