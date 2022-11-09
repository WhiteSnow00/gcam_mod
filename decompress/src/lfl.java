// 
// Decompiled by Procyon v0.6.0
// 

public final class lfl
{
    public final String a;
    public final int b;
    
    public lfl() {
    }
    
    public lfl(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static lfk a() {
        return new lfk();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lfl) {
            final lfl lfl = (lfl)o;
            if (this.a.equals(lfl.a) && this.b == lfl.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 49);
        sb.append("CameraIdFailure{cameraId=");
        sb.append(a);
        sb.append(", errorCode=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
