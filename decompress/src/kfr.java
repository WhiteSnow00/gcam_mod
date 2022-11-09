// 
// Decompiled by Procyon v0.6.0
// 

final class kfr implements Runnable
{
    final /* synthetic */ kht a;
    final /* synthetic */ kft b;
    
    public kfr(final kft b, final kht a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a.a(this.a);
    }
}
