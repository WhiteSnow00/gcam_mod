import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class bbh implements awp
{
    private final File a;
    private final bbi b;
    private Object c;
    
    public bbh(final File a, final bbi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Class a() {
        return this.b.a();
    }
    
    @Override
    public final void aI() {
    }
    
    @Override
    public final void d() {
        final Object c = this.c;
        if (c != null) {
            try {
                this.b.c(c);
            }
            catch (final IOException ex) {}
        }
    }
    
    @Override
    public final void f(final auo auo, final awo awo) {
        try {
            awo.b(this.c = this.b.b(this.a));
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
