import java.io.IOException;
import java.io.FileOutputStream;
import java.nio.file.Paths;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyz
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/debug/api/DebugDataSavers");
    }
    
    public static void a(final byte[] array, final String s) {
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(Paths.get(s, "debug_3a.bin").toString());
            try {
                fileOutputStream.write(array);
                fileOutputStream.close();
            }
            finally {
                try {
                    fileOutputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)(Object)array).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {
            a.k(dyz.a.c(), "3A_DEBUG, error putting 3a debug data to additional path. %s.", ex.getMessage(), '\u040c');
        }
    }
}
