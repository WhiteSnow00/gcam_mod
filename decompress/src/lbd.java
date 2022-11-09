// 
// Decompiled by Procyon v0.6.0
// 

public final class lbd
{
    public final lhl a;
    private final kzt b;
    
    public lbd(final lhl a, final kzt b) {
        this.a = a;
        this.b = b;
    }
    
    public final lhk a(final long n) {
        return (lhk)this.b.a(new lba(this, n));
    }
    
    public final lhk b(final ldk ldk) {
        return (lhk)this.b.b(ldk, new lbb(ldk));
    }
}
