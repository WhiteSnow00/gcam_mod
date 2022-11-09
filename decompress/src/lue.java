import android.media.MediaFormat;
import java.nio.charset.StandardCharsets;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lue
{
    public lue() {
        final short[][] a = ltz.a;
    }
    
    public static byte[] a(final String s) {
        final byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        if (bytes.length == 4) {
            return bytes;
        }
        final StringBuilder sb = new StringBuilder(s.length() + 27);
        sb.append("Type \"");
        sb.append(s);
        sb.append("\" is not 4 characters");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static long b(final long n, final long n2) {
        return n * n2 / 1000000L;
    }
    
    public static niz c(final MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return niz.i(mediaFormat.getInteger("time-lapse-fps"));
        }
        return nii.a;
    }
    
    public static boolean d(final MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("audio/");
    }
    
    public static boolean e(final MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("video/");
    }
}
