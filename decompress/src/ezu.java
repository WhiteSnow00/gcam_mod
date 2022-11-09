import java.util.concurrent.TimeUnit;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

final class ezu extends CountDownTimer
{
    int a;
    long b;
    final /* synthetic */ ezv c;
    
    public ezu(final ezv c) {
        this.c = c;
        super(2147483647L, 12000L);
        this.a = 0;
        this.b = -1L;
    }
    
    public final void onFinish() {
        final ezv c = this.c;
        c.b.remove(c.f);
        final boi boi = (boi)knf.d(this.c.k);
        if (boi != null) {
            boi.c();
        }
        if (this.c.i.p()) {
            this.c.j.e();
        }
    }
    
    public final void onTick(final long b) {
        synchronized (this) {
            if (this.b == -1L) {
                this.b = b;
                return;
            }
            final ezv c = this.c;
            if (!c.b.contains(c.f) && this.b - b >= TimeUnit.SECONDS.toMillis(30L)) {
                final ezv c2 = this.c;
                c2.b.add(c2.f);
                this.a = this.c.b.size() - 1;
            }
            final irf irf = this.c.b.get(this.a);
            final int a = this.a + 1;
            this.a = a;
            this.a = a % this.c.b.size();
            this.c.a.execute(new ezt(this, irf));
        }
    }
}
