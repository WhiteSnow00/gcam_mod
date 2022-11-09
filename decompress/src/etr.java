import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etr extends esa
{
    public final int e;
    private final int f;
    
    public etr() {
        final int a = esa.a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nuniform float uBrightness;                          \nuniform float uAlpha;                               \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.rgb *= uBrightness * uAlpha;         \n  gl_FragColor.a = gl_FragColor.a * uAlpha;         \n}                                                   \n");
        this.d = a;
        this.a = esa.h(a, "aPosition");
        this.b = esa.h(this.d, "aTextureCoord");
        this.c = esa.i(this.d, "uMvpMatrix");
        final int i = esa.i(this.d, "uBrightness");
        this.e = i;
        final int j = esa.i(this.d, "uAlpha");
        this.f = j;
        this.c();
        GLES20.glUniform1f(i, 0.5f);
        GLES20.glUniform1f(j, 0.5f);
    }
    
    public final void j(final float n) {
        GLES20.glUniform1f(this.f, n);
    }
}
