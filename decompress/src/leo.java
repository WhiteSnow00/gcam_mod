import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CaptureRequest$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class leo
{
    public final CaptureRequest$Builder a;
    
    public leo(final CaptureRequest$Builder a) {
        this.a = a;
    }
    
    public final ljh a() {
        return new len(this.a.build());
    }
    
    public final void b(final CaptureRequest$Key captureRequest$Key, final Object o) {
        final CaptureRequest$Builder a = this.a;
        final String value = String.valueOf(captureRequest$Key.getName());
        if (value.length() != 0) {
            "Value cannot be null for key ".concat(value);
        }
        else {
            new String("Value cannot be null for key ");
        }
        a.set(captureRequest$Key, o);
    }
}
