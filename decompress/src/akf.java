import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akf
{
    public static final String a;
    public static final String[] b;
    
    static {
        a = aiy.b("WrkDbPathHelper");
        b = new String[] { "-journal", "-shm", "-wal" };
    }
    
    public static File a(final Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }
    
    public static String b() {
        return "androidx.work.workdb";
    }
}
