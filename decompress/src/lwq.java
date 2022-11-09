// 
// Decompiled by Procyon v0.6.0
// 

final class lwq extends lvn
{
    final /* synthetic */ int a;
    final /* synthetic */ lws b;
    
    public lwq(final lws b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Object o) {
        final lws b = this.b;
        b.b[this.a] = o;
        b.a();
    }
}
