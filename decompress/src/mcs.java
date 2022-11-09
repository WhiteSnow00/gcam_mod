import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcs implements mcr
{
    public final ofn b;
    private final mcf c;
    
    public mcs(final mcf c) {
        this.c = c;
        this.b = ofn.f();
    }
    
    @Override
    public final void a(final mbd mbd) {
        this.c.b(mbd.b, mbd.c);
        mbd.close();
    }
    
    @Override
    public final void b(final MediaFormat mediaFormat) {
        this.b.o(mediaFormat);
    }
}
