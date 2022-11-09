import android.os.storage.StorageManager;
import android.view.WindowManager;
import android.os.Vibrator;
import android.hardware.SensorManager;
import android.os.PowerManager;
import android.app.NotificationManager;
import android.location.LocationManager;
import android.app.KeyguardManager;
import android.hardware.display.DisplayManager;
import android.app.admin.DevicePolicyManager;
import android.hardware.camera2.CameraManager;
import android.view.accessibility.AccessibilityManager;
import android.media.AudioManager;
import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public interface egi
{
    public static final egh c = new egh(AudioManager.class, "audio", 2);
    public static final egh d = new egh(AccessibilityManager.class, "accessibility", 3);
    public static final egh e = new egh(CameraManager.class, "camera", 4);
    public static final egh f = new egh(DisplayManager.class, "display", 6);
    public static final egh g = new egh(KeyguardManager.class, "keyguard", 7);
    public static final egh h = new egh(LocationManager.class, "location", 8);
    public static final egh i = new egh(NotificationManager.class, "notification", 9);
    public static final egh j = new egh(PowerManager.class, "power", 10);
    public static final egh k = new egh(SensorManager.class, "sensor", 11);
    
    default static {
        new egh(ActivityManager.class, "activity", 1);
        new egh(DevicePolicyManager.class, "device_policy", 5);
        new egh(Vibrator.class, "vibrator", 12);
        new egh(WindowManager.class, "window", 13);
        new egh(StorageManager.class, "storage", 14);
    }
    
    Object a(final egh p0);
}
