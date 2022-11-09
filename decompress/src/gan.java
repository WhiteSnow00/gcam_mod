import java.util.concurrent.Executor;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gan implements gdf
{
    public final /* synthetic */ gao a;
    private final boa b;
    private final hhy c;
    private final gyd d;
    private int e;
    private kra f;
    private final gam g;
    private final gye h;
    
    public gan(gao a, final gen gen, final gdf gdf, final boa b, final gye h) {
        this.a = a;
        boolean b2 = false;
        this.e = 0;
        this.b = b;
        final hhy b3 = gen.b;
        this.c = b3;
        this.h = h;
        final gam g = new gam(this, gdf);
        this.g = g;
        final gxp c = a.c;
        final Executor d = a.d;
        final niz i = niz.i(g);
        final kse b4 = a.b;
        Long.toString(SystemClock.elapsedRealtime());
        final eyx eyx = new eyx();
        final gyg gyg = new gyg(c, d, h, eyx, b4);
        final gyd gyd = new gyd(c, gyg, i, eyx);
        gyg.c = gyd;
        this.d = gyd;
        gyd.f.d = SystemClock.elapsedRealtimeNanos();
        a = (gao)gyd.c;
        synchronized (a) {
            if (gyd.d == 1) {
                b2 = true;
            }
            njo.o(b2);
            gyd.a.set(1);
            gyd.d = 2;
            final ofn b5 = gyd.b;
            monitorexit(a);
            ofi.w(b5, new gyc(gyd, b3), odx.a);
            a = (gao)b3.k();
            a.getClass();
            ((huz)a).s(SystemClock.elapsedRealtime());
        }
    }
    
    @Override
    public final void a(final lju lju, final oey d) {
        ++this.e;
        this.f = kra.b((int)this.b.c().aQ());
        final gya a = gyb.a(lju);
        a.d = d;
        kra c;
        if ((c = this.f) == null) {
            c = kra.a;
        }
        a.c = c;
        a.f = this.a.e;
        this.d.b(a.a(), this.c);
    }
    
    @Override
    public final void close() {
        this.d.close();
        if (this.e == 0) {
            this.c.w(new dgi("LuckyShotReprocessingImageSaver closed without processing any Images."));
        }
    }
}
