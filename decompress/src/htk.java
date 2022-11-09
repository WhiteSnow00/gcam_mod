import android.content.pm.ResolveInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htk
{
    private ResolveInfo a;
    private Boolean b;
    private Boolean c;
    
    public final htl a() {
        final ResolveInfo a = this.a;
        if (a != null) {
            final Boolean b = this.b;
            if (b != null) {
                if (this.c != null) {
                    return new htl(a, b, this.c);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" resolveInfo");
        }
        if (this.b == null) {
            sb.append(" selected");
        }
        if (this.c == null) {
            sb.append(" supported");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final ResolveInfo a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null resolveInfo");
    }
    
    public final void c(final boolean b) {
        this.b = b;
    }
    
    public final void d(final boolean b) {
        this.c = b;
    }
}
