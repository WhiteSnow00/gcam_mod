import java.util.Iterator;
import java.util.concurrent.Executor;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnf implements mmw
{
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final njp c;
    private final boolean d;
    private final mnc e;
    
    public mnf(final Context a, final niz niz, final mnc e, final ClearcutMetricSnapshotTransmitter b) {
        this.a = a;
        this.c = nov.F(new mii(a, 2));
        this.d = (boolean)niz.e(false);
        this.e = e;
        this.b = b;
    }
    
    @Override
    public final void a(psp psp) {
        if (this.d) {
            psc psc;
            if ((psc = psp.g) == null) {
                psc = psc.l;
            }
            if ((psc.a & 0x1) != 0x0) {
                return;
            }
        }
        psp psp2 = psp;
        if ((psp.a & 0x800) != 0x0) {
            psp2 = psp;
            if (this.c.a()) {
                final okt okt = (okt)psp.H(5);
                okt.o(psp);
                psg psg;
                if ((psg = psp.k) == null) {
                    psg = psg.o;
                }
                final olj j = psg.j;
                psg k = psg;
                if (!j.isEmpty()) {
                    final okt m = psk.c.m();
                    final Iterator<Object> iterator = j.iterator();
                    psf psf = null;
                    while (iterator.hasNext()) {
                        final psf psf2 = iterator.next();
                        if (psf != null) {
                            final int n = psf.d + 1;
                            if (n != psf2.c) {
                                m.ah(0);
                                m.ag(n);
                            }
                        }
                        m.ah(psf2.b);
                        m.ag(psf2.c);
                        psf = psf2;
                    }
                    if (psf != null && (psf.a & 0x4) != 0x0) {
                        final int d = psf.d;
                        m.ah(0);
                        m.ag(d + 1);
                    }
                    final okt okt2 = (okt)psg.H(5);
                    okt2.o(psg);
                    if (okt2.c) {
                        okt2.m();
                        okt2.c = false;
                    }
                    ((psg)okt2.b).j = oky.B();
                    if (okt2.c) {
                        okt2.m();
                        okt2.c = false;
                    }
                    final psg psg2 = (psg)okt2.b;
                    final psk i = (psk)m.h();
                    i.getClass();
                    psg2.i = i;
                    psg2.a |= 0x80;
                    k = (psg)okt2.h();
                }
                if (okt.c) {
                    okt.m();
                    okt.c = false;
                }
                psp = (psp)okt.b;
                k.getClass();
                psp.k = k;
                psp.a |= 0x800;
                psp2 = (psp)okt.h();
            }
        }
        ofi.w(odg.i(this.e.a(), new mne(this, psp2), odx.a), new doh(3), odx.a);
    }
}
