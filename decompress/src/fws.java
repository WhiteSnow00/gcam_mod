import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fws implements fwu
{
    public static final MeteringRectangle[] a;
    
    static {
        a = new MeteringRectangle[] { new MeteringRectangle(0, 0, 0, 0, 0) };
    }
    
    public static fwu c() {
        return fwr.a;
    }
    
    @Override
    public final MeteringRectangle[] a(final Rect rect) {
        return fws.a;
    }
    
    @Override
    public final MeteringRectangle[] b(final Rect rect) {
        return fws.a;
    }
}
