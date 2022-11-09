import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.GestureDetector$OnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iss implements isx
{
    @Override
    public final GestureDetector$OnGestureListener a() {
        return (GestureDetector$OnGestureListener)new GestureDetector$SimpleOnGestureListener();
    }
    
    @Override
    public final View$OnTouchListener b() {
        return null;
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final boolean d() {
        return true;
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        return true;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
    }
    
    public final void surfaceRedrawNeeded(final SurfaceHolder surfaceHolder) {
    }
}
