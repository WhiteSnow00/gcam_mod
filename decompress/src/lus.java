// 
// Decompiled by Procyon v0.6.0
// 

public final class lus
{
    public String a;
    public String b;
    private Integer c;
    private Integer d;
    
    public final lut a() {
        final String a = this.a;
        if (a != null) {
            final String b = this.b;
            if (b != null) {
                final Integer c = this.c;
                if (c != null) {
                    if (this.d != null) {
                        return new lut(a, b, c, this.d);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mime");
        }
        if (this.b == null) {
            sb.append(" semantic");
        }
        if (this.c == null) {
            sb.append(" length");
        }
        if (this.d == null) {
            sb.append(" padding");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final int n) {
        this.c = n;
    }
    
    public final void c(final int n) {
        this.d = n;
    }
}
