import java.nio.Buffer;
import java.nio.FloatBuffer;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mue
{
    private final int a;
    
    public mue(final int a) {
        this.a = a;
    }
    
    public final void a() {
        GLES20.glDisableVertexAttribArray(this.a);
    }
    
    public final void b() {
        GLES20.glEnableVertexAttribArray(this.a);
    }
    
    public final void c(final FloatBuffer floatBuffer, final int n) {
        GLES20.glVertexAttribPointer(this.a, n, 5126, false, 0, (Buffer)floatBuffer);
    }
}
