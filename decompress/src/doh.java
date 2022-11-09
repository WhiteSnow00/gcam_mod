import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doh implements oen
{
    private final /* synthetic */ int a;
    
    public doh() {
    }
    
    public doh(final int a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.a) {
            default: {
                return;
            }
            case 2: {
                a.m(meu.g().c(), "Failed to add examples", '\u0c07', t);
                return;
            }
            case 1: {
                a.m(bzh.a.b(), "Failed to clear all examples", '\u00f6', t);
                return;
            }
            case 0: {
                if (t instanceof CancellationException) {
                    a.m(doj.a.c(), "Photos launch was cancelled", '\u033d', t);
                    return;
                }
                throw new IllegalStateException("Error during photos launch", t);
            }
        }
    }
}
