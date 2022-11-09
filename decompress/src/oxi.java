import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oxi implements oxp
{
    public oxp b(final Runnable runnable) {
        return this.c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
    
    public abstract oxp c(final Runnable p0, final long p1, final TimeUnit p2);
}
