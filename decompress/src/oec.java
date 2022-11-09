// 
// Decompiled by Procyon v0.6.0
// 

final class oec implements Runnable
{
    final /* synthetic */ ofv a;
    final /* synthetic */ ofn b;
    final /* synthetic */ oey c;
    final /* synthetic */ oey d;
    final /* synthetic */ oee e;
    
    public oec(final ofv a, final ofn b, final oey c, final oey d, final oee e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        if (this.a.isDone()) {
            this.b.e(this.c);
            return;
        }
        if (this.d.isCancelled() && this.e.compareAndSet(oed.a, oed.b)) {
            this.a.cancel(false);
        }
    }
}
