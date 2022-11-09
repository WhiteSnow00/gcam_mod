import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohu
{
    final Face[] a;
    int[] b;
    byte[] c;
    float[] d;
    
    public ohu(final lji lji) {
        this.a = (Face[])lji.d(CaptureResult.STATISTICS_FACES);
        if (jli.m != null && jli.n != null && jli.o != null) {
            this.b = (int[])lji.d(jli.m);
            this.c = (byte[])lji.d(jli.n);
            this.d = (float[])lji.d(jli.o);
        }
    }
}
