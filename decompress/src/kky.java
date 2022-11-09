// 
// Decompiled by Procyon v0.6.0
// 

final class kky implements krc
{
    final /* synthetic */ kjc a;
    final /* synthetic */ kkz b;
    
    public kky(final kkz b, final kjc a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void close() {
        this.b.b.remove(this.a);
    }
}
