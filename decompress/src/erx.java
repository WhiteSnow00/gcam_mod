import android.opengl.Matrix;
import java.util.Vector;
import java.nio.ShortBuffer;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class erx
{
    public FloatBuffer a;
    public FloatBuffer b;
    public ShortBuffer c;
    public final Vector d;
    public esa e;
    private final float[] f;
    private final float[] g;
    
    public erx() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new Vector();
        final float[] f = new float[16];
        this.f = f;
        this.g = new float[16];
        this.e = null;
        Matrix.setIdentityM(f, 0);
    }
    
    public void a(final float[] array) {
        Matrix.multiplyMM(this.g, 0, array, 0, this.f, 0);
        this.c(this.g);
    }
    
    public abstract void c(final float[] p0);
    
    protected final void d(int n, final float n2, final float n3) {
        final int n4 = n * 3;
        n = n4 + 1;
        this.a.put(n4, n2);
        this.a.put(n, -1.7f);
        this.a.put(n + 1, n3);
    }
}
