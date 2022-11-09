import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.Trace;
import android.app.Activity;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.concurrent.Executor;
import android.content.Context;
import android.util.ArrayMap;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class min extends mit implements mfl, mgx
{
    private static final nsd a;
    private final Application b;
    private final mfp c;
    private final mih d;
    private final mie e;
    private final ArrayMap f;
    private final mgu g;
    private final pii h;
    private final pii i;
    private final mhc j;
    private final njp k;
    private final pii l;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl");
    }
    
    public min(final mgv mgv, final Context context, final mfp c, final oui oui, final mie e, final pii h, final pii pii, final Executor executor, final pii i, final mhc j, final pii l, final boolean b) {
        final ArrayMap f = new ArrayMap();
        this.f = f;
        njo.o(true);
        this.g = mgv.a(executor, oui, pii);
        final Application b2 = (Application)context;
        this.b = b2;
        this.c = c;
        this.h = h;
        this.e = e;
        this.i = i;
        this.j = j;
        this.k = nov.F(new mig(this, l));
        this.l = l;
        final mij mij = new mij((Context)b2, f);
        mih d;
        if (b) {
            d = new mil((Window$OnFrameMetricsAvailableListener)mij);
        }
        else {
            d = new mim((Window$OnFrameMetricsAvailableListener)mij);
        }
        this.d = d;
    }
    
    public oey a(Activity activity) {
        final mik a = mik.a(activity);
        final mmh c = this.g.c;
        final int d = c.d;
        final mmm b = c.b;
        if (d == 3 && b.b()) {
            activity = (Activity)this.f;
            synchronized (activity) {
                final mip mip = (mip)this.f.remove((Object)a);
                if (this.f.isEmpty()) {
                    this.d.d();
                }
                monitorexit(activity);
                if (mip == null) {
                    a.k(min.a.c(), "Measurement not found: %s", a, '\u0c28');
                    activity = (Activity)oev.a;
                    return (oey)activity;
                }
                final String b2 = a.b();
                if (Trace.isEnabled()) {
                    activity = (Activity)((miv)this.l.get()).b.iterator();
                    while (((Iterator)activity).hasNext()) {
                        final miu miu = ((Iterator<miu>)activity).next();
                        int b3;
                        if ((b3 = mif.b(miu.a)) == 0) {
                            b3 = 1;
                        }
                        int n = 0;
                        switch (b3 - 1) {
                            default: {
                                final String b4 = miu.b;
                                continue;
                            }
                            case 7: {
                                n = mip.o;
                                break;
                            }
                            case 6: {
                                n = mip.m;
                                break;
                            }
                            case 5: {
                                n = mip.l;
                                break;
                            }
                            case 4: {
                                n = mip.k;
                                break;
                            }
                            case 3: {
                                n = mip.j;
                                break;
                            }
                            case 2: {
                                n = mip.h;
                                break;
                            }
                            case 1: {
                                n = 0;
                                break;
                            }
                        }
                        Trace.setCounter(miu.b.replace("%EVENT_NAME%", b2), (long)n);
                    }
                    Trace.endAsyncSection(String.format("J<%s>", b2), 352691800);
                }
                if (mip.j == 0) {
                    activity = (Activity)oev.a;
                    return (oey)activity;
                }
                if (this.i.get()) {
                    if (mip.o <= TimeUnit.SECONDS.toMillis(9L) && mip.h != 0) {
                        this.j.a((String)this.k.a());
                    }
                }
                final okt m = psp.t.m();
                final int n2 = (int)(mip.d.b() - mip.e);
                final okt i = psg.o.m();
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                activity = (Activity)i.b;
                final int a2 = ((psg)activity).a | 0x10;
                ((psg)activity).a = a2;
                ((psg)activity).f = n2 + 1;
                final int h = mip.h;
                final int a3 = a2 | 0x1;
                ((psg)activity).a = a3;
                ((psg)activity).b = h;
                final int j = mip.j;
                final int a4 = a3 | 0x2;
                ((psg)activity).a = a4;
                ((psg)activity).c = j;
                final int k = mip.k;
                final int a5 = a4 | 0x4;
                ((psg)activity).a = a5;
                ((psg)activity).d = k;
                final int l = mip.m;
                final int a6 = a5 | 0x20;
                ((psg)activity).a = a6;
                ((psg)activity).g = l;
                final int o = mip.o;
                final int a7 = a6 | 0x40;
                ((psg)activity).a = a7;
                ((psg)activity).h = o;
                final int l2 = mip.l;
                ((psg)activity).a = (a7 | 0x8);
                ((psg)activity).e = l2;
                int n5 = 0;
                Label_0901: {
                    if (mip.p != Integer.MIN_VALUE) {
                        final int[] b5 = mip.b;
                        activity = (Activity)(Object)mip.g;
                        final int p = mip.p;
                        final okt m2 = psk.c.m();
                        while (true) {
                            for (int n3 = 0; n3 < 51; ++n3) {
                                if (b5[n3] > p) {
                                    m2.ah(0);
                                    m2.ag(p + 1);
                                    activity = (Activity)m2.h();
                                    if (i.c) {
                                        i.m();
                                        i.c = false;
                                    }
                                    final psg psg = (psg)i.b;
                                    activity.getClass();
                                    psg.n = (psk)activity;
                                    final int a8 = psg.a | 0x800;
                                    psg.a = a8;
                                    final int i2 = mip.i;
                                    final int a9 = a8 | 0x200;
                                    psg.a = a9;
                                    psg.l = i2;
                                    final int n4 = mip.n;
                                    psg.a = (a9 | 0x400);
                                    psg.m = n4;
                                    n5 = 0;
                                    break Label_0901;
                                }
                                final int n6 = activity[n3];
                                if (n6 > 0 || (n3 > 0 && activity[n3 - 1] > 0)) {
                                    m2.ah(n6);
                                    m2.ag(b5[n3]);
                                }
                            }
                            if (activity[50] > 0) {
                                m2.ag(p + 1);
                                m2.ah(0);
                            }
                            activity = (Activity)m2.h();
                            continue;
                        }
                    }
                    n5 = 0;
                }
                while (n5 < 28) {
                    if (mip.f[n5] > 0) {
                        activity = (Activity)psf.e.m();
                        final int b6 = mip.f[n5];
                        if (((okt)activity).c) {
                            ((okt)activity).m();
                            ((okt)activity).c = false;
                        }
                        final psf psf = (psf)((okt)activity).b;
                        psf.a |= 0x1;
                        psf.b = b6;
                        final int c2 = mip.a[n5];
                        if (((okt)activity).c) {
                            ((okt)activity).m();
                            ((okt)activity).c = false;
                        }
                        final psf psf2 = (psf)((okt)activity).b;
                        psf2.a |= 0x2;
                        psf2.c = c2;
                        final int n7 = n5 + 1;
                        if (n7 < 28) {
                            final int n8 = mip.a[n7];
                            if (((okt)activity).c) {
                                ((okt)activity).m();
                                ((okt)activity).c = false;
                            }
                            final psf psf3 = (psf)((okt)activity).b;
                            psf3.a |= 0x4;
                            psf3.d = n8 - 1;
                        }
                        if (i.c) {
                            i.m();
                            i.c = false;
                        }
                        final psg psg2 = (psg)i.b;
                        final psf psf4 = (psf)((okt)activity).h();
                        psf4.getClass();
                        activity = (Activity)psg2.j;
                        if (!((olj)activity).c()) {
                            psg2.j = oky.C((olj)activity);
                        }
                        psg2.j.add(psf4);
                    }
                    ++n5;
                }
                final psg psg3 = (psg)i.h();
                activity = (Activity)psg3.H(5);
                ((okt)activity).o(psg3);
                final int a10 = mif.a((Context)this.b);
                if (((okt)activity).c) {
                    ((okt)activity).m();
                    ((okt)activity).c = false;
                }
                final psg psg4 = (psg)((okt)activity).b;
                psg4.a |= 0x100;
                psg4.k = a10;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final psp psp = (psp)m.b;
                activity = (Activity)((okt)activity).h();
                activity.getClass();
                psp.k = (psg)activity;
                psp.a |= 0x800;
                final psp psp2 = (psp)m.h();
                final mgu g = this.g;
                activity = (Activity)mgr.a();
                ((mgq)activity).c(psp2);
                ((mgq)activity).b = null;
                ((mgq)activity).c = "Activity";
                ((mgq)activity).a = a.b();
                ((mgq)activity).b(true);
                activity = (Activity)g.a(((mgq)activity).a());
                return (oey)activity;
            }
        }
        activity = (Activity)oev.a;
        return (oey)activity;
    }
    
    @Override
    public void c(final Activity activity) {
        synchronized (this.f) {
            this.f.clear();
        }
    }
    
    public void d(final Activity activity) {
        final mik a = mik.a(activity);
        if (!this.g.b(a.b())) {
            return;
        }
        synchronized (this.f) {
            if (this.f.size() >= 25) {
                min.a.c().E(3115).r("Too many concurrent measurements, ignoring %s", a);
                return;
            }
            final mip mip = (mip)this.f.put((Object)a, (Object)((miq)this.h).a());
            if (mip != null) {
                this.f.put((Object)a, (Object)mip);
                min.a.c().E(3114).r("measurement already started: %s", a);
                return;
            }
            if (this.f.size() == 1) {
                this.d.c();
            }
            if (Trace.isEnabled()) {
                Trace.beginAsyncSection(String.format("J<%s>", a.b()), 352691800);
            }
        }
    }
    
    @Override
    public void k() {
        this.c.a(this.d);
        this.c.a(this.e);
    }
}
