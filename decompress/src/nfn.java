import android.graphics.Path;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfn extends nfo
{
    public float a;
    public float b;
    
    @Override
    public final void a(final Matrix matrix, final Path path) {
        final Matrix g = this.g;
        matrix.invert(g);
        path.transform(g);
        path.lineTo(this.a, this.b);
        path.transform(matrix);
    }
}
