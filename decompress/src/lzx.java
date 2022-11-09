import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzx extends maf
{
    public final int a;
    
    public lzx(final int n, final int a) {
        super(n);
        this.a = a;
    }
    
    public final void b() {
        GLES20.glBindBuffer(this.a, this.b);
    }
    
    @Override
    protected final void c() {
        GLES20.glDeleteBuffers(1, new int[] { this.b }, 0);
    }
    
    @Override
    public final String toString() {
        final int b = super.b;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder(51);
        sb.append("GLRawBuffer{handle=");
        sb.append(b);
        sb.append(", target=");
        sb.append(a);
        sb.append('}');
        return sb.toString();
    }
}
