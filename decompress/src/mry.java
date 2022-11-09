import android.os.SystemClock;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mry
{
    public static final File a(final Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new msd("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty((CharSequence)uri.getQuery())) {
            throw new msd("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty((CharSequence)uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new msd("Did not expect uri to have authority");
    }
    
    public static File b(final Context context) {
        final File filesDir = context.getFilesDir();
        File filesDir2;
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir2 = context.getFilesDir();
            if (filesDir2 == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        else {
            filesDir2 = filesDir;
        }
        return filesDir2;
    }
    
    public static int c(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
}
