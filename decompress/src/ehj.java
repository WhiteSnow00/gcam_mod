import android.app.Activity;
import android.os.Handler;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehj implements exn, exl, exj, exm, exe
{
    public final WeakReference a;
    public Runnable b;
    private final Handler c;
    private final long d;
    
    public ehj(final Activity activity, final Handler c, final long d) {
        this.a = new WeakReference((T)activity);
        this.c = c;
        this.d = d;
    }
    
    private final void b() {
        kjm.a();
        final Runnable b = this.b;
        if (b == null) {
            return;
        }
        this.c.removeCallbacks(b);
        this.b = null;
    }
    
    @Override
    public final void bh() {
        this.b();
    }
    
    @Override
    public final void bj() {
        this.b();
    }
    
    @Override
    public final void bk() {
        this.b();
    }
    
    @Override
    public final void e() {
        kjm.a();
        nov.A(this.b == null);
        if (this.d == 0L) {
            return;
        }
        final ehi b = new ehi(this);
        this.b = b;
        this.c.postDelayed((Runnable)b, this.d);
    }
}
