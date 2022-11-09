import android.graphics.Path;
import android.graphics.Matrix;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfm extends nfo
{
    private static final RectF h;
    @Deprecated
    public final float a;
    @Deprecated
    public final float b;
    @Deprecated
    public final float c;
    @Deprecated
    public final float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    
    static {
        h = new RectF();
    }
    
    public nfm(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final Matrix matrix, final Path path) {
        final Matrix g = this.g;
        matrix.invert(g);
        path.transform(g);
        final RectF h = nfm.h;
        h.set(this.a, this.b, this.c, this.d);
        path.arcTo(h, this.e, this.f, false);
        path.transform(matrix);
    }
}
