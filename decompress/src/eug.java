import java.nio.ByteBuffer;
import com.google.android.libraries.lens.lenslite.api.ImageProxy$Plane;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eug implements ImageProxy$Plane
{
    private final ljt a;
    
    public eug(final ljt a) {
        this.a = a;
    }
    
    @Override
    public final ByteBuffer getBuffer() {
        return this.a.getBuffer();
    }
    
    @Override
    public final int getPixelStride() {
        return this.a.getPixelStride();
    }
    
    @Override
    public final int getRowStride() {
        return this.a.getRowStride();
    }
}
