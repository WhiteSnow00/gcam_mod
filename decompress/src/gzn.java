import java.util.Arrays;
import android.graphics.PointF;
import java.util.List;
import java.util.HashMap;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.CaptureResult;
import android.graphics.Rect;
import java.util.Map;
import android.hardware.camera2.params.MeteringRectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzn implements Comparable, krc
{
    public final byte A;
    public final MeteringRectangle[] B;
    public final Map C;
    private final lji D;
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final long m;
    public final Rect n;
    public final float o;
    public final gzm[] p;
    public final boolean q;
    public final int r;
    public final Rect s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final float z;
    
    static {
        new MeteringRectangle(0, 0, 0, 0, 0);
    }
    
    public gzn(final lji lji, final int n, final Rect rect) {
        this(lji, n, rect, null, (Rect)lji.d(CaptureResult.SCALER_CROP_REGION));
    }
    
    public gzn(final lji d, int i, final Rect rect, final String a, final Rect n) {
        this.D = d;
        this.a = a;
        final Long n2 = (Long)d.d(CaptureResult.SENSOR_TIMESTAMP);
        final Long value = 0L;
        final long longValue = (long)e(n2, value);
        this.b = longValue;
        this.c = (long)e(d.d(CaptureResult.SENSOR_EXPOSURE_TIME), value);
        this.d = (long)e(d.d(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW), value);
        final Integer n3 = (Integer)d.d(CaptureResult.SENSOR_SENSITIVITY);
        final int n4 = 0;
        final Boolean value2 = false;
        final Integer value3 = 0;
        this.e = (int)e(n3, value3);
        this.f = (int)e(d.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST), value3);
        final Float n5 = (Float)d.d(CaptureResult.LENS_FOCAL_LENGTH);
        final Float value4 = 0.0f;
        this.g = (float)e(n5, value4);
        this.h = (float)e(d.d(CaptureResult.LENS_FOCUS_DISTANCE), value4);
        this.i = (int)e(d.d(CaptureResult.CONTROL_AF_STATE), value3);
        this.j = (int)e(d.d(CaptureResult.CONTROL_AE_STATE), value3);
        this.k = (int)e(d.d(CaptureResult.CONTROL_AWB_STATE), value3);
        final Integer n6 = (Integer)d.d(CaptureResult.LENS_STATE);
        final Integer value5 = 1;
        this.l = (int)e(n6, value5);
        this.n = n;
        if (jlh.c != null) {
            this.m = (long)e(d.d(jlh.c), value);
        }
        else {
            this.m = longValue;
        }
        if (jlh.r != null) {
            this.o = (float)e(d.d(jlh.r), 1.0f);
        }
        else {
            this.o = 1.0f;
        }
        this.r = i;
        this.s = (Rect)e(rect, new Rect());
        if (jli.m != null && d.d(jli.m) != null) {
            final List b = ljj.b(d);
            final int size = b.size();
            this.p = new gzm[size];
            for (i = 0; i < size; ++i) {
                this.p[i] = this.d(gzm.b((ljj)b.get(i)));
            }
        }
        else {
            final Face[] array = (Face[])d.d(CaptureResult.STATISTICS_FACES);
            if (array != null) {
                i = array.length;
            }
            else {
                i = 0;
            }
            this.p = new gzm[i];
            for (int j = 0; j < i; ++j) {
                this.p[j] = this.d(gzm.a(array[j]));
            }
        }
        if (jli.l != null) {
            this.q = (boolean)e(this.D.d(jli.l), value2);
        }
        else {
            this.q = false;
        }
        this.t = (int)e(this.D.d(CaptureResult.CONTROL_MODE), 2);
        this.u = (int)e(this.D.d(CaptureResult.CONTROL_AE_MODE), value5);
        this.B = (MeteringRectangle[])this.D.d(CaptureResult.CONTROL_AF_REGIONS);
        this.z = (float)e(this.D.d(CaptureResult.LENS_APERTURE), value4);
        this.v = (int)e(this.D.d(CaptureResult.CONTROL_AF_MODE), value3);
        this.x = (boolean)e(this.D.d(CaptureResult.CONTROL_AE_LOCK), value2);
        this.w = (int)e(this.D.d(CaptureResult.CONTROL_AWB_MODE), value3);
        this.y = (boolean)e(this.D.d(CaptureResult.CONTROL_AWB_LOCK), value2);
        this.A = (byte)e(this.D.d(CaptureResult.JPEG_QUALITY), 0);
        this.C = new HashMap();
        if (jll.f != null) {
            final byte[] array2 = (byte[])d.d(jll.f);
            if (array2 != null) {
                final nns b2 = dqv.b(array2);
                int c;
                dqt dqt;
                for (c = ((nql)b2).c, i = n4; i < c; ++i) {
                    dqt = b2.get(i);
                    this.C.put(dqt.a, dqt);
                }
            }
        }
    }
    
    private final float a(final float n) {
        return (n - this.n.left) * this.s.width() / this.n.width();
    }
    
    private final float b(final float n) {
        return (n - this.n.top) * this.s.height() / this.n.height();
    }
    
    private final PointF c(final PointF pointF) {
        return new PointF(this.a(pointF.x), this.b(pointF.y));
    }
    
    private final gzm d(final gzm gzm) {
        final Rect a = gzm.a;
        final PointF c = gzm.c;
        final PointF d = gzm.d;
        final PointF e = gzm.e;
        final PointF f = gzm.f;
        final PointF g = gzm.g;
        final PointF h = gzm.h;
        final int i = gzm.i;
        Rect rect;
        if (a != null) {
            rect = new Rect(Math.round(this.a((float)a.left)), Math.round(this.b((float)a.top)), Math.round(this.a((float)a.right)), Math.round(this.b((float)a.bottom)));
        }
        else {
            rect = null;
        }
        final int b = gzm.b;
        PointF c2;
        if (c != null) {
            c2 = this.c(gzm.c);
        }
        else {
            c2 = null;
        }
        PointF c3;
        if (d != null) {
            c3 = this.c(gzm.d);
        }
        else {
            c3 = null;
        }
        PointF c4;
        if (e != null) {
            c4 = this.c(gzm.e);
        }
        else {
            c4 = null;
        }
        PointF c5;
        if (f != null) {
            c5 = this.c(gzm.f);
        }
        else {
            c5 = null;
        }
        PointF c6;
        if (g != null) {
            c6 = this.c(gzm.g);
        }
        else {
            c6 = null;
        }
        PointF c7;
        if (h != null) {
            c7 = this.c(gzm.h);
        }
        else {
            c7 = null;
        }
        return new gzm(i, rect, b, c2, c3, c4, c5, c6, c7, gzm.j, gzm.k, gzm.l);
    }
    
    private static Object e(final Object o, final Object o2) {
        if (o == null) {
            return o2;
        }
        return o;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final String toString() {
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final float g = this.g;
        final int e = this.e;
        final float h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final int l = this.l;
        final String value = String.valueOf(this.n);
        final long m = this.m;
        final float o = this.o;
        final String string = Arrays.toString(this.p);
        final int r = this.r;
        final String value2 = String.valueOf(this.s);
        final String a = this.a;
        final int t = this.t;
        final int u = this.u;
        final int v = this.v;
        final int w = this.w;
        final boolean x = this.x;
        final boolean y = this.y;
        final float z = this.z;
        final byte a2 = this.A;
        final String string2 = Arrays.toString(this.B);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 643 + String.valueOf(string).length() + String.valueOf(value2).length() + String.valueOf(a).length() + String.valueOf(string2).length());
        sb.append("CameraMetadata{, timestampNs=");
        sb.append(b);
        sb.append(", exposureTime=");
        sb.append(c);
        sb.append(", rollingShutterTime=");
        sb.append(d);
        sb.append(", focalLength=");
        sb.append(g);
        sb.append(", sensorSensitivity=");
        sb.append(e);
        sb.append(", focusDistance=");
        sb.append(h);
        sb.append(", aFStatus=");
        sb.append(i);
        sb.append(", aEStatus=");
        sb.append(j);
        sb.append(", aWBStatus=");
        sb.append(k);
        sb.append(", lensStatus=");
        sb.append(l);
        sb.append(", cropRegion=");
        sb.append(value);
        sb.append(", mTimestampBootime=");
        sb.append(m);
        sb.append(", subjectMotion=");
        sb.append(o);
        sb.append(", faces=");
        sb.append(string);
        sb.append(", rotationDegrees=");
        sb.append(r);
        sb.append(", activeArraySize=");
        sb.append(value2);
        sb.append(", physicalId=");
        sb.append(a);
        sb.append(", controlMode=");
        sb.append(t);
        sb.append(", aeMode=");
        sb.append(u);
        sb.append(", aFMode=");
        sb.append(v);
        sb.append(", aWBMode=");
        sb.append(w);
        sb.append(", aELock=");
        sb.append(x);
        sb.append(", aWBLock=");
        sb.append(y);
        sb.append(", lenseAperture=");
        sb.append(z);
        sb.append(", jpegQuality=");
        sb.append(a2);
        sb.append(", autoFocusRegions=");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
