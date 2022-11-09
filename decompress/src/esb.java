import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esb extends esa
{
    private final int e;
    
    public esb() {
        final int a = esa.a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   gl_PointSize = 5.5;                      \n}                                           \n", "precision mediump float;                       \nuniform vec4 uDrawColor;                       \nvoid main()                                    \n{                                              \n  gl_FragColor = uDrawColor;                   \n}                                              \n");
        this.d = a;
        this.a = esa.h(a, "aPosition");
        this.c = esa.i(this.d, "uMvpMatrix");
        this.e = esa.i(this.d, "uDrawColor");
    }
    
    public final void j(final float[] array) {
        this.c();
        GLES20.glUniform4f(this.e, array[0], array[1], array[2], array[3]);
    }
}
