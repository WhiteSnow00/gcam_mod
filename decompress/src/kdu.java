// 
// Decompiled by Procyon v0.6.0
// 

final class kdu implements Runnable
{
    final /* synthetic */ kdv a;
    
    public kdu(final kdv a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a.a) {
            this.a.b.a.countDown();
        }
    }
}
