import android.hardware.camera2.CaptureResult;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grp extends kxc
{
    public final kkz a;
    private final Executor b;
    private final Map c;
    
    public grp(final kkz a, final Executor b) {
        this.a = a;
        this.b = b;
        this.c = nqb.h(2);
    }
    
    @Override
    public final void b(final ljm ljm) {
        synchronized (this) {
            final String s = (String)ljm.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            if (s != null) {
                this.c.put(s, ljm);
                if (!s.equals(this.a.d)) {
                    this.b.execute(new gro(this, s));
                }
            }
        }
    }
}
