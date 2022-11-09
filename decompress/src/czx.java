import java.util.List;
import android.net.Uri;
import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class czx implements bqs
{
    public final long b;
    public final him c;
    public final nns d;
    public final String e;
    public final String f;
    public final Instant g;
    public final Instant h;
    public final Uri i;
    public final boolean j;
    public final kre k;
    public final int l;
    
    public czx() {
    }
    
    public czx(final long b, final him c, final nns d, final String e, final String f, final Instant g, final Instant h, final Uri i, final boolean j, final kre k, final int l) {
        this.b = b;
        this.c = c;
        if (d == null) {
            throw new NullPointerException("Null allContentIds");
        }
        this.d = d;
        if (e == null) {
            throw new NullPointerException("Null title");
        }
        this.e = e;
        if (f == null) {
            throw new NullPointerException("Null mimeType");
        }
        this.f = f;
        if (g == null) {
            throw new NullPointerException("Null creationInstant");
        }
        this.g = g;
        if (h == null) {
            throw new NullPointerException("Null lastModifiedInstant");
        }
        this.h = h;
        if (i == null) {
            throw new NullPointerException("Null uri");
        }
        this.i = i;
        this.j = j;
        if (k != null) {
            this.k = k;
            this.l = l;
            return;
        }
        throw new NullPointerException("Null dimensions");
    }
    
    public static czw k() {
        final czw czw = new czw();
        czw.f("");
        czw.h("");
        czw.b = czx.a;
        czw.g(0);
        return czw;
    }
    
    @Override
    public final int a() {
        return this.l;
    }
    
    @Override
    public final long b() {
        return this.b;
    }
    
    @Override
    public final Uri c() {
        return this.i;
    }
    
    @Override
    public final him d() {
        return this.c;
    }
    
    @Override
    public final kre e() {
        return this.k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof czx) {
            final czx czx = (czx)o;
            if (this.b == czx.b) {
                final him c = this.c;
                if (c == null) {
                    if (czx.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(czx.c)) {
                    return false;
                }
                if (nqb.t(this.d, czx.d) && this.e.equals(czx.e) && this.f.equals(czx.f) && this.g.equals((Object)czx.g) && this.h.equals((Object)czx.h) && this.i.equals((Object)czx.i) && this.j == czx.j && this.k.equals(czx.k) && this.l == czx.l) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final nns f() {
        return this.d;
    }
    
    @Override
    public final Instant g() {
        return this.g;
    }
    
    @Override
    public final Instant h() {
        return this.h;
    }
    
    @Override
    public final int hashCode() {
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final him c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final int hashCode2 = this.d.hashCode();
        final int hashCode3 = this.e.hashCode();
        final int hashCode4 = this.f.hashCode();
        final int hashCode5 = this.g.hashCode();
        final int hashCode6 = this.h.hashCode();
        final int hashCode7 = this.i.hashCode();
        int n2;
        if (!this.j) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        return this.l ^ ((((((((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ n2) * 1000003 ^ this.k.hashCode()) * 1000003;
    }
    
    @Override
    public final String i() {
        return this.f;
    }
    
    @Override
    public final boolean j() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        final long b = this.b;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String e = this.e;
        final String f = this.f;
        final String value3 = String.valueOf(this.g);
        final String value4 = String.valueOf(this.h);
        final String value5 = String.valueOf(this.i);
        final boolean j = this.j;
        final String value6 = String.valueOf(this.k);
        final int l = this.l;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 192 + String.valueOf(value2).length() + e.length() + f.length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length());
        sb.append("MediaStoreData{contentId=");
        sb.append(b);
        sb.append(", shotId=");
        sb.append(value);
        sb.append(", allContentIds=");
        sb.append(value2);
        sb.append(", title=");
        sb.append(e);
        sb.append(", mimeType=");
        sb.append(f);
        sb.append(", creationInstant=");
        sb.append(value3);
        sb.append(", lastModifiedInstant=");
        sb.append(value4);
        sb.append(", uri=");
        sb.append(value5);
        sb.append(", inProgress=");
        sb.append(j);
        sb.append(", dimensions=");
        sb.append(value6);
        sb.append(", orientation=");
        sb.append(l);
        sb.append("}");
        return sb.toString();
    }
}
