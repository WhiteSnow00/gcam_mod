// 
// Decompiled by Procyon v0.6.0
// 

public final class hif
{
    public final cyn a;
    private final llc b;
    private final kse c;
    private final cxl d;
    private final krr e;
    private final hkc f;
    private final llu g;
    
    public hif(final llc b, final kse c, final krr krr, final cxl d, final hkc f, final llu g, final cyn a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = krr.a("GcaMediaStorage");
        this.f = f;
        this.g = g;
        this.a = a;
    }
    
    public final hie a(final long n, final drk drk, final String s) {
        hip hip;
        if (this.f.c(hjq.R)) {
            hip = hip.b;
        }
        else {
            hip = hip.a;
        }
        return this.b(n, drk, s, hip);
    }
    
    public final hie b(final long n, final drk drk, final String s, final hip hip) {
        this.c.f("Create fileGroup");
        final hie b = hie.b(this.b, n, drk, s, this.e, this.d, this.g, hip);
        final krr e = this.e;
        final String value = String.valueOf(b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 8);
        sb.append("Created ");
        sb.append(value);
        e.f(sb.toString());
        this.c.g();
        return b;
    }
    
    public final hie c(final long n) {
        return this.a(n, drk.f, "NIGHT");
    }
    
    public final hie d(final long n) {
        return this.a(n, drk.a, null);
    }
}
