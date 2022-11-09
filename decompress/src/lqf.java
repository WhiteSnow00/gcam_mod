import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqf
{
    public final lqo a;
    public final List b;
    public final lqh c;
    
    public lqf() {
    }
    
    public lqf(final lqo a, final List b, final lqh c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static lqe a() {
        final lqe lqe = new lqe();
        lqe.c(lqh.b);
        return lqe;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lqf) {
            final lqf lqf = (lqf)o;
            if (this.a.equals(lqf.a) && this.b.equals(lqf.b) && this.c.equals(lqf.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final lqo a = this.a;
        int ay = a.ay;
        if (ay == 0) {
            ay = omr.a.b(a).b(a);
            a.ay = ay;
        }
        final int hashCode = this.b.hashCode();
        final lqh c = this.c;
        int ay2 = c.ay;
        if (ay2 == 0) {
            ay2 = omr.a.b(c).b(c);
            c.ay = ay2;
        }
        return ((ay ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ ay2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 81 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("LinkPresentationResult{linkDataResult=");
        sb.append(value);
        sb.append(", linkChipResult=");
        sb.append(value2);
        sb.append(", linkChipResultMetadata=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
