// 
// Decompiled by Procyon v0.6.0
// 

final class atr implements Runnable
{
    final /* synthetic */ RuntimeException a;
    final /* synthetic */ att b;
    
    public atr(final att b, final RuntimeException a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a.c(this.a);
    }
}
