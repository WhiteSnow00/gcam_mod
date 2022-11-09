import java.io.IOException;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class awm implements awp
{
    private final String a;
    private final AssetManager b;
    private Object c;
    
    public awm(final AssetManager b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void aI() {
    }
    
    protected abstract Object b(final AssetManager p0, final String p1);
    
    @Override
    public final void d() {
        final Object c = this.c;
        if (c != null) {
            try {
                this.e(c);
            }
            catch (final IOException ex) {}
        }
    }
    
    protected abstract void e(final Object p0);
    
    @Override
    public final void f(final auo auo, final awo awo) {
        try {
            awo.b(this.c = this.b(this.b, this.a));
        }
        catch (final IOException ex) {
            awo.e(ex);
        }
    }
    
    @Override
    public final int g() {
        return 1;
    }
}
