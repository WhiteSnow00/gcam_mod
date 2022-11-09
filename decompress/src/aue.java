import j$.util.Objects;
import java.util.Iterator;
import android.hardware.camera2.CaptureRequest$Builder;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import android.hardware.camera2.CameraDevice;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aue
{
    public final Map a;
    public long b;
    
    public aue() {
        this.a = new HashMap();
        this.b = 0L;
    }
    
    public aue(final aue aue) {
        if (aue != null) {
            this.a = new HashMap(aue.a);
            this.b = aue.b;
            return;
        }
        throw new NullPointerException("Tried to copy null Camera2RequestSettingsSet");
    }
    
    public final CaptureRequest a(final CameraDevice cameraDevice, int i, final Surface... array) {
        if (cameraDevice != null) {
            final CaptureRequest$Builder captureRequest = cameraDevice.createCaptureRequest(i);
            for (final CaptureRequest$Key captureRequest$Key : this.a.keySet()) {
                final Object b = this.b(captureRequest$Key);
                if (b != null) {
                    captureRequest.set(captureRequest$Key, b);
                }
            }
            Surface surface;
            for (i = 0; i <= 0; ++i) {
                surface = array[i];
                if (surface == null) {
                    throw new NullPointerException("Tried to add null Surface as request target");
                }
                captureRequest.addTarget(surface);
            }
            return captureRequest.build();
        }
        throw new NullPointerException("Tried to create request using null CameraDevice");
    }
    
    public final Object b(final CaptureRequest$Key captureRequest$Key) {
        if (captureRequest$Key != null) {
            return this.a.get(captureRequest$Key);
        }
        throw new NullPointerException("Received a null key");
    }
    
    public final boolean c(final CaptureRequest$Key captureRequest$Key, final Object o) {
        return Objects.equals(this.b(captureRequest$Key), o);
    }
    
    public final void d(final CaptureRequest$Key captureRequest$Key, final Object o) {
        if (captureRequest$Key == null) {
            throw new NullPointerException("Received a null key");
        }
        final Object b = this.b(captureRequest$Key);
        if (this.a.containsKey(captureRequest$Key) && Objects.equals(o, b)) {
            return;
        }
        this.a.put(captureRequest$Key, o);
        ++this.b;
    }
}
