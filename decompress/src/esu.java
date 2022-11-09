import android.opengl.Matrix;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;

// 
// Decompiled by Procyon v0.6.0
// 

final class esu extends Thread
{
    final /* synthetic */ esv a;
    
    public esu(final esv a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        Object o = esh.a;
        synchronized (o) {
            if (esh.b) {
                LightCycleNative.UndoAddImage();
                monitorexit(o);
                this.a.d.a();
                if (this.a.F.c() == 0) {
                    this.a.d.d();
                    if (this.a.G == 6) {
                        o = new float[16];
                        Matrix.setIdentityM((float[])o, 0);
                        this.a.d.b((float[])o);
                    }
                    o = this.a;
                    final etc h = ((esv)o).h;
                    h.g = false;
                    h.h = false;
                    h.f = 0;
                    ((esv)o).F.G.b = -1.0;
                    ((esv)o).n = true;
                    if (!((esv)o).w) {
                        ((esv)o).e.c(((esv)o).x);
                    }
                }
                o = this.a;
                if (((esv)o).w) {
                    ((esv)o).e.d(true, ((esv)o).F.n);
                }
                return;
            }
            throw new IllegalStateException("State is not ready.");
        }
    }
}
