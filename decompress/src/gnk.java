import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnk implements gna
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/aaa/illumination/PckTorchIlluminationController");
    }
    
    public static final void c(final kwh ex, final boolean b) {
        try {
            final kvq a = ((kwh)ex).a();
            ((lbf)a).c = 1;
            int n;
            if (!b) {
                n = 0;
            }
            else {
                n = 2;
            }
            ((lbf)a).e = n;
            ((kwh)ex).b(((lbf)a).e()).get();
            return;
        }
        catch (final CancellationException ex) {}
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex) {}
        catch (final kuw kuw) {}
        a.m(gnk.a.b(), "Couldn't set the torch state", '\u0763', ex);
    }
    
    @Override
    public final gmz a(final kwh kwh) {
        c(kwh, true);
        return new gnj(kwh);
    }
    
    @Override
    public final void b() {
    }
}
