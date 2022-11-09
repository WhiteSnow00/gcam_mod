// 
// Decompiled by Procyon v0.6.0
// 

final class bqy implements krc
{
    final /* synthetic */ bqz a;
    private final kjk b;
    
    public bqy(final bqz a, final kjk b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void close() {
        synchronized (this.a.a) {
            this.b.close();
        }
    }
}
