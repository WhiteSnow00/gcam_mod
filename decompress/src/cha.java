// 
// Decompiled by Procyon v0.6.0
// 

final class cha extends kxc
{
    final /* synthetic */ chc a;
    
    public cha(final chc a) {
        this.a = a;
    }
    
    @Override
    public final void aL(final kwz kwz, final long n) {
        synchronized (this.a.c) {
            if (kwz.equals(this.a.i)) {
                chc.a.c().E(430).q("onBufferLost in viewfinderStream => frame number: %d", n);
            }
            else if (kwz.equals(this.a.j)) {
                chc.a.c().E(429).q("onBufferLost in recordingStream => frame number: %d", n);
            }
        }
    }
}
