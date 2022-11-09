import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czp extends ContentObserver
{
    public boolean a;
    public fkx b;
    private boolean c;
    
    public czp() {
        super((Handler)null);
        this.c = false;
        this.a = false;
    }
    
    public final void a(final boolean c) {
        if (!(this.c = c)) {
            this.a = false;
        }
    }
    
    public final void onChange(final boolean b) {
        if (this.c) {
            this.a = true;
        }
    }
}
