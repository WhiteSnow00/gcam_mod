import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class jsy implements Runnable
{
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ jsz c;
    
    public jsy(final jsz c, final LifecycleCallback a) {
        this.c = c;
        this.a = a;
        this.b = "ConnectionlessLifecycleHelper";
    }
    
    @Override
    public final void run() {
        final jsz c = this.c;
        if (c.b > 0) {
            final LifecycleCallback a = this.a;
            final Bundle c2 = c.c;
            Bundle bundle;
            if (c2 != null) {
                bundle = c2.getBundle(this.b);
            }
            else {
                bundle = null;
            }
            a.d(bundle);
        }
        if (this.c.b >= 2) {
            this.a.i();
        }
        if (this.c.b >= 3) {
            ((jse)this.a).k();
        }
        if (this.c.b >= 4) {
            this.a.j();
        }
    }
}
