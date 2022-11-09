// 
// Decompiled by Procyon v0.6.0
// 

public final class ffw implements krc
{
    public final long a;
    public final ofn b;
    public final ofn c;
    
    public ffw() {
    }
    
    public ffw(final long a, final ofn b, final ofn c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void close() {
        this.b.cancel(true);
        this.c.cancel(true);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ffw) {
            final ffw ffw = (ffw)o;
            if (this.a == ffw.a && this.b.equals(ffw.b) && this.c.equals(ffw.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return this.c.hashCode() ^ (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 93 + String.valueOf(value2).length());
        sb.append("EncoderFrameInfo{timestampNs=");
        sb.append(a);
        sb.append(", stabilizationTransforms=");
        sb.append(value);
        sb.append(", encodeDecision=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
