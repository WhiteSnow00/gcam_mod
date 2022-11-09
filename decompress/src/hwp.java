import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwp
{
    public static final Object a;
    
    static {
        a = new Object();
    }
    
    public final void a(final File file) {
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        final File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (final File file2 : listFiles) {
            if (file2.isDirectory()) {
                this.a(file2);
            }
            if (!file2.delete()) {
                final String value = String.valueOf(file2.getAbsolutePath());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to delete file: ".concat(value);
                }
                else {
                    concat = new String("Failed to delete file: ");
                }
                throw new IOException(concat);
            }
        }
        file.delete();
    }
}
