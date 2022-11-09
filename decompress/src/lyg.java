import java.nio.Buffer;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lyg implements Callable
{
    final /* synthetic */ lyp a;
    final /* synthetic */ int b;
    final /* synthetic */ ByteBuffer c;
    
    public lyg(final lyp a, final int b, final ByteBuffer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final int remaining = this.c.remaining();
        final StringBuilder sb = new StringBuilder(51);
        sb.append("createBufferWithStaticData(");
        sb.append(b);
        sb.append(",");
        sb.append(remaining);
        sb.append(")");
        return sb.toString();
    }
}
