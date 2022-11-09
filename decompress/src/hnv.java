import java.util.concurrent.Callable;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class hnv extends CountDownTimer
{
    final /* synthetic */ PointF a;
    final /* synthetic */ hnx b;
    
    public hnv(final hnx b, final long n, final long n2, final PointF a) {
        this.b = b;
        this.a = a;
        super(n, n2);
    }
    
    public final void onFinish() {
        final hnx b = this.b;
        if (b.j) {
            return;
        }
        b.k = null;
        b.c.a();
        Object o = this.b;
        final nii a = nii.a;
        synchronized (o) {
            final Callable i = ((hnx)o).i;
            monitorexit(o);
            if (i != null) {
                try {
                    o = i.call();
                    if (((niz)o).g()) {
                        o = niz.i(((ixt)((niz)o).c()).a);
                    }
                }
                catch (final Exception o) {
                    a.m(hnx.a.b(), "Grabbing viewfinder screenshot failed.", '\u0938', (Throwable)o);
                }
            }
            if (((niz)o).g()) {
                this.b.b.S(26, 8);
                this.b.f.c(0);
                o = this.b.d;
                final oiu b2 = oiv.b();
                b2.b = (Bitmap)((niz)o).c();
                b2.g = this.a;
                ((iov)o).g = b2.a();
                if (!this.b.e.b(jbm.k)) {
                    this.b.d.e();
                }
            }
        }
    }
    
    public final void onTick(final long n) {
    }
}
