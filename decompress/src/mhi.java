import android.app.Application;
import java.util.concurrent.Executor;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mhi implements mgx
{
    public final ofb a;
    public final oui b;
    
    public mhi(final mgv mgv, final Context context, final ofb a, final oui b, final pii pii, final pii pii2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        mgv.a(a, b, pii);
        final Application application = (Application)context;
        this.a = a;
        this.b = b;
        nov.F(new mhf(this, context));
        nov.F(new mhg(pii2));
    }
    
    public final void a() {
        synchronized (this) {
            final int a = ((mhe)this.b.get()).a;
        }
    }
    
    @Override
    public final void k() {
        ofi.p(new mhh(this), this.a);
    }
}
