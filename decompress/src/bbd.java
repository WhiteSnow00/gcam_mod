import java.io.ByteArrayInputStream;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class bbd implements awp
{
    private final String a;
    private Object b;
    
    public bbd(final String a) {
        this.a = a;
    }
    
    @Override
    public final Class a() {
        return InputStream.class;
    }
    
    @Override
    public final void aI() {
    }
    
    @Override
    public final void d() {
        try {
            ((InputStream)this.b).close();
        }
        catch (final IOException ex) {}
    }
    
    @Override
    public final void f(final auo auo, final awo awo) {
        try {
            final String a = this.a;
            if (!a.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            final int index = a.indexOf(44);
            if (index == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (a.substring(0, index).endsWith(";base64")) {
                awo.b(this.b = new ByteArrayInputStream(Base64.decode(a.substring(index + 1), 0)));
                return;
            }
            throw new IllegalArgumentException("Not a base64 image data URL.");
        }
        catch (final IllegalArgumentException ex) {
            awo.e(ex);
        }
    }
    
    @Override
    public final int g() {
        return 1;
    }
}
