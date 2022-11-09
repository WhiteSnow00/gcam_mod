// 
// Decompiled by Procyon v0.6.0
// 

final class abg implements Runnable
{
    final /* synthetic */ ho a;
    final /* synthetic */ Object b;
    
    public abg(final ho a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.a(this.b);
    }
}
