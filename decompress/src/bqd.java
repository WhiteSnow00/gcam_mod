import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqd implements hub
{
    private final bnf a;
    private final ofn b;
    private final krr c;
    
    public bqd(final bnf a, final ofn b, final krr krr) {
        this.a = a;
        this.b = b;
        this.c = krr.a("CameraDeviceVerifier");
    }
    
    @Override
    public final void run() {
        final bnf a = this.a;
        try {
            if (((dep)a.a().get()).a) {
                this.b.o(btv.a);
                return;
            }
            this.c.f("Unable to retrieve camera devices.");
            return;
        }
        catch (final ExecutionException a) {}
        catch (final InterruptedException ex) {}
        throw new IllegalStateException("No Cameras are currently available.", (Throwable)a);
    }
}
