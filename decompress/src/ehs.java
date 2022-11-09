import com.google.googlex.gcam.AeResults;
import com.integrity.annotations.PaiConfiguration;
import java.util.concurrent.Executor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class ehs implements dvu
{
    final /* synthetic */ eht a;
    final /* synthetic */ ksh b;
    final /* synthetic */ ehu c;
    
    public ehs(final ehu c, final eht a, final ksh b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    private final void b(final HardwareBuffer hardwareBuffer, final dgi dgi) {
        hardwareBuffer.close();
        this.a.e.a(dgi);
        this.c.b(this.a);
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    @Override
    public void a(HardwareBuffer a, final ShotMetadata shotMetadata) {
        final nsx a2 = ntf.a;
        this.b.a();
        final int size = this.a.j.size();
        final eht a3 = this.a;
        final int l = a3.l;
        if (size > l) {
            ((krc)a3.j.get(l)).close();
        }
        else {
            ehu.a.b().g(ntf.a, "KeplerController").E(1200).p("Image token for %dth callback not found.", this.a.l);
        }
        this.a.i.open();
        Object o = this.c;
        synchronized (o) {
            if (!this.c.j.containsKey(this.a.a)) {
                a.close();
                this.a.a.a();
                return;
            }
            monitorexit(o);
            try {
                if (this.a.l == 0) {
                    final ehu c = this.c;
                    o = new kre(a.getWidth(), a.getHeight());
                    final eht a4 = this.a;
                    final int b = boa.b(a4.a.c.a.a, c.e);
                    final ehy g = c.g;
                    final FileOutputStream e = a4.d.e();
                    final kra b2 = kra.b(b);
                    final dsd a5 = g.a;
                    final eya b3 = g.b;
                    final Executor c2 = g.c;
                    final cxl d = g.d;
                    final cxo a6 = cxs.a;
                    d.d();
                    a4.n = new ehz(a5, b3, c2, e, (kre)o, b2);
                    o = shotMetadata.f();
                    final long frameMetadata_wb_get = GcamModuleJNI.FrameMetadata_wb_get(((FrameMetadata)o).a, (FrameMetadata)o);
                    if (frameMetadata_wb_get == 0L) {
                        o = null;
                    }
                    else {
                        o = new AwbInfo(frameMetadata_wb_get, false);
                    }
                    final AwbInfo awbInfo = new AwbInfo(GcamModuleJNI.new_AwbInfo__SWIG_1(AwbInfo.a((AwbInfo)o), (AwbInfo)o), true);
                    GcamModuleJNI.AwbInfo_FixLegacyRgbGains(awbInfo.a, awbInfo);
                    this.a.g.o(awbInfo);
                    o = shotMetadata.e();
                    this.a.h.o(new dvi(((AeResults)o).a(0), ((AeResults)o).a(1)));
                }
                final ehz n = this.a.n;
                if (n == null) {
                    this.b(a, new dgi("Encoder not available."));
                    return;
                }
                n.b(a, TimeUnit.NANOSECONDS.convert(this.a.m, TimeUnit.MILLISECONDS));
                a = (HardwareBuffer)this.a;
                final int i = ((eht)a).l + 1;
                ((eht)a).l = i;
                ((eht)a).m += this.c.b;
                if (i == ((eht)a).c) {
                    ofi.w(n.a(), new ehr(this), this.c.f);
                }
            }
            catch (final IOException ex) {
                a.m(ehu.a.b().g(ntf.a, "KeplerController"), "Encoder creation failed", '\u04ae', ex);
                this.b(a, new dgi("Failed to create encoder.", ex));
            }
        }
    }
}
