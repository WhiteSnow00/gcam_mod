// 
// Decompiled by Procyon v0.6.0
// 

final class fts implements frl
{
    final /* synthetic */ ftt a;
    
    public fts(final ftt a) {
        this.a = a;
    }
    
    @Override
    public final void a(final lju lju) {
        this.a.d.post((Runnable)new ftr(this, lju));
    }
    
    @Override
    public final void close() {
        this.a.e.b("DBG closing sink");
        this.a.d.post((Runnable)new ftq(this));
    }
}
