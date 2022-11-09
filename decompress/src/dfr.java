// 
// Decompiled by Procyon v0.6.0
// 

final class dfr implements krc
{
    final /* synthetic */ dfz a;
    final /* synthetic */ dfs b;
    
    public dfr(final dfs b, final dfz a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void close() {
        this.b.a.remove(this.a);
    }
}
