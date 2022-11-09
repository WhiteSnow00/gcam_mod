import android.app.KeyguardManager;
import android.app.Activity;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egt
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/intentlaunch/IntentRouter");
    }
    
    public static final niz a(niz a, final Intent intent, final iov iov, final pii pii, final isa isa, final Activity activity, final eyt eyt, final egb egb, final njp njp, final hkd hkd, final lae lae) {
        e(intent);
        if (!a.g()) {
            a.l(egt.a.c(), "the mode is unknown or unsupported", '\u0497');
            return nii.a;
        }
        a.k(egt.a.c(), "launch mode: %s", ((jbm)a.c()).name(), '\u0496');
        if (activity.isVoiceInteractionRoot()) {
            if (activity.getIntent().hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
                final String stringExtra = activity.getIntent().getStringExtra("com.google.assistant.extra.CAMERA_MODE");
                stringExtra.getClass();
                bmx.g(intent, "com.google.assistant.extra.CAMERA_MODE", stringExtra);
            }
        }
        else if (activity.getIntent().hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            final String stringExtra2 = activity.getIntent().getStringExtra("android.intent.extra.STILL_IMAGE_MODE");
            stringExtra2.getClass();
            bmx.g(intent, "android.intent.extra.STILL_IMAGE_MODE", stringExtra2);
        }
        if (!activity.isVoiceInteractionRoot()) {
            f(intent, true);
        }
        else {
            f(intent, activity.getIntent().getBooleanExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", false));
        }
        switch (((jbm)a.c()).ordinal()) {
            case 12: {
                i(intent, bmx.m(activity.getIntent()), activity);
                h(intent, activity);
                break;
            }
            case 6: {
                i(intent, bmx.m(activity.getIntent()), activity);
                h(intent, activity);
                g(intent, activity);
                break;
            }
            case 3: {
                h(intent, activity);
                break;
            }
            case 2: {
                i(intent, bmx.m(activity.getIntent()), activity);
                break;
            }
            case 1: {
                if (bmx.t(activity.getIntent())) {
                    i(intent, true, activity);
                }
                else {
                    i(intent, bmx.m(activity.getIntent()), activity);
                }
                h(intent, activity);
                g(intent, activity);
                break;
            }
        }
        if (intent.hasExtra("launch_unknown_mode")) {
            e(intent);
            a = nii.a;
        }
        return a;
    }
    
    public static final void b(final Intent intent, final boolean b, final Activity activity, final hkd hkd) {
        if (activity.isVoiceInteractionRoot()) {
            if (b) {
                intent.putExtra("launch_unknown_mode", true);
            }
            intent.putExtra("assistant_voice_interaction", true);
        }
        if (!bmx.o(intent)) {
            hkd.d(hjq.h, true);
        }
    }
    
    public static final niz c(final Intent intent, final Activity activity, final njp njp, final lae lae) {
        final niz i = niz.i(bmx.d(intent));
        niz a;
        if (!intent.hasExtra("com.google.assistant.extra.CAMERA_MODE") && !intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            a = i;
        }
        else if (!bmx.k(intent) && !bmx.r(intent)) {
            a = nii.a;
        }
        else {
            final jbm jbm = (jbm)((njd)i).a;
            boolean b2;
            if (((nnx)njp.a()).containsKey(jbm)) {
                final Boolean b = (Boolean)((nnx)njp.a()).get(jbm);
                nov.z(b);
                b2 = b;
            }
            else if (bmx.t(activity.getIntent())) {
                final lfj e = lae.a.e(lfu.a);
                e.getClass();
                b2 = lae.a.a(e).A();
            }
            else {
                b2 = true;
            }
            if (!b2) {
                return nii.a;
            }
            a = i;
        }
        return a;
    }
    
    public static final boolean d(final jbm jbm, final iov iov, final pii pii, final isa isa, final Activity activity, final eyt eyt, final egb egb) {
        final boolean equals = jbm.equals(jbm.k);
        int n = 0;
        boolean b;
        if (equals) {
            iov.b();
            b = true;
        }
        else if (jbm.equals(jbm.s) && isa.c(activity.getBaseContext())) {
            ((isc)pii).a().c();
            b = true;
        }
        else if (jbm.equals(jbm.j) && isa.a(activity.getBaseContext())) {
            ((isc)pii).a().a();
            b = true;
        }
        else {
            a.l(egt.a.c(), "Attempted to launch unsupported external activity!", '\u049a');
            b = false;
        }
        if (b) {
            final String action = activity.getIntent().getAction();
            int n2 = 9;
            int n3;
            if (action == null) {
                n3 = 1;
            }
            else {
                Label_0239: {
                    switch (action.hashCode()) {
                        case 1130890360: {
                            if (action.equals("android.media.action.VIDEO_CAMERA")) {
                                n = 2;
                                break Label_0239;
                            }
                            break;
                        }
                        case 485955591: {
                            if (action.equals("android.media.action.STILL_IMAGE_CAMERA_SECURE")) {
                                n = 1;
                                break Label_0239;
                            }
                            break;
                        }
                        case 464109999: {
                            if (action.equals("android.media.action.STILL_IMAGE_CAMERA")) {
                                break Label_0239;
                            }
                            break;
                        }
                    }
                    n = -1;
                }
                switch (n) {
                    default: {
                        n3 = 1;
                        break;
                    }
                    case 2: {
                        n3 = 9;
                        break;
                    }
                    case 1: {
                        n3 = 10;
                        break;
                    }
                    case 0: {
                        n3 = 8;
                        break;
                    }
                }
            }
            if (!activity.isVoiceInteractionRoot()) {
                n2 = 7;
            }
            final KeyguardManager a = egb.a();
            eyt.ak(n3, n2, jbk.f(jbm), a.isKeyguardLocked(), a.isKeyguardSecure(), true);
        }
        return b;
    }
    
    private static final void e(final Intent intent) {
        intent.removeExtra("com.google.assistant.extra.CAMERA_MODE");
        intent.removeExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
        intent.removeExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS");
        intent.removeExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY");
        intent.removeExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
        intent.removeExtra("android.intent.extra.STILL_IMAGE_MODE");
        intent.removeExtra("android.intent.extra.FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.USE_FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.TIMER_DURATION_SECONDS");
    }
    
    private static final void f(final Intent intent, final boolean b) {
        if (!intent.hasExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY")) {
            bmx.g(intent, "com.google.assistant.extra.CAMERA_OPEN_ONLY", b);
        }
    }
    
    private static final void g(final Intent intent, final Activity activity) {
        if (activity.isVoiceInteractionRoot() && activity.getIntent().hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            final String stringExtra = activity.getIntent().getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
            if (bmx.j(activity.getIntent())) {
                stringExtra.getClass();
                bmx.g(intent, "com.google.assistant.extra.CAMERA_FLASH_MODE", stringExtra);
                return;
            }
            bmx.g(intent, "launch_unknown_mode", true);
        }
    }
    
    private static final void h(final Intent intent, final Activity activity) {
        if (activity.isVoiceInteractionRoot()) {
            bmx.g(intent, "com.google.assistant.extra.TIMER_DURATION_SECONDS", bmx.b(activity.getIntent()));
        }
    }
    
    private static final void i(final Intent intent, final boolean b, final Activity activity) {
        if (activity.isVoiceInteractionRoot()) {
            bmx.g(intent, "com.google.assistant.extra.USE_FRONT_CAMERA", b);
            return;
        }
        final Boolean value = b;
        bmx.g(intent, "android.intent.extra.FRONT_CAMERA", value);
        bmx.g(intent, "android.intent.extra.USE_FRONT_CAMERA", value);
    }
}
