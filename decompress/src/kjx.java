// 
// Decompiled by Procyon v0.6.0
// 

public final class kjx
{
    public String a;
    public Boolean b;
    public kjw c;
    private Integer d;
    private Integer e;
    
    public final kjy a() {
        final Integer d = this.d;
        if (d != null && this.a != null && this.e != null && this.b != null && this.c != null) {
            return new kjy(d, this.a, this.e, this.b, this.c);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" threadCount");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.e == null) {
            sb.append(" androidThreadPriority");
        }
        if (this.b == null) {
            sb.append(" propagateErrors");
        }
        if (this.c == null) {
            sb.append(" threadBodyDecorator");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final int n) {
        this.e = n;
    }
    
    public final void c(final int n) {
        this.d = n;
    }
}
