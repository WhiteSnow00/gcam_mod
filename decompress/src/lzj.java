import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.GLES30;
import android.opengl.EGL14;

// 
// Decompiled by Procyon v0.6.0
// 

final class lzj implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ lzk c;
    
    public lzj(final lzk c, final Runnable a, final Throwable b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int incrementAndGet = this.c.a.incrementAndGet();
        final boolean value = this.c.b.get();
        this.a.run();
        final Runnable a = this.a;
        final Throwable b = this.b;
        final int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            mcn.d(a, incrementAndGet, eglGetError, GLES30.glGetError(), value);
            final String eglErrorString = GLUtils.getEGLErrorString(eglGetError);
            final String string = a.toString();
            final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 37 + String.valueOf(eglErrorString).length());
            sb.append("Executing EGL task '");
            sb.append(string);
            sb.append("' caused error: ");
            sb.append(eglErrorString);
            sb.append("!");
            throw new RuntimeException(sb.toString(), b);
        }
        final Runnable a2 = this.a;
        final Throwable b2 = this.b;
        final int glGetError = GLES30.glGetError();
        if (glGetError == 0) {
            return;
        }
        mcn.d(a2, incrementAndGet, EGL14.eglGetError(), glGetError, value);
        final String gluErrorString = GLU.gluErrorString(glGetError);
        final String string2 = a2.toString();
        final StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 35 + String.valueOf(gluErrorString).length());
        sb2.append("Executing GL task '");
        sb2.append(string2);
        sb2.append("' caused error ");
        sb2.append(gluErrorString);
        sb2.append("!");
        throw new RuntimeException(sb2.toString(), b2);
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 10);
        sb.append("checked [");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
