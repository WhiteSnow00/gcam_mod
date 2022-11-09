// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.Parcelable;
import android.app.PendingIntent;
import android.support.v4.graphics.drawable.IconCompat;
import android.support.v4.app.RemoteActionCompat;

public class RemoteActionCompatParcelizer
{
    public static RemoteActionCompat read(final agb agb) {
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat)agb.t(remoteActionCompat.a);
        remoteActionCompat.b = agb.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = agb.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent)agb.b((Parcelable)remoteActionCompat.d, 4);
        remoteActionCompat.e = agb.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = agb.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final agb agb) {
        agb.u(remoteActionCompat.a);
        agb.g(remoteActionCompat.b, 2);
        agb.g(remoteActionCompat.c, 3);
        agb.i((Parcelable)remoteActionCompat.d, 4);
        agb.f(remoteActionCompat.e, 5);
        agb.f(remoteActionCompat.f, 6);
    }
}
