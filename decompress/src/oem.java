import java.util.concurrent.Executor;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oem extends oek implements oey
{
    protected oem() {
    }
    
    protected abstract oey c();
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        this.c().d(runnable, executor);
    }
}
