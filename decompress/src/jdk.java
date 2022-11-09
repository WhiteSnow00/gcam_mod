// 
// Decompiled by Procyon v0.6.0
// 

public final class jdk
{
    public final double[] a;
    
    public jdk() {
        this.a = new double[9];
    }
    
    public static void b(final jdk jdk, final jdk jdk2, final jdk jdk3) {
        final double[] a = jdk.a;
        final double n = a[0];
        final double[] a2 = jdk2.a;
        final double n2 = a2[0];
        final double n3 = a[1];
        final double n4 = a2[3];
        final double n5 = a[2];
        final double n6 = a2[6];
        final double n7 = a2[1];
        final double n8 = a2[4];
        final double n9 = a2[7];
        final double n10 = a2[2];
        final double n11 = a2[5];
        final double n12 = a2[8];
        final double n13 = a[3];
        final double n14 = a[4];
        final double n15 = a[5];
        final double n16 = a[6];
        final double n17 = a[7];
        final double n18 = a[8];
        jdk3.f(n * n2 + n3 * n4 + n5 * n6, n * n7 + n3 * n8 + n5 * n9, n * n10 + n3 * n11 + n5 * n12, n13 * n2 + n14 * n4 + n15 * n6, n13 * n7 + n14 * n8 + n15 * n9, n13 * n10 + n14 * n11 + n15 * n12, n2 * n16 + n4 * n17 + n6 * n18, n7 * n16 + n8 * n17 + n9 * n18, n16 * n10 + n17 * n11 + n18 * n12);
    }
    
    public static void c(final jdk jdk, final jdn jdn, final jdn jdn2) {
        final double[] a = jdk.a;
        final double n = a[0];
        final double a2 = jdn.a;
        final double n2 = a[1];
        final double b = jdn.b;
        final double n3 = a[2];
        final double c = jdn.c;
        final double n4 = a[3];
        final double n5 = a[4];
        final double n6 = a[5];
        final double n7 = a[6];
        final double n8 = a[7];
        final double n9 = a[8];
        jdn2.a = n * a2 + n2 * b + n3 * c;
        jdn2.b = n4 * a2 + n5 * b + n6 * c;
        jdn2.c = n7 * a2 + n8 * b + n9 * c;
    }
    
    public final double a(final int n, final int n2) {
        return this.a[n * 3 + n2];
    }
    
    public final void d(final jdk jdk) {
        final double[] a = this.a;
        final double[] a2 = jdk.a;
        a[0] = a2[0];
        a[1] = a2[1];
        a[2] = a2[2];
        a[3] = a2[3];
        a[4] = a2[4];
        a[5] = a2[5];
        a[6] = a2[6];
        a[7] = a2[7];
        a[8] = a2[8];
    }
    
    public final void e(final int n, final int n2, final double n3) {
        this.a[n * 3 + n2] = n3;
    }
    
    public final void f(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9) {
        final double[] a = this.a;
        a[0] = n;
        a[1] = n2;
        a[2] = n3;
        a[3] = n4;
        a[4] = n5;
        a[5] = n6;
        a[6] = n7;
        a[7] = n8;
        a[8] = n9;
    }
    
    public final void g(final int n, final jdn jdn) {
        final double[] a = this.a;
        a[n] = jdn.a;
        a[n + 3] = jdn.b;
        a[n + 6] = jdn.c;
    }
    
    public final void h() {
        final double[] a = this.a;
        a[6] = (a[7] = 0.0);
        a[3] = (a[5] = 0.0);
        a[1] = (a[2] = 0.0);
        a[8] = 1.0;
        a[0] = (a[4] = 1.0);
    }
    
    public final void i(final double n) {
        final double[] a = this.a;
        a[8] = n;
        a[0] = (a[4] = n);
    }
    
    public final void j() {
        final double[] a = this.a;
        a[8] = 0.0;
        a[6] = (a[7] = 0.0);
        a[4] = (a[5] = 0.0);
        a[2] = (a[3] = 0.0);
        a[0] = (a[1] = 0.0);
    }
    
    public final void k(final jdk jdk) {
        final double[] a = this.a;
        final double n = a[1];
        final double n2 = a[2];
        final double n3 = a[5];
        final double[] a2 = jdk.a;
        a2[0] = a[0];
        a2[1] = a[3];
        a2[2] = a[6];
        a2[3] = n;
        a2[4] = a[4];
        a2[5] = a[7];
        a2[6] = n2;
        a2[7] = n3;
        a2[8] = a[8];
    }
    
    public final void l(final jdk jdk) {
        final double n = this.a(0, 0) * (this.a(1, 1) * this.a(2, 2) - this.a(2, 1) * this.a(1, 2)) - this.a(0, 1) * (this.a(1, 0) * this.a(2, 2) - this.a(1, 2) * this.a(2, 0)) + this.a(0, 2) * (this.a(1, 0) * this.a(2, 1) - this.a(1, 1) * this.a(2, 0));
        if (n == 0.0) {
            return;
        }
        final double n2 = 1.0 / n;
        final double[] a = this.a;
        final double n3 = a[4];
        final double n4 = a[8];
        final double n5 = a[7];
        final double n6 = a[5];
        final double n7 = a[1];
        final double n8 = a[2];
        final double n9 = a[3];
        final double n10 = a[6];
        final double n11 = a[0];
        jdk.f((n3 * n4 - n5 * n6) * n2, -(n7 * n4 - n8 * n5) * n2, (n7 * n6 - n8 * n3) * n2, -(n9 * n4 - n6 * n10) * n2, (n4 * n11 - n8 * n10) * n2, -(n6 * n11 - n8 * n9) * n2, (n9 * n5 - n10 * n3) * n2, -(n11 * n5 - n10 * n7) * n2, (n11 * n3 - n9 * n7) * n2);
    }
}
