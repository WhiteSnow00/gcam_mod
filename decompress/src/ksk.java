import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksk implements Executor
{
    private final Executor a;
    private final kse b;
    private final String c;
    
    public ksk(final Executor a, final kse b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(this.b.c(this.c, runnable));
    }
}
