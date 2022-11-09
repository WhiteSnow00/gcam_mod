// 
// Decompiled by Procyon v0.6.0
// 

public final class pbf extends owx
{
    final int b;
    
    public pbf(final int b) {
        this.b = b;
    }
    
    public final void k(final psr psr) {
        if (psr instanceof oyx) {
            psr.bY(new pbd((oyx)psr, this.b));
            return;
        }
        psr.bY(new pbe(psr, this.b));
    }
}
