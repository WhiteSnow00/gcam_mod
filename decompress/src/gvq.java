import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.content.res.Resources$Theme;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.ScheduledExecutorService;
import android.graphics.Rect;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvq extends how
{
    public final flo a;
    public final bxu b;
    public boolean c;
    private final Resources d;
    private final klj e;
    private Rect f;
    
    public gvq(final Resources d, final flo a, final klj e, final ScheduledExecutorService scheduledExecutorService, final bxu b) {
        super(scheduledExecutorService);
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
    }
    
    @Override
    public final void c(final lfg lfg) {
        super.c(lfg);
        this.f = (Rect)lfg.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }
    
    @Override
    protected final hov d() {
        final hpf a = hpg.a();
        a.b = this.d.getString(2131952431);
        a.c = this.d.getDrawable(2131231517, (Resources$Theme)null);
        a.d = new gvp(this, 1);
        a.g = new gvp(this);
        a.h = new gvp(this, 2);
        a.d(5000L);
        final hpg a2 = a.a();
        final hou a3 = hov.a();
        a3.a = a2;
        a3.b(30);
        a3.c(5);
        return a3.a();
    }
    
    @Override
    protected final boolean e(final ljm ljm) {
        final boolean c = this.c;
        final boolean b = false;
        if (!c) {
            final Face[] array = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
            boolean b2;
            if (array == null) {
                b2 = b;
            }
            else {
                for (int length = array.length, i = 0; i < length; ++i) {
                    final Rect bounds = array[i].getBounds();
                    final int width = bounds.width();
                    final Rect f = this.f;
                    f.getClass();
                    final int width2 = f.width();
                    final int height = bounds.height();
                    final Rect f2 = this.f;
                    f2.getClass();
                    b2 = b;
                    if (width / (float)width2 * (height / (float)f2.height()) < 0.05f) {
                        return b2;
                    }
                }
                final int length2 = array.length;
                if (length2 > 0 && length2 <= 1) {
                    if ((float)this.e.aQ() < 1.0f) {
                        return false;
                    }
                    b2 = true;
                }
                else {
                    b2 = b;
                }
            }
            return b2;
        }
        return false;
    }
}
