import android.media.MediaFormat;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqe
{
    public static final kre a;
    public static final kre b;
    public static final kre c;
    public static final kre d;
    public static final kre e;
    public static final kre f;
    public static final long g;
    public static final long h;
    
    static {
        a = kre.h(1024, 768);
        b = kre.h(1280, 720);
        c = kre.h(2048, 1536);
        d = kre.h(1920, 1080);
        kre.h(4032, 3024);
        kre.h(4032, 2268);
        e = kre.h(2880, 2160);
        f = kre.h(3840, 2160);
        g = TimeUnit.MICROSECONDS.convert(1L, TimeUnit.SECONDS) / 30L;
        h = TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS) / 30L;
        Math.max(2.0f, 0.23333333f);
    }
    
    public static int a(final MediaFormat mediaFormat) {
        return mediaFormat.getInteger("width") * mediaFormat.getInteger("height") * 3 / 2;
    }
}
