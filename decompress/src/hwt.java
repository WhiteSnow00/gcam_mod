import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwt
{
    public final Bitmap a;
    public final kra b;
    
    public hwt(final Bitmap a, final kra b) {
        a.getClass();
        b.getClass();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 52 + String.valueOf(value2).length());
        sb.append("OrientationBitmap[Bitmap: ");
        sb.append(value);
        sb.append("][rotation: ");
        sb.append(value2);
        sb.append("]: ");
        sb.append(hashCode);
        return sb.toString();
    }
}
