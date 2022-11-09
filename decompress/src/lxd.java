import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lxd
{
    public lxd a;
    public final Executor b;
    public final Runnable c;
    public final lxh d;
    
    public lxd(final Executor b, final Runnable c) {
        this.b = b;
        this.c = c;
        this.d = null;
    }
    
    public lxd(final Executor b, final Runnable c, final lxh d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
