import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbs extends mbt
{
    private final AutoCloseable b;
    
    public mbs(final mbv mbv, final AutoCloseable b) {
        super(mbv);
        this.b = b;
    }
    
    @Override
    public final void e(final int n) {
        try {
            this.b.close();
        }
        catch (final Exception ex) {
            Log.w("CloseOnStopListener", "Exception while trying to close object.", (Throwable)ex);
        }
        super.e(n);
    }
}
