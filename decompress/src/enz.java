import java.util.concurrent.TimeUnit;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class enz extends CountDownTimer
{
    final /* synthetic */ float a;
    final /* synthetic */ eoa b;
    
    public enz(final eoa b, final long n, final long n2, final float a) {
        this.b = b;
        this.a = a;
        super(n, n2);
    }
    
    public final void onFinish() {
        this.b.a.v.r();
        this.cancel();
    }
    
    public final void onTick(long h) {
        final fme o = this.b.a.o;
        final float a = this.a;
        h = (int)TimeUnit.MILLISECONDS.toSeconds(h);
        final iys b = o.b;
        b.h = h;
        b.l = String.format("%01d:%02d", h / 60L, h % 60L);
        b.invalidate();
        if ((int)(a * 100.0f) >= 100) {
            o.a.c = true;
            return;
        }
        o.a.c = false;
    }
}
