import android.app.AlertDialog$Builder;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.os.Build;
import android.provider.Settings$Secure;
import android.content.pm.ApplicationInfo;
import android.content.ComponentName;
import android.view.Window;
import android.util.Log;
import android.os.PowerManager;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orq
{
    public static final String a;
    
    static {
        a = orq.class.getSimpleName();
    }
    
    private orq() {
    }
    
    public static void a(final Activity activity, final boolean sustainedPerformanceMode) {
        if (!((PowerManager)activity.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            return;
        }
        final Window window = activity.getWindow();
        if (window == null) {
            Log.e(orq.a, "Activity does not have a window");
            return;
        }
        window.setSustainedPerformanceMode(sustainedPerformanceMode);
    }
    
    public static boolean b(final Activity activity, final boolean b) {
        if (((Context)activity).getPackageManager().hasSystemFeature("android.software.vr.mode")) {
            final ComponentName componentName = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
            try {
                activity.setVrModeEnabled(b, componentName);
                return true;
            }
            catch (final UnsupportedOperationException ex) {
                final String a = orq.a;
                final String value = String.valueOf(ex);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 23);
                sb.append("Failed to set VR mode: ");
                sb.append(value);
                Log.w(a, sb.toString());
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                final String a2 = orq.a;
                final String value2 = String.valueOf(ex2);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 25);
                sb2.append("No VR service component: ");
                sb2.append(value2);
                Log.w(a2, sb2.toString());
                if (((Context)activity).getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                    final Iterator iterator = ((Context)activity).getPackageManager().getInstalledApplications(0).iterator();
                    while (true) {
                        while (iterator.hasNext()) {
                            if (((ApplicationInfo)iterator.next()).packageName.equals("com.google.vr.vrcore")) {
                                final String string = Settings$Secure.getString(((Context)activity).getContentResolver(), "enabled_vr_listeners");
                                final ComponentName componentName2 = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
                                int n;
                                if (string != null) {
                                    if (!string.contains(componentName2.flattenToString())) {
                                        n = -2;
                                    }
                                    else {
                                        n = 0;
                                    }
                                }
                                else {
                                    n = -2;
                                }
                                if (!"goldfish".equals(Build.HARDWARE)) {
                                    if (!"ranchu".equals(Build.HARDWARE)) {
                                        if (n == -1) {
                                            c((Context)activity, 2131951917, 2131952065, (DialogInterface$OnClickListener)new orp((Context)activity, 1));
                                            return false;
                                        }
                                        if (n == -2) {
                                            c((Context)activity, 2131951916, 2131952066, (DialogInterface$OnClickListener)new orp((Context)activity));
                                            return false;
                                        }
                                    }
                                }
                                Log.w(orq.a, "Failed to handle missing VrCore package.");
                            }
                        }
                        int n = -1;
                        continue;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    private static void c(final Context context, final int message, final int n, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 2132017535);
        alertDialog$Builder.setMessage(message).setTitle(2131951915).setPositiveButton(n, dialogInterface$OnClickListener).setNegativeButton(2131951825, (DialogInterface$OnClickListener)new fnv(3));
        alertDialog$Builder.create().show();
    }
}
