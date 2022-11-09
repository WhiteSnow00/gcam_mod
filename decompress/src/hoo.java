// 
// Decompiled by Procyon v0.6.0
// 

public final class hoo
{
    public hpg a;
    private Integer b;
    private Integer c;
    private jbm d;
    private Float e;
    
    public final hop a() {
        final Integer b = this.b;
        if (b != null && this.c != null && this.a != null && this.d != null && this.e != null) {
            return new hop(b, this.c, this.a, this.d, this.e);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" numFramesPerSample");
        }
        if (this.c == null) {
            sb.append(" numSuccessiveSamplesRequired");
        }
        if (this.a == null) {
            sb.append(" suggestion");
        }
        if (this.d == null) {
            sb.append(" applicationMode");
        }
        if (this.e == null) {
            sb.append(" scoreThreshold");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final jbm d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null applicationMode");
    }
    
    public final void c(final int n) {
        this.b = n;
    }
    
    public final void d(final int n) {
        this.c = n;
    }
    
    public final void e() {
        this.e = 0.0f;
    }
}
