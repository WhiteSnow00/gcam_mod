import android.net.Uri;
import android.content.ContentResolver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class llt
{
    public Context a;
    public ContentResolver b;
    public String c;
    public Integer d;
    public Integer e;
    public String f;
    private Uri g;
    private Uri h;
    private String i;
    private String j;
    private String k;
    private Integer l;
    private Integer m;
    
    public final llu a() {
        final Context a = this.a;
        if (a != null) {
            final ContentResolver b = this.b;
            if (b != null) {
                final Uri g = this.g;
                if (g != null) {
                    final Uri h = this.h;
                    if (h != null) {
                        final String c = this.c;
                        if (c != null) {
                            final String i = this.i;
                            if (i != null) {
                                final String j = this.j;
                                if (j != null) {
                                    final Integer d = this.d;
                                    if (d != null && this.e != null && this.f != null && this.k != null && this.l != null) {
                                        if (this.m != null) {
                                            return new llu(a, b, g, h, c, i, j, d, this.e, this.f, this.k, this.l, this.m);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" context");
        }
        if (this.b == null) {
            sb.append(" contentResolver");
        }
        if (this.g == null) {
            sb.append(" photoInsertUri");
        }
        if (this.h == null) {
            sb.append(" videoInsertUri");
        }
        if (this.c == null) {
            sb.append(" displayNameColumnName");
        }
        if (this.i == null) {
            sb.append(" mimeTypeColumnName");
        }
        if (this.j == null) {
            sb.append(" isPendingColumnName");
        }
        if (this.d == null) {
            sb.append(" isPendingTrue");
        }
        if (this.e == null) {
            sb.append(" isPendingFalse");
        }
        if (this.f == null) {
            sb.append(" relativePathColumnName");
        }
        if (this.k == null) {
            sb.append(" mediaTypeColumnName");
        }
        if (this.l == null) {
            sb.append(" mediaTypeImage");
        }
        if (this.m == null) {
            sb.append(" mediaTypeVideo");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b() {
        this.j = "is_pending";
    }
    
    public final void c() {
        this.k = "media_type";
    }
    
    public final void d(final int n) {
        this.l = n;
    }
    
    public final void e(final int n) {
        this.m = n;
    }
    
    public final void f() {
        this.i = "mime_type";
    }
    
    public final void g(final Uri g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null photoInsertUri");
    }
    
    public final void h(final Uri h) {
        if (h != null) {
            this.h = h;
            return;
        }
        throw new NullPointerException("Null videoInsertUri");
    }
}
