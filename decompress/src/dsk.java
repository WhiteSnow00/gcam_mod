// 
// Decompiled by Procyon v0.6.0
// 

final class dsk implements Runnable
{
    final /* synthetic */ Object a;
    
    public dsk(final Object a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }
}
