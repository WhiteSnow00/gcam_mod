import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

class ojv extends oju
{
    private static final long serialVersionUID = 1L;
    protected final byte[] a;
    
    public ojv(final byte[] a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw null;
    }
    
    @Override
    public byte a(final int n) {
        return this.a[n];
    }
    
    @Override
    public byte b(final int n) {
        return this.a[n];
    }
    
    protected int c() {
        return 0;
    }
    
    @Override
    public int d() {
        return this.a.length;
    }
    
    @Override
    protected void e(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(this.a, n, array, n2, n3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ojw)) {
            return false;
        }
        if (this.d() != ((ojw)o).d()) {
            return false;
        }
        if (this.d() == 0) {
            return true;
        }
        if (o instanceof ojv) {
            final ojv ojv = (ojv)o;
            final int c = super.c;
            final int c2 = ojv.c;
            return (c == 0 || c2 == 0 || c == c2) && this.g(ojv, 0, this.d());
        }
        return o.equals(this);
    }
    
    @Override
    public final boolean g(final ojw ojw, int d, final int n) {
        if (n > ojw.d()) {
            d = this.d();
            final StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(n);
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
        final int n2 = d + n;
        if (n2 > ojw.d()) {
            final int d2 = ojw.d();
            final StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(d);
            sb2.append(", ");
            sb2.append(n);
            sb2.append(", ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (ojw instanceof ojv) {
            final ojv ojv = (ojv)ojw;
            final byte[] a = this.a;
            final byte[] a2 = ojv.a;
            int c;
            int i;
            for (c = this.c(), i = this.c(), d += ojv.c(); i < c + n; ++i, ++d) {
                if (a[i] != a2[d]) {
                    return false;
                }
            }
            return true;
        }
        return ojw.k(d, n2).equals(this.k(0, n));
    }
    
    @Override
    protected final int i(final int n, final int n2, final int n3) {
        return olk.d(n, this.a, this.c() + n2, n3);
    }
    
    @Override
    protected final int j(final int n, int n2, final int n3) {
        n2 += this.c();
        final byte[] a = this.a;
        final pjv a2 = onu.a;
        return pjv.o(n, a, n2, n3 + n2);
    }
    
    @Override
    public final ojw k(final int n, int q) {
        q = ojw.q(n, q, this.d());
        if (q == 0) {
            return ojw.b;
        }
        return new ojs(this.a, this.c() + n, q);
    }
    
    @Override
    public final okb l() {
        return okb.K(this.a, this.c(), this.d());
    }
    
    @Override
    protected final String m(final Charset charset) {
        return new String(this.a, this.c(), this.d(), charset);
    }
    
    @Override
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.a, this.c(), this.d()).asReadOnlyBuffer();
    }
    
    @Override
    public final void o(final ojp ojp) {
        ojp.a(this.a, this.c(), this.d());
    }
    
    @Override
    public final boolean p() {
        final int c = this.c();
        return onu.h(this.a, c, this.d() + c);
    }
}
