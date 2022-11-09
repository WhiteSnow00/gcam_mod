// 
// Decompiled by Procyon v0.6.0
// 

public final class ldo
{
    public final long a;
    public volatile long b;
    
    public ldo(final long b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean a(long a, long n) {
        final long b = this.b;
        n = a - n + b;
        if (n == 0L) {
            return true;
        }
        a = this.a;
        if (a != 0L && n < a && n > -a) {
            this.b = b - n;
            return true;
        }
        return false;
    }
    
    public final boolean b(final long n, final long n2) {
        return n2 - n - this.b + this.a < 0L;
    }
}
