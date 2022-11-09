// 
// Decompiled by Procyon v0.6.0
// 

public final class mle implements mft
{
    public final int a;
    public final float b;
    private final niz c;
    private final int d;
    
    public mle() {
    }
    
    public mle(final int d, final int a, final float b, final niz c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final mld c() {
        final mld mld = new mld(null);
        mld.a = 10;
        mld.b = 1.0f;
        mld.c = nii.a;
        mld.d = 1;
        return mld;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final int b() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mle)) {
            return false;
        }
        final mle mle = (mle)o;
        final int d = this.d;
        final int d2 = mle.d;
        if (d != 0) {
            return d == d2 && this.a == mle.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(mle.b) && this.c.equals(mle.c);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int d = this.d;
        mfu.b(d);
        return (((d ^ 0xF4243) * 1000003 ^ this.a) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ 0x79A31AAC;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.d);
        final int a2 = this.a;
        final float b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(a.length() + 130 + String.valueOf(value).length());
        sb.append("TimerConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(a2);
        sb.append(", samplingProbability=");
        sb.append(b);
        sb.append(", perEventConfigurationFlags=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
