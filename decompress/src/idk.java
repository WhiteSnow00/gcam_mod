import android.util.SizeF;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idk
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;
    public final Rect g;
    public final Rect h;
    private final SizeF i;
    
    public idk() {
    }
    
    public idk(final long a, final long b, final long c, final long d, final float e, final float f, final Rect g, final Rect h, final SizeF i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof idk) {
            final idk idk = (idk)o;
            if (this.a == idk.a && this.b == idk.b && this.c == idk.c && this.d == idk.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(idk.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(idk.f) && this.g.equals((Object)idk.g) && this.h.equals((Object)idk.h) && this.i.equals((Object)idk.i)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        return this.i.hashCode() ^ (((((((((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c >>> 32 ^ c)) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ Float.floatToIntBits(this.e)) * 1000003 ^ Float.floatToIntBits(this.f)) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("frameTimestampNs=");
        sb.append(this.a);
        sb.append(", exposureTimeNs=");
        sb.append(this.b);
        sb.append(", oisTimestampNs=");
        sb.append(this.c);
        sb.append(", rollingShutterTimeNs=");
        sb.append(this.d);
        sb.append(", digitalZoomRatio=");
        sb.append(this.e);
        sb.append(", fieldOfView=");
        sb.append(this.f);
        sb.append(", fullImageSize=");
        sb.append(this.g);
        sb.append(", sensorSize=");
        sb.append(this.i);
        return sb.toString();
    }
}
