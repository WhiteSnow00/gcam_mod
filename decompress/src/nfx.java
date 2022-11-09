import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfx
{
    private static nfx b;
    public final Object a;
    
    private nfx() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), (Handler$Callback)new nfv(this));
    }
    
    public static nfx a() {
        if (nfx.b == null) {
            nfx.b = new nfx();
        }
        return nfx.b;
    }
}
