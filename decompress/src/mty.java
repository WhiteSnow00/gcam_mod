import android.system.StructStat;
import android.system.Os;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.io.File;
import java.io.IOException;
import android.net.Uri$Builder;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public class mty
{
    public static Uri a(final Uri uri, final String s) {
        final Uri$Builder buildUpon = uri.buildUpon();
        final String value = String.valueOf(uri.getPath());
        String concat;
        if (s.length() != 0) {
            concat = value.concat(s);
        }
        else {
            concat = new String(value);
        }
        return buildUpon.path(concat).build();
    }
    
    public static IOException b(final mrs mrs, final Uri uri, final IOException ex) {
        try {
            final msl msl = new msl();
            msl.a = true;
            final File file = (File)mrs.b(uri, msl);
            IOException ex2;
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            ex2 = e(file, ex);
                        }
                        else {
                            ex2 = e(file, ex);
                        }
                    }
                    else if (file.canWrite()) {
                        ex2 = e(file, ex);
                    }
                    else {
                        ex2 = e(file, ex);
                    }
                }
                else if (file.canRead()) {
                    if (file.canWrite()) {
                        ex2 = e(file, ex);
                    }
                    else {
                        ex2 = e(file, ex);
                    }
                }
                else if (file.canWrite()) {
                    ex2 = e(file, ex);
                }
                else {
                    ex2 = e(file, ex);
                }
            }
            else {
                ex2 = e(file, ex);
            }
            return ex2;
        }
        catch (final IOException ex3) {
            return new IOException(ex);
        }
    }
    
    public static Object c(final Callable callable) {
        try {
            return callable.call();
        }
        finally {
            final Throwable t;
            throw new IOException(t);
        }
    }
    
    private static IOException d(final File file, final IOException ex) {
        String s = "Inoperable file:";
        try {
            final String value = String.valueOf(String.format(Locale.US, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), file.getFreeSpace()));
            if (value.length() != 0) {
                s = "Inoperable file:".concat(value);
            }
            else {
                s = new String("Inoperable file:");
            }
            try {
                final StructStat stat = Os.stat(file.getCanonicalPath());
                final String value2 = String.valueOf(s);
                final String value3 = String.valueOf(String.format(Locale.US, " mode[%d]", stat.st_mode));
                if (value3.length() != 0) {
                    s = value2.concat(value3);
                    return new IOException(s, ex);
                }
                s = new String(value2);
                return new IOException(s, ex);
            }
            catch (final IOException ex2) {}
            catch (final Exception ex3) {}
        }
        catch (final IOException ex4) {}
        s = String.valueOf(s).concat(" failed");
        return new IOException(s, ex);
    }
    
    private static IOException e(final File file, final IOException ex) {
        final File parentFile = file.getParentFile();
        if (parentFile == null) {
            return d(file, ex);
        }
        if (!parentFile.exists()) {
            return d(file, ex);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return d(file, ex);
                }
                return d(file, ex);
            }
            else {
                if (parentFile.canWrite()) {
                    return d(file, ex);
                }
                return d(file, ex);
            }
        }
        else if (parentFile.canRead()) {
            if (parentFile.canWrite()) {
                return d(file, ex);
            }
            return d(file, ex);
        }
        else {
            if (parentFile.canWrite()) {
                return d(file, ex);
            }
            return d(file, ex);
        }
    }
}
