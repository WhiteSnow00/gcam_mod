// 
// Decompiled by Procyon v0.6.0
// 

final class chh extends kxc
{
    final /* synthetic */ chj a;
    
    public chh(final chj a) {
        this.a = a;
    }
    
    @Override
    public final void aL(final kwz kwz, final long n) {
        synchronized (this.a.c) {
            if (kwz.equals(this.a.g)) {
                chj.a.c().E(446).q("onBufferLost in viewfinderStream => frame number: %d", n);
            }
            else if (kwz.equals(this.a.h)) {
                chj.a.c().E(445).q("onBufferLost in recordingStream => frame number: %d", n);
            }
        }
    }
}
