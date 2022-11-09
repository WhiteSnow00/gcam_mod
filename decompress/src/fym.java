import android.hardware.camera2.CaptureRequest;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fym
{
    public final List a;
    
    public fym(final klj klj, final jbm jbm) {
        final lft lft = (lft)((klo)klj).a;
        final nnn nnn = new nnn();
        final noi b = grd.b(jbm);
        if (b.isEmpty()) {
            final lft b2 = lft.b;
            int n = 1;
            if (lft != b2 && lft != lft.c) {
                if (lft != lft.a) {
                    n = 0;
                }
            }
            nnn.g(kxc.p(CaptureRequest.CONTROL_SCENE_MODE, n));
        }
        else {
            nnn.h(b);
        }
        this.a = nnn.f();
    }
}
