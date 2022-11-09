import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgh
{
    public final kva a;
    public final File b;
    public final hia c;
    public final hie d;
    public final kre e;
    public final long f;
    public final int g;
    private final niz h;
    private final llk i;
    private final int j;
    private final long k;
    
    public cgh() {
    }
    
    public cgh(final kva a, final File b, final hia c, final hie d, final niz h, final llk i, final kre e, final int j, final long k, final long f, final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.i = i;
        this.e = e;
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof cgh) {
            final cgh cgh = (cgh)o;
            if (this.a.equals(cgh.a) && this.b.equals(cgh.b) && this.c.equals(cgh.c) && this.d.equals(cgh.d) && this.h.equals(cgh.h) && this.i.equals(cgh.i) && this.e.equals(cgh.e) && this.j == cgh.j && this.k == cgh.k && this.f == cgh.f && this.g == cgh.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.h.hashCode();
        final int hashCode6 = this.i.hashCode();
        final int hashCode7 = this.e.hashCode();
        final int j = this.j;
        final long k = this.k;
        final long f = this.f;
        return ((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ j) * 1000003 ^ (int)(k >>> 32 ^ k)) * 1000003 ^ (int)(f >>> 32 ^ f)) * 1000003 ^ this.g;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.h);
        final String value6 = String.valueOf(this.i);
        final String value7 = String.valueOf(this.e);
        final int j = this.j;
        final long k = this.k;
        final long f = this.f;
        final int g = this.g;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 233 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length());
        sb.append("CamcorderSnapshot{exifInfo=");
        sb.append(value);
        sb.append(", filePath=");
        sb.append(value2);
        sb.append(", gcaMediaFile=");
        sb.append(value3);
        sb.append(", gcaMediaGroup=");
        sb.append(value4);
        sb.append(", location=");
        sb.append(value5);
        sb.append(", mimeType=");
        sb.append(value6);
        sb.append(", size=");
        sb.append(value7);
        sb.append(", orientation=");
        sb.append(j);
        sb.append(", takenTime=");
        sb.append(k);
        sb.append(", requestProcessingTimeMilliseconds=");
        sb.append(f);
        sb.append(", retries=");
        sb.append(g);
        sb.append("}");
        return sb.toString();
    }
}
