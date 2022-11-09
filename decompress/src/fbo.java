import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbo
{
    public static final InputStream a(final String s) {
        try {
            return new BufferedInputStream(new FileInputStream(s));
        }
        catch (final FileNotFoundException ex) {
            a.k(fbp.a.c(), "Could not read file: %s, perhaps it is not a panorama.", s, '\u05eb');
            return null;
        }
    }
}
