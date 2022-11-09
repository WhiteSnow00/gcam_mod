import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asn implements asi
{
    public final Handler a;
    public final asi b;
    
    private asn(final asi b) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = b;
    }
    
    public static asn e(final Handler handler, final asi asi) {
        if (handler != null) {
            return new asn(asi);
        }
        return null;
    }
    
    @Override
    public final void a(final int n) {
        this.a.post((Runnable)new ask(this, n));
    }
    
    @Override
    public final void b(final asx asx) {
        this.a.post((Runnable)new asj(this, asx));
    }
    
    @Override
    public final void c(final int n, final String s) {
        this.a.post((Runnable)new asl(this, n, s, 1));
    }
    
    @Override
    public final void d(final int n, final String s) {
        this.a.post((Runnable)new asl(this, n, s));
    }
}
