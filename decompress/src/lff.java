import android.graphics.SurfaceTexture;
import java.util.Collections;
import java.util.Arrays;
import android.hardware.camera2.CameraCharacteristics$Key;
import java.util.ArrayList;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Range;
import java.util.List;
import android.hardware.camera2.CameraCharacteristics;
import java.util.Collection;
import java.util.Set;
import android.hardware.camera2.params.StreamConfigurationMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lff implements lfg
{
    public final lfj a;
    public final noi b;
    public final liy c;
    private final Object h;
    private final kse i;
    private final krr j;
    private StreamConfigurationMap k;
    private final kqk l;
    
    public lff(final lfj a, final kqk l, final Set set, final liy c, final kse i, final krr krr) {
        this.k = null;
        this.a = a;
        this.l = l;
        this.b = noi.F(set);
        this.c = c;
        this.i = i;
        this.j = krr.a("Characteristics");
        this.h = new Object();
    }
    
    @Override
    public final boolean A() {
        return this.I() && this.t().size() > 1;
    }
    
    @Override
    public final boolean B() {
        final Integer n = (Integer)this.m(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        return n != null && n > 0;
    }
    
    @Override
    public final boolean C() {
        final Integer n = (Integer)this.m(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        final Float n2 = (Float)this.m(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        return n != null && n > 0 && n2 != null && n2 > 0.0f;
    }
    
    @Override
    public final boolean D() {
        final Float n = (Float)this.m(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (n != null) {
            return n > 0.0f;
        }
        final List q = this.q();
        return q.contains(1) || q.contains(2) || q.contains(4) || q.contains(3);
    }
    
    @Override
    public final boolean E() {
        final Range range = (Range)this.m(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        boolean b = true;
        if (range != null) {
            if (range.getLower() != null && (int)range.getLower() != 0) {
                return b;
            }
            if (range.getUpper() != null) {
                if ((int)range.getUpper() != 0) {
                    return true;
                }
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final boolean F() {
        return this.G() || this.l() == lfu.a;
    }
    
    @Override
    public final boolean G() {
        return (boolean)this.n(CameraCharacteristics.FLASH_INFO_AVAILABLE, false);
    }
    
    @Override
    public final boolean H() {
        throw null;
    }
    
    @Override
    public final boolean I() {
        final int[] array = (int[])this.n(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, lff.d);
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == 11) {
                return this.b.size() > 1;
            }
        }
        return false;
    }
    
    @Override
    public final boolean J() {
        throw null;
    }
    
    @Override
    public final byte[] K() {
        throw null;
    }
    
    @Override
    public final int L() {
        final int intValue = (int)this.o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        switch (intValue) {
            default: {
                final StringBuilder sb = new StringBuilder(61);
                sb.append("Invalid or Unknown INFO_SUPPORTED_HARDWARE_LEVEL: ");
                sb.append(intValue);
                throw new IllegalStateException(sb.toString());
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 1;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    @Override
    public final float a() {
        if (!this.E()) {
            return -1.0f;
        }
        final Rational rational = (Rational)this.n(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, Rational.ZERO);
        return rational.getNumerator() / (float)rational.getDenominator();
    }
    
    @Override
    public final float b() {
        throw null;
    }
    
    @Override
    public final float c() {
        throw null;
    }
    
    @Override
    public final int d() {
        if (!this.E()) {
            return -1;
        }
        return (int)((Range)this.o(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getUpper();
    }
    
    @Override
    public final int e() {
        if (!this.E()) {
            return -1;
        }
        return (int)((Range)this.o(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getLower();
    }
    
    @Override
    public final int f() {
        return (int)this.o(CameraCharacteristics.SENSOR_ORIENTATION);
    }
    
    @Override
    public final long g(final int n, final kre kre) {
        final StreamConfigurationMap i = this.i();
        if (i == null) {
            return 0L;
        }
        return i.getOutputMinFrameDuration(n, krf.a(kre));
    }
    
    @Override
    public final Rect h() {
        return (Rect)this.o(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }
    
    public final StreamConfigurationMap i() {
        synchronized (this.h) {
            if (this.k == null) {
                try {
                    try {
                        final kse i = this.i;
                        final String a = this.a.a;
                        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 31);
                        sb.append("StreamConfigurationMap(");
                        sb.append(a);
                        sb.append(")#create");
                        i.f(sb.toString());
                        this.k = (StreamConfigurationMap)this.m(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        this.i.g();
                    }
                    finally {}
                }
                catch (final Exception ex) {
                    final krr j = this.j;
                    final String value = String.valueOf(this.a.a);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Unable to obtain StreamConfigurationMap for camera ".concat(value);
                    }
                    else {
                        concat = new String("Unable to obtain StreamConfigurationMap for camera ");
                    }
                    j.e(concat, ex);
                    this.i.g();
                    return null;
                }
                this.i.g();
            }
            return this.k;
        }
    }
    
    @Override
    public final lfj j() {
        return this.a;
    }
    
    @Override
    public final lft k() {
        final int[] array = (int[])this.n(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES, lff.d);
        final int length = array.length;
        final ArrayList list = new ArrayList(length);
        for (int i = 0; i < length; ++i) {
            list.add((Object)lft.a(array[i]));
        }
        if (list.contains(lft.b)) {
            return lft.b;
        }
        if (list.contains(lft.c)) {
            return lft.c;
        }
        return lft.d;
    }
    
    @Override
    public final lfu l() {
        final int intValue = (int)this.o(CameraCharacteristics.LENS_FACING);
        if (intValue == 1) {
            return lfu.b;
        }
        if (intValue == 0) {
            return lfu.a;
        }
        return lfu.c;
    }
    
    @Override
    public final Object m(final CameraCharacteristics$Key cameraCharacteristics$Key) {
        return this.l.a(cameraCharacteristics$Key);
    }
    
    @Override
    public final Object n(final CameraCharacteristics$Key cameraCharacteristics$Key, final Object o) {
        final kqk l = this.l;
        cameraCharacteristics$Key.getClass();
        o.getClass();
        final Object a = l.a.a(cameraCharacteristics$Key);
        if (a != null) {
            return a;
        }
        return o;
    }
    
    @Override
    public final Object o(final CameraCharacteristics$Key cameraCharacteristics$Key) {
        final kqk l = this.l;
        cameraCharacteristics$Key.getClass();
        final Object a = l.a.a(cameraCharacteristics$Key);
        a.getClass();
        return a;
    }
    
    @Override
    public final List p() {
        return ofi.D((int[])this.n(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, lff.d));
    }
    
    @Override
    public final List q() {
        return ofi.D((int[])this.n(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, lff.d));
    }
    
    @Override
    public final List r() {
        return ofi.D((int[])this.n(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES, lff.d));
    }
    
    @Override
    public final List s() {
        return och.f((float[])this.n(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS, lff.e));
    }
    
    @Override
    public final List t() {
        final float[] array = (float[])this.l.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        array.getClass();
        Arrays.sort(array);
        final ArrayList m = nqb.m();
        for (int length = array.length, i = 0; i < length; ++i) {
            m.add(array[i]);
        }
        return m;
    }
    
    @Override
    public final List u() {
        throw null;
    }
    
    @Override
    public final List v(final int n) {
        final StreamConfigurationMap i = this.i();
        if (i == null) {
            return Collections.emptyList();
        }
        return krf.e(i.getOutputSizes(n));
    }
    
    @Override
    public final List w() {
        final StreamConfigurationMap i = this.i();
        if (i == null) {
            return Collections.emptyList();
        }
        return krf.e(i.getOutputSizes((Class)SurfaceTexture.class));
    }
    
    @Override
    public final Set x() {
        return this.l.a.c();
    }
    
    @Override
    public final Set y() {
        return this.l.a.d();
    }
    
    @Override
    public final Set z() {
        return this.b;
    }
}
