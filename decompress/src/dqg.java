import android.hardware.camera2.CameraCharacteristics;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqg extends kxc
{
    public final dpy a;
    private final boa b;
    private final Executor c;
    private final Set d;
    private final jcx e;
    
    public dqg(final dpy a, final boa b, final jcx e, final Executor c) {
        this.d = new HashSet();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    @Override
    public final void b(final ljm ljm) {
        if (this.d.isEmpty()) {
            return;
        }
        this.c.execute(new dqf(this, ljm, this.b.d()));
    }
    
    public final Rect d(final String s) {
        return (Rect)this.e.a(s).m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }
    
    public final void e(final String s) {
        synchronized (this) {
            this.d.add(s);
        }
    }
    
    public final void f(final String s) {
        synchronized (this) {
            this.d.remove(s);
        }
    }
}
