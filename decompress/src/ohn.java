import com.google.googlex.gcam.creativecamera.skysegmentation.SkySegmenterManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohn implements krc
{
    private long a;
    
    public ohn(final String s) {
        this.a = SkySegmenterManager.getReservation(s);
    }
    
    @Override
    public final void close() {
        final long a = this.a;
        if (a != 0L) {
            SkySegmenterManager.releaseReservation(a);
            this.a = 0L;
        }
    }
}
