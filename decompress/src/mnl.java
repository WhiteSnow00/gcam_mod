import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class mnl extends ContentObserver
{
    final /* synthetic */ mnm a;
    
    public mnl(final mnm a) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        this.a.d();
    }
}
