import android.graphics.Path;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nfo
{
    protected final Matrix g;
    
    public nfo() {
        this.g = new Matrix();
    }
    
    public abstract void a(final Matrix p0, final Path p1);
}
