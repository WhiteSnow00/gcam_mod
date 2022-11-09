import android.content.res.Resources;
import android.content.Context;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqa
{
    private static boolean a;
    
    private mqa() {
    }
    
    static void a(final ofb ofb) {
        synchronized (mqa.class) {
            if (!mqa.a) {
                final TimeUnit minutes = TimeUnit.MINUTES;
                mpp.a(ofb.d(new mpz(ofb, minutes), 10L, minutes));
                mqa.a = true;
            }
        }
    }
    
    public static String b(final InputStream inputStream, final long n, int read) {
        final byte[] array = new byte[1024];
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(n);
            int i = read;
            if (read <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                read = inputStream.read(array, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(array, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            }
            catch (final UnsupportedEncodingException ex) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", ex);
            }
        }
        catch (final IOException ex2) {
            throw new RuntimeException("Failed to read license or metadata text.", ex2);
        }
    }
    
    public static String c(final Context context, final String s, final long n, final int n2) {
        final Resources resources = context.getApplicationContext().getResources();
        return b(resources.openRawResource(resources.getIdentifier(s, "raw", resources.getResourcePackageName(2131427569))), n, n2);
    }
}
