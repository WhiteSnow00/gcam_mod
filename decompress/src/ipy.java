import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipy
{
    private Rect a;
    private Integer b;
    
    public final ipz a() {
        final Rect a = this.a;
        if (a != null) {
            final Integer b = this.b;
            if (b != null) {
                return new ipz(a, b);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rect");
        }
        if (this.b == null) {
            sb.append(" radius");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final int n) {
        this.b = n;
    }
    
    public final void c(final Rect a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null rect");
    }
}
