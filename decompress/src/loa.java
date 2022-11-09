import android.net.Uri;
import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loa extends ContentObserver
{
    final /* synthetic */ lob a;
    
    public loa(final lob a, final Handler handler) {
        this.a = a;
        super(handler);
    }
    
    public final void onChange(final boolean b, final Uri uri) {
        this.a.b();
    }
}
