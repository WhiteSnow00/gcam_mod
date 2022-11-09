import java.io.IOException;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class jwp
{
    public static void a(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final IOException ex) {}
        }
    }
}
