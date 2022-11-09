import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public interface edh
{
    float getCaptureProgress();
    
    Bitmap getPreview(final int p0);
    
    Texture getPreviewAsTexture();
    
    void getTrackerStats(final TrackerStats p0);
    
    void release();
    
    void setMetaData(final float p0, final int p1, final boolean p2, final int p3, final boolean p4);
    
    void startCapture();
    
    int stopCapture(final String p0);
    
    boolean trackTexture(final float[] p0, final float[] p1);
}
