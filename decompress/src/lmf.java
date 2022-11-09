import java.util.Locale;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmf
{
    public final llx a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    public lmf() {
    }
    
    public lmf(final llx a, final String b, final String c, final String d, final String e) {
        if (a == null) {
            throw new NullPointerException("Null directory");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null subpath");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null name");
        }
        this.c = c;
        if (d != null) {
            this.d = d;
            this.e = e;
            return;
        }
        throw new NullPointerException("Null extension");
    }
    
    public static lmf a(final llx llx, final String s, final String s2, final String s3, final String s4) {
        final boolean d = njb.d(s4);
        boolean b = false;
        Label_0071: {
            if (!d && !"text/plain".equals(s4)) {
                if ("application/octet-stream".equals(s4)) {
                    b = true;
                    break Label_0071;
                }
                final String b2 = lou.b(s3);
                if (b2 == null || !b2.equals(s4)) {
                    break Label_0071;
                }
            }
            b = true;
        }
        njo.d(b);
        njo.l(llx.c(s4), "Cannot publish %s to %s", s4, llx);
        return new lmf(llx, s, s2, s3, s4);
    }
    
    final File b(final llu llu) {
        File a = this.a.a(llu.a);
        if (!njb.d(this.b)) {
            a = new File(a, this.b);
        }
        final String c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder(c.length() + 1 + d.length());
        sb.append(c);
        sb.append(".");
        sb.append(d);
        return new File(a, sb.toString());
    }
    
    public final String c() {
        String concat;
        if (njb.d(this.b)) {
            concat = "";
        }
        else {
            concat = this.b.concat("/");
        }
        final String c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 1 + c.length() + d.length());
        sb.append(concat);
        sb.append(c);
        sb.append(".");
        sb.append(d);
        return sb.toString();
    }
    
    final boolean d() {
        return this.a.b() && this.a.c(this.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lmf) {
            final lmf lmf = (lmf)o;
            if (this.a.equals(lmf.a) && this.b.equals(lmf.b) && this.c.equals(lmf.c) && this.d.equals(lmf.d) && this.e.equals(lmf.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String string = this.a.toString();
        String concat;
        if (njb.d(this.b)) {
            concat = "";
        }
        else {
            concat = this.b.concat("/");
        }
        return String.format(root, "%s/%s%s.%s (%s)", string, concat, this.c, this.d, this.e);
    }
}
