import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mah extends maf
{
    public mah(final int n, final String s) {
        super(n);
        GLES20.glShaderSource(this.b, s);
    }
    
    @Override
    protected final void c() {
        GLES20.glDeleteShader(this.b);
    }
}
