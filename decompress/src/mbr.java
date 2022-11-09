import android.media.MediaFormat;
import android.view.Surface;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbr
{
    public final Object a;
    public nir b;
    public Handler c;
    public boolean d;
    public Surface e;
    private final MediaFormat f;
    private final mcf g;
    private mbw h;
    
    public mbr() {
        this.a = new Object();
        final niu a = niu.a;
        throw null;
    }
    
    public mbr(final MediaFormat f, final mcf g) {
        this.a = new Object();
        this.b = niu.a;
        this.f = f;
        this.c = null;
        this.g = g;
        this.h = new mbw(mbv.c);
        this.d = false;
        this.e = null;
    }
    
    public final void b(final mbv mbv) {
        this.h = new mbw(mbv);
    }
}
