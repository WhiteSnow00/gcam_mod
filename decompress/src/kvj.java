import java.util.TimeZone;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.location.Location;
import java.io.IOException;
import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvj
{
    private static final double b;
    private static final Long c;
    public final ExifInterface a;
    
    static {
        b = Math.log(2.0);
        c = 1000L;
    }
    
    public kvj(final ExifInterface a) {
        this.a = a;
    }
    
    public static ExifInterface a(final byte[] array) {
        final ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.r(array);
        }
        catch (final IOException ex) {
            Log.w("CAM_CameraExif", "Failed to read EXIF data", (Throwable)ex);
        }
        return exifInterface;
    }
    
    public static kvj b() {
        return new kvj(new ExifInterface());
    }
    
    public static final krb h(final Float n, final Long n2) {
        if (n != null && n2 != null) {
            return new krb((long)(n * n2), n2);
        }
        return null;
    }
    
    private static final krb i(final Double n, final Long n2) {
        final double doubleValue = n;
        final double n3 = n2;
        Double.isNaN(n3);
        return new krb((long)(doubleValue * n3), n2);
    }
    
    public final void c(final int n, final Object o) {
        if (o != null) {
            final ExifInterface a = this.a;
            a.y(a.i(n, o));
        }
    }
    
    public final void d(final Location location) {
        final ExifInterface a = this.a;
        final double latitude = location.getLatitude();
        final double longitude = location.getLongitude();
        final kvh i = a.i(ExifInterface.aR, ExifInterface.w(latitude));
        final kvh j = a.i(ExifInterface.aT, ExifInterface.w(longitude));
        String s;
        if (latitude >= 0.0) {
            s = "N";
        }
        else {
            s = "S";
        }
        final kvh k = a.i(ExifInterface.aQ, s);
        String s2;
        if (longitude >= 0.0) {
            s2 = "E";
        }
        else {
            s2 = "W";
        }
        final kvh l = a.i(ExifInterface.aS, s2);
        if (i != null && j != null && k != null && l != null) {
            a.y(i);
            a.y(j);
            a.y(k);
            a.y(l);
        }
        final ExifInterface a2 = this.a;
        final long time = location.getTime();
        final kvh m = a2.i(ExifInterface.bq, a2.bA.format(time));
        final byte b = 1;
        if (m != null) {
            a2.y(m);
            a2.bB.setTimeInMillis(time);
            final kvh i2 = a2.i(ExifInterface.aW, new krb[] { new krb(a2.bB.get(11), 1L), new krb(a2.bB.get(12), 1L), new krb(a2.bB.get(13), 1L) });
            if (i2 != null) {
                a2.y(i2);
            }
        }
        if (location.hasAltitude()) {
            final ExifInterface a3 = this.a;
            final double altitude = location.getAltitude();
            final int av = ExifInterface.aV;
            final double abs = Math.abs(altitude);
            final double n = ExifInterface.bv;
            Double.isNaN(n);
            final kvh i3 = a3.i(av, new krb((int)(abs * n), ExifInterface.bv));
            byte b2 = b;
            if (altitude >= 0.0) {
                b2 = 0;
            }
            final kvh i4 = a3.i(ExifInterface.aU, b2);
            if (i3 != null) {
                if (i4 != null) {
                    a3.y(i3);
                    a3.y(i4);
                }
            }
        }
    }
    
    public final void e() {
        this.c(ExifInterface.g, Build.MANUFACTURER);
        this.c(ExifInterface.h, Build.MODEL);
    }
    
    public final void f(int n, final int n2, final kra kra, final niz niz) {
        this.e();
        final ExifInterface a = this.a;
        final int ai = ExifInterface.ai;
        final Integer value = n;
        a.y(a.i(ai, value));
        final ExifInterface a2 = this.a;
        n = ExifInterface.aj;
        final Integer value2 = n2;
        a2.y(a2.i(n, value2));
        final ExifInterface a3 = this.a;
        a3.y(a3.i(ExifInterface.a, value));
        final ExifInterface a4 = this.a;
        a4.y(a4.i(ExifInterface.b, value2));
        final ExifInterface a5 = this.a;
        a5.y(a5.i(ExifInterface.j, kvc.b(kra).i));
        if (niz.g()) {
            final lji lji = (lji)niz.c();
            final Long value3 = 1000000000L;
            final Long value4 = 100L;
            final Long n3 = (Long)lji.d(CaptureResult.SENSOR_EXPOSURE_TIME);
            n = ExifInterface.F;
            krb krb;
            if (n3 != null) {
                krb = new krb(n3, value3);
            }
            else {
                krb = null;
            }
            this.c(n, krb);
            if (n3 != null) {
                final long longValue = n3;
                final long longValue2 = value3;
                final double n4 = (double)longValue;
                final double n5 = (double)longValue2;
                Double.isNaN(n4);
                Double.isNaN(n5);
                this.c(ExifInterface.Q, i(Math.log(n4 / n5) / kvj.b, value4));
            }
            final Integer n6 = (Integer)lji.d(CaptureResult.SENSOR_SENSITIVITY);
            if (n6 != null) {
                final Integer n7 = (Integer)lji.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                Integer value5 = n6;
                if (n7 != null) {
                    value5 = n6 * (n7 / 100);
                }
                this.c(ExifInterface.J, value5);
            }
            final Float n8 = (Float)lji.d(CaptureResult.LENS_APERTURE);
            this.c(ExifInterface.G, h(n8, value4));
            if (n8 != null) {
                final double doubleValue = Math.log(n8) / kvj.b;
                this.c(ExifInterface.R, i(doubleValue + doubleValue, value4));
            }
            this.c(ExifInterface.Z, h((Float)lji.d(CaptureResult.LENS_FOCAL_LENGTH), 1000L));
            final Integer n9 = (Integer)lji.d(CaptureResult.FLASH_STATE);
            n = 1;
            if (n9 != null && n9 == 3) {
                this.c(ExifInterface.Y, 1);
            }
            else {
                this.c(ExifInterface.Y, 0);
            }
            final Float n10 = (Float)lji.d(CaptureResult.LENS_FOCUS_DISTANCE);
            if (n10 != null) {
                krb h;
                int n12;
                if (n10 > 1.0E-6f) {
                    final float n11 = 1.0f / n10;
                    h = h(n11, kvj.c);
                    if (n11 >= 1.0f) {
                        if (n11 < 3.0f) {
                            n = 2;
                        }
                        else {
                            n = 3;
                        }
                    }
                    n12 = n;
                }
                else if (n10 >= 0.0f) {
                    h = new krb(-1L, 1L);
                    n = (n12 = 3);
                }
                else {
                    h = new krb(0L, 1L);
                    n = (n12 = 0);
                }
                this.c(ExifInterface.V, h);
                this.c(ExifInterface.aI, (short)n12);
            }
        }
    }
    
    public final void g(final long n) {
        if (n > 0L) {
            this.a.x(ExifInterface.s, n, TimeZone.getDefault());
            this.a.x(ExifInterface.M, n, TimeZone.getDefault());
            this.a.x(ExifInterface.N, n, TimeZone.getDefault());
        }
    }
}
