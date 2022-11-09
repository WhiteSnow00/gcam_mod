import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eeg
{
    public static final FloatBuffer a;
    public static final FloatBuffer b;
    public Texture c;
    public final float[] d;
    public final float[] e;
    public muh f;
    public muj g;
    public muj h;
    public muj i;
    public mue j;
    public mue k;
    
    static {
        a = mug.a(mug.b(-1.0f, -1.0f));
        b = mug.a(mug.b(0.0f, 0.0f));
    }
    
    public eeg() {
        this.c = null;
        final float[] d = new float[16];
        this.d = d;
        final float[] e = new float[16];
        this.e = e;
        Matrix.setIdentityM(d, 0);
        Matrix.setIdentityM(e, 0);
    }
}
