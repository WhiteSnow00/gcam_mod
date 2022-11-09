// 
// Decompiled by Procyon v0.6.0
// 

final class dji implements Runnable
{
    final /* synthetic */ djj a;
    
    public dji(final djj a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final djj a = this.a;
        a.g = false;
        a.h.start();
    }
}
