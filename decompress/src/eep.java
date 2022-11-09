import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eep
{
    private final eeg a;
    
    public eep(final Texture c, final int n) {
        final eeg a = new eeg();
        this.a = a;
        a.c = c;
        final float[] array = new float[16];
        Matrix.setIdentityM(array, 0);
        Matrix.rotateM(array, 0, (float)n, 0.0f, 0.0f, 1.0f);
        System.arraycopy(array, 0, a.d, 0, 16);
    }
    
    public final void a(final float[] array) {
        System.arraycopy(array, 0, this.a.e, 0, 16);
        GLES20.glClear(16384);
        final eeg a = this.a;
        final Texture c = a.c;
        if (c == null) {
            return;
        }
        if (a.f == null) {
            String s;
            if (c.getType() == 36197) {
                s = "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}";
            }
            else {
                s = "precision mediump float;uniform sampler2D texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}";
            }
            a.f = new muh("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = vertexTransform * vec4(vertexAttrib, 0., 1.);}", s);
            a.g = a.f.b("texture");
            a.h = a.f.b("vertexTransform");
            a.i = a.f.b("textureTransform");
            a.j = a.f.a("vertexAttrib");
            a.k = a.f.a("texCoordAttrib");
        }
        a.f.c();
        a.j.b();
        a.j.c(eeg.a, 2);
        a.k.b();
        a.k.c(eeg.b, 2);
        a.g.c(a.c);
        a.h.a(a.d);
        a.i.a(a.e);
        GLES20.glDrawArrays(5, 0, eeg.a.capacity() / 2);
        a.k.a();
        a.j.a();
        a.f.e();
        a.c.unbind();
    }
}
