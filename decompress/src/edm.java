import java.io.IOException;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edm implements eeh
{
    public static final nsd a;
    public MediaCodec b;
    public boolean c;
    public boolean d;
    private final MediaFormat e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/audio/AudioEncoder");
    }
    
    public edm() {
        final MediaCodec encoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        final MediaFormat audioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
        this.c = false;
        this.d = false;
        this.b = encoderByType;
        this.e = audioFormat;
    }
    
    @Override
    public final MediaCodec a() {
        return this.b;
    }
    
    @Override
    public final void b() {
        this.c = true;
    }
    
    @Override
    public final void c() {
        this.d = false;
        this.b.stop();
        this.b.release();
    }
    
    @Override
    public final boolean d() {
        if (this.d) {
            a.l(edm.a.b(), "AudioEncoder already started!", '\u045b');
            return true;
        }
        this.e.setInteger("aac-profile", 2);
        this.e.setInteger("bitrate", 128000);
        this.e.setInteger("max-input-size", 16384);
        try {
            this.b.configure(this.e, (Surface)null, (MediaCrypto)null, 1);
            this.b.start();
            return this.d = true;
        }
        catch (final Exception ex) {
            a.m(edm.a.b(), "Exception when configuring MediaCodec.", '\u045a', ex);
            this.b.release();
            try {
                this.b = MediaCodec.createEncoderByType("audio/mp4a-latm");
            }
            catch (final IOException ex2) {
                ex2.printStackTrace();
            }
            return false;
        }
    }
}
