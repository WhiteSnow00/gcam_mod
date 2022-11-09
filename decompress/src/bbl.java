import java.security.MessageDigest;
import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbl implements awc
{
    public final bbm b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;
    
    public bbl(final String d) {
        final bbm a = bbm.a;
        this.c = null;
        bit.c(d);
        this.d = d;
        bit.a(a);
        this.b = a;
    }
    
    public bbl(final URL c) {
        final bbm a = bbm.a;
        bit.a(c);
        this.c = c;
        this.d = null;
        bit.a(a);
        this.b = a;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = this.b().getBytes(bbl.a);
        }
        messageDigest.update(this.g);
    }
    
    public final String b() {
        final String d = this.d;
        if (d != null) {
            return d;
        }
        final URL c = this.c;
        bit.a(c);
        return c.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof bbl) {
            final bbl bbl = (bbl)o;
            if (this.b().equals(bbl.b()) && this.b.equals(bbl.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int h;
        if ((h = this.h) == 0) {
            final int hashCode = this.b().hashCode();
            this.h = hashCode;
            h = hashCode * 31 + this.b.hashCode();
            this.h = h;
        }
        return h;
    }
    
    @Override
    public final String toString() {
        return this.b();
    }
}
