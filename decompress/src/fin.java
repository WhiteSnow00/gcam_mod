import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fin
{
    public static MediaFormat a(final kre kre, final int n, final float n2, final boolean b) {
        final MediaFormat videoFormat = MediaFormat.createVideoFormat("video/avc", kre.a, kre.b);
        videoFormat.setInteger("bitrate", n);
        videoFormat.setInteger("frame-rate", 30);
        videoFormat.setInteger("color-format", 21);
        videoFormat.setInteger("color-standard", 2);
        videoFormat.setInteger("color-transfer", 3);
        videoFormat.setInteger("color-range", 1);
        videoFormat.setFloat("i-frame-interval", n2);
        videoFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        if (b) {
            videoFormat.setInteger("profile", 8);
            videoFormat.setInteger("level", 32768);
        }
        return videoFormat;
    }
}
