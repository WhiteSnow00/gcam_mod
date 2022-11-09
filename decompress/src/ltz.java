import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltz
{
    public static final short[][] a;
    public static final short[] b;
    
    static {
        a = new short[][] { { 2, 2 }, { 1, 1 }, { 5, 6 }, { 5, 1 }, { 6, 6 }, { 6, 7 }, { 9, 9 }, { 9, 10 }, { 4, 4 }, { 8, 9 } };
        b = new short[] { 2, 8, 13, 1, 4, 5, 16, 18 };
    }
    
    public static int a(final MediaFormat mediaFormat, final String s) {
        if (mediaFormat.containsKey(s)) {
            return mediaFormat.getInteger(s);
        }
        return 0;
    }
}
