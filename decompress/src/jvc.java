import android.content.ServiceConnection;
import android.os.Handler$Callback;
import android.os.Handler;
import android.content.Context;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvc
{
    public static final Object a;
    public static jvc b;
    public final HashMap c;
    public final Context d;
    public final Handler e;
    public final jwl f;
    public final long g;
    private final long h;
    
    static {
        a = new Object();
    }
    
    public jvc() {
    }
    
    public jvc(final Context context) {
        this.c = new HashMap();
        this.d = context.getApplicationContext();
        this.e = new kax(context.getMainLooper(), (Handler$Callback)new jve(this));
        this.f = jwl.a();
        this.h = 5000L;
        this.g = 300000L;
    }
    
    public final void a(final String s, String value, final ServiceConnection serviceConnection, final boolean b) {
        final jvb jvb = new jvb(s, value, b);
        synchronized (this.c) {
            final jvd jvd = this.c.get(jvb);
            if (jvd == null) {
                final String value2 = String.valueOf(jvb);
                final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(value2);
                throw new IllegalStateException(sb.toString());
            }
            if (jvd.b(serviceConnection)) {
                jvd.a.remove(serviceConnection);
                if (jvd.c()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, (Object)jvb), this.h);
                }
                return;
            }
            value = String.valueOf(jvb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 76);
            sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
