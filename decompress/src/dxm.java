// 
// Decompiled by Procyon v0.6.0
// 

final class dxm implements Runnable
{
    final /* synthetic */ dxn a;
    private final boolean b;
    
    public dxm(final dxn a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        synchronized (this.a) {
            this.a.a = this.b;
        }
    }
}
