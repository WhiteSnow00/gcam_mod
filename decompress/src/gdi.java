import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdi
{
    public static final nsd a;
    protected final Set b;
    public final ofn c;
    private final Executor d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/lifecycle/CameraAsyncTaskRunner");
    }
    
    public gdi(final Set b, final ofn c, final Executor executor, final kse kse) {
        this.b = b;
        this.c = c;
        this.d = new ksk(executor, kse, "CameraStarter");
    }
    
    public final oey a() {
        final ArrayList list = new ArrayList();
        for (final bsk bsk : this.b) {
            try {
                list.add(bsk.aP());
            }
            finally {
                final Throwable t;
                a.m(gdi.a.b(), "Failed to run task", '\u0710', t);
                list.add(ofi.m(t));
            }
        }
        final oey h = odg.h(ofi.j(list), fzt.c, odx.a);
        knf.f(h, new gdj(this), this.d);
        return h;
    }
}
