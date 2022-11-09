import java.nio.ByteBuffer;
import com.google.android.libraries.camera.jni.graphics.HardwarePixels;

// 
// Decompiled by Procyon v0.6.0
// 

final class lgz implements ljt
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ HardwarePixels c;
    
    public lgz(final HardwarePixels c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ByteBuffer getBuffer() {
        final boolean value = this.c.c.get();
        int n = 1;
        njo.p(value ^ true, "Accessing data after close!");
        final HardwarePixels c = this.c;
        final long b = c.b;
        final int a = this.a;
        final int b2 = this.b;
        final int format = c.a.getFormat();
        njo.p(a == 0 || format == 35, "Internal error: Expect planes 1 and 2 to only appear in YUV420 formats");
        if (a != 0) {
            n = 2;
        }
        return HardwarePixels.nativeGetData(b, a, b2, n);
    }
    
    @Override
    public final int getPixelStride() {
        return HardwarePixels.nativePixelStride(this.c.b, this.a);
    }
    
    @Override
    public final int getRowStride() {
        return HardwarePixels.nativeRowStride(this.c.b, this.a);
    }
}
