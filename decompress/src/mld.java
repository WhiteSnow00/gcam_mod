// 
// Decompiled by Procyon v0.6.0
// 

public final class mld
{
    public Integer a;
    public Float b;
    public niz c;
    public int d;
    
    public mld() {
    }
    
    public mld(final byte[] array) {
        this.c = nii.a;
    }
    
    public final mle a() {
        final int d = this.d;
        if (d != 0) {
            final Integer a = this.a;
            if (a != null) {
                if (this.b != null) {
                    final mle mle = new mle(d, a, this.b, this.c);
                    final int a2 = mle.a;
                    final boolean b = true;
                    njo.p(a2 >= 0, "Rate limit per second must be >= 0");
                    final float b2 = mle.b;
                    njo.p(b2 > 0.0f && b2 <= 1.0f && b, "Sampling Probability shall be > 0 and <= 1");
                    return mle;
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.b == null) {
            sb.append(" samplingProbability");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        int d;
        if (!b) {
            d = 2;
        }
        else {
            d = 3;
        }
        this.d = d;
    }
}
