// 
// Decompiled by Procyon v0.6.0
// 

final class atp implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ att b;
    
    public atp(final att b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a.a(this.a);
    }
}
