// 
// Decompiled by Procyon v0.6.0
// 

final class tz
{
    int a;
    int b;
    int c;
    int d;
    int e;
    
    public tz() {
        this.a = 0;
    }
    
    static final int e(final int n, final int n2) {
        if (n > n2) {
            return 1;
        }
        if (n == n2) {
            return 2;
        }
        return 4;
    }
    
    final void a(final int n) {
        this.a |= n;
    }
    
    final void b() {
        this.a = 0;
    }
    
    final void c(final int b, final int c, final int d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    final boolean d() {
        final int a = this.a;
        if ((a & 0x7) != 0x0 && (a & e(this.d, this.b)) == 0x0) {
            return false;
        }
        final int a2 = this.a;
        if ((a2 & 0x70) != 0x0 && (a2 & e(this.d, this.c) << 4) == 0x0) {
            return false;
        }
        final int a3 = this.a;
        if ((a3 & 0x700) != 0x0 && (a3 & e(this.e, this.b) << 8) == 0x0) {
            return false;
        }
        final int a4 = this.a;
        return (a4 & 0x7000) == 0x0 || (a4 & e(this.e, this.c) << 12) != 0x0;
    }
}
