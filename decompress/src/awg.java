import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awg implements awc
{
    private final yu b;
    
    public awg() {
        this.b = new bij();
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        int n = 0;
        while (true) {
            final yu b = this.b;
            if (n >= b.j) {
                break;
            }
            final awf awf = (awf)b.f(n);
            final Object i = this.b.i(n);
            final awe b2 = awf.b;
            if (awf.d == null) {
                awf.d = awf.c.getBytes(awc.a);
            }
            b2.a(awf.d, i, messageDigest);
            ++n;
        }
    }
    
    public final Object b(final awf awf) {
        Object o;
        if (this.b.containsKey(awf)) {
            o = this.b.get(awf);
        }
        else {
            o = awf.a;
        }
        return o;
    }
    
    public final void c(final awg awg) {
        this.b.k(awg.b);
    }
    
    public final void d(final awf awf, final Object o) {
        this.b.put(awf, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof awg && this.b.equals(((awg)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
        sb.append("Options{values=");
        sb.append(value);
        sb.append('}');
        return sb.toString();
    }
}
