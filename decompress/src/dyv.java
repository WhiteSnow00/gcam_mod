import java.util.Arrays;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyv
{
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    private final long d;
    private final long e;
    
    public dyv() {
    }
    
    public dyv(final long d, final long e, final byte[] a, final byte[] b, final byte[] c) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static niz a(final lji lji) {
        if (lji == null) {
            return nii.a;
        }
        final dyu dyu = new dyu();
        long longValue = 0L;
        dyu.a(0L);
        dyu.a = lji.b();
        final Long n = (Long)lji.d(CaptureResult.SENSOR_TIMESTAMP);
        if (n != null) {
            longValue = n;
        }
        dyu.a(longValue);
        if (jli.h != null) {
            dyu.c = (byte[])lji.d(jli.h);
        }
        if (jli.i != null) {
            dyu.d = (byte[])lji.d(jli.i);
        }
        if (jli.j != null) {
            dyu.e = (byte[])lji.d(jli.j);
        }
        final Long a = dyu.a;
        if (a != null && dyu.b != null) {
            return niz.i(new dyv(a, dyu.b, dyu.c, dyu.d, dyu.e));
        }
        final StringBuilder sb = new StringBuilder();
        if (dyu.a == null) {
            sb.append(" frameNumber");
        }
        if (dyu.b == null) {
            sb.append(" timestampNanos");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof dyv) {
            final dyv dyv = (dyv)o;
            if (this.d == dyv.d && this.e == dyv.e) {
                final byte[] a = this.a;
                final boolean b = dyv instanceof dyv;
                byte[] array;
                if (b) {
                    array = dyv.a;
                }
                else {
                    array = dyv.a;
                }
                if (Arrays.equals(a, array)) {
                    final byte[] b2 = this.b;
                    byte[] array2;
                    if (b) {
                        array2 = dyv.b;
                    }
                    else {
                        array2 = dyv.b;
                    }
                    if (Arrays.equals(b2, array2) && Arrays.equals(this.c, dyv.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long d = this.d;
        final long e = this.e;
        return Arrays.hashCode(this.c) ^ (((((int)(d ^ d >>> 32) ^ 0xF4243) * 1000003 ^ (int)(e ^ e >>> 32)) * 1000003 ^ Arrays.hashCode(this.a)) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AfDebugMetadata{");
        sb.append(this.d);
        if (this.e > 0L) {
            sb.append(" ");
            sb.append(this.e);
        }
        if (this.a != null) {
            sb.append(" AEC");
        }
        if (this.b != null) {
            sb.append(" AF");
        }
        if (this.c != null) {
            sb.append(" AWB");
        }
        sb.append("}");
        return sb.toString();
    }
}
