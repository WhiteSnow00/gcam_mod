// 
// Decompiled by Procyon v0.6.0
// 

final class hly implements krc
{
    final /* synthetic */ hlz a;
    final /* synthetic */ hma b;
    
    public hly(final hma b, final hlz a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void close() {
        synchronized (this.b) {
            this.b.a.remove(this.a);
        }
    }
}
