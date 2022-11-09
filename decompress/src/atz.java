import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atz
{
    public static final int a;
    
    static {
        try {
            try {
                a = Class.forName("android.hardware.camera2.CameraCharacteristics").getField("CONTROL_SCENE_MODE_HDR").getInt(null);
                return;
            }
            finally {}
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error while reflecting on SCENE_MODE_HDR enum, HDR will not be available: ");
            sb.append(ex);
            Log.e("LegacyVendorTags", sb.toString());
            a = -1;
            return;
        }
        a = -1;
    }
}
