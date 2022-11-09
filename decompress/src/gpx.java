import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.BurstSpec;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpx implements gtt
{
    private static final nsd a;
    private final dvj b;
    private final lfg c;
    private final kse d;
    private final gpc e;
    private final gij f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckSecondaryHdrPlusProcessor");
    }
    
    public gpx(final dvj b, final lfg c, final gij f, final kse d, final gpc e) {
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    private static void c(final List list) {
        final nrw t = ((nns)list).t();
        while (t.hasNext()) {
            ((kvs)t.next()).close();
        }
    }
    
    public final void a(final List list, final gen gen, int a, ljm f, final dtx dtx, final BurstSpec burstSpec, final niz niz, final niz niz2, int n) {
        final int c = ((nql)list).c;
        try {
            final int a2 = this.b.a(f);
            final PostviewParams b = dub.b(this.c, this.f);
            this.d.f("pckHdrZsl#startShot");
            final ljm ljm = null;
            try {
                try {
                    f = (ljm)this.b.f(a2, gen, b, dtx.g, f, a, true, n, niz);
                    this.d.g();
                }
                finally {}
            }
            catch (final kuw kuw) {
                gpx.a.b().h(kuw).E(1930).o("Unable to start PSL shot ");
                this.d.g();
                f = null;
            }
            if (f == null) {
                gpx.a.c().E(1934).o("Failed to initiate HDR+ shot capture.");
                throw new dgb("Invalid shot received from HdrPlusSession.");
            }
            if (burstSpec == null) {
                gpx.a.c().E(1933).o("Missing burst spec.");
                throw new dgb("Burst spec not provided.");
            }
            final gpb a3 = this.e.a(null, gen);
            n = (int)burstSpec.b().a();
            this.b.s((dxh)f, burstSpec);
            final nrw t = ((nns)list).t();
            a = 0;
            ljm ljm2 = ljm;
            while (t.hasNext()) {
                final ljm b2 = a3.b((dxh)f, a, n, t.next(), false, niz2);
                if (b2 != null) {
                    ++a;
                    ljm2 = b2;
                }
            }
            if (a3.e((dxh)f, a, n, ljm2, gen.b.k(), false)) {
                c(list);
                return;
            }
            a = ((dxh)f).a();
            final StringBuilder sb = new StringBuilder(59);
            sb.append("Error finishing the HDR+ payload, aborting shot ");
            sb.append(a);
            final String string = sb.toString();
            gpx.a.b().E(1932).r("%s", string);
            this.b.n((dxh)f);
            throw new dgf(string);
            this.d.g();
        }
        finally {
            c(list);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final List list, final gff gff, final gen gen, final int n, final ljm ljm, final dtx dtx) {
        this.a(list, gen, n, ljm, dtx, null, nii.a, nii.a, 1);
    }
}
