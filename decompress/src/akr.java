import android.content.Intent;
import java.util.Iterator;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.List;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public class akr extends BroadcastReceiver
{
    static {
        aiy.b("ConstraintProxy");
    }
    
    static void a(final Context context, final List list) {
        final Iterator iterator = list.iterator();
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        while (iterator.hasNext()) {
            final ain i = ((ana)iterator.next()).i;
            b4 |= i.d;
            b |= i.b;
            b2 |= i.e;
            final int j = i.i;
            boolean b5 = true;
            if (j == 1) {
                b5 = false;
            }
            b3 |= b5;
            if (b4 && b && b2 && b3) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, b4, b, b2, b3));
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final aiy a = aiy.a();
        String.format("onReceive : %s", intent);
        a.d(new Throwable[0]);
        context.startService(akq.b(context));
    }
}
