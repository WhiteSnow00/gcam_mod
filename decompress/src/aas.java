import java.util.concurrent.Executor;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import android.media.MediaCodecList;
import android.os.Trace;
import com.google.android.apps.camera.toast.EducationToastView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aas implements Runnable
{
    private final /* synthetic */ int p;
    
    static {
        o = new aas(20);
        n = new aas(19);
        m = new aas(18);
        l = new aas(17);
        k = new aas(16);
        j = new aas(12);
        i = new aas(11);
        h = new aas(10);
        g = new aas(9);
        f = new aas(8);
        e = new aas(7);
        d = new aas(6);
        c = new aas(5);
        b = new aas(4);
        a = new aas(3);
    }
    
    public aas() {
    }
    
    public aas(final int p) {
        this.p = p;
    }
    
    @Override
    public final void run() {
        switch (this.p) {
            default: {
                return;
            }
            case 18: {
                final int c = EducationToastView.c;
                return;
            }
            case 17: {
                final int c2 = EducationToastView.c;
            }
            case 16: {
                return;
            }
            case 15: {
                kjm.a();
            }
            case 13:
            case 14: {
                return;
            }
            case 12: {
                ffb.a();
                ffb.b();
                return;
            }
            case 11: {
                final Executor a = elc.a;
                Trace.beginSection("preloadMediaCodecList");
                new MediaCodecList(0);
                Trace.endSection();
                return;
            }
            case 10: {
                final Executor a2 = elc.a;
                Trace.beginSection("loadJniLibraries");
                krk.a(ehh.a.get(0));
                egz.b();
                Trace.endSection();
            }
            case 7:
            case 8:
            case 9: {
                return;
            }
            case 6: {
                DynamicDepthUtils.savePdCacheImpl();
            }
            case 4:
            case 5: {
                return;
            }
            case 3: {
                final nsd a3 = bsa.a;
            }
            case 0:
            case 1:
            case 2: {}
        }
    }
}
