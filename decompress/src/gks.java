import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gks implements Runnable
{
    final /* synthetic */ Executor a;
    final /* synthetic */ kri b;
    final /* synthetic */ gku c;
    
    public gks(final gku c, final Executor a, final kri b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.execute(new gkr(this, this.c.a.a()));
    }
}
