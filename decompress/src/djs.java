import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

// 
// Decompiled by Procyon v0.6.0
// 

final class djs implements TextureFrame
{
    final /* synthetic */ man a;
    final /* synthetic */ long b;
    
    public djs(final man a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int getHeight() {
        return this.a.b().a.a();
    }
    
    @Override
    public final int getTextureName() {
        return ((maj)this.a.g()).b;
    }
    
    @Override
    public final long getTimestamp() {
        return this.b;
    }
    
    @Override
    public final int getWidth() {
        return this.a.b().a.b();
    }
    
    @Override
    public final void release() {
    }
    
    @Override
    public final void release(final GlSyncToken glSyncToken) {
    }
}
