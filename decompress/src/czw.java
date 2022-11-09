import java.util.Collection;
import android.net.Uri;
import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czw
{
    public him a;
    public kre b;
    private Long c;
    private nns d;
    private String e;
    private String f;
    private Instant g;
    private Instant h;
    private Uri i;
    private Boolean j;
    private Integer k;
    
    public czw() {
    }
    
    public czw(final czx czx) {
        this.c = czx.b;
        this.a = czx.c;
        this.d = czx.d;
        this.e = czx.e;
        this.f = czx.f;
        this.g = czx.g;
        this.h = czx.h;
        this.i = czx.i;
        this.j = czx.j;
        this.b = czx.k;
        this.k = czx.l;
    }
    
    public final czx a() {
        final Long c = this.c;
        if (c == null) {
            throw new IllegalStateException("Property \"contentId\" has not been set");
        }
        final nns j = nns.j(nns.m(c));
        this.d = j;
        final Long c2 = this.c;
        if (c2 != null && j != null && this.e != null && this.f != null && this.g != null && this.h != null && this.i != null && this.j != null && this.b != null && this.k != null) {
            return new czi(c2, this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.b, this.k);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" contentId");
        }
        if (this.d == null) {
            sb.append(" allContentIds");
        }
        if (this.e == null) {
            sb.append(" title");
        }
        if (this.f == null) {
            sb.append(" mimeType");
        }
        if (this.g == null) {
            sb.append(" creationInstant");
        }
        if (this.h == null) {
            sb.append(" lastModifiedInstant");
        }
        if (this.i == null) {
            sb.append(" uri");
        }
        if (this.j == null) {
            sb.append(" inProgress");
        }
        if (this.b == null) {
            sb.append(" dimensions");
        }
        if (this.k == null) {
            sb.append(" orientation");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final long n) {
        this.c = n;
    }
    
    public final void c(final Instant g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null creationInstant");
    }
    
    public final void d(final boolean b) {
        this.j = b;
    }
    
    public final void e(final Instant h) {
        if (h != null) {
            this.h = h;
            return;
        }
        throw new NullPointerException("Null lastModifiedInstant");
    }
    
    public final void f(final String f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null mimeType");
    }
    
    public final void g(final int n) {
        this.k = n;
    }
    
    public final void h(final String e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null title");
    }
    
    public final void i(final Uri i) {
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}
