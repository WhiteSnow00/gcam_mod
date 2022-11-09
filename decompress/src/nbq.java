import java.io.InputStream;
import java.io.Closeable;
import java.io.StringWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbq
{
    public static final nte a;
    
    static {
        a = nte.g("RxUploadClient");
    }
    
    public static final String a(oqz oqz) {
        final InputStream c = oqz.c;
        c.getClass();
        oqz = (oqz)new BufferedReader(new InputStreamReader(c, pmx.a), 8192);
        try {
            final StringWriter stringWriter = new StringWriter();
            final char[] array = new char[8192];
            for (int i = ((Reader)oqz).read(array); i >= 0; i = ((Reader)oqz).read(array)) {
                stringWriter.write(array, 0, i);
            }
            final String string = stringWriter.toString();
            string.getClass();
            pkh.c((Closeable)oqz, null);
            return string;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                pkh.c((Closeable)oqz, t);
                while (true) {}
            }
        }
    }
}
