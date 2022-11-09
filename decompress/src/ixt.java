import android.graphics.Rect;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixt
{
    public final Bitmap a;
    public final int b;
    public final niz c;
    public final boolean d;
    
    public ixt() {
    }
    
    public ixt(final Bitmap a, final int b, final niz c, final boolean d) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }
    
    public static ixt b(final Bitmap bitmap, final int n) {
        return new ixt(bitmap, n, niz.h(null), true);
    }
    
    public final Rect a() {
        return new Rect(0, 0, this.a.getWidth(), this.a.getHeight());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ixt) {
            final ixt ixt = (ixt)o;
            if (this.a.equals(ixt.a) && this.b == ixt.b && this.c.equals(ixt.c) && this.d == ixt.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final int hashCode2 = this.c.hashCode();
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final String value2 = String.valueOf(this.c);
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 91 + String.valueOf(value2).length());
        sb.append("ViewfinderScreenshot{bitmap=");
        sb.append(value);
        sb.append(", downscaleRatio=");
        sb.append(b);
        sb.append(", bitmapSourceRect=");
        sb.append(value2);
        sb.append(", allowed=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
