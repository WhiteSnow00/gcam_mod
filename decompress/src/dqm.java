// 
// Decompiled by Procyon v0.6.0
// 

public final class dqm
{
    public final long a;
    public final float b;
    private final niz c;
    private final niz d;
    private final float e;
    
    public dqm() {
    }
    
    public dqm(final long a, final niz c, final float b, final niz d, final float e) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof dqm) {
            final dqm dqm = (dqm)o;
            if (this.a == dqm.a && this.c.equals(dqm.c) && Float.floatToIntBits(this.b) == Float.floatToIntBits(dqm.b) && this.d.equals(dqm.d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(dqm.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return Float.floatToIntBits(this.e) ^ (((((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ this.c.hashCode()) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ this.d.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String value = String.valueOf(this.c);
        final float b = this.b;
        final String value2 = String.valueOf(this.d);
        final float e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 150 + String.valueOf(value2).length());
        sb.append("FrequentFace{trackId=");
        sb.append(a);
        sb.append(", identityId=");
        sb.append(value);
        sb.append(", score=");
        sb.append(b);
        sb.append(", aggregatedToneProbabilities=");
        sb.append(value2);
        sb.append(", aggregatedToneConfidence=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
