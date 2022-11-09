import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgx
{
    public final HardwareBuffer a;
    
    public lgx(final HardwareBuffer a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.close();
    }
    
    public final void b(final byte[] array, final int n, final int n2, final int n3) {
        ReadHardwareBufferJniFunctions.readHardwareBuffer(this.a, array, n, n2, n3);
    }
}
