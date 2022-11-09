import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback2;

// 
// Decompiled by Procyon v0.6.0
// 

final class ixg implements SurfaceHolder$Callback2
{
    final /* synthetic */ ixh a;
    
    public ixg(final ixh a) {
        this.a = a;
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        njo.o(this.a.f ^ true);
        this.a.d.f("surfaceChanged");
        final kre kre = new kre(n2, n3);
        final Surface surface = surfaceHolder.getSurface();
        final Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        final kqp e = kqp.e(kre);
        final krr a = this.a.a;
        final String value = String.valueOf(kre);
        final String value2 = String.valueOf(e);
        final int width = surfaceFrame.width();
        final int height = surfaceFrame.height();
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 91 + String.valueOf(value2).length());
        sb.append("SurfaceEvent: surfaceChanged (newSize: ");
        sb.append(value);
        sb.append(", newRatio: ");
        sb.append(value2);
        sb.append(", surfaceFrame: ");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append(")");
        a.b(sb.toString());
        if (!this.a.g.isDone()) {
            final ixh a2 = this.a;
            if (surface.isValid()) {
                final kqp e2 = kqp.e(kre);
                final kqp d = a2.e.b.d();
                if (!nqb.E(e2, d)) {
                    final krr a3 = a2.a;
                    final String value3 = String.valueOf(e2.d());
                    final String value4 = String.valueOf(d.d());
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 47 + String.valueOf(value4).length());
                    sb2.append("Aspect ratios do not match! surface: ");
                    sb2.append(value3);
                    sb2.append(" preview: ");
                    sb2.append(value4);
                    a3.g(sb2.toString());
                }
                else {
                    final ixh a4 = this.a;
                    final krr a5 = a4.a;
                    final String value5 = String.valueOf(a4.e.a);
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(value5).length() + 29);
                    sb3.append("Surface request is set. size=");
                    sb3.append(value5);
                    a5.f(sb3.toString());
                    this.a.h.i(hwo.b);
                    this.a.d.f("surfaceRequest.set");
                    this.a.g.o(new ixq(surface, n, new kre(n2, n3).c()));
                    this.a.d.g();
                }
            }
        }
        this.a.d.g();
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        njo.o(this.a.f ^ true);
        this.a.h.i(hwo.a);
        this.a.a.b("SurfaceEvent: surfaceCreated");
        if (this.a.g.isDone()) {
            final ixh a = this.a;
            final krr a2 = a.a;
            final String value = String.valueOf(knf.d(a.g));
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 55);
            sb.append("surfaceChanged was already called or cancelled? Value: ");
            sb.append(value);
            a2.h(sb.toString());
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        njo.o(this.a.f ^ true);
        this.a.a.b("SurfaceEvent: surfaceDestroyed");
        final ixh a = this.a;
        a.a("Surface has been destroyed.");
        a.g = ofn.f();
        this.a.h.close();
        if (this.a.c.g()) {
            final ekw a2 = ((eke)this.a.c.c()).a;
            if (a2.U.f() && !a2.U.g()) {
                a2.E = true;
                a2.o.p();
            }
        }
    }
    
    public final void surfaceRedrawNeeded(final SurfaceHolder surfaceHolder) {
        njo.o(this.a.f ^ true);
        this.a.a.b("SurfaceEvent: surfaceRedrawNeeded");
    }
}
