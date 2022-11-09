import java.nio.Buffer;
import android.opengl.GLES20;
import android.opengl.GLES30;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class mam implements Callable
{
    final /* synthetic */ lyp a;
    final /* synthetic */ lxx b;
    
    public mam(final lyp a, final lxx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        return "createTexture(RGBA8888)";
    }
}
