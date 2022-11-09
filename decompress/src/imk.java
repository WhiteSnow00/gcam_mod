import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.content.Context;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imk implements exn, exe, exj, exh
{
    public static final long[] a;
    public final eyt b;
    private final hfd c;
    private SensorEventListener d;
    private boolean e;
    private boolean f;
    private final imj g;
    private boolean h;
    
    static {
        a = new long[] { 0L, 150L, 75L, 150L };
    }
    
    public imk(final Context context, final BottomBarController bottomBarController, final hfd c, final eyt b) {
        final imj g = new imj(context);
        this.h = true;
        this.c = c;
        this.g = g;
        this.f = g.a();
        this.d = (SensorEventListener)new imi(this, (Vibrator)context.getSystemService("vibrator"), bottomBarController);
        this.b = b;
    }
    
    @Override
    public final void bh() {
        this.c.a(this.d);
        this.d = null;
    }
    
    @Override
    public final void bi() {
        this.h = true;
        if (this.e) {
            this.c.a(this.d);
        }
    }
    
    @Override
    public final void bj() {
        final boolean a = this.g.a();
        this.f = a;
        if (a && this.e) {
            this.c.b(this.d);
        }
        this.h = false;
    }
    
    public final void d(final boolean e) {
        this.e = e;
        if (this.h) {
            return;
        }
        if (this.f && e) {
            this.c.b(this.d);
            return;
        }
        this.c.a(this.d);
    }
}
