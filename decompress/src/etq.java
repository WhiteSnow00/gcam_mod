import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etq extends esa
{
    private int e;
    
    public etq() {
        this.e = 0;
        final int a = esa.a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.a = gl_FragColor.a * uAlphaFactor;   \n}                                                   \n");
        this.d = a;
        this.a = esa.h(a, "aPosition");
        this.b = esa.h(this.d, "aTextureCoord");
        this.c = esa.i(this.d, "uMvpMatrix");
        this.e = esa.i(this.d, "uAlphaFactor");
        this.c();
        GLES20.glUniform1f(this.e, 1.0f);
    }
    
    public final void j(final float n) {
        GLES20.glUniform1f(this.e, n);
    }
}
