import android.opengl.GLES30;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lyn implements Callable
{
    final /* synthetic */ lyp a;
    final /* synthetic */ EGLImage b;
    
    public lyn(final lyp a, final EGLImage b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b.b());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 22);
        sb.append("createCanvasForImage(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
