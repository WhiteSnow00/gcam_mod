// 
// Decompiled by Procyon v0.6.0
// 

final class lmv
{
    final byte[] a;
    final int b;
    final int c;
    final int d;
    
    public lmv(final byte[] a, final int d, final int b, final int c) {
        final boolean b2 = true;
        njo.e(b >= 0, "offset must be >= 0");
        njo.e(c > 0, "length must be > 0");
        njo.e(c <= a.length && b2, "length exceeds data length");
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    final int a() {
        return this.c + 2;
    }
}
