import android.graphics.Point;
import android.graphics.PointF;
import java.util.concurrent.Executor;
import android.os.CountDownTimer;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnx extends jgo
{
    public static final nsd a;
    public final eyt b;
    public final hoj c;
    public final iov d;
    public final flo e;
    public final jdj f;
    public volatile boolean g;
    public crg h;
    public Callable i;
    public boolean j;
    public CountDownTimer k;
    public boolean l;
    private final dgm n;
    private long o;
    private boolean p;
    
    static {
        a = nsd.g("com/google/android/apps/camera/smarts/SmartsGestureListener");
    }
    
    public hnx(final Executor executor, final eyt b, final hoj c, final dgm n, final iov d, final flo e, final jdj f) {
        this.g = false;
        this.l = false;
        this.b = b;
        this.c = c;
        this.n = n;
        this.d = d;
        this.e = e;
        this.f = f;
        ofi.w(d.a(), new hnu(this), executor);
    }
    
    @Override
    public final void a(final PointF pointF) {
        if (this.j) {
            this.p = true;
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.o < 500L) {
            this.p = true;
        }
        else {
            this.p = false;
        }
        this.o = currentTimeMillis;
    }
    
    @Override
    public final void b() {
        kjm.a();
        this.d();
    }
    
    @Override
    public final void c(final PointF pointF) {
        kjm.a();
        if (!this.l) {
            return;
        }
        final Callable i = this.i;
        final boolean b = true;
        njo.o(i != null);
        njo.o(this.h != null);
        njo.o(this.k == null && b);
        if (this.g && this.h.j() && !(boolean)((kkz)this.n.b).d && !this.p && !this.j) {
            final long max = Math.max(0L, 1100L - (System.currentTimeMillis() - this.o));
            (this.k = new hnv(this, max, max, pointF)).start();
            if (max > 0L) {
                this.f.c(0);
                final hoj c = this.c;
                c.f.b(new hog(c, new Point((int)pointF.x, (int)pointF.y)));
            }
        }
    }
    
    public final void d() {
        kjm.a();
        final CountDownTimer k = this.k;
        if (k != null) {
            k.cancel();
            this.k = null;
            this.c.a();
        }
    }
}
