// 
// Decompiled by Procyon v0.6.0
// 

final class jns implements jnb
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ jnu b;
    
    public jns(final jnu b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.b.a.post(this.a);
    }
}
