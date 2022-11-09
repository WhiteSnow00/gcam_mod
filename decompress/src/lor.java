import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lor
{
    private final Context a;
    private final Object b;
    private File c;
    
    public lor(final Context context) {
        this.b = new Object();
        this.a = context.getApplicationContext();
    }
    
    public final File a() {
        synchronized (this.b) {
            if (this.c == null) {
                this.c = this.a.getDataDir();
            }
            return this.c;
        }
    }
}
