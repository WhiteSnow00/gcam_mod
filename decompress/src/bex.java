import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bex implements awi
{
    public static final awf a;
    public static final awf b;
    private final bev c;
    private final azk d;
    
    static {
        a = awf.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new bes(1));
        b = awf.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new bes());
    }
    
    public bex(final azk d, final bev c) {
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final aza a(Object scaledFrameAtTime, final int n, final int n2, final awg awg) {
        final long longValue = (long)awg.b(bex.a);
        if (longValue < 0L && longValue != -1L) {
            final StringBuilder sb = new StringBuilder(83);
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
        Integer value;
        if ((value = (Integer)awg.b(bex.b)) == null) {
            value = 2;
        }
        bdt e;
        if ((e = (bdt)awg.b(bdt.f)) == null) {
            e = bdt.e;
        }
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.c.a(mediaMetadataRetriever, scaledFrameAtTime);
            final int intValue = value;
            scaledFrameAtTime = null;
            if (n != Integer.MIN_VALUE && n2 != Integer.MIN_VALUE && e != bdt.d) {
                try {
                    int int1 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    final int int2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    final int int3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                    int n3;
                    if (int3 != 90 && int3 != 270) {
                        n3 = int2;
                    }
                    else {
                        n3 = int1;
                        int1 = int2;
                    }
                    final float a = e.a(int1, n3, n, n2);
                    scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(int1 * a), Math.round(a * n3));
                }
                finally {}
            }
            Object frameAtTime;
            if ((frameAtTime = scaledFrameAtTime) == null) {
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
            }
            if (frameAtTime != null) {
                mediaMetadataRetriever.close();
                return bdf.f((Bitmap)frameAtTime, this.d);
            }
            scaledFrameAtTime = new bew();
            throw scaledFrameAtTime;
        }
        finally {
            mediaMetadataRetriever.close();
        }
    }
    
    @Override
    public final boolean b(final Object o, final awg awg) {
        return true;
    }
}
