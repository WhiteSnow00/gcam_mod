import android.media.Image$Plane;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class les implements ljt
{
    private final int a;
    private final int b;
    private final ByteBuffer c;
    private final /* synthetic */ int d;
    
    public les(final Image$Plane image$Plane) {
        this.a = image$Plane.getPixelStride();
        this.b = image$Plane.getRowStride();
        this.c = image$Plane.getBuffer();
    }
    
    public les(final ByteBuffer c, final int b, final int a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ByteBuffer getBuffer() {
        switch (this.d) {
            default: {
                return this.c;
            }
            case 0: {
                return this.c;
            }
        }
    }
    
    @Override
    public final int getPixelStride() {
        switch (this.d) {
            default: {
                return this.a;
            }
            case 0: {
                return this.a;
            }
        }
    }
    
    @Override
    public final int getRowStride() {
        switch (this.d) {
            default: {
                return this.b;
            }
            case 0: {
                return this.b;
            }
        }
    }
}
