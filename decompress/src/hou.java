// 
// Decompiled by Procyon v0.6.0
// 

public final class hou
{
    public hpg a;
    private Integer b;
    private Integer c;
    
    public final hov a() {
        final Integer b = this.b;
        if (b != null && this.c != null && this.a != null) {
            return new hov(b, this.c, this.a);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" samplingPeriod");
        }
        if (this.c == null) {
            sb.append(" successiveSamplesRequired");
        }
        if (this.a == null) {
            sb.append(" suggestion");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final int n) {
        this.b = n;
    }
    
    public final void c(final int n) {
        this.c = n;
    }
}
