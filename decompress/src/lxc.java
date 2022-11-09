import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lxc implements Runnable
{
    private final Object a;
    private final Executor b;
    private final lxh c;
    private final lwl d;
    private final lza e;
    
    public lxc(final Object a, final lwl d, final Executor b, final lxh c, final lza e, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        lxh.n(this.a, this.d, this.b, this.c);
    }
    
    @Override
    public final String toString() {
        return this.d.toString();
    }
}
