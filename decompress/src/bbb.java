import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class bbb implements awp
{
    private final File a;
    
    public bbb(final File a) {
        this.a = a;
    }
    
    @Override
    public final Class a() {
        return ByteBuffer.class;
    }
    
    @Override
    public final void aI() {
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void f(final auo auo, final awo awo) {
        try {
            awo.b(bii.b(this.a));
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
