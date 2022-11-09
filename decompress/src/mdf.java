import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdf implements mde
{
    final /* synthetic */ mde a;
    final /* synthetic */ Iterable b;
    private final boolean c;
    
    public mdf(final mde a, final Iterable b) {
        this.a = a;
        this.b = b;
        this.c = false;
    }
    
    @Override
    public final lwk a() {
        synchronized (this) {
            return lwk.i(this.a.a().j(odx.a, new mdg(this.b)));
        }
    }
    
    @Override
    public final Object bF() {
        synchronized (this) {
            throw null;
        }
    }
    
    @Override
    public final Object c() {
        return this.a.c();
    }
    
    @Override
    public final void close() {
        lwt.f(this.a());
    }
}
