import android.net.Uri;
import android.content.ContentResolver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class llu
{
    public final Context a;
    public final ContentResolver b;
    public final Uri c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;
    
    public llu() {
    }
    
    public llu(final Context a, final ContentResolver b, final Uri c, final Uri d, final String e, final String f, final String g, final int h, final int i, final String j, final String k, final int l, final int m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static llt a(final Context a) {
        final llt llt = new llt();
        llt.a = a;
        final ContentResolver contentResolver = a.getContentResolver();
        if (contentResolver != null) {
            llt.b = contentResolver;
            llt.e = 0;
            llt.d = 1;
            return llt;
        }
        throw new NullPointerException("Null contentResolver");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof llu) {
            final llu llu = (llu)o;
            if (this.a.equals(llu.a) && this.b.equals(llu.b) && this.c.equals((Object)llu.c) && this.d.equals((Object)llu.d) && this.e.equals(llu.e) && this.f.equals(llu.f) && this.g.equals(llu.g) && this.h == llu.h && this.i == llu.i && this.j.equals(llu.j) && this.k.equals(llu.k) && this.l == llu.l && this.m == llu.m) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h) * 1000003 ^ this.i) * 1000003 ^ this.j.hashCode()) * 1000003 ^ this.k.hashCode()) * 1000003 ^ this.l) * 1000003 ^ this.m;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final int h = this.h;
        final int i = this.i;
        final String j = this.j;
        final String k = this.k;
        final int l = this.l;
        final int m = this.m;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 305 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(e).length() + String.valueOf(f).length() + String.valueOf(g).length() + String.valueOf(j).length() + String.valueOf(k).length());
        sb.append("ContentResolverApi{context=");
        sb.append(value);
        sb.append(", contentResolver=");
        sb.append(value2);
        sb.append(", photoInsertUri=");
        sb.append(value3);
        sb.append(", videoInsertUri=");
        sb.append(value4);
        sb.append(", displayNameColumnName=");
        sb.append(e);
        sb.append(", mimeTypeColumnName=");
        sb.append(f);
        sb.append(", isPendingColumnName=");
        sb.append(g);
        sb.append(", isPendingTrue=");
        sb.append(h);
        sb.append(", isPendingFalse=");
        sb.append(i);
        sb.append(", relativePathColumnName=");
        sb.append(j);
        sb.append(", mediaTypeColumnName=");
        sb.append(k);
        sb.append(", mediaTypeImage=");
        sb.append(l);
        sb.append(", mediaTypeVideo=");
        sb.append(m);
        sb.append("}");
        return sb.toString();
    }
}
