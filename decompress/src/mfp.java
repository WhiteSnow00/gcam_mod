import android.content.ComponentCallbacks;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mfp
{
    public final mfr a;
    
    public mfp(final Context context, final mfr a) {
        this.a = a;
        final Application application = (Application)context;
        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)a.a);
        application.registerComponentCallbacks((ComponentCallbacks)a.a);
    }
    
    public final void a(final mfo mfo) {
        final mfr a = this.a;
        mfo.getClass();
        final mfq a2 = a.a;
        final int c = mfq.c;
        a2.a.add(mfo);
    }
    
    public final void b(final mfo mfo) {
        final mfr a = this.a;
        mfo.getClass();
        final mfq a2 = a.a;
        final int c = mfq.c;
        a2.a.remove(mfo);
    }
}
