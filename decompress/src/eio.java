import java.util.Iterator;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class eio extends BroadcastReceiver
{
    final /* synthetic */ eiq a;
    
    public eio(final eiq a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        if (action != null) {
            if (action.equals("com.google.android.apps.camera.remotecontrol.remotekey")) {
                final int intExtra = intent.getIntExtra("key_value", 0);
                final boolean booleanExtra = intent.getBooleanExtra("key_down", false);
                switch (intExtra) {
                    default: {
                        a.l(eiq.a.b(), "Unknown Key event received. Ignoring it.", '\u04d8');
                        break;
                    }
                    case 7: {
                        this.a.h(booleanExtra);
                        break;
                    }
                    case 6: {
                        synchronized (this.a.e) {
                            final Iterator iterator = this.a.b.iterator();
                            while (iterator.hasNext()) {
                                ((eip)iterator.next()).f(booleanExtra);
                            }
                            break;
                        }
                    }
                    case 5: {
                        synchronized (this.a.e) {
                            final Iterator iterator2 = this.a.b.iterator();
                            while (iterator2.hasNext()) {
                                ((eip)iterator2.next()).e(booleanExtra);
                            }
                            break;
                        }
                    }
                    case 4: {
                        synchronized (this.a.e) {
                            final Iterator iterator3 = this.a.b.iterator();
                            while (iterator3.hasNext()) {
                                ((eip)iterator3.next()).b(booleanExtra);
                            }
                            break;
                        }
                    }
                    case 3: {
                        synchronized (this.a.e) {
                            final Iterator iterator4 = this.a.b.iterator();
                            while (iterator4.hasNext()) {
                                ((eip)iterator4.next()).b(booleanExtra);
                            }
                            break;
                        }
                    }
                    case 2: {
                        if (booleanExtra) {
                            final eiq a = this.a;
                            synchronized (a.e) {
                                final Iterator iterator5 = a.b.iterator();
                                while (iterator5.hasNext()) {
                                    ((eip)iterator5.next()).c();
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 1: {
                        if (action.equals("com.google.android.apps.camera.remotecontrol.remotekey")) {
                            this.a.d.af(3);
                        }
                        synchronized (this.a.e) {
                            final Iterator iterator6 = this.a.b.iterator();
                            while (iterator6.hasNext()) {
                                ((eip)iterator6.next()).d(booleanExtra);
                            }
                        }
                        break;
                    }
                }
                final eiq a2 = this.a;
                synchronized (a2.e) {
                    final Iterator iterator7 = a2.c.iterator();
                    while (iterator7.hasNext()) {
                        ((itp)iterator7.next()).a.a();
                    }
                }
            }
        }
    }
}
