import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cal
{
    private Uri a;
    private String b;
    private Boolean c;
    
    public final cam a() {
        final Uri a = this.a;
        if (a != null) {
            final String b = this.b;
            if (b != null) {
                final Boolean c = this.c;
                if (c != null) {
                    return new cam(a, b, c);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" uri");
        }
        if (this.b == null) {
            sb.append(" mediaId");
        }
        if (this.c == null) {
            sb.append(" isDeleted");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.c = b;
    }
    
    public final void c(final String b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null mediaId");
    }
    
    public final void d(final Uri a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}
