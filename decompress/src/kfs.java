// 
// Decompiled by Procyon v0.6.0
// 

final class kfs implements Runnable
{
    final /* synthetic */ kgf a;
    final /* synthetic */ kft b;
    
    public kfs(final kft b, final kgf a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.a(this.b.a);
        this.a.a(this.b.a.e);
    }
}
