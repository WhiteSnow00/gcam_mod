import android.view.SurfaceHolder;
import android.os.Handler;
import android.graphics.SurfaceTexture;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isy implements isx
{
    final /* synthetic */ fol a;
    
    public isy() {
    }
    
    public isy(final fol a) {
        this.a = a;
    }
    
    @Override
    public final GestureDetector$OnGestureListener a() {
        return null;
    }
    
    @Override
    public final View$OnTouchListener b() {
        return this.a.M;
    }
    
    @Override
    public final void c() {
        this.a.G();
    }
    
    @Override
    public final boolean d() {
        return false;
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int x, final int y) {
        final fol a = this.a;
        if (a.I != null) {
            a.l(fol.b.c(), "onCameraAvailable queued before onSurfaceTextureAvailable", '\u06b2');
            return;
        }
        a.x = x;
        a.y = y;
        a.w();
        this.a.t.g().b();
        final bsa bsa = (bsa)this.a.t.g();
        final SurfaceTexture t = bsa.t;
        Label_0146: {
            if (t != null) {
                final isu r = bsa.r;
                if (r != null) {
                    t.setDefaultBufferSize(r.b(), bsa.r.a());
                    break Label_0146;
                }
            }
            a.l(bsa.a.c(), "Could not set SurfaceTexture default buffer dimensions, not yet setup", '\u0081');
        }
        this.a.t.g().h(false);
        final fol a2 = this.a;
        a2.I = new dsm(surfaceTexture, a2.H, a2);
        final fol a3 = this.a;
        if (a3.i != null) {
            a3.F();
        }
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.a.E();
        return true;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int x, final int y) {
        final fol a = this.a;
        a.x = x;
        a.y = y;
        final Handler h = a.H;
        if (h != null) {
            h.obtainMessage(2, x, y).sendToTarget();
        }
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }
    
    public final void surfaceRedrawNeeded(final SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }
}
