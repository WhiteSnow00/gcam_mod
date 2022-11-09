import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lld implements llc
{
    final lkm a;
    final lky b;
    public final llu c;
    
    public lld(final llb llb, final lkm a, final lky b) {
        this.a = a;
        this.b = b;
        this.c = llb.o;
    }
    
    @Override
    public final lkj a(final llu llu, final String s, final long n) {
        final lky b = this.b;
        final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)b.a.get();
        scheduledExecutorService.getClass();
        final Object value = b.b.get();
        final llb a = ((hxm)b.c).a();
        final kse kse = (kse)b.d.get();
        kse.getClass();
        final lkx lkx = new lkx(scheduledExecutorService, (lkr)value, a, kse, ((krp)b.e).a());
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        final lkm a2 = this.a;
        final llz llz = (llz)a2.a.get();
        llz.getClass();
        final llb a3 = ((hxm)a2.b).a();
        final lke lke = (lke)a2.c.get();
        lke.getClass();
        final fcq b2 = fcq.b;
        final jdv a4 = jdv.a;
        final krr a5 = ((krp)a2.d).a();
        final kse kse2 = (kse)a2.e.get();
        kse2.getClass();
        final lkh lkh = (lkh)a2.f.get();
        lkh.getClass();
        llu.getClass();
        return new lkl(llz, a3, lke, b2, a4, a5, kse2, lkh, llu, lkx, s, elapsedRealtimeNanos, n);
    }
}
