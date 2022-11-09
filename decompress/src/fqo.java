import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqo implements fut
{
    public final fut a;
    public final gry b;
    private final Handler c;
    
    public fqo(final fut a, final Handler c, final gry b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final int a() {
        return Integer.MAX_VALUE;
    }
    
    @Override
    public final void b(final kvs kvs, final fvn fvn, final fvd fvd, final fus fus) {
        synchronized (this) {
            this.c.postDelayed((Runnable)new fql(fus, new fqn(this, kvs, fvn, fvd)), 100L);
        }
    }
    
    @Override
    public final boolean c(final kvs kvs, final gry gry) {
        return this.a.c(kvs, gry);
    }
}
