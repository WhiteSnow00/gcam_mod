import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clh implements ckz
{
    public static final nsd a;
    public final cli b;
    public final cfg c;
    public long d;
    private final ixn e;
    private final crg f;
    private final kjh g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/snapshot/SnapshotTakerViewfinderImpl");
    }
    
    public clh(final chw chw, final cfm cfm, final ixn e, final crg f, final cli b) {
        this.g = chw.a();
        this.e = e;
        this.f = f;
        this.b = b;
        this.c = cfm.a();
    }
    
    @Override
    public final oey a() {
        this.d = System.currentTimeMillis();
        final ofn f = ofn.f();
        ofi.w(this.b(this.f.e(), kra.d), new clg(this, f), this.g);
        return f;
    }
    
    @Override
    public final oey b(final lfu lfu, final kra kra) {
        final niz d = this.e.d(lfu == lfu.a, 1, kra);
        if (d.g()) {
            return ofi.n(((ixt)d.c()).a);
        }
        return ofi.m(new IllegalStateException("Can't take screen snapshot."));
    }
    
    @Override
    public final void close() {
    }
}
