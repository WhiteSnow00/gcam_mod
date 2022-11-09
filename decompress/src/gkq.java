import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gkq implements liq
{
    final /* synthetic */ Executor a;
    final /* synthetic */ kri b;
    
    public gkq(final Executor a, final kri b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void aY(final kra kra) {
        this.a.execute(new gkp(this, kra));
    }
}
