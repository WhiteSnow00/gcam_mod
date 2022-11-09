import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class fon implements SurfaceHolder$Callback
{
    final /* synthetic */ for a;
    
    public fon(final for a) {
        this.a = a;
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        final kwz g = this.a.g;
        final Surface surface = surfaceHolder.getSurface();
        final kre h = kre.h(n2, n3);
        this.a.f = h;
        if (g != null) {
            if (g.b().e().equals(h.e())) {
                try {
                    g.d(surface);
                    return;
                }
                catch (final IllegalArgumentException ex) {
                    this.a.b.e("Surface change failed!", ex);
                    return;
                }
            }
            final krr b = this.a.b;
            final String value = String.valueOf(g);
            final String value2 = String.valueOf(g.b());
            final String value3 = String.valueOf(h);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 50 + String.valueOf(value2).length() + String.valueOf(value3).length());
            sb.append("Ignoring surface changed: ");
            sb.append(value);
            sb.append(" is ");
            sb.append(value2);
            sb.append(" and the surface is ");
            sb.append(value3);
            b.h(sb.toString());
        }
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        final for a = this.a;
        a.f = null;
        final kwz g = a.g;
        if (g != null) {
            g.d(null);
        }
    }
}
