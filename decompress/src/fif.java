import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.HandlerThread;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import android.content.Context;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fif implements oun
{
    private final /* synthetic */ int a;
    
    public fif() {
    }
    
    public fif(final int a) {
        this.a = a;
    }
    
    public static MediaFormat a() {
        final MediaFormat audioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 2);
        audioFormat.setInteger("aac-profile", 2);
        audioFormat.setInteger("bitrate", 128000);
        audioFormat.setInteger("max-input-size", dqd.a);
        audioFormat.setInteger("oo.muxer.force_sequential", 1);
        pqf.k(audioFormat);
        return audioFormat;
    }
    
    public static MediaFormat b() {
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "application/microvideo-meta-stream");
        mediaFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        return mediaFormat;
    }
    
    public static igj c() {
        return new ify(nii.a, nii.a, null);
    }
}
