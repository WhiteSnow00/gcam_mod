import android.hardware.HardwareBuffer;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ogz
{
    long create(final long p0, final String p1, final String p2);
    
    void delete(final long p0);
    
    void finishCapture(final long p0);
    
    void notifySurfaceChanged(final long p0, final Surface p1);
    
    void processAndCloseFrame(final long p0, final long p1, final HardwareBuffer p2, final Runnable p3, final long p4, final long p5);
    
    void startCapture(final long p0, final long p1, final String p2, final Runnable p3, final Runnable p4, final Runnable p5);
}
