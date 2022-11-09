import android.os.HandlerThread;
import android.content.Context;
import android.os.Looper;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Intent;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public class kfu extends Service implements kfi, kfe
{
    public kfo a;
    public Intent b;
    public final Object c;
    public boolean d;
    public final kge e;
    private ComponentName f;
    private IBinder g;
    private Looper h;
    
    public kfu() {
        this.c = new Object();
        this.e = new kge(new mcn(), null, null, null);
    }
    
    public void a(final kht kht) {
        throw null;
    }
    
    public final void b(final kgg kgg) {
    }
    
    public final void c(final kgg kgg) {
    }
    
    public final void d(final kgg kgg) {
    }
    
    public final void e(final kgg kgg) {
    }
    
    public final IBinder onBind(final Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.g;
        }
        return null;
    }
    
    public final void onCreate() {
        super.onCreate();
        this.f = new ComponentName((Context)this, this.getClass().getName());
        if (this.h == null) {
            final HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.h = handlerThread.getLooper();
        }
        this.a = new kfo(this, this.h);
        (this.b = new Intent("com.google.android.gms.wearable.BIND_LISTENER")).setComponent(this.f);
        this.g = (IBinder)new kft(this);
    }
    
    public final void onDestroy() {
        synchronized (this.c) {
            this.d = true;
            final kfo a = this.a;
            if (a != null) {
                a.getLooper().quit();
                a.a();
                monitorexit(this.c);
                super.onDestroy();
                return;
            }
            final String value = String.valueOf(this.f);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 111);
            sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
            sb.append(value);
            throw new IllegalStateException(sb.toString());
        }
    }
}
