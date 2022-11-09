// 
// Decompiled by Procyon v0.6.0
// 

final class bsu implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ bsv b;
    
    public bsu(final bsv b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a.execute(this.a);
    }
}
