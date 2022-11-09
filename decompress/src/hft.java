import java.io.File;
import android.content.Context;
import android.os.Environment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hft implements oun
{
    private final pii a;
    
    public hft(final pii a) {
        this.a = a;
    }
    
    public final hhw a() {
        final hwp a = hku.a();
        final Context a2 = ((egg)this.a).a();
        File file;
        if (Environment.isExternalStorageEmulated()) {
            file = a2.getExternalFilesDir((String)null);
        }
        else {
            file = a2.getNoBackupFilesDir();
        }
        return new hhw(file, a2.getExternalFilesDir((String)null), a);
    }
}
