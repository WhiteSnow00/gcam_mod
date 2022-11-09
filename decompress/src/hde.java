import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hde implements hdd
{
    private final /* synthetic */ int a;
    
    public hde() {
    }
    
    public hde(final int a) {
        this.a = a;
    }
    
    @Override
    public final kra a(final gyb gyb) {
        switch (this.a) {
            default: {
                return kra.a;
            }
            case 0: {
                return gyb.b;
            }
        }
    }
    
    @Override
    public final int b(final gyb gyb, final ByteBuffer byteBuffer) {
        switch (this.a) {
            default: {
                return JpegUtilNative.a(gyb.a, byteBuffer.duplicate(), gyb.e, gyb.b);
            }
            case 0: {
                return JpegUtilNative.a(gyb.a, byteBuffer.duplicate(), gyb.e, kra.a);
            }
        }
    }
}
