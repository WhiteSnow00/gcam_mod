// 
// Decompiled by Procyon v0.6.0
// 

final class p implements Runnable
{
    final /* synthetic */ s a;
    
    public p(final s a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a.b) {
            final Object g = this.a.g;
            this.a.g = s.a;
            monitorexit(this.a.b);
            this.a.g(g);
        }
    }
}
