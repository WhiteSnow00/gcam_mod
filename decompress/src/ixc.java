import java.util.List;
import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixc extends ixa
{
    private static final nsd a;
    private static final kre b;
    private static final kre c;
    private final lfh d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/viewfinder/LowResViewfinderSizeSelector");
        b = kre.h(1024, 768);
        c = kre.h(1280, 720);
    }
    
    public ixc(final WindowManager windowManager, final cxl cxl, final lfh d) {
        super(windowManager, cxl);
        this.d = d;
    }
    
    @Override
    public final kre b(final List list, final double n, final lfu lfu, final jbm jbm, final lfj lfj) {
        if (jbm == jbm.b) {
            try {
                final kre b = gij.a(this.d.a(lfj), this.a(list, n), 34).b;
                kre kre;
                if (kqp.b.j(kqp.g(b))) {
                    kre = ixc.c;
                }
                else {
                    njo.d(kqp.a.j(kqp.g(b)));
                    kre = ixc.b;
                }
                if (list.contains(kre)) {
                    return kre;
                }
            }
            catch (final gii gii) {
                a.n(ixc.a.c(), "selectViewfinderSize: cameraId=%s", lfj, '\u0ba0', gii);
            }
        }
        return super.b(list, n, lfu, jbm, lfj);
    }
}
