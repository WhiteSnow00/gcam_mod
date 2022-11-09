import android.graphics.RectF;
import android.app.Activity;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ioe
{
    private static final nsd b;
    public final MainActivityLayout a;
    private final Activity c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/ui/layout/legacy/CaptureLayoutHelper");
    }
    
    public ioe(final Activity c) {
        this.c = c;
        this.a = (MainActivityLayout)c.findViewById(2131427411);
    }
    
    public final RectF a() {
        final inw inw = this.a.q.get();
        if (inw == null) {
            a.l(ioe.b.c(), "Preview rectangle is not available now", '\u0ae6');
            return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        return new RectF(inw.b.e);
    }
    
    public final boolean b() {
        return this.c.isInMultiWindowMode();
    }
}
