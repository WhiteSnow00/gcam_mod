// 
// Decompiled by Procyon v0.6.0
// 

final class lmt implements lmw
{
    private final byte[] a;
    private int b;
    
    public lmt(final byte[] a) {
        this.a = a;
        this.b = 0;
    }
    
    private final int e() {
        return this.a.length - this.b;
    }
    
    @Override
    public final int a() {
        final int b = this.b;
        final byte[] a = this.a;
        if (b < a.length) {
            this.b = b + 1;
            return a[b] & 0xFF;
        }
        return -1;
    }
    
    @Override
    public final lmv b(int min, final int n) {
        min = Math.min(min, this.e());
        final lmv lmv = new lmv(this.a, n, this.b, min);
        this.b += min;
        return lmv;
    }
    
    @Override
    public final void c(final int n) {
        this.b += Math.min(n, this.e());
    }
    
    @Override
    public final lmv d() {
        return this.b(this.a.length - this.b, 218);
    }
}
