// 
// Decompiled by Procyon v0.6.0
// 

public final class ohm
{
    public final Runnable a;
    public final Runnable b;
    public final Runnable c;
    private final long d;
    
    public ohm() {
    }
    
    public ohm(final long d, final Runnable a, final Runnable b, final Runnable c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ohm) {
            final ohm ohm = (ohm)o;
            if (this.d == ohm.d && this.a.equals(ohm.a) && this.b.equals(ohm.b) && this.c.equals(ohm.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long d = this.d;
        return this.c.hashCode() ^ ((((int)(d ^ d >>> 32) ^ 0xF4243) * 1000003 ^ this.a.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long d = this.d;
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 81 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("ShotStatusCallback{shotId=");
        sb.append(d);
        sb.append(", onFinish=");
        sb.append(value);
        sb.append(", onError=");
        sb.append(value2);
        sb.append(", onComplete=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
