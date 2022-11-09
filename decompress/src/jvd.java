import java.util.Iterator;
import android.os.Message;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import java.util.HashMap;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.Map;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class jvd implements ServiceConnection, jvf
{
    public final Map a;
    public int b;
    public boolean c;
    public IBinder d;
    public final jvb e;
    public ComponentName f;
    final /* synthetic */ jvc g;
    
    public jvd(final jvc g, final jvb e) {
        this.g = g;
        this.e = e;
        this.a = new HashMap();
        this.b = 2;
    }
    
    public final void a(final String s) {
        this.b = 3;
        final jvc g = this.g;
        final jwl f = g.f;
        final Context d = g.d;
        final jvb e = this.e;
        final boolean e2 = e.e;
        final Intent intent = null;
        final Intent intent2 = null;
        Intent intent4;
        if (e2) {
            final Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", e.b);
            Bundle call;
            try {
                call = d.getContentResolver().call(jvb.a, "serviceIntentCall", (String)null, bundle);
            }
            catch (final IllegalArgumentException ex) {
                final String value = String.valueOf(ex);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(value);
                Log.w("ConnectionStatusConfig", sb.toString());
                call = null;
            }
            Intent intent3;
            if (call == null) {
                intent3 = intent2;
            }
            else {
                intent3 = (Intent)call.getParcelable("serviceResponseIntentKey");
            }
            intent4 = intent3;
            if (intent3 == null) {
                final String b = e.b;
                String concat;
                if (b.length() != 0) {
                    concat = "Dynamic lookup for intent failed for action: ".concat(b);
                }
                else {
                    concat = new String("Dynamic lookup for intent failed for action: ");
                }
                Log.w("ConnectionStatusConfig", concat);
                intent4 = intent3;
            }
        }
        else {
            intent4 = intent;
        }
        Intent setPackage;
        if ((setPackage = intent4) == null) {
            setPackage = new Intent(e.b).setPackage(e.c);
        }
        final boolean c = f.c(d, s, setPackage, (ServiceConnection)this, 4225);
        this.c = c;
        if (c) {
            final Message obtainMessage = this.g.e.obtainMessage(1, (Object)this.e);
            final jvc g2 = this.g;
            g2.e.sendMessageDelayed(obtainMessage, g2.g);
            return;
        }
        this.b = 2;
        try {
            final jvc g3 = this.g;
            g3.f.b(g3.d, (ServiceConnection)this);
        }
        catch (final IllegalArgumentException ex2) {}
    }
    
    public final boolean b(final ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }
    
    public final boolean c() {
        return this.a.isEmpty();
    }
    
    public final void d(final ServiceConnection serviceConnection, final ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }
    
    public final void onServiceConnected(final ComponentName f, final IBinder d) {
        final HashMap c = this.g.c;
        monitorenter(c);
        try {
            this.g.e.removeMessages(1, (Object)this.e);
            this.d = d;
            this.f = f;
            final Iterator iterator = this.a.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceConnected(f, d);
            }
            this.b = 1;
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final void onServiceDisconnected(final ComponentName f) {
        final HashMap c = this.g.c;
        monitorenter(c);
        try {
            this.g.e.removeMessages(1, (Object)this.e);
            this.d = null;
            this.f = f;
            final Iterator iterator = this.a.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceDisconnected(f);
            }
            this.b = 2;
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
}
