import android.os.SystemClock;
import android.hardware.camera2.TotalCaptureResult;
import android.content.res.Resources$Theme;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;
import android.hardware.SensorManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fae extends how
{
    private static final nsd j;
    private static final float k;
    public final fam a;
    public final flo b;
    public final SensorManager c;
    public final Sensor d;
    public final Sensor e;
    public final SensorEventListener f;
    public final bxu g;
    public boolean h;
    private lfu l;
    private final Resources m;
    private float n;
    private final hkc o;
    private final cxl p;
    
    static {
        j = nsd.g("com/google/android/apps/camera/longexposure/LongExposureSmartsProcessor");
        k = (float)Math.toRadians(20.0);
    }
    
    public fae(final Resources m, final Context context, final hkc o, final flo b, final cxl p7, final ScheduledExecutorService scheduledExecutorService, final bxu g) {
        super(scheduledExecutorService);
        this.n = Float.POSITIVE_INFINITY;
        this.m = m;
        this.a = new fam(new float[] { 0.0f, 0.0f, 1.0f }, fae.k);
        this.o = o;
        this.b = b;
        this.p = p7;
        final SensorManager c = (SensorManager)context.getSystemService("sensor");
        this.c = c;
        this.d = c.getDefaultSensor(9);
        this.e = c.getDefaultSensor(4);
        this.f = (SensorEventListener)new fad(this);
        this.g = g;
    }
    
    private final boolean i() {
        final lfu l = this.l;
        return l != null && l == lfu.a;
    }
    
    @Override
    public final void c(final lfg lfg) {
        super.c(lfg);
        final lfu l = lfg.l();
        nov.z(l);
        this.l = l;
        final float b = cxv.b(this.p, l);
        if (b == Float.POSITIVE_INFINITY) {
            a.l(fae.j.b(), "Unknown device type. Advice will not fire.", '\u05d0');
        }
        this.n = b;
    }
    
    @Override
    protected final hov d() {
        final hpf a = hpg.a();
        a.b = this.m.getString(2131952172);
        a.c = this.m.getDrawable(2131231290, (Resources$Theme)null);
        a.d = new fac(this, 1);
        a.g = new fac(this);
        a.h = new fac(this, 2);
        a.d(2000L);
        final hpg a2 = a.a();
        final hou a3 = hov.a();
        a3.a = a2;
        a3.b(3);
        a3.c(5);
        return a3.a();
    }
    
    @Override
    protected final boolean e(final ljm ljm) {
        if (!this.h) {
            String s = (String)this.o.c(hjq.i);
            if (this.i()) {
                s = (String)this.o.c(hjq.j);
            }
            if (!s.equals("on")) {
                final Long n = (Long)ljm.d(TotalCaptureResult.SENSOR_EXPOSURE_TIME);
                final Integer n2 = (Integer)ljm.d(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                final Integer n3 = (Integer)ljm.d(TotalCaptureResult.SENSOR_SENSITIVITY);
                if (n != null && n2 != null && n3 != null) {
                    final fam a = this.a;
                    final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    final boolean b = a.e >= 5 && a.f >= 5 && elapsedRealtimeNanos - a.c >= 1000000L && elapsedRealtimeNanos - a.d >= 1000000L && !this.i();
                    nov.z(n);
                    final long longValue = n;
                    nov.z(n2);
                    final int intValue = n2;
                    nov.z(n3);
                    final float n4 = (float)longValue;
                    final float n5 = n3;
                    final float n6 = (float)intValue;
                    if (!b && n4 * 1.0E-6f * n5 * n6 > this.n) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    protected final boolean f(final ljm ljm) {
        final Long n = (Long)ljm.d(TotalCaptureResult.SENSOR_EXPOSURE_TIME);
        final Integer n2 = (Integer)ljm.d(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        final Integer n3 = (Integer)ljm.d(TotalCaptureResult.SENSOR_SENSITIVITY);
        return n == null || n2 == null || n3 == null;
    }
    
    @Override
    public final void t() {
        super.t();
        this.i.execute(new fac(this, 4));
    }
    
    @Override
    public final void u() {
        this.i.execute(new fac(this, 3));
    }
}
