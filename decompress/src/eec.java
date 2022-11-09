import com.google.android.apps.camera.imax.cyclops.image.CyclopsPhotoWriter;
import com.google.geo.lightfield.processing.ProgressCallback;
import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eec implements eeb
{
    static {
        System.loadLibrary("cyclops");
    }
    
    @Override
    public final void a(final StereoPanorama stereoPanorama, final String s, final ProgressCallback progressCallback) {
        progressCallback.setProgress(0.2f);
        CyclopsPhotoWriter.writeToFile(stereoPanorama.a, stereoPanorama.b, stereoPanorama.c, stereoPanorama.d, s);
    }
}
