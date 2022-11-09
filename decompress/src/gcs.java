import java.util.Set;
import android.hardware.camera2.CaptureResult;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcs implements gca
{
    final /* synthetic */ gcm a;
    private final /* synthetic */ int b;
    
    public gcs(final gcm a) {
        this.a = a;
    }
    
    public gcs(final gcm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final gcu a(final gcb gcb) {
        final int b = this.b;
        final Integer value = 3;
        final Integer value2 = 2;
        final Integer value3 = 1;
        final Integer value4 = 0;
        switch (b) {
            default: {
                final gcl a = this.a.a(gcb);
                final ArrayList list = new ArrayList();
                gct.b("single image", a.c(), list);
                gct.b("limited or full", a.g(value4, value3), list);
                gct.b("processing method", a.f(gcf.c), list);
                gct.b("flash off", a.b(), list);
                return gct.a("npf reprocessing", list);
            }
            case 2: {
                final gcl a2 = this.a.a(gcb);
                final ArrayList list2 = new ArrayList();
                gct.b("single image", a2.c(), list2);
                gct.b("limited or full", a2.g(value4, value3, value), list2);
                gct.b("hw_jpeg, sw_jpeg, reprocessing", a2.f(gcf.a, gcf.b, gcf.d), list2);
                gct.b("flash off", a2.b(), list2);
                gct.b("edge", a2.a(), list2);
                gct.b("noise reduction", a2.d(), list2);
                return gct.a("regular", list2);
            }
            case 1: {
                final gcl a3 = this.a.a(gcb);
                final ArrayList list3 = new ArrayList();
                gct.b("legacy", a3.g(value2), list3);
                return gct.a("legacy", list3);
            }
            case 0: {
                final gcl a4 = this.a.a(gcb);
                final ArrayList list4 = new ArrayList();
                gct.b("single image", a4.c(), list4);
                gct.b("limited or full", a4.g(value4, value3, value), list4);
                gct.b("hw jpeg, sw jpeg, reprocessing", a4.f(gcf.a, gcf.b, gcf.d), list4);
                gct.b("flash fired", a4.a.a().a(CaptureResult.FLASH_STATE, value), list4);
                gct.b("edge", a4.a(), list4);
                gct.b("noise reduction", a4.d(), list4);
                gct.b("aberration", a4.e(Integer.class, CaptureResult.COLOR_CORRECTION_ABERRATION_MODE, value4, noi.I(value3, value2), noi.I(value3, value2)), list4);
                gct.b("af converged", a4.a.a().b(CaptureResult.CONTROL_AF_STATE, value2, 6, value4, 4, 5), list4);
                return gct.a("flash", list4);
            }
        }
    }
}
