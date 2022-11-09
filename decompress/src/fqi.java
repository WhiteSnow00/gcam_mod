import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqi implements fut
{
    public final lhr a;
    public final lhr b;
    public final lhw c;
    public final lhw d;
    private final fut e;
    private final lhr f;
    
    public fqi(final lif lif, final fut e) {
        this.e = e;
        this.f = lif.a("/gca/moments/hdr_launch_count", new lht[0]);
        this.a = lif.a("/gca/moments/hdr_finish_count", lht.b("result"));
        this.b = lif.a("/gca/moments/hdr_images_closed_count", new lht[0]);
        this.c = lif.b("/gca/moments/hdr_processing_time_ms", lht.b("result"));
        this.d = lif.b("/gca/moments/hdr_result_open_ms", new lht[0]);
    }
    
    @Override
    public final int a() {
        this.e.a();
        return 1;
    }
    
    @Override
    public final void b(final kvs kvs, final fvn fvn, final fvd fvd, final fus fus) {
        this.e.b(kvs, fvn, fvd, new fqg(this, SystemClock.elapsedRealtime(), fus));
        this.f.a(new Object[0]);
    }
    
    @Override
    public final boolean c(final kvs kvs, final gry gry) {
        return true;
    }
}
