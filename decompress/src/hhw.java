import java.io.IOException;
import java.io.FileFilter;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhw
{
    private static final nsd a;
    private final niz b;
    private final niz c;
    private final hwp d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/session/SessionStorageManagerImpl");
    }
    
    public hhw(final File file, final File file2, final hwp d) {
        this.b = niz.h(file);
        this.c = niz.h(file2);
        this.d = d;
    }
    
    private final void b(File file) {
        final File[] listFiles = file.listFiles(new hhv());
        if (listFiles == null) {
            return;
        }
        final int length = listFiles.length;
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < length; ++i) {
            file = listFiles[i];
            file.getAbsolutePath();
            if (file.lastModified() < -86400000L + currentTimeMillis) {
                try {
                    this.d.a(file);
                }
                catch (final IOException ex) {
                    a.k(hhw.a.c(), "Could not clean up %s", file.getAbsolutePath(), '\u091a');
                }
            }
        }
    }
    
    public final File a(String value) {
        if (this.b.g()) {
            final File file = new File((File)this.b.c(), value);
            Object o = hwp.a;
            synchronized (o) {
                final boolean directory = file.isDirectory();
                boolean b = true;
                if (!directory) {
                    if (!file.mkdirs()) {
                        b = false;
                    }
                }
                monitorexit(o);
                if (!b) {
                    o = String.valueOf(file);
                    final StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 36);
                    sb.append("Could not create session directory: ");
                    sb.append((String)o);
                    throw new IOException(sb.toString());
                }
                if (file.isDirectory()) {
                    this.b(file);
                    this.b(new File((File)this.c.c(), value));
                    return file;
                }
                value = String.valueOf(file);
                o = new StringBuilder(String.valueOf(value).length() + 38);
                ((StringBuilder)o).append("Session directory is not a directory: ");
                ((StringBuilder)o).append(value);
                throw new IOException(((StringBuilder)o).toString());
            }
        }
        throw new IOException("Could retrieve baseDirectory.");
    }
}
