// 
// Decompiled by Procyon v0.6.0
// 

public final class ltn
{
    public Boolean a;
    public Boolean b;
    public int c;
    public int d;
    
    public final lto a() {
        final int c = this.c;
        if (c != 0) {
            final Boolean a = this.a;
            if (a != null && this.b != null) {
                if (this.d != 0) {
                    return new lto(c, a, this.b, this.d);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" lastFrameDurationBehavior");
        }
        if (this.a == null) {
            sb.append(" editsEnabled");
        }
        if (this.b == null) {
            sb.append(" dynamicFtypEnabled");
        }
        if (this.d == 0) {
            sb.append(" mainFileBrand");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
}
