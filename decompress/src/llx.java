import android.os.Environment;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public enum llx
{
    a("DCIM", 0), 
    b("PICTURES", 1), 
    c("MOVIES", 2), 
    d("APP_DATA", 3), 
    e("APP_CACHE", 4);
    
    private llx(final String s, final int n) {
    }
    
    public final File a(final Context context) {
        switch (this.ordinal()) {
            default: {
                final String value = String.valueOf(this);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 23);
                sb.append("Unknown MediaDirectory ");
                sb.append(value);
                throw new IllegalStateException(sb.toString());
            }
            case 4: {
                return context.getCacheDir();
            }
            case 3: {
                return context.getFilesDir();
            }
            case 2: {
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
            }
            case 1: {
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            }
            case 0: {
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            }
        }
    }
    
    public final boolean b() {
        switch (this.ordinal()) {
            default: {
                return false;
            }
            case 0:
            case 1:
            case 2: {
                return true;
            }
        }
    }
    
    public final boolean c(final String s) {
        switch (this.ordinal()) {
            default: {
                return false;
            }
            case 3:
            case 4: {
                return true;
            }
            case 2: {
                return lou.d(s);
            }
            case 1: {
                return lou.c(s);
            }
            case 0: {
                return lou.c(s) || lou.d(s);
            }
        }
    }
}
