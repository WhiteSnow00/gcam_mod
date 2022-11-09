import android.graphics.SurfaceTexture;

// 
// Decompiled by Procyon v0.6.0
// 

final class asu implements Runnable
{
    final /* synthetic */ SurfaceTexture a;
    final /* synthetic */ asx b;
    
    public asu(final asx b, final SurfaceTexture a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.c().obtainMessage(101, (Object)this.a).sendToTarget();
    }
}
