import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class klc implements kri
{
    Object a;
    final /* synthetic */ Executor b;
    final /* synthetic */ kri c;
    
    public klc(final Executor b, final kri c) {
        this.b = b;
        this.c = c;
        this.a = null;
    }
    
    @Override
    public final void aR(final Object a) {
        if (!nqb.E(this.a, a)) {
            this.a = a;
            this.b.execute(new kln(this.c, a, 1));
        }
    }
}
