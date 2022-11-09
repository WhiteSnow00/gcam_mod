import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

final class lzd implements lzh
{
    final /* synthetic */ String a;
    final /* synthetic */ float b;
    
    public lzd(final String a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final mag mag) {
        GLES20.glUniform1f(mag.b(this.a), this.b);
    }
}
