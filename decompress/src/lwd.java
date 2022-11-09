import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lwd implements Runnable
{
    private final Object a;
    private final Executor b;
    private final lxh c;
    private final lwl d;
    
    public lwd(final Object a, final lwl d, final Executor b, final lxh c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        final Object a = this.a;
        final lwl d = this.d;
        final Executor b = this.b;
        final lxh c = this.c;
        try {
            d.a(a, b).c(odx.a, new lwf(c), new lwe(c)).h(lvm.a);
        }
        catch (final lwi lwi) {
            c.l(lwi);
        }
        finally {
            final Throwable t;
            c.l(lwi.a(t));
        }
    }
    
    @Override
    public final String toString() {
        return this.d.toString();
    }
}
