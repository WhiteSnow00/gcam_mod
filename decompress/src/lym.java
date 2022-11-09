import android.opengl.GLES30;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lym implements Callable
{
    final /* synthetic */ mde a;
    
    public lym(final mde a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(((man)this.a.c()).b());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
        sb.append("createCanvasForTexture(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
