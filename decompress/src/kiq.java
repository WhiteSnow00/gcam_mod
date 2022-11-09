import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class kiq extends ContentObserver
{
    public kiq() {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        kir.e.set(true);
    }
}
