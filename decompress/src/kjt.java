import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class kjt implements Runnable
{
    final /* synthetic */ kjv a;
    private final Future b;
    
    public kjt(final kjv a, final Future b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            ofi.u(this.b);
        }
        catch (final ExecutionException ex) {
            this.a.a.execute(new mpo(ex, 1));
        }
        finally {
            final Throwable t;
            this.a.a.execute(new jzd(t, 3));
        }
    }
}
