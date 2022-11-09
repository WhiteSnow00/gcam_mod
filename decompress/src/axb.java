import java.io.FileNotFoundException;
import java.io.IOException;
import android.content.ContentResolver;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class axb implements awp
{
    private final Uri a;
    private final ContentResolver b;
    private Object c;
    
    public axb(final ContentResolver b, final Uri a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void aI() {
    }
    
    protected abstract Object b(final Uri p0, final ContentResolver p1);
    
    protected abstract void c(final Object p0);
    
    @Override
    public final void d() {
        final Object c = this.c;
        if (c != null) {
            try {
                this.c(c);
            }
            catch (final IOException ex) {}
        }
    }
    
    @Override
    public final void f(final auo auo, final awo awo) {
        try {
            awo.b(this.c = this.b(this.a, this.b));
        }
        catch (final FileNotFoundException ex) {
            awo.e(ex);
        }
    }
    
    @Override
    public final int g() {
        return 1;
    }
}
