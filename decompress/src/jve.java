import android.content.ServiceConnection;
import android.content.ComponentName;
import android.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class jve implements Handler$Callback
{
    final /* synthetic */ jvc a;
    
    public jve(final jvc a) {
        this.a = a;
    }
    
    public final boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 1: {
                synchronized (this.a.c) {
                    final jvb jvb = (jvb)message.obj;
                    final jvd jvd = this.a.c.get(jvb);
                    if (jvd != null && jvd.b == 3) {
                        final String value = String.valueOf(jvb);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(value);
                        Log.e("GmsClientSupervisor", sb.toString(), (Throwable)new Exception());
                        ComponentName f;
                        if ((f = jvd.f) == null) {
                            f = null;
                        }
                        ComponentName componentName;
                        if ((componentName = f) == null) {
                            componentName = new ComponentName(jvb.c, "unknown");
                        }
                        jvd.onServiceDisconnected(componentName);
                    }
                    return true;
                }
            }
            case 0: {
                synchronized (this.a.c) {
                    final jvb jvb2 = (jvb)message.obj;
                    final jvd jvd2 = this.a.c.get(jvb2);
                    if (jvd2 != null && jvd2.c()) {
                        if (jvd2.c) {
                            jvd2.g.e.removeMessages(1, (Object)jvd2.e);
                            final jvc g = jvd2.g;
                            g.f.b(g.d, (ServiceConnection)jvd2);
                            jvd2.c = false;
                            jvd2.b = 2;
                        }
                        this.a.c.remove(jvb2);
                    }
                    return true;
                }
                break;
            }
        }
    }
}
