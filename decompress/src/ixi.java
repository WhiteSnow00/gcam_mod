import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback2;

// 
// Decompiled by Procyon v0.6.0
// 

final class ixi implements SurfaceHolder$Callback2
{
    private final dbk a;
    
    public ixi(final dbk a) {
        this.a = a;
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        final dbk a = this.a;
        surfaceHolder.getSurface();
        a.f();
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final dbk a = this.a;
        surfaceHolder.getSurface();
        a.f();
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.a.c();
    }
    
    public final void surfaceRedrawNeeded(final SurfaceHolder surfaceHolder) {
    }
}
