import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class enh implements eir
{
    final /* synthetic */ eyt a;
    final /* synthetic */ fmd b;
    final /* synthetic */ ivj c;
    final /* synthetic */ AtomicBoolean d;
    final /* synthetic */ enm e;
    final /* synthetic */ jbj f;
    
    public enh(final enm e, final eyt a, final fmd b, final jbj f, final ivj c, final AtomicBoolean d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final oey a(final int n) {
        this.e.H(false);
        switch (n - 1) {
            default: {
                this.a.ae(5, System.currentTimeMillis());
                break;
            }
            case 1: {
                this.a.ae(4, System.currentTimeMillis());
                break;
            }
        }
        return this.b.a(n);
    }
    
    @Override
    public final oey b(final int n) {
        if (!this.f.h) {
            final oey b = this.b.b(n);
            kpo.d(Looper.getMainLooper()).post((Runnable)new eng(this));
            return b;
        }
        this.a.ae(2, System.currentTimeMillis());
        this.f.a();
        this.c.S();
        if (!this.d.get()) {
            this.e.A.c();
        }
        return ofi.n(true);
    }
}
