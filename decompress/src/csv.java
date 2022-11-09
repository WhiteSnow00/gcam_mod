import j$.util.Map$_EL;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csv implements kuf
{
    public final krr a;
    public final CameraFatalErrorTrackerDatabase b;
    public final eyt c;
    public final csn d;
    public final njp e;
    private final Executor f;
    private final kjm g;
    private final Map h;
    
    public csv(final CameraFatalErrorTrackerDatabase b, final Executor f, final eyt c, final krr krr, final kjm g, final cxl cxl, final csn d) {
        this.h = new HashMap();
        this.a = krr.a("FatalErrorTrkr");
        this.b = b;
        this.f = f;
        this.c = c;
        this.g = g;
        this.e = new csq(cxl);
        this.d = d;
    }
    
    public static long a(final long n, final long n2) {
        return TimeUnit.MILLISECONDS.toDays(n - n2);
    }
    
    final void b() {
        this.g.b(new csr(this, 1));
    }
    
    @Override
    public final void c(final kst kst) {
        if (!kst.c(kst)) {
            this.b();
            return;
        }
        this.f.execute(new css(this, kst, System.currentTimeMillis()));
    }
    
    @Override
    public final void d(final lfj lfj, final kst kst, final boolean b) {
        synchronized (this) {
            if (kst.d(kst)) {
                final long currentTimeMillis = System.currentTimeMillis();
                final Map h = this.h;
                final Long value = 0L;
                final long longValue = (long)Map$_EL.getOrDefault(h, (Object)lfj, (Object)value);
                long n;
                if (longValue != 0L) {
                    n = currentTimeMillis - longValue;
                }
                else {
                    n = 0L;
                }
                this.h.put(lfj, value);
                this.f.execute(new csu(this, lfj, currentTimeMillis, b, n));
                return;
            }
            this.b();
        }
    }
    
    @Override
    public final void e(final lfj lfj) {
        synchronized (this) {
            this.h.put(lfj, System.currentTimeMillis());
            this.f.execute(new cst(this, lfj, 1));
        }
    }
    
    @Override
    public final void f(final lfj lfj) {
        synchronized (this) {
            this.h.put(lfj, 0L);
            this.f.execute(new cst(this, lfj));
        }
    }
    
    @Override
    public final void g() {
        this.f.execute(new csr(this));
    }
}
