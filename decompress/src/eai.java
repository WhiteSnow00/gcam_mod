// 
// Decompiled by Procyon v0.6.0
// 

public final class eai
{
    double a;
    double b;
    boolean c;
    
    public eai() {
        this.a = Double.NaN;
        this.b = Double.NaN;
        this.c = false;
    }
    
    public final double a(double n) {
        if (!this.c) {
            this.b = n;
            this.a = n;
            this.c = true;
            return n;
        }
        final double n2 = n - this.b;
        this.b = n;
        n = n2;
        if (n2 > 180.0) {
            n = n2 - 360.0;
        }
        double n3 = n;
        if (n < -180.0) {
            n3 = n + 360.0;
        }
        n = this.a + n3;
        return this.a = n;
    }
}
