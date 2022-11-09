import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class mnr extends ContentObserver
{
    public mnr() {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        moh.g();
    }
}
