import androidx.work.RxWorker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajd implements Runnable, oxl
{
    public final aox a;
    private oxp b;
    
    public ajd() {
        (this.a = aox.h()).d(this, RxWorker.f);
    }
    
    public final void a() {
        final oxp b = this.b;
        if (b != null) {
            b.bX();
        }
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.f(t);
    }
    
    @Override
    public final void bV(final oxp b) {
        this.b = b;
    }
    
    @Override
    public final void d(final Object o) {
        this.a.e(o);
    }
    
    @Override
    public final void run() {
        if (this.a.isCancelled()) {
            this.a();
        }
    }
}
