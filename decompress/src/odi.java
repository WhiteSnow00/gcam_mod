// 
// Decompiled by Procyon v0.6.0
// 

final class odi implements Runnable
{
    final /* synthetic */ nnj a;
    final /* synthetic */ odj b;
    
    public odi(final odj b, final nnj a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.i(this.a);
    }
}
