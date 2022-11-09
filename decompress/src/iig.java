import java.util.concurrent.Executor;
import j$.util.function.Consumer;
import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iig implements bqp
{
    public static final nsd a;
    public final WindowManager b;
    public final bqv c;
    public boolean d;
    private final Consumer e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/captureindicator/wirer/FilmstripDataCaptureIndicatorUpdater");
    }
    
    public iig(final WindowManager b, final Consumer e, final bqv c, final hkc hkc, final kjm kjm, final cxl cxl, final bmz bmz) {
        this.b = b;
        this.e = e;
        this.c = c;
        if (cxl.k(cxr.bi)) {
            bmz.i().c(hkc.a(hjq.R).a(new iie(this, c), kjm));
        }
    }
    
    @Override
    public final void a() {
        this.e.accept((Object)new iif(this));
    }
}
