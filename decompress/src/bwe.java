// 
// Decompiled by Procyon v0.6.0
// 

final class bwe
{
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final opw g;
    
    public bwe() {
    }
    
    public bwe(final long a, final long b, final int c, final int d, final int e, final float f, final opw g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null frameMetadata");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof bwe) {
            final bwe bwe = (bwe)o;
            if (this.a == bwe.a && this.b == bwe.b && this.c == bwe.c && this.d == bwe.d && this.e == bwe.e && Float.floatToIntBits(this.f) == Float.floatToIntBits(bwe.f) && this.g.equals(bwe.g)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        final int n = (int)(a ^ a >>> 32);
        final int n2 = (int)(b ^ b >>> 32);
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int floatToIntBits = Float.floatToIntBits(this.f);
        final opw g = this.g;
        int ay = g.ay;
        if (ay == 0) {
            ay = omr.a.b(g).b(g);
            g.ay = ay;
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ e) * 1000003 ^ floatToIntBits) * 1000003 ^ ay;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final float f = this.f;
        final String value = String.valueOf(this.g);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 286);
        sb.append("CaptureReport{durationSinceLastCaptureMs=");
        sb.append(a);
        sb.append(", durationFromCandidatetoSavingMs=");
        sb.append(b);
        sb.append(", candidateFramesDiscarded=");
        sb.append(c);
        sb.append(", framesAnalyzedBeforeCandidate=");
        sb.append(d);
        sb.append(", framesAnalyzedAfterCandidate=");
        sb.append(e);
        sb.append(", analysisScore=");
        sb.append(f);
        sb.append(", frameMetadata=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
