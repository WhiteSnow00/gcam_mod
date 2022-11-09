import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lwn implements Runnable
{
    final /* synthetic */ lxh a;
    final /* synthetic */ Callable b;
    
    public lwn(final lxh a, final Callable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            final lxh a = this.a;
            final Object call = this.b.call();
            call.getClass();
            a.k(call);
        }
        catch (final Exception ex) {
            this.a.l(lwi.a(ex));
        }
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
