import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

final class lzb implements lzh
{
    final /* synthetic */ String a;
    final /* synthetic */ float[] b;
    
    public lzb(final float[] b) {
        this.a = "uTransform";
        this.b = b;
    }
    
    @Override
    public final void a(final mag mag) {
        GLES20.glUniformMatrix4fv(mag.b(this.a), 1, false, this.b, 0);
    }
}
