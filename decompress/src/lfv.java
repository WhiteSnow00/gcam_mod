import java.util.Set;
import java.util.Arrays;
import java.util.List;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.graphics.Rect;
import android.util.Range;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public class lfv implements lfg
{
    public final lfg a;
    
    protected lfv(final lfg a) {
        this.a = a;
    }
    
    @Override
    public final boolean A() {
        return this.a.A();
    }
    
    @Override
    public final boolean B() {
        return this.a.B();
    }
    
    @Override
    public final boolean C() {
        return this.a.C();
    }
    
    @Override
    public final boolean D() {
        return this.a.D();
    }
    
    @Override
    public final boolean E() {
        return this.a.E();
    }
    
    @Override
    public final boolean F() {
        return this.a.F();
    }
    
    @Override
    public final boolean G() {
        return this.a.G();
    }
    
    @Override
    public final boolean H() {
        final lfg a = this.a;
        final boolean d = ((lff)a).c.d;
        boolean contains = false;
        if (d) {
            try {
                contains = ((lff)a).x().contains(CaptureRequest.CONTROL_ENABLE_ZSL);
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                contains = contains;
            }
        }
        return contains;
    }
    
    @Override
    public final boolean I() {
        return this.a.I();
    }
    
    @Override
    public final boolean J() {
        final int[] array = (int[])((lff)this.a).n(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, lff.d);
        final int length = array.length;
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= length) {
                break;
            }
            if (array[n] == 1) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    @Override
    public final byte[] K() {
        final lfg a = this.a;
        final byte[] g = lff.g;
        if (jlh.a != null) {
            return (byte[])((lff)a).n(jlh.a, lff.g);
        }
        return g;
    }
    
    @Override
    public final int L() {
        throw null;
    }
    
    @Override
    public final float a() {
        return this.a.a();
    }
    
    @Override
    public final float b() {
        final lff lff = (lff)this.a;
        if (lff.c.g) {
            final Range range = (Range)lff.m(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                return (float)range.getUpper();
            }
        }
        return (float)lff.n(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, 1.0f);
    }
    
    @Override
    public final float c() {
        final lff lff = (lff)this.a;
        if (lff.c.g) {
            final Range range = (Range)lff.m(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                return (float)range.getLower();
            }
        }
        return 1.0f;
    }
    
    @Override
    public final int d() {
        return this.a.d();
    }
    
    @Override
    public final int e() {
        return this.a.e();
    }
    
    @Override
    public final int f() {
        return this.a.f();
    }
    
    @Override
    public final long g(final int n, final kre kre) {
        return this.a.g(n, kre);
    }
    
    @Override
    public final Rect h() {
        return this.a.h();
    }
    
    @Override
    public final lfj j() {
        return ((lff)this.a).a;
    }
    
    @Override
    public final lft k() {
        return this.a.k();
    }
    
    @Override
    public final lfu l() {
        return this.a.l();
    }
    
    @Override
    public final Object m(final CameraCharacteristics$Key cameraCharacteristics$Key) {
        return this.a.m(cameraCharacteristics$Key);
    }
    
    @Override
    public final Object n(final CameraCharacteristics$Key cameraCharacteristics$Key, final Object o) {
        return this.a.n(cameraCharacteristics$Key, o);
    }
    
    @Override
    public final Object o(final CameraCharacteristics$Key cameraCharacteristics$Key) {
        return this.a.o(cameraCharacteristics$Key);
    }
    
    @Override
    public final List p() {
        throw null;
    }
    
    @Override
    public final List q() {
        throw null;
    }
    
    @Override
    public final List r() {
        throw null;
    }
    
    @Override
    public final List s() {
        return this.a.s();
    }
    
    @Override
    public final List t() {
        return this.a.t();
    }
    
    @Override
    public final List u() {
        return Arrays.asList((Range[])((lff)this.a).o(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }
    
    @Override
    public final List v(final int n) {
        return this.a.v(n);
    }
    
    @Override
    public final List w() {
        return this.a.w();
    }
    
    @Override
    public final Set x() {
        throw null;
    }
    
    @Override
    public final Set y() {
        return this.a.y();
    }
    
    @Override
    public final Set z() {
        return ((lff)this.a).b;
    }
}
