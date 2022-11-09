import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afk implements afd
{
    public final Object a;
    public afj b;
    public boolean c;
    private final Context d;
    private final String e;
    private final aez f;
    private final boolean g;
    
    public afk(final Context d, final String e, final aez f, final boolean g) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = new Object();
    }
    
    private final afj b() {
        synchronized (this.a) {
            if (this.b == null) {
                final afh[] array = { null };
                final String e = this.e;
                if (e != null && this.g) {
                    this.b = new afj(this.d, new File(this.d.getNoBackupFilesDir(), this.e).getAbsolutePath(), array, this.f);
                }
                else {
                    this.b = new afj(this.d, e, array, this.f);
                }
                this.b.setWriteAheadLoggingEnabled(this.c);
            }
            return this.b;
        }
    }
    
    @Override
    public final afh a() {
        return this.b().c();
    }
    
    @Override
    public final void close() {
        this.b().close();
    }
}
