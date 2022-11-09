// 
// Decompiled by Procyon v0.6.0
// 

public final class dsz
{
    public final jdn a;
    private final jdn b;
    private final jdn c;
    private final jdn d;
    private final jdn e;
    private final jdk f;
    private final jdk g;
    
    public dsz() {
        this.b = new jdn();
        this.c = new jdn();
        this.d = new jdn();
        this.e = new jdn();
        this.f = new jdk();
        this.g = new jdk();
        this.a = new jdn();
    }
    
    public static final void b(final jdn jdn, final jdk jdk) {
        final double a = jdn.a(jdn, jdn);
        final double sqrt = Math.sqrt(a);
        double n = 0.5;
        double n2;
        if (a < 1.0E-8) {
            n2 = 1.0 - a * 0.1666666716337204;
        }
        else if (a < 1.0E-6) {
            n = 0.5 - 0.0416666679084301 * a;
            final double n3 = a * 0.1666666716337204;
            n2 = 1.0 - n3 * (1.0 - n3);
        }
        else {
            final double n4 = 1.0 / sqrt;
            final double sin = Math.sin(sqrt);
            final double cos = Math.cos(sqrt);
            n2 = sin * n4;
            n = n4 * n4 * (1.0 - cos);
        }
        final double a2 = jdn.a;
        final double n5 = a2 * a2;
        final double b = jdn.b;
        final double n6 = b * b;
        final double c = jdn.c;
        final double n7 = c * c;
        jdk.e(0, 0, 1.0 - (n6 + n7) * n);
        jdk.e(1, 1, 1.0 - (n7 + n5) * n);
        jdk.e(2, 2, 1.0 - (n5 + n6) * n);
        final double n8 = jdn.c * n2;
        final double n9 = jdn.a * jdn.b * n;
        jdk.e(0, 1, n9 - n8);
        jdk.e(1, 0, n9 + n8);
        final double n10 = jdn.b * n2;
        final double n11 = jdn.a * jdn.c * n;
        jdk.e(0, 2, n11 + n10);
        jdk.e(2, 0, n11 - n10);
        final double n12 = n2 * jdn.a;
        final double n13 = n * (jdn.b * jdn.c);
        jdk.e(1, 2, n13 - n12);
        jdk.e(2, 1, n13 + n12);
    }
    
    public final void a(final jdn jdn, final jdn jdn2, final jdk jdk) {
        jdk.h();
        jdn.c(jdn, jdn2, this.c);
        if (this.c.b() == 0.0) {
            return;
        }
        this.d.f(jdn);
        this.e.f(jdn2);
        this.c.d();
        this.d.d();
        this.e.d();
        final jdk f = this.f;
        f.g(0, this.d);
        f.g(1, this.c);
        jdn.c(this.c, this.d, this.b);
        f.g(2, this.b);
        final jdk g = this.g;
        g.g(0, this.e);
        g.g(1, this.c);
        jdn.c(this.c, this.e, this.b);
        g.g(2, this.b);
        final double[] a = f.a;
        final double n = a[1];
        a[1] = a[3];
        a[3] = n;
        final double n2 = a[2];
        a[2] = a[6];
        a[6] = n2;
        final double n3 = a[5];
        a[5] = a[7];
        a[7] = n3;
        jdk.b(g, f, jdk);
    }
}
