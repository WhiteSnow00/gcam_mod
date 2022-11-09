import android.os.Binder;
import android.os.IBinder;
import android.content.ServiceConnection;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfb
{
    public static final nsd a;
    public final Context b;
    public final Object c;
    public final ServiceConnection d;
    public dfa e;
    public final IBinder f;
    public ngw g;
    public final ngx h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/elmyra/ElmyraClient");
    }
    
    public dfb(final Context b) {
        this.f = (IBinder)new Binder();
        this.b = b;
        this.c = new Object();
        this.h = new ngx(this);
        this.d = (ServiceConnection)new dez(this);
    }
}
