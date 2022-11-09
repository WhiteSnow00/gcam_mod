import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwi
{
    public final PointF a;
    public final boolean b;
    private final int c;
    
    public fwi() {
    }
    
    public fwi(final PointF a, final int c, final boolean b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fwi) {
            final fwi fwi = (fwi)o;
            if (this.a.equals((Object)fwi.a) && this.c == fwi.c && this.b == fwi.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int c = this.c;
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ c) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int c = this.c;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 72);
        sb.append("AfRoi{normalizedCenterPoint=");
        sb.append(value);
        sb.append(", confidenceScore=");
        sb.append(c);
        sb.append(", isFace=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
