import java.util.List;
import java.util.Iterator;
import android.content.res.Resources;
import android.app.Notification$BigTextStyle;
import android.app.Notification$BubbleMetadata;
import android.net.Uri;
import android.text.TextUtils;
import android.app.Notification;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import android.app.Notification$Builder;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.FragmentManager;
import android.content.DialogInterface$OnDismissListener;
import android.app.Activity;
import android.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.util.TypedValue;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpw extends jpx
{
    public static final jpw a;
    public static final int b;
    private static final Object d;
    
    static {
        d = new Object();
        a = new jpw();
        b = jpx.c;
    }
    
    public final Dialog a(final Context context, final int n, final juw juw, final DialogInterface$OnCancelListener onCancelListener) {
        AlertDialog$Builder alertDialog$Builder = null;
        if (n == 0) {
            return null;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            alertDialog$Builder = new AlertDialog$Builder(context, 5);
        }
        AlertDialog$Builder alertDialog$Builder2;
        if ((alertDialog$Builder2 = alertDialog$Builder) == null) {
            alertDialog$Builder2 = new AlertDialog$Builder(context);
        }
        alertDialog$Builder2.setMessage((CharSequence)jur.d(context, n));
        if (onCancelListener != null) {
            alertDialog$Builder2.setOnCancelListener(onCancelListener);
        }
        final String c = jur.c(context, n);
        if (c != null) {
            alertDialog$Builder2.setPositiveButton((CharSequence)c, (DialogInterface$OnClickListener)juw);
        }
        final String g = jur.g(context, n);
        if (g != null) {
            alertDialog$Builder2.setTitle((CharSequence)g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", n), (Throwable)new IllegalArgumentException());
        return (Dialog)alertDialog$Builder2.create();
    }
    
    public final void b(Activity activity, Dialog i, final String s, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        try {
            if (activity instanceof em) {
                final fi c = ((em)activity).c();
                activity = (Activity)new jqi();
                jvu.j(i, "Cannot display null dialog");
                i.setOnCancelListener((DialogInterface$OnCancelListener)null);
                i.setOnDismissListener((DialogInterface$OnDismissListener)null);
                ((jqi)activity).ac = i;
                if (dialogInterface$OnCancelListener != null) {
                    ((jqi)activity).ad = dialogInterface$OnCancelListener;
                }
                ((ec)activity).d = false;
                ((ec)activity).e = true;
                i = (Dialog)c.i();
                ((fr)i).m((ei)activity, s);
                ((fr)i).f();
                return;
            }
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {}
        final FragmentManager fragmentManager = activity.getFragmentManager();
        final jpt jpt = new jpt();
        jvu.j(i, "Cannot display null dialog");
        i.setOnCancelListener((DialogInterface$OnCancelListener)null);
        i.setOnDismissListener((DialogInterface$OnDismissListener)null);
        jpt.a = i;
        if (dialogInterface$OnCancelListener != null) {
            jpt.b = dialogInterface$OnCancelListener;
        }
        jpt.show(fragmentManager, s);
    }
    
    public final void c(final Context context, int n, PendingIntent pendingIntent) {
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", n, null), (Throwable)new IllegalArgumentException());
        if (n == 18) {
            new jpv(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (n == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        final String f = jur.f(context, n);
        final String e = jur.e(context, n);
        final Resources resources = context.getResources();
        final Object systemService = context.getSystemService("notification");
        jvu.a(systemService);
        final NotificationManager notificationManager = (NotificationManager)systemService;
        final fy fy = new fy(context);
        fy.j = true;
        final Notification m = fy.m;
        m.flags |= 0x10;
        fy.e = fy.b(f);
        final fx fx = new fx();
        fx.a = fy.b(e);
        fy.d(fx);
        if (jwn.c(context)) {
            jvu.f(true);
            fy.c(context.getApplicationInfo().icon);
            fy.h = 2;
            jwn.d(context);
            fy.g = pendingIntent;
        }
        else {
            fy.c(17301642);
            fy.m.tickerText = fy.b(resources.getString(2131951858));
            fy.m.when = System.currentTimeMillis();
            fy.g = pendingIntent;
            fy.f = fy.b(e);
        }
        jvu.f(true);
        pendingIntent = (PendingIntent)jpw.d;
        monitorenter(pendingIntent);
        try {
            monitorexit(pendingIntent);
            pendingIntent = (PendingIntent)notificationManager.getNotificationChannel("com.google.android.gms.availability");
            final String b = jur.b(context);
            if (pendingIntent == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", (CharSequence)b, 4));
            }
            else if (!b.contentEquals(((NotificationChannel)pendingIntent).getName())) {
                ((NotificationChannel)pendingIntent).setName((CharSequence)b);
                notificationManager.createNotificationChannel((NotificationChannel)pendingIntent);
            }
            fy.l = "com.google.android.gms.availability";
            new ArrayList();
            final Bundle bundle = new Bundle();
            final Notification$Builder notification$Builder = new Notification$Builder(fy.a, fy.l);
            final Notification i = fy.m;
            pendingIntent = (PendingIntent)notification$Builder.setWhen(i.when).setSmallIcon(i.icon, i.iconLevel).setContent(i.contentView).setTicker(i.tickerText, (RemoteViews)null).setVibrate(i.vibrate).setLights(i.ledARGB, i.ledOnMS, i.ledOffMS);
            pendingIntent = (PendingIntent)((Notification$Builder)pendingIntent).setOngoing((0x2 & i.flags) != 0x0);
            pendingIntent = (PendingIntent)((Notification$Builder)pendingIntent).setOnlyAlertOnce((i.flags & 0x8) != 0x0);
            pendingIntent = (PendingIntent)((Notification$Builder)pendingIntent).setAutoCancel((i.flags & 0x10) != 0x0).setDefaults(i.defaults).setContentTitle(fy.e).setContentText(fy.f).setContentInfo((CharSequence)null).setContentIntent(fy.g).setDeleteIntent(i.deleteIntent);
            ((Notification$Builder)pendingIntent).setFullScreenIntent((PendingIntent)null, (i.flags & 0x80) != 0x0).setLargeIcon((Bitmap)null).setNumber(0).setProgress(0, 0, false);
            notification$Builder.setSubText((CharSequence)null).setUsesChronometer(false).setPriority(fy.h);
            pendingIntent = (PendingIntent)fy.b;
            if (((List)pendingIntent).size() > 0) {
                final fw fw = ((List<fw>)pendingIntent).get(0);
                throw null;
            }
            pendingIntent = (PendingIntent)fy.k;
            if (pendingIntent != null) {
                bundle.putAll((Bundle)pendingIntent);
            }
            notification$Builder.setShowWhen(true);
            notification$Builder.setLocalOnly(fy.j).setGroup((String)null).setGroupSummary(false).setSortKey((String)null);
            notification$Builder.setCategory((String)null).setColor(0).setVisibility(0).setPublicVersion((Notification)null).setSound(i.sound, i.audioAttributes);
            final ArrayList n2 = fy.n;
            if (!n2.isEmpty()) {
                final Iterator iterator = n2.iterator();
                while (iterator.hasNext()) {
                    notification$Builder.addPerson((String)iterator.next());
                }
            }
            if (fy.d.size() > 0) {
                pendingIntent = (PendingIntent)fy.a().getBundle("android.car.EXTENSIONS");
                Object o;
                if ((o = pendingIntent) == null) {
                    o = new Bundle();
                }
                final Bundle bundle2 = new Bundle((Bundle)o);
                pendingIntent = (PendingIntent)new Bundle();
                if (fy.d.size() > 0) {
                    Integer.toString(0);
                    final fw fw2 = fy.d.get(0);
                    new Bundle();
                    throw null;
                }
                ((Bundle)o).putBundle("invisible_actions", (Bundle)pendingIntent);
                bundle2.putBundle("invisible_actions", (Bundle)pendingIntent);
                fy.a().putBundle("android.car.EXTENSIONS", (Bundle)o);
                bundle.putBundle("android.car.EXTENSIONS", bundle2);
            }
            notification$Builder.setExtras(fy.k).setRemoteInputHistory((CharSequence[])null);
            notification$Builder.setBadgeIconType(0).setSettingsText((CharSequence)null).setShortcutId((String)null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty((CharSequence)fy.l)) {
                notification$Builder.setSound((Uri)null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[])null);
            }
            final ArrayList c = fy.c;
            if (c.size() <= 0) {
                notification$Builder.setAllowSystemGeneratedContextualActions(true);
                notification$Builder.setBubbleMetadata((Notification$BubbleMetadata)null);
                aah.b();
                pendingIntent = (PendingIntent)fy.i;
                if (pendingIntent != null) {
                    new Notification$BigTextStyle(notification$Builder).setBigContentTitle((CharSequence)null).bigText(((fx)pendingIntent).a);
                }
                final Notification build = notification$Builder.build();
                if (pendingIntent != null) {
                    pendingIntent = (PendingIntent)build.extras;
                    if (pendingIntent != null) {
                        ((Bundle)pendingIntent).putString("android.support.v4.app.extra.COMPAT_TEMPLATE", "android.support.v4.app.NotificationCompat$BigTextStyle");
                    }
                }
                switch (n) {
                    default: {
                        n = 39789;
                        break;
                    }
                    case 1:
                    case 2:
                    case 3: {
                        jqg.b.set(false);
                        n = 10436;
                        break;
                    }
                }
                notificationManager.notify(n, build);
                return;
            }
            final aak aak = (aak)c.get(0);
            throw null;
        }
        finally {
            monitorexit(pendingIntent);
            while (true) {}
        }
    }
    
    public final void d(final Activity activity, final int n, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog a = this.a((Context)activity, n, new juu(this.g((Context)activity, n, "d"), activity, n2), dialogInterface$OnCancelListener);
        if (a == null) {
            return;
        }
        this.b(activity, a, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
    }
}
