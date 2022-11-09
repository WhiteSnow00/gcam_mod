import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fw
{
    public static Intent a(final Activity activity) {
        final Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null) {
            final String c = c(activity);
            if (c == null) {
                return null;
            }
            final ComponentName component = new ComponentName((Context)activity, c);
            try {
                Intent intent;
                if (d((Context)activity, component) == null) {
                    intent = Intent.makeMainActivity(component);
                }
                else {
                    intent = new Intent().setComponent(component);
                }
                return intent;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("getParentActivityIntent: bad parentActivityName '");
                sb.append(c);
                sb.append("' in manifest");
                Log.e("NavUtils", sb.toString());
                return null;
            }
        }
        return parentActivityIntent;
    }
    
    public static Intent b(final Context context, ComponentName component) {
        final String d = d(context, component);
        if (d == null) {
            return null;
        }
        component = new ComponentName(component.getPackageName(), d);
        Intent intent;
        if (d(context, component) == null) {
            intent = Intent.makeMainActivity(component);
        }
        else {
            intent = new Intent().setComponent(component);
        }
        return intent;
    }
    
    public static String c(final Activity activity) {
        try {
            return d((Context)activity, activity.getComponentName());
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    public static String d(final Context context, final ComponentName componentName) {
        final ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        final String parentActivityName = activityInfo.parentActivityName;
        if (parentActivityName != null) {
            return parentActivityName;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        final String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            return sb.toString();
        }
        return string;
    }
}
