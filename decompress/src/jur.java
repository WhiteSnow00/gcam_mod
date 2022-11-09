import android.util.Log;
import android.content.res.Resources;
import android.text.TextUtils;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jur
{
    private static final zb a;
    private static Locale b;
    
    static {
        a = new zb();
    }
    
    public static String a(final Context context) {
        final String packageName = context.getPackageName();
        try {
            final jwt b = jwu.b(context);
            return b.a.getPackageManager().getApplicationLabel(b.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        }
        catch (final NullPointerException ex) {}
        catch (final PackageManager$NameNotFoundException ex2) {}
        final String name = context.getApplicationInfo().name;
        if (TextUtils.isEmpty((CharSequence)name)) {
            return packageName;
        }
        return name;
    }
    
    public static String b(final Context context) {
        return context.getResources().getString(2131951857);
    }
    
    public static String c(final Context context, final int n) {
        final Resources resources = context.getResources();
        switch (n) {
            default: {
                return resources.getString(17039370);
            }
            case 3: {
                return resources.getString(2131951851);
            }
            case 2: {
                return resources.getString(2131951861);
            }
            case 1: {
                return resources.getString(2131951854);
            }
        }
    }
    
    public static String d(final Context context, final int n) {
        final Resources resources = context.getResources();
        final String a = a(context);
        switch (n) {
            default: {
                return resources.getString(2131951859, new Object[] { a });
            }
            case 20: {
                return h(context, "common_google_play_services_restricted_profile_text", a);
            }
            case 18: {
                return resources.getString(2131951864, new Object[] { a });
            }
            case 17: {
                return h(context, "common_google_play_services_sign_in_failed_text", a);
            }
            case 16: {
                return h(context, "common_google_play_services_api_unavailable_text", a);
            }
            case 9: {
                return resources.getString(2131951860, new Object[] { a });
            }
            case 7: {
                return h(context, "common_google_play_services_network_error_text", a);
            }
            case 5: {
                return h(context, "common_google_play_services_invalid_account_text", a);
            }
            case 3: {
                return resources.getString(2131951852, new Object[] { a });
            }
            case 2: {
                jwn.d(context);
                return resources.getString(2131951862, new Object[] { a });
            }
            case 1: {
                return resources.getString(2131951855, new Object[] { a });
            }
        }
    }
    
    public static String e(final Context context, final int n) {
        if (n != 6 && n != 19) {
            return d(context, n);
        }
        return h(context, "common_google_play_services_resolution_required_text", a(context));
    }
    
    public static String f(final Context context, final int n) {
        String s;
        if (n == 6) {
            s = i(context, "common_google_play_services_resolution_required_title");
        }
        else {
            s = g(context, n);
        }
        if (s == null) {
            return context.getResources().getString(2131951858);
        }
        return s;
    }
    
    public static String g(final Context context, final int n) {
        final Resources resources = context.getResources();
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(n);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 11: {
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            }
            case 10: {
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 8: {
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            }
            case 4:
            case 6:
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(2131951853);
            }
            case 2: {
                return resources.getString(2131951863);
            }
            case 1: {
                return resources.getString(2131951856);
            }
        }
    }
    
    private static String h(final Context context, String s, final String s2) {
        final Resources resources = context.getResources();
        String s3;
        s = (s3 = i(context, s));
        if (s == null) {
            s3 = resources.getString(2131951859);
        }
        return String.format(resources.getConfiguration().locale, s3, s2);
    }
    
    private static String i(final Context context, final String s) {
        final zb a = jur.a;
        synchronized (a) {
            final Locale value = new aao(new aap(context.getResources().getConfiguration().getLocales())).a.a.get(0);
            if (!value.equals(jur.b)) {
                a.clear();
                jur.b = value;
            }
            final String s2 = (String)a.get(s);
            if (s2 != null) {
                return s2;
            }
            final int c = jqg.c;
            Resources resourcesForApplication;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            final int identifier = resourcesForApplication.getIdentifier(s, "string", "com.google.android.gms");
            if (identifier == 0) {
                String concat;
                if (s.length() != 0) {
                    concat = "Missing resource: ".concat(s);
                }
                else {
                    concat = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", concat);
                return null;
            }
            final String string = resourcesForApplication.getString(identifier);
            if (TextUtils.isEmpty((CharSequence)string)) {
                String concat2;
                if (s.length() != 0) {
                    concat2 = "Got empty resource: ".concat(s);
                }
                else {
                    concat2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", concat2);
                return null;
            }
            jur.a.put(s, string);
            return string;
        }
    }
}
