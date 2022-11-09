// 
// Decompiled by Procyon v0.6.0
// 

public final class aco
{
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final acf j;
    
    public aco() {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new acf();
    }
    
    public final float a() {
        return (float)this.i;
    }
    
    final acf b(double n, double n2, final long n3) {
        if (!this.c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            final double b = this.b;
            if (b > 1.0) {
                final double a = this.a;
                this.f = -b * a + a * Math.sqrt(b * b - 1.0);
                final double b2 = this.b;
                final double a2 = this.a;
                this.g = -b2 * a2 - a2 * Math.sqrt(b2 * b2 - 1.0);
            }
            else if (b >= 0.0 && b < 1.0) {
                this.h = this.a * Math.sqrt(1.0 - b * b);
            }
            this.c = true;
        }
        final double n4 = (double)n3;
        Double.isNaN(n4);
        final double n5 = n4 / 1000.0;
        final double n6 = n - this.i;
        final double b3 = this.b;
        if (b3 > 1.0) {
            n = this.g;
            n2 = (n * n6 - n2) / (n - this.f);
            final double n7 = n6 - n2;
            n = Math.pow(2.718281828459045, n * n5) * n7 + Math.pow(2.718281828459045, this.f * n5) * n2;
            final double g = this.g;
            final double pow = Math.pow(2.718281828459045, g * n5);
            final double f = this.f;
            n2 = n7 * g * pow + n2 * f * Math.pow(2.718281828459045, f * n5);
        }
        else if (b3 == 1.0) {
            n = this.a;
            n2 += n * n6;
            final double n8 = n6 + n2 * n5;
            n = Math.pow(2.718281828459045, -n * n5) * n8;
            final double pow2 = Math.pow(2.718281828459045, -this.a * n5);
            final double n9 = -this.a;
            n2 = n8 * pow2 * n9 + n2 * Math.pow(2.718281828459045, n9 * n5);
        }
        else {
            final double h = this.h;
            n = this.a;
            n2 = 1.0 / h * (b3 * n * n6 + n2);
            n = Math.pow(2.718281828459045, -b3 * n * n5) * (Math.cos(this.h * n5) * n6 + Math.sin(this.h * n5) * n2);
            final double a3 = this.a;
            final double b4 = this.b;
            final double pow3 = Math.pow(2.718281828459045, -b4 * a3 * n5);
            final double h2 = this.h;
            final double sin = Math.sin(h2 * n5);
            final double h3 = this.h;
            n2 = -a3 * n * b4 + pow3 * (-h2 * n6 * sin + n2 * h3 * Math.cos(h3 * n5));
        }
        final acf j = this.j;
        j.a = (float)(n + this.i);
        j.b = (float)n2;
        return j;
    }
    
    public final void c(final float n) {
        this.i = n;
    }
}
