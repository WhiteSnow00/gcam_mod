import android.content.pm.ServiceInfo;
import android.content.pm.PackageInfo;
import java.util.Set;
import java.util.HashSet;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brc
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/app/silentfeedback/SilentFeedback");
    }
    
    public static void a(final Context context, final Throwable t) {
        final String concat = String.valueOf(context.getPackageName()).concat(".SILENT_FEEDBACK");
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = t.getStackTrace().length;
        final Intent intent = null;
        Intent intent2;
        if (length == 0) {
            intent2 = intent;
        }
        else {
            PackageInfo packageInfo;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 4);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                a.m(brc.a.b(), "Could not find our own package. This should never happen. Not sending crash info.", 'p', (Throwable)ex);
                packageInfo = null;
            }
            final ServiceInfo[] services = packageInfo.services;
            final int length2 = services.length;
            String name = null;
            for (final ServiceInfo serviceInfo : services) {
                if (serviceInfo.name.equals("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService")) {
                    name = serviceInfo.name;
                }
            }
            if (name == null) {
                a.l(brc.a.b(), "Could not find SilentFeedbackService, not sending crash info.", 'o');
                intent2 = intent;
            }
            else {
                final Intent intent3 = new Intent();
                intent3.setComponent(new ComponentName(context.getApplicationContext(), name));
                intent3.setPackage(context.getApplicationContext().getPackageName());
                final StringBuilder sb = new StringBuilder();
                b(t, sb, new HashSet(), null);
                final StackTraceElement stackTraceElement = stackTrace[0];
                String fileName;
                if (stackTraceElement.getFileName() != null) {
                    fileName = stackTraceElement.getFileName();
                }
                else {
                    fileName = "Unknown Source";
                }
                intent3.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass", t.getClass().getName());
                intent3.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace", sb.toString());
                intent3.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass", stackTraceElement.getClassName());
                intent3.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile", fileName);
                intent3.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", stackTraceElement.getLineNumber());
                intent3.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod", stackTraceElement.getMethodName());
                if (concat != null) {
                    intent3.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag", concat);
                }
                intent2 = intent3;
            }
        }
        if (intent2 != null) {
            try {
                context.startService(intent2);
            }
            catch (final IllegalStateException ex2) {
                a.m(brc.a.b(), "failed to start silent feedback service", 's', t);
            }
        }
    }
    
    private static void b(final Throwable t, final StringBuilder sb, final Set set, final String s) {
        if (t != null && !set.contains(t)) {
            set.add(t);
            if (s != null) {
                sb.append(s);
            }
            sb.append(t.getClass().getName());
            sb.append(':');
            final StackTraceElement[] stackTrace = t.getStackTrace();
            final int length = stackTrace.length;
            final int n = 0;
            for (final StackTraceElement stackTraceElement : stackTrace) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement);
            }
            final Throwable[] suppressed = t.getSuppressed();
            for (int length2 = suppressed.length, j = n; j < length2; ++j) {
                b(suppressed[j], sb, set, "\nSuppressed: ");
            }
            if (t.getCause() != null) {
                b(t.getCause(), sb, set, "\nCaused by: ");
            }
        }
    }
}
