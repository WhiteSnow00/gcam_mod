import android.text.TextUtils;
import androidx.window.sidecar.SidecarProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.List;
import android.hardware.camera2.CameraCharacteristics;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xo
{
    public xo() {
        new Rect();
    }
    
    public static final List a(final CameraCharacteristics cameraCharacteristics) {
        cameraCharacteristics.getClass();
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }
    
    public static final List b(final CameraCharacteristics cameraCharacteristics) {
        cameraCharacteristics.getClass();
        return cameraCharacteristics.getAvailableSessionKeys();
    }
    
    public static final Set c(final CameraCharacteristics cameraCharacteristics) {
        cameraCharacteristics.getClass();
        final Set physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        physicalCameraIds.getClass();
        return physicalCameraIds;
    }
    
    public static final aid d(String s) {
        if (s == null || plr.h(s)) {
            return null;
        }
        final Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(s);
        if (!matcher.matches()) {
            return null;
        }
        s = matcher.group(1);
        Integer value;
        if (s == null) {
            value = null;
        }
        else {
            value = Integer.parseInt(s);
        }
        if (value == null) {
            return null;
        }
        final int intValue = value;
        s = matcher.group(2);
        Integer value2;
        if (s == null) {
            value2 = null;
        }
        else {
            value2 = Integer.parseInt(s);
        }
        if (value2 == null) {
            return null;
        }
        final int intValue2 = value2;
        s = matcher.group(3);
        Integer value3;
        if (s == null) {
            value3 = null;
        }
        else {
            value3 = Integer.parseInt(s);
        }
        if (value3 == null) {
            return null;
        }
        final int intValue3 = value3;
        if (matcher.group(4) != null) {
            s = matcher.group(4);
        }
        else {
            s = "";
        }
        s.getClass();
        return new aid(intValue, intValue2, intValue3, s);
    }
    
    public static final aid e() {
        final aid aid = null;
        aid d;
        try {
            final String apiVersion = SidecarProvider.getApiVersion();
            d = aid;
            if (!TextUtils.isEmpty((CharSequence)apiVersion)) {
                final aid a = aid.a;
                d = d(apiVersion);
            }
        }
        catch (final UnsupportedOperationException ex) {
            d = aid;
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            d = aid;
        }
        return d;
    }
}
