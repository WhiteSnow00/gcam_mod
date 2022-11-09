import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import j$.time.Duration;
import java.util.TimerTask;
import java.util.Map;
import java.util.Timer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cia
{
    public final ims a;
    public final jgv b;
    public final kjm c;
    public final njn d;
    public final cxl e;
    public niz f;
    private final Timer g;
    private final Map h;
    private final TimerTask i;
    private Duration j;
    private int k;
    
    public cia(final ims a, final jgv b, final kjm c, final njn d, final cxl e) {
        this.g = new Timer();
        this.h = new HashMap();
        this.f = nii.a;
        this.i = new chz(this);
        this.j = Duration.ZERO;
        this.k = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final void g(final int n) {
        final Duration ofMillis = Duration.ofMillis(this.d.a(TimeUnit.MILLISECONDS));
        this.h.put(n, ofMillis.minus(this.j));
        this.j = ofMillis;
    }
    
    public final long a(final int n) {
        final Map h = this.h;
        final Integer value = n;
        if (!h.containsKey(value)) {
            return this.d.a(TimeUnit.MILLISECONDS) - this.j.toMillis();
        }
        final Duration duration = this.h.get(value);
        duration.getClass();
        return duration.toMillis();
    }
    
    public final void b(final int k) {
        final int i = this.k;
        if (i != -1) {
            this.g(i);
        }
        this.k = k;
    }
    
    public final void c() {
        final njn d = this.d;
        if (d.a) {
            d.e();
            this.c.b(new chx(this, 1));
            this.b.g("/video_state_paused", -1L);
        }
    }
    
    public final void d() {
        final njn d = this.d;
        if (!d.a) {
            d.d();
            this.c.b(new chx(this));
            this.b.g("/video_state_resumed", -1L);
        }
    }
    
    public final void e() {
        this.d.d();
        this.g.scheduleAtFixedRate(this.i, 0L, 1000L);
    }
    
    public final void f() {
        final njn d = this.d;
        if (d.a) {
            d.e();
        }
        this.f = nii.a;
        this.g(this.k);
        this.b.g("/video_state_stopped", -1L);
        this.g.cancel();
        this.i.cancel();
    }
}
