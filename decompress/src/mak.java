import android.opengl.GLES20;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class mak implements Callable
{
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    
    public mak(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder(25);
        sb.append("createShader(");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
