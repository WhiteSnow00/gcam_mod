// 
// Decompiled by Procyon v0.6.0
// 

public final class mhe implements mft
{
    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final double f;
    
    public mhe() {
    }
    
    public mhe(final int b, final int c, final int d, final int e, final double f) {
        this.a = 1;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final int b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mhe)) {
            return false;
        }
        final mhe mhe = (mhe)o;
        final int a = this.a;
        final int a2 = mhe.a;
        if (a != 0) {
            return a2 == 1 && this.b == mhe.b && this.c == mhe.c && this.d == mhe.d && this.e == mhe.e && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(mhe.f);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        mfu.b(this.a);
        return ((((this.b ^ 0xD4F15B46) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ (int)(Double.doubleToLongBits(this.f) >>> 32 ^ Double.doubleToLongBits(this.f));
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.a);
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final double f = this.f;
        final StringBuilder sb = new StringBuilder(a.length() + 211);
        sb.append("CpuProfilingConfigurations{enablement=");
        sb.append(a);
        sb.append(", maxBufferSizeBytes=");
        sb.append(b);
        sb.append(", sampleDurationMs=");
        sb.append(c);
        sb.append(", sampleDurationSkewMs=");
        sb.append(d);
        sb.append(", sampleFrequencyMicro=");
        sb.append(e);
        sb.append(", samplesPerEpoch=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
