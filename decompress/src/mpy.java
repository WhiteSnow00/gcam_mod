import java.util.Iterator;
import java.util.Map;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpy extends BroadcastReceiver
{
    public static final Object a;
    public static volatile boolean b;
    static final moi c;
    
    static {
        a = new Object();
        c = moi.b();
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        for (final Map.Entry<nja, V> entry : mpy.c.entrySet()) {
            if (((String)entry.getKey().a).equals(stringExtra)) {
                ((mpe)entry.getValue()).a.c();
            }
        }
    }
}
