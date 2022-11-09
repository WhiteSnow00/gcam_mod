import java.util.concurrent.Executor;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bni implements bsk
{
    public final csg a;
    public final CameraActivityTiming b;
    public final dfz c;
    public final Executor d;
    public final crw e;
    private final bnf f;
    
    public bni(final bnf f, final csg a, final CameraActivityTiming b, final crw e, final dfz c, final Executor d) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    public static kst a(final dep dep) {
        kst kst;
        if ((kst = dep.b) == null) {
            kst = kst.m;
        }
        kst.getClass();
        return kst;
    }
    
    @Override
    public final oey aP() {
        final CameraActivityTiming b = this.b;
        b.j(hvu.e, CameraActivityTiming.b);
        b.h = b.e.a("waitForCameraDevice");
        return oco.i(odg.h(this.f.a(), new bng(this), odx.a), Throwable.class, emt.b, odx.a);
    }
}
