// 
// Decompiled by Procyon v0.6.0
// 

final class atw implements Runnable
{
    final /* synthetic */ atx a;
    
    public atw(final atx a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }
}
