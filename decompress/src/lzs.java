import java.util.Iterator;
import android.opengl.GLES20;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lzs implements Callable
{
    final /* synthetic */ lzt a;
    
    public lzs(final lzt a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final int size = this.a.a.size();
        final StringBuilder sb = new StringBuilder(26);
        sb.append("linkProgram(n=");
        sb.append(size);
        sb.append(")");
        return sb.toString();
    }
}
