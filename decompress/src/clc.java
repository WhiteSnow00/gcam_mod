import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clc implements ckz
{
    private static final nsd i;
    public final cfg a;
    public final ckg b;
    public final cli c;
    public final ScheduledExecutorService d;
    public int e;
    public long f;
    public ofn g;
    public oey h;
    private final kjh j;
    private final irw k;
    
    static {
        i = nsd.g("com/google/android/apps/camera/camcorder/snapshot/SnapshotTakerFrameServerImpl");
    }
    
    public clc(final chw chw, final cfm cfm, final irw k, final ckg b, final cli c) {
        this.d = mcn.l("snapshot-taker");
        this.j = chw.a();
        this.k = k;
        this.a = cfm.a();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final oey a() {
        this.e = 0;
        final ofn f = ofn.f();
        this.g = f;
        this.h = null;
        this.f = System.currentTimeMillis();
        this.c(null);
        return f;
    }
    
    @Override
    public final oey b(final lfu lfu, final kra kra) {
        return ofi.m(new UnsupportedOperationException("Not implemented."));
    }
    
    public final void c(final Throwable t) {
        final oey h = this.h;
        if (h != null) {
            h.cancel(true);
        }
        if (this.e++ < 3) {
            this.j.execute(new cla(this));
            return;
        }
        final nsu b = clc.i.b();
        t.getClass();
        a.m(b, "Failed to take snapshot.", '\u0220', t);
        final ofn g = this.g;
        t.getClass();
        g.a(t);
        this.k.a(irv.d);
    }
    
    @Override
    public final void close() {
        this.d.shutdown();
    }
}
