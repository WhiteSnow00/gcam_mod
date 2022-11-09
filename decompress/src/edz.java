import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edz
{
    private float a;
    private float b;
    private int c;
    
    public edz() {
        this.b();
    }
    
    public final void a(final TrackerStats trackerStats) {
        synchronized (this) {
            ++this.c;
            final float featureMotionInPixels = trackerStats.featureMotionInPixels;
            final int min = Math.min(trackerStats.numActiveTracks, 50);
            final float n = 1.0f / Math.min(this.c, 5);
            final float n2 = 1.0f - n;
            this.a = featureMotionInPixels * n + this.a * n2;
            this.b = n * (min / 50.0f) + n2 * this.b;
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0;
        }
    }
}
