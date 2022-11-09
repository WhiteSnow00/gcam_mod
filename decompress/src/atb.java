// 
// Decompiled by Procyon v0.6.0
// 

final class atb implements Runnable
{
    final /* synthetic */ atc a;
    
    public atb(final atc a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a.b) {
            this.a.b.notifyAll();
        }
    }
}
