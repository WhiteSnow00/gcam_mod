import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hig
{
    private Long a;
    private Uri b;
    private hio c;
    private Boolean d;
    
    public final hih a() {
        final Uri b = this.b;
        if (b == null) {
            throw new IllegalStateException("Property \"uri\" has not been set");
        }
        njo.p(b.equals((Object)Uri.EMPTY) ^ true, "MediaStoreRecord should only be created with a valid MediaStore Uri");
        final String lastPathSegment = b.getLastPathSegment();
        lastPathSegment.getClass();
        final Long value = Long.parseLong(lastPathSegment);
        this.a = value;
        if (value != null && this.b != null && this.c != null && this.d != null) {
            return new hih(value, this.b, this.c, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaStoreId");
        }
        if (this.b == null) {
            sb.append(" uri");
        }
        if (this.c == null) {
            sb.append(" sessionType");
        }
        if (this.d == null) {
            sb.append(" secure");
        }
        final String value2 = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value2);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.d = b;
    }
    
    public final void c(final hio c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null sessionType");
    }
    
    public final void d(final Uri b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}
