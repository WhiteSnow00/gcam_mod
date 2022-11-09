// 
// Decompiled by Procyon v0.6.0
// 

final class gxt implements Runnable
{
    final /* synthetic */ gxu a;
    
    public gxt(final gxu a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (this.a.a.decrementAndGet() == 0) {
            synchronized (this.a.c) {
                this.a.a();
            }
        }
    }
}
