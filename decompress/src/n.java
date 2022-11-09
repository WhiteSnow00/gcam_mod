import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public class n extends Service implements k
{
    private final x a;
    
    public n() {
        this.a = new x(this);
    }
    
    public final i aD() {
        return this.a.a;
    }
    
    public final IBinder onBind(final Intent intent) {
        this.a.a(g.b);
        return null;
    }
    
    public void onCreate() {
        this.a.a(g.a);
        super.onCreate();
    }
    
    public void onDestroy() {
        final x a = this.a;
        a.a(g.e);
        a.a(g.f);
        super.onDestroy();
    }
    
    public final void onStart(final Intent intent, final int n) {
        this.a.a(g.b);
        super.onStart(intent, n);
    }
}
