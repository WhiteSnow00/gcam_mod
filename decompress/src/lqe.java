import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqe
{
    private lqo a;
    private List b;
    private lqh c;
    
    public final lqf a() {
        final lqo a = this.a;
        if (a != null) {
            final List b = this.b;
            if (b != null) {
                final lqh c = this.c;
                if (c != null) {
                    return new lqf(a, b, c);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" linkDataResult");
        }
        if (this.b == null) {
            sb.append(" linkChipResult");
        }
        if (this.c == null) {
            sb.append(" linkChipResultMetadata");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final List b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null linkChipResult");
    }
    
    public final void c(final lqh c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null linkChipResultMetadata");
    }
    
    public final void d(final lqo a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null linkDataResult");
    }
}
