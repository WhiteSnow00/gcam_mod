import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class grr implements gab
{
    final /* synthetic */ Executor a;
    final /* synthetic */ Runnable b;
    
    public grr(final Executor a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final oey a() {
        this.a.execute(this.b);
        return ofi.n(true);
    }
    
    @Override
    public final oey b() {
        return ofi.n(false);
    }
}
