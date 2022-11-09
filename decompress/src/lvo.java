import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class lvo implements Runnable
{
    private final oey a;
    
    public lvo(final oey a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            ofi.v(this.a);
        }
        catch (final ofw ofw) {
            throw njt.a(lwi.a(ofw.getCause()));
        }
    }
}
