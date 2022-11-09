import com.google.android.apps.camera.debugui.DebugCanvasView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddz
{
    public static final nsd a;
    public DebugCanvasView b;
    public boolean c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/debugui/DebugCanvasAdapter");
    }
    
    public ddz() {
        this.c = false;
    }
    
    final void a() {
        final DebugCanvasView b = this.b;
        if (b == null) {
            a.l(ddz.a.c(), "UI view not yet initialized", '\u02cb');
            return;
        }
        b.invalidate();
    }
    
    public final void b(final DebugCanvasView b) {
        this.b = b;
        if (b != null) {
            b.setVisibility(4);
        }
    }
}
