// 
// Decompiled by Procyon v0.6.0
// 

final class dlk implements dll
{
    final /* synthetic */ long a;
    private long b;
    
    public dlk(final long n) {
        this.a = n;
        this.b = n;
    }
    
    @Override
    public final long a() {
        return this.b;
    }
    
    @Override
    public final boolean b() {
        final long b = this.b;
        long min = 1L;
        if (b >= 1L) {
            min = Math.min(b + 1L, Long.MAX_VALUE);
        }
        if (min > this.b) {
            this.b = min;
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean c() {
        final long max = Math.max(this.b - 1L, 1L);
        if (max < this.b) {
            this.b = max;
            return true;
        }
        return false;
    }
}
