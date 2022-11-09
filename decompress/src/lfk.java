// 
// Decompiled by Procyon v0.6.0
// 

public final class lfk
{
    private String a;
    private Integer b;
    
    public final lfl a() {
        final String a = this.a;
        if (a != null) {
            final Integer b = this.b;
            if (b != null) {
                return new lfl(a, b);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" cameraId");
        }
        if (this.b == null) {
            sb.append(" errorCode");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null cameraId");
    }
    
    public final void c(final int n) {
        this.b = n;
    }
}
