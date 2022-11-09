import java.util.Arrays;
import android.graphics.Matrix;
import android.util.Log;
import android.os.Parcelable;
import android.os.Bundle;
import android.graphics.PointF;
import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oiv
{
    public final Uri a;
    public final Bitmap b;
    public final byte[] c;
    public final Long d;
    public final lpw e;
    public final Integer f;
    public final Integer g;
    public final PointF h;
    
    public oiv() {
    }
    
    public oiv(final Uri a, final Bitmap b, final Long d, final lpw e, final Integer f, final Integer g, final PointF h) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static oiu b() {
        return new oiu();
    }
    
    public final Bundle a(final jkz jkz) {
        final Bundle bundle = new Bundle();
        final Uri a = this.a;
        if (a != null) {
            bundle.putParcelable("uri", (Parcelable)a);
        }
        final Bitmap b = this.b;
        final int n = 0;
        if (b != null) {
            int d;
            if ((jkz.a & 0x4) != 0x0) {
                d = jkz.d;
            }
            else {
                d = 33554432;
            }
            Object bitmap;
            if (b.getByteCount() <= d) {
                bitmap = b;
            }
            else {
                Log.w("LensMetadata", String.format("Input bitmap is %d bytes, which is larger than our maximum of %d bytes. Downsampling...", b.getByteCount(), d));
                final float n2 = (float)Math.sqrt(d / (float)b.getByteCount());
                final Matrix matrix = new Matrix();
                matrix.setScale(n2, n2);
                bitmap = Bitmap.createBitmap(b, 0, 0, b.getWidth(), b.getHeight(), matrix, true);
            }
            bundle.putParcelable("bitmap", (Parcelable)bitmap);
        }
        final Integer f = this.f;
        int intValue;
        if (f == null) {
            intValue = n;
        }
        else {
            intValue = f;
        }
        bundle.putInt("lens_transition_type", intValue);
        final PointF h = this.h;
        if (h != null) {
            bundle.putParcelable("lens_tap_location", (Parcelable)h);
        }
        return bundle;
    }
    
    public final oiu c() {
        return new oiu(this);
    }
    
    public final Bundle d() {
        final Bundle bundle = new Bundle();
        final Long d = this.d;
        if (d != null) {
            bundle.putLong("activity_launch_timestamp_nanos", (long)d);
        }
        final lpw e = this.e;
        if (e != null) {
            bundle.putByteArray("lens_initial_parameters", e.g());
        }
        final Integer g = this.g;
        if (g != null) {
            bundle.putInt("lens_intent_type", (int)g);
        }
        return bundle;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof oiv) {
            final oiv oiv = (oiv)o;
            final Uri a = this.a;
            if (a == null) {
                if (oiv.a != null) {
                    return false;
                }
            }
            else if (!a.equals((Object)oiv.a)) {
                return false;
            }
            final Bitmap b = this.b;
            if (b == null) {
                if (oiv.b != null) {
                    return false;
                }
            }
            else if (!b.equals(oiv.b)) {
                return false;
            }
            if (oiv instanceof oiv) {
                final byte[] c = oiv.c;
            }
            if (Arrays.equals(null, (byte[])null)) {
                final Long d = this.d;
                if (d == null) {
                    if (oiv.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(oiv.d)) {
                    return false;
                }
                final lpw e = this.e;
                if (e == null) {
                    if (oiv.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(oiv.e)) {
                    return false;
                }
                final Integer f = this.f;
                if (f == null) {
                    if (oiv.f != null) {
                        return false;
                    }
                }
                else if (!f.equals(oiv.f)) {
                    return false;
                }
                final Integer g = this.g;
                if (g == null) {
                    if (oiv.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(oiv.g)) {
                    return false;
                }
                final PointF h = this.h;
                final PointF h2 = oiv.h;
                if (h == null) {
                    if (h2 != null) {
                        return false;
                    }
                }
                else if (!h.equals((Object)h2)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Uri a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Bitmap b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int hashCode4 = Arrays.hashCode((byte[])null);
        final Long d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final lpw e = this.e;
        int ay;
        if (e == null) {
            ay = 0;
        }
        else {
            ay = e.ay;
            if (ay == 0) {
                ay = omr.a.b(e).b(e);
                e.ay = ay;
            }
        }
        final Integer f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final Integer g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final PointF h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 272515929 ^ hashCode4) * 1000003 ^ hashCode5) * 1525764945 ^ ay) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode) * 1525764945;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf((Object)null);
        final String value4 = String.valueOf((Object)null);
        final String value5 = String.valueOf((Object)null);
        final String string = Arrays.toString((byte[])null);
        final String value6 = String.valueOf(this.d);
        final String value7 = String.valueOf((Object)null);
        final String value8 = String.valueOf((Object)null);
        final String value9 = String.valueOf((Object)null);
        final String value10 = String.valueOf(this.e);
        final String value11 = String.valueOf(this.f);
        final String value12 = String.valueOf(this.g);
        final String value13 = String.valueOf(this.h);
        final String value14 = String.valueOf((Object)null);
        final String value15 = String.valueOf((Object)null);
        final String value16 = String.valueOf((Object)null);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 379 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf((Object)null).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf((Object)null).length() + String.valueOf(string).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length() + String.valueOf(value14).length() + String.valueOf((Object)null).length() + String.valueOf(value15).length() + String.valueOf(value16).length());
        sb.append("LensMetadata{bitmapUri=");
        sb.append(value);
        sb.append(", bitmap=");
        sb.append(value2);
        sb.append(", imageLocationOnScreen=");
        sb.append(value3);
        sb.append(", account=null, cropBoundingBox=");
        sb.append(value4);
        sb.append(", imageLocation=");
        sb.append(value5);
        sb.append(", imagePlaceId=null, imagePayload=");
        sb.append(string);
        sb.append(", lensActivityLaunchTimestampNanos=");
        sb.append(value6);
        sb.append(", startStreamingRequestTimestampNanos=");
        sb.append(value7);
        sb.append(", hideLensCloseButton=");
        sb.append(value8);
        sb.append(", disableArtLookalike=");
        sb.append(value9);
        sb.append(", lensInitParams=");
        sb.append(value10);
        sb.append(", transitionType=");
        sb.append(value11);
        sb.append(", intentType=");
        sb.append(value12);
        sb.append(", tapLocation=");
        sb.append(value13);
        sb.append(", lensTheme=");
        sb.append(value14);
        sb.append(", fifeUrl=null, disableIntentOptimizations=");
        sb.append(value15);
        sb.append(", promoAddShortcut=");
        sb.append(value16);
        sb.append("}");
        return sb.toString();
    }
}
