import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsf implements hub, exn, exl, exm
{
    public static final nsd a;
    public final Context b;
    public final kse c;
    private final cxl d;
    private final ewy e;
    private final kjm f;
    private final Executor g;
    private oey h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/assistant/CameraAssistantBehavior");
    }
    
    public bsf(final Context b, final cxl d, final ewy e, final kjm f, final Executor g, final kse c) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.c = c;
    }
    
    @Override
    public final void bk() {
        if (this.h != null) {
            return;
        }
        this.h = ofi.r(new bse(this), this.g);
    }
    
    @Override
    public final void e() {
        final oey h = this.h;
        if (h == null) {
            return;
        }
        knf.f(h, new bsd(this), this.g);
        this.h = null;
    }
    
    @Override
    public final void run() {
        if (!this.d.k(cxr.G)) {
            return;
        }
        egz.d(this.f, this.e, this);
    }
}
