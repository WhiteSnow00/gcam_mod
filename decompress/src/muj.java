import com.google.android.libraries.vision.opengl.Texture;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class muj
{
    public final int a;
    
    public muj(final int a) {
        this.a = a;
    }
    
    public final void a(final float[] array) {
        GLES20.glUniformMatrix4fv(this.a, 1, false, array, 0);
    }
    
    public final void b(final float[] array) {
        GLES20.glUniform4fv(this.a, 1, array, 0);
    }
    
    public final void c(final Texture texture) {
        GLES20.glActiveTexture(33984);
        texture.bind();
        GLES20.glUniform1i(this.a, 0);
    }
}
