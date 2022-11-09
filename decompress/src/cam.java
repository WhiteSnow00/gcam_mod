import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cam
{
    public final String a;
    public final boolean b;
    private final Uri c;
    
    public cam() {
    }
    
    public cam(final Uri c, final String a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static cal a() {
        return new cal();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof cam) {
            final cam cam = (cam)o;
            if (this.c.equals((Object)cam.c) && this.a.equals(cam.a) && this.b == cam.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.c.hashCode();
        final int hashCode2 = this.a.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final String a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 48 + String.valueOf(a).length());
        sb.append("MediaRecordInfo{uri=");
        sb.append(value);
        sb.append(", mediaId=");
        sb.append(a);
        sb.append(", isDeleted=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
