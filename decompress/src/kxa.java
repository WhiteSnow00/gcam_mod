// 
// Decompiled by Procyon v0.6.0
// 

public final class kxa
{
    private kxd a;
    private niz b;
    private niz c;
    private kre d;
    private Integer e;
    private Integer f;
    private niz g;
    private Boolean h;
    private Boolean i;
    
    public kxa() {
    }
    
    public kxa(final byte[] array) {
        this.b = nii.a;
        this.c = nii.a;
        this.g = nii.a;
    }
    
    public final kxb a() {
        final kxd a = this.a;
        if (a != null) {
            final kre d = this.d;
            if (d != null) {
                final Integer e = this.e;
                if (e != null && this.f != null && this.h != null) {
                    if (this.i != null) {
                        final kxb kxb = new kxb(a, this.b, this.c, d, e, this.f, this.g, this.h, this.i);
                        final int f = kxb.f;
                        final boolean b = false;
                        njo.p(f > 0 || f == -1, "Capacity should be positive or -1");
                        njo.p(kxb.d.b() > 0L, "Size area must be positive");
                        njo.p(kxb.e >= 0, "Format must be valid");
                        njo.p(kxb.a != null, "StreamType cannot be null");
                        njo.p(kxb.d != null || b, "Size cannot be null");
                        return kxb;
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.d == null) {
            sb.append(" size");
        }
        if (this.e == null) {
            sb.append(" imageFormat");
        }
        if (this.f == null) {
            sb.append(" capacity");
        }
        if (this.h == null) {
            sb.append(" forCapture");
        }
        if (this.i == null) {
            sb.append(" ignoreMemoryLimits");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final lfj lfj) {
        this.b = niz.i(lfj);
    }
    
    public final void c(final int n) {
        this.f = n;
    }
    
    public final void d(final boolean b) {
        this.h = b;
    }
    
    public final void e(final boolean b) {
        this.i = b;
    }
    
    public final void f(final int n) {
        this.e = n;
    }
    
    public final void g(final kre d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null size");
    }
    
    public final void h(final kxd a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null type");
    }
    
    public final void i(final long n) {
        this.g = niz.i(n);
    }
}
