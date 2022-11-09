import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkj extends kxc
{
    public final lfu a;
    public final bki b;
    public float c;
    public hjb d;
    private final krr e;
    private final klv f;
    private final bkp g;
    
    public bkj(final krr krr, final kjk kjk, final fxu fxu, final dtb dtb, klv f, final klv klv, final eyt eyt, final cxl cxl) {
        this.c = 0.0f;
        this.d = hjb.a;
        final krr a = krr.a("LowLightAfLock");
        this.e = a;
        final lfu l = fxu.l();
        this.a = l;
        if (l == lfu.a) {
            f = klv;
        }
        this.f = f;
        this.b = new bki(cxv.b(cxl, l));
        final String value = String.valueOf(l.name());
        String concat;
        if (value.length() != 0) {
            concat = "cuttlef-af-".concat(value);
        }
        else {
            concat = new String("cuttlef-af-");
        }
        final bkp g = new bkp(fxu, dtb, a, concat);
        kjk.c(g);
        (this.g = g).b();
        kjk.c(f.a(new bkh(this, eyt), odx.a));
    }
    
    @Override
    public final void b(final ljm ljm) {
        final Float n = (Float)ljm.d(CaptureResult.LENS_FOCUS_DISTANCE);
        nov.z(n);
        this.c = n;
        this.g.a(ljm);
        final bki b = this.b;
        final Long n2 = (Long)ljm.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        nov.z(n2);
        final long longValue = n2;
        final Integer n3 = (Integer)ljm.d(CaptureResult.SENSOR_SENSITIVITY);
        nov.z(n3);
        final int intValue = n3;
        final Integer n4 = (Integer)ljm.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        nov.z(n4);
        final float b2 = longValue * 1.0E-6f * intValue * n4;
        b.b = b2;
        if (b2 < b.a) {
            b.c = 0;
        }
        else {
            final int min = Math.min(b.c + 1, 5);
            b.c = min;
            if (min >= 5 && !this.g.c()) {
                if ((int)this.f.aQ() != hjb.a.f) {
                    return;
                }
                final Integer n5 = (Integer)ljm.d(CaptureResult.CONTROL_AF_STATE);
                nov.z(n5);
                if (gzr.a(n5) == gzr.g) {
                    this.e.f("Locking AF");
                    this.f.aR(hjb.b.f);
                }
                return;
            }
        }
        if ((int)this.f.aQ() == hjb.b.f) {
            this.e.f("Unlocking AF");
            this.f.aR(hjb.a.f);
        }
    }
}
