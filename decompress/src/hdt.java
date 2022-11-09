import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdt
{
    public static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/secure/SecureActivityModule");
    }
    
    public static boolean a(final Intent intent) {
        if (intent == null) {
            return false;
        }
        final String action = intent.getAction();
        return "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || intent.getBooleanExtra("secure_camera", false);
    }
}
