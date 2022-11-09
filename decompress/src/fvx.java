// 
// Decompiled by Procyon v0.6.0
// 

public final class fvx
{
    private gzo a;
    private gzp b;
    
    public final fvy a() {
        final gzo a = this.a;
        if (a != null) {
            final gzp b = this.b;
            if (b != null) {
                return new fvy(a, b);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" aeMode");
        }
        if (this.b == null) {
            sb.append(" aeState");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final gzo a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null aeMode");
    }
    
    public final void c(final gzp b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null aeState");
    }
}
