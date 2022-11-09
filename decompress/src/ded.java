import com.google.android.apps.camera.debugui.DebugCanvasView;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ded extends kxc
{
    private final ddz a;
    
    public ded(final ddz a, final cxl cxl) {
        this.a = a;
        final cxo a2 = cxr.a;
        cxl.b();
        cxl.b();
        cxl.b();
    }
    
    @Override
    public final void b(final ljm ljm) {
        final ddz a = this.a;
        final Rect rect = (Rect)ljm.d(CaptureResult.SCALER_CROP_REGION);
        rect.getClass();
        final DebugCanvasView b = a.b;
        if (b == null) {
            a.l(ddz.a.c(), "UI view not yet initialized", '\u02ca');
        }
        else if (b.d.d(rect) && b.d()) {
            b.d.a().mapRect(b.c, new RectF(rect));
        }
        if (ljm.d(jll.h) != null) {
            try {
                final byte[] array = (byte[])ljm.d(jll.h);
                if (array == null) {
                    this.a.a();
                    return;
                }
                final nib nib = (nib)oky.o(nib.a, new ByteArrayInputStream(array));
            }
            catch (final IOException ex) {}
        }
        this.a.a();
    }
}
