import android.os.Process;
import android.content.Context;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmx
{
    private static final jbm a;
    
    static {
        a = jbm.b;
    }
    
    public static float a(final Intent intent) {
        return intent.getFloatExtra("override_screen_brightness", -1.0f);
    }
    
    public static int b(final Intent intent) {
        int n;
        if (intent.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS")) {
            n = intent.getIntExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS", 0);
        }
        else {
            n = intent.getIntExtra("android.intent.extra.TIMER_DURATION_SECONDS", 0);
        }
        if (n < 3) {
            return 3;
        }
        if (n > 30) {
            return 30;
        }
        return n;
    }
    
    public static ggv c(final Intent intent) {
        final ggv b = ggv.b;
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            final String stringExtra = intent.getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
            if (bmy.c.containsKey(stringExtra)) {
                return (ggv)bmy.c.get(stringExtra);
            }
        }
        return b;
    }
    
    public static jbm d(final Intent intent) {
        final jbm a = bmx.a;
        jbm jbm;
        if (intent != null) {
            final String action = intent.getAction();
            if (!"android.media.action.VIDEO_CAMERA".equals(action) && !s(intent)) {
                if ("android.media.action.VIDEO_CAPTURE".equals(action)) {
                    jbm = jbm.i;
                }
                else if (!"android.media.action.IMAGE_CAPTURE".equals(action) && !"android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) {
                    jbm = x(a, intent);
                }
                else {
                    jbm = jbm.h;
                }
            }
            else {
                jbm = x(jbm.c, intent);
            }
        }
        else {
            jbm = a;
        }
        return jbm;
    }
    
    public static niz e(final Intent intent) {
        Bundle extras;
        if (intent == null) {
            extras = null;
        }
        else {
            extras = intent.getExtras();
        }
        if (extras == null) {
            return nii.a;
        }
        return niz.h(extras.getParcelable("output"));
    }
    
    public static void f(final Intent intent) {
        intent.putExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", true);
    }
    
    public static void g(final Intent intent, final String s, final Object o) {
        if (o instanceof String) {
            intent.putExtra(s, (String)o);
            return;
        }
        if (o instanceof Integer) {
            intent.putExtra(s, (int)o);
            return;
        }
        if (o instanceof Boolean) {
            intent.putExtra(s, (boolean)o);
            return;
        }
        throw new IllegalArgumentException("Not found corresponding type.");
    }
    
    public static boolean h(final Context context, final Uri uri) {
        return context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 2) == 0;
    }
    
    public static boolean i(final Intent intent) {
        return intent.hasExtra("android.intent.extra.USE_FRONT_CAMERA") || intent.hasExtra("android.intent.extra.FRONT_CAMERA") || intent.hasExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
    }
    
    public static boolean j(final Intent intent) {
        return intent != null && intent.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE") && bmy.c.containsKey(intent.getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE"));
    }
    
    public static boolean k(final Intent intent) {
        return intent.hasExtra("com.google.assistant.extra.CAMERA_MODE") && bmy.a.containsKey(intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE"));
    }
    
    public static boolean l(final Intent intent) {
        return "power_double_tap".equals(intent.getStringExtra("com.android.systemui.camera_launch_source"));
    }
    
    public static boolean m(final Intent intent) {
        return intent.getBooleanExtra("android.intent.extra.USE_FRONT_CAMERA", false) || intent.getBooleanExtra("android.intent.extra.FRONT_CAMERA", false) || intent.getBooleanExtra("com.google.assistant.extra.USE_FRONT_CAMERA", false);
    }
    
    public static boolean n(final Intent intent) {
        return "android.intent.action.MAIN".equals(intent.getAction()) && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER");
    }
    
    public static boolean o(final Intent intent) {
        return intent.getBooleanExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", false);
    }
    
    public static boolean p(final Intent intent) {
        return intent != null && intent.getBooleanExtra("launch_from_remote_control", false);
    }
    
    public static boolean q(final String s) {
        return "android.media.action.STILL_IMAGE_CAMERA".equals(s) || "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(s);
    }
    
    public static boolean r(final Intent intent) {
        return intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE") && bmy.b.containsKey(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
    }
    
    public static boolean s(final Intent intent) {
        final String action = intent.getAction();
        boolean b = false;
        if (action != null && "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(intent.getAction()) && intent.hasExtra("com.google.assistant.extra.OPEN_IN_VIDEO_MODE")) {
            b = true;
        }
        return b;
    }
    
    public static boolean t(final Intent intent) {
        boolean equals = false;
        if (intent != null) {
            if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
                equals = "WIDE_ANGLE".equals(intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE"));
            }
            else if (intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
                return "WIDE_ANGLE".equals(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
            }
        }
        return equals;
    }
    
    public static boolean u(final bmq bmq) {
        final Intent a = bmq.a();
        if (a == null) {
            return false;
        }
        final String action = a.getAction();
        return "android.media.action.VIDEO_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action);
    }
    
    public static boolean v(final bmq bmq) {
        final Intent a = bmq.a();
        return a != null && (q(a.getAction()) && (a.hasExtra("android.intent.extra.TIMER_DURATION_SECONDS") || a.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS")) && !o(a));
    }
    
    public static boolean w(final bmq bmq) {
        final Intent a = bmq.a();
        boolean b = false;
        if (a == null) {
            return false;
        }
        final String action = a.getAction();
        if (action == null) {
            return false;
        }
        if (!o(a)) {
            if (!action.equals("android.media.action.VIDEO_CAMERA")) {
                if (s(a)) {
                    return true;
                }
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    private static jbm x(final jbm jbm, final Intent intent) {
        jbm jbm2;
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            final String stringExtra = intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE");
            jbm2 = jbm;
            if (bmy.a.containsKey(stringExtra)) {
                jbm2 = (jbm)bmy.a.get(stringExtra);
            }
        }
        else {
            jbm2 = jbm;
            if (intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
                final String stringExtra2 = intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE");
                jbm2 = jbm;
                if (bmy.b.containsKey(stringExtra2)) {
                    return (jbm)bmy.b.get(stringExtra2);
                }
            }
        }
        return jbm2;
    }
}
