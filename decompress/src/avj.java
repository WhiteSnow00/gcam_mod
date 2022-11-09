import java.io.IOException;
import java.io.File;
import java.io.Closeable;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

final class avj
{
    static final Charset a;
    
    static {
        a = Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
    }
    
    static void a(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (final Exception ex) {}
        catch (final RuntimeException ex2) {
            throw ex2;
        }
    }
    
    static void b(File file) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                file = listFiles[i];
                if (file.isDirectory()) {
                    b(file);
                }
                if (!file.delete()) {
                    final String value = String.valueOf(file);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 23);
                    sb.append("failed to delete file: ");
                    sb.append(value);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        final String value2 = String.valueOf(file);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 26);
        sb2.append("not a readable directory: ");
        sb2.append(value2);
        throw new IOException(sb2.toString());
    }
}
