// 
// Decompiled by Procyon v0.6.0
// 

final class arl implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ arm b;
    
    public arl(final arm b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final arm b = this.b;
        b.b.a(this.a, b.c);
    }
}
