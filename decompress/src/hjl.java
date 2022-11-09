// 
// Decompiled by Procyon v0.6.0
// 

public final class hjl
{
    public final hjx a;
    public final krr b;
    
    public hjl(final hjx a, final krq krq) {
        this.a = a;
        this.b = krq.a("Settings");
    }
    
    public final klv a(final String s, final boolean b) {
        if (!this.a.n(s)) {
            final krr b2 = this.b;
            final StringBuilder sb = new StringBuilder(s.length() + 46);
            sb.append("Initializing default value (");
            sb.append(b);
            sb.append(") for key: (");
            sb.append(s);
            sb.append(")");
            b2.f(sb.toString());
            this.a.l(s, b);
        }
        return new hiq(this.a, s);
    }
    
    public final klv b(final String s, final int n) {
        if (!this.a.n(s)) {
            final krr b = this.b;
            final StringBuilder sb = new StringBuilder(s.length() + 52);
            sb.append("Initializing default value (");
            sb.append(n);
            sb.append(") for key: (");
            sb.append(s);
            sb.append(")");
            b.f(sb.toString());
            this.a.i(s, n);
        }
        return new hix(this.a, s);
    }
    
    public final klv c(final String s, final String s2) {
        if (!this.a.n(s)) {
            final krr b = this.b;
            final StringBuilder sb = new StringBuilder(String.valueOf(s2).length() + 41 + String.valueOf(s).length());
            sb.append("Initializing default value (");
            sb.append(s2);
            sb.append(") for key: (");
            sb.append(s);
            sb.append(")");
            b.f(sb.toString());
            this.a.k(s, s2);
        }
        return new hkf(this.a, s);
    }
}
