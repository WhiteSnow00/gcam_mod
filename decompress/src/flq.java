// 
// Decompiled by Procyon v0.6.0
// 

public final class flq
{
    public final lfj a;
    public final lfu b;
    public final kre c;
    public final ixs d;
    private final kqp e;
    
    public flq() {
    }
    
    public flq(final lfj a, final lfu b, final kqp e, final kre c, final ixs d) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof flq) {
            final flq flq = (flq)o;
            if (this.a.equals(flq.a) && this.b.equals(flq.b) && this.e.equals(flq.e) && this.c.equals(flq.c) && this.d.equals(flq.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.b ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.e);
        final String value4 = String.valueOf(this.c);
        final String value5 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 92 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length());
        sb.append("OneModeConfig{cameraId=");
        sb.append(value);
        sb.append(", cameraFacing=");
        sb.append(value2);
        sb.append(", aspectRatio=");
        sb.append(value3);
        sb.append(", captureResolution=");
        sb.append(value4);
        sb.append(", viewfinderConfig=");
        sb.append(value5);
        sb.append("}");
        return sb.toString();
    }
}
