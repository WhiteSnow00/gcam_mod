// 
// Decompiled by Procyon v0.6.0
// 

public final class jdb implements krc
{
    final /* synthetic */ jdc a;
    
    public jdb(final jdc a) {
        this.a = a;
        a.a.incrementAndGet();
    }
    
    @Override
    public final void close() {
        this.a.a.decrementAndGet();
    }
}
