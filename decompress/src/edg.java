import com.google.android.apps.camera.imax.cyclops.processing.NativeCaptureImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edg implements edi
{
    public static int a;
    public static float b;
    
    static {
        edg.a = 8192;
        edg.b = 60.0f;
    }
    
    @Override
    public final edh a() {
        return new NativeCaptureImpl(edg.a, edg.b);
    }
}
