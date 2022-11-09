// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bdt
{
    public static final bdt a;
    public static final bdt b;
    public static final bdt c;
    public static final bdt d;
    public static final bdt e;
    public static final awf f;
    static final boolean g;
    
    static {
        a = new bdr();
        b = new bdp();
        final bdt e2 = c = new bdq();
        d = new bds();
        e = e2;
        f = awf.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", e2);
        g = true;
    }
    
    public abstract float a(final int p0, final int p1, final int p2, final int p3);
    
    public abstract int b(final int p0, final int p1, final int p2, final int p3);
}
