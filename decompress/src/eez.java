import android.opengl.Matrix;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eez
{
    public static final float[] a;
    public FloatBuffer b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public muh f;
    public muj g;
    public muj h;
    public muj i;
    public mue j;
    
    static {
        a = new float[] { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f };
    }
    
    public eez() {
        this.b = mug.a(eez.a);
        final float[] c = new float[16];
        this.c = c;
        this.d = new float[16];
        this.e = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        Matrix.setIdentityM(c, 0);
    }
}
