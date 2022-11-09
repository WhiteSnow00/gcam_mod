import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mag extends maf
{
    public mag(final int n) {
        super(n);
    }
    
    public final int b(final String s) {
        return GLES20.glGetUniformLocation(this.b, s);
    }
    
    @Override
    protected final void c() {
        GLES20.glDeleteProgram(this.b);
    }
}
