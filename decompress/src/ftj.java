import android.graphics.Rect;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftj implements fva
{
    private final int a;
    private final boolean b;
    private final fkh c;
    private final duq d;
    private final hys e;
    private final AtomicReference f;
    private volatile int g;
    private volatile float h;
    private volatile int i;
    private volatile float j;
    private volatile boolean k;
    private volatile int l;
    
    public ftj(final dpy dpy, final lfg lfg, final cxl cxl, final fkh c, final duq d, final hys e) {
        final AtomicReference f = new AtomicReference();
        this.f = f;
        boolean b = true;
        this.l = 1;
        this.k = false;
        this.a = (int)lfg.n(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY, 0);
        if (!cxl.k(cxx.s)) {
            final cxo a = cxr.a;
            cxl.c();
            b = false;
        }
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        dpy.f(new fti(f), odx.a);
    }
    
    private final boolean b(final gzn gzn, final int n) {
        final long millis = TimeUnit.NANOSECONDS.toMillis(gzn.c);
        final int e = gzn.e;
        return millis < n || e < this.a;
    }
    
    private static final boolean c(final gzn gzn, final float n) {
        final int width = gzn.s.width();
        final Rect n2 = gzn.n;
        int width2;
        if (n2 != null) {
            width2 = n2.width();
        }
        else {
            width2 = width;
        }
        return width / (float)width2 < n;
    }
    
    @Override
    public final int a() {
        final gzn gzn = this.f.get();
        if (gzn == null) {
            if (!this.k) {
                this.k = true;
            }
            return this.l;
        }
        this.k = false;
        if (this.c.c()) {
            return this.l = 3;
        }
        if (!(boolean)this.d.a().aQ() && !(boolean)this.e.a().aQ()) {
            if (this.b) {
                this.g = 33;
                this.h = 1.2f;
                this.i = 66;
                this.j = 3.0f;
            }
            else {
                this.g = 33;
                this.h = 1.2f;
                this.i = this.g;
                this.j = this.h;
            }
            if (c(gzn, this.h) && this.b(gzn, this.g)) {
                this.l = 3;
            }
            else if (c(gzn, this.j) && this.b(gzn, this.i)) {
                this.l = 2;
            }
            else {
                this.l = 1;
            }
            return this.l;
        }
        return this.l = 1;
    }
}
