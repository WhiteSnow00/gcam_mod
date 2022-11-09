import com.google.android.apps.camera.ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.android.apps.camera.stats.Instrumentation;
import j$.util.Map$_EL;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.camera.ui.views.ViewfinderCover;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzw implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public hzw(final pii a) {
        this.a = a;
    }
    
    public hzw(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static isa a(final cxl cxl) {
        return new isa(cxl);
    }
    
    public static hzw b(final pii pii) {
        return new hzw(pii, 6);
    }
}
