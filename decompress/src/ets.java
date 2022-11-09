import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ets extends esa
{
    private int e;
    
    public ets() {
        this.e = 0;
        final int a = esa.a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision highp float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = uAlphaFactor;                        \n  gl_FragColor = texcolor;                          \n}                                                   \n");
        this.d = a;
        this.a = esa.h(a, "aPosition");
        this.b = esa.h(this.d, "aTextureCoord");
        this.c = esa.i(this.d, "uMvpMatrix");
        this.e = esa.i(this.d, "uAlphaFactor");
        this.c();
        GLES20.glUniform1f(this.e, 0.9f);
    }
    
    public final void j(final float n) {
        GLES20.glUniform1f(this.e, n);
    }
}
