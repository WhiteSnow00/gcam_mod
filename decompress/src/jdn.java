// 
// Decompiled by Procyon v0.6.0
// 

public final class jdn
{
    public double a;
    public double b;
    public double c;
    
    public static double a(final jdn jdn, final jdn jdn2) {
        return jdn.a * jdn2.a + jdn.b * jdn2.b + jdn.c * jdn2.c;
    }
    
    public static void c(final jdn jdn, final jdn jdn2, final jdn jdn3) {
        final double b = jdn.b;
        final double c = jdn2.c;
        final double c2 = jdn.c;
        final double b2 = jdn2.b;
        final double a = jdn2.a;
        final double a2 = jdn.a;
        jdn3.g(b * c - c2 * b2, c2 * a - c * a2, a2 * b2 - b * a);
    }
    
    public final double b() {
        final double a = this.a;
        final double b = this.b;
        final double c = this.c;
        return Math.sqrt(a * a + b * b + c * c);
    }
    
    public final void d() {
        final double b = this.b();
        if (b != 0.0) {
            this.e(1.0 / b);
        }
    }
    
    public final void e(final double n) {
        this.a *= n;
        this.b *= n;
        this.c *= n;
    }
    
    public final void f(final jdn jdn) {
        this.a = jdn.a;
        this.b = jdn.b;
        this.c = jdn.c;
    }
    
    public final void g(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void h() {
        this.c = 0.0;
        this.b = 0.0;
        this.a = 0.0;
    }
}
