// 
// Decompiled by Procyon v0.6.0
// 

public final class hrl
{
    private String a;
    private noi b;
    private noi c;
    
    public final hrm a() {
        final String a = this.a;
        if (a != null) {
            final noi b = this.b;
            if (b != null) {
                final noi c = this.c;
                if (c != null) {
                    return new hrm(a, b, c);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" packageName");
        }
        if (this.b == null) {
            sb.append(" photoActivityNames");
        }
        if (this.c == null) {
            sb.append(" videoActivityNames");
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
        throw new NullPointerException("Null packageName");
    }
    
    public final void c(final noi b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null photoActivityNames");
    }
    
    public final void d(final noi c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null videoActivityNames");
    }
}
