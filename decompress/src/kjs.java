import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjs implements Executor
{
    static final kjm a;
    public final kjm b;
    private final Executor c;
    
    static {
        a = new kjm(kjm.a);
    }
    
    public kjs(final Executor c) {
        final kjm a = kjs.a;
        this.b = a;
        this.c = c;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.c.execute(new kjr(this, runnable));
    }
}
