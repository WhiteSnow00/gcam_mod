import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class bsp
{
    public static bsk c(final Runnable runnable) {
        return new bsl(runnable);
    }
    
    public static bsk d(final Runnable runnable, final Executor executor) {
        return new bsm(executor, runnable);
    }
    
    public void a() {
        throw null;
    }
    
    public void b() {
    }
}
