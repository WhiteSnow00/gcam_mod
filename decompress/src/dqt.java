import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqt
{
    public final int a;
    public final nns b;
    public final float c;
    
    public dqt() {
    }
    
    public dqt(final int a, final nns b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof dqt) {
            final dqt dqt = (dqt)o;
            if (this.a == dqt.a && nqb.t(this.b, dqt.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(dqt.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ Float.floatToIntBits(this.c);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final float c = this.c;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 80);
        sb.append("FaceTrueTone{id=");
        sb.append(a);
        sb.append(", toneProbabilities=");
        sb.append(value);
        sb.append(", toneConfidence=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
