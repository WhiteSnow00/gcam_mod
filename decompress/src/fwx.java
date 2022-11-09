import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwx
{
    private final int a;
    
    public fwx(final int a) {
        this.a = a;
    }
    
    public final PointF a(final PointF pointF) {
        switch (this.a) {
            default: {
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
            }
            case 270: {
                return new PointF(1.0f - pointF.y, pointF.x);
            }
            case 180: {
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            }
            case 90: {
                return new PointF(pointF.y, 1.0f - pointF.x);
            }
            case 0: {
                return pointF;
            }
        }
    }
    
    public final PointF b(final PointF pointF) {
        switch (this.a) {
            default: {
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
            }
            case 270: {
                return new PointF(pointF.y, 1.0f - pointF.x);
            }
            case 180: {
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            }
            case 90: {
                return new PointF(1.0f - pointF.y, pointF.x);
            }
            case 0: {
                return pointF;
            }
        }
    }
}
