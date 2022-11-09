import android.hardware.camera2.CaptureResult$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cht
{
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    
    public cht(final ljm ljm) {
        this.a = (byte[])a(jlk.m, ljm);
        this.b = (byte[])a(jlk.n, ljm);
        this.c = (byte[])a(jlk.o, ljm);
    }
    
    private static Object a(final CaptureResult$Key captureResult$Key, final ljm ljm) {
        if (captureResult$Key != null) {
            return ljm.d(captureResult$Key);
        }
        return null;
    }
}
