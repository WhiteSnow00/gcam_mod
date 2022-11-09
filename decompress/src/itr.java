// 
// Decompiled by Procyon v0.6.0
// 

final class itr implements Runnable
{
    final /* synthetic */ kjm a;
    final /* synthetic */ Runnable b;
    
    public itr(final kjm a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.execute(this.b);
    }
}
