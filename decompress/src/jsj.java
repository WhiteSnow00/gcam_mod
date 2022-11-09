// 
// Decompiled by Procyon v0.6.0
// 

final class jsj implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ jsm b;
    
    public jsj(final jsm b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.k(this.a);
    }
}
