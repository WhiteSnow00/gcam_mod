import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ery
{
    public int a;
    
    public ery() {
        this.a = -1;
    }
    
    public ery(final byte[] array) {
        this.a = -1;
        this.a = b();
    }
    
    public static int a() {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(3553, array[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return array[0];
    }
    
    public static int b() {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(3553, array[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return array[0];
    }
    
    public final void c() {
        GLES20.glDeleteTextures(1, new int[] { this.a }, 0);
        this.a = -1;
    }
    
    public final void d() {
        final int a = this.a;
        if (a >= 0) {
            GLES20.glBindTexture(3553, a);
            erz.a("glBindTexture");
            return;
        }
        throw new erz("Trying to bind without a loaded texture");
    }
}
