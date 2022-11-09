import javax.microedition.khronos.egl.EGLConfig;
import java.nio.Buffer;
import android.opengl.GLES30;
import javax.microedition.khronos.opengles.GL10;
import java.nio.ByteBuffer;
import android.opengl.GLSurfaceView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idu implements GLSurfaceView$Renderer
{
    public ByteBuffer a;
    public float[] b;
    public ids c;
    private final jvh d;
    
    public idu(final jvh d, final byte[] array, final byte[] array2) {
        this.d = d;
    }
    
    public final void onDrawFrame(final GL10 gl10) {
        System.currentTimeMillis();
        final ids c = this.c;
        final ByteBuffer a = this.a;
        final float[] b = this.b;
        a.position(0);
        GLES30.glTexImage2D(3553, 0, 6407, c.c, c.b, 0, 6407, 5121, (Buffer)a);
        c.a.put(b);
        c.a.position(0);
        GLES30.glVertexAttribPointer(c.d, 4, 5126, false, 16, (Buffer)c.a);
        GLES30.glEnableVertexAttribArray(c.d);
        c.e.position(0);
        GLES30.glDrawElements(4, c.e.capacity(), 5123, (Buffer)c.e);
        System.currentTimeMillis();
    }
    
    public final void onSurfaceChanged(final GL10 gl10, final int n, final int n2) {
        this.c = new ids(this.d, n, n2, null, null);
        gl10.glViewport(0, 0, n, n2);
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
    }
}
