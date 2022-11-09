import com.google.vr.cardboard.ExternalSurfaceManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orw
{
    final /* synthetic */ long a;
    
    public orw(final long a) {
        this.a = a;
    }
    
    public final void a(final int n, final int n2, final long n3, final float[] array) {
        ExternalSurfaceManager.nativeUpdateSurface(this.a, n, n2, n3, array);
    }
}
