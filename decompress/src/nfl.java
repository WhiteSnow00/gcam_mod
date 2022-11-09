// 
// Decompiled by Procyon v0.6.0
// 

final class nfl extends nfp
{
    private final nfn a;
    private final float b;
    private final float c;
    
    public nfl(final nfn a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    final float a() {
        final nfn a = this.a;
        return (float)Math.toDegrees(Math.atan((a.b - this.c) / (a.a - this.b)));
    }
}
