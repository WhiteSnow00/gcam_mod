// 
// Decompiled by Procyon v0.6.0
// 

final class den implements Runnable
{
    final /* synthetic */ deq a;
    
    public den(final deq a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final dep a = this.a.a();
        synchronized (this.a.a) {
            final deq a2 = this.a;
            final ofn b = a2.b;
            a2.b = null;
            monitorexit(this.a.a);
            b.getClass();
            b.o(a);
        }
    }
}
