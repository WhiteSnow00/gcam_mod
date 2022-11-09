import java.io.File;
import android.os.Environment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxk
{
    public static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/storage/module/StorageModule");
    }
    
    public static hwy a() {
        return new hwy(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera"));
    }
}
