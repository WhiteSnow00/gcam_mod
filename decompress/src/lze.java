import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

final class lze implements lvi
{
    private final int a;
    
    public lze(final int a) {
        GLES20.glEnableVertexAttribArray(this.a = a);
    }
    
    @Override
    public final void close() {
        GLES20.glDisableVertexAttribArray(this.a);
    }
}
