// 
// Decompiled by Procyon v0.6.0
// 

public final class hwf
{
    private Boolean a;
    private Boolean b;
    
    public final hwg a() {
        final Boolean a = this.a;
        if (a != null && this.b != null) {
            return new hwg(a, this.b);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" logDurationFromStart");
        }
        if (this.b == null) {
            sb.append(" logDurationFromLast");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.b = b;
    }
    
    public final void c(final boolean b) {
        this.a = b;
    }
}
