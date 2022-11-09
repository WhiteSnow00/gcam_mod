// 
// Decompiled by Procyon v0.6.0
// 

public final class iof
{
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private nns d;
    
    public final iog a() {
        final Boolean a = this.a;
        if (a != null && this.b != null && this.c != null && this.d != null) {
            return new iog(a, this.b, this.c, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" supportDocumentScanning");
        }
        if (this.b == null) {
            sb.append(" supportTextFilterIntent");
        }
        if (this.c == null) {
            sb.append(" supportTranslate");
        }
        if (this.d == null) {
            sb.append(" supportedTranslateLanguages");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.a = b;
    }
    
    public final void c(final boolean b) {
        this.b = b;
    }
    
    public final void d(final boolean b) {
        this.c = b;
    }
    
    public final void e(final nns d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null supportedTranslateLanguages");
    }
}
