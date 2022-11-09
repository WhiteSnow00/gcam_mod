import com.google.geo.lightfield.processing.ProgressCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ebj implements ProgressCallback
{
    final /* synthetic */ ebk a;
    
    public ebj(final ebk a) {
        this.a = a;
    }
    
    @Override
    public final void setProgress(final float n) {
        this.a.a.b(krd.b(n));
    }
    
    @Override
    public final void setRange(final float n, final float n2) {
    }
    
    @Override
    public final boolean wasCancelled() {
        return false;
    }
}
