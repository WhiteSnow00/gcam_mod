import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class aos
{
    static final aos a;
    final Runnable b;
    final Executor c;
    aos d;
    
    static {
        a = new aos(null, null);
    }
    
    public aos(final Runnable b, final Executor c) {
        this.b = b;
        this.c = c;
    }
}
