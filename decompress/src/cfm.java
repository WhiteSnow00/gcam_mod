import java.util.concurrent.Executor;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfm implements krc
{
    private final Object A;
    public final ivj a;
    public final irw b;
    public final String c;
    private final klj d;
    private final klj e;
    private final klj f;
    private final klv g;
    private final fvt h;
    private final fwd i;
    private final fxb j;
    private final cfr k;
    private final cid l;
    private final crg m;
    private final kjm n;
    private final klv o;
    private final klv p;
    private final klv q;
    private final klv r;
    private final hkc s;
    private final cxl t;
    private final lfh u;
    private final niz v;
    private final ckt w;
    private lfu x;
    private final klv y;
    private cfg z;
    
    public cfm(final Resources resources, final fvt h, final fwd i, final fxb j, final klj f, final klv g, final klj e, final cfr k, final cid l, final crg m, final ivj a, final irw b, final kjm n, final hkc s, final cxl t, final lfh u, final klj d, final klv o, final klv p23, final klv q, final klv r, final niz v, final ckt w) {
        this.A = new Object();
        this.h = h;
        this.i = i;
        this.j = j;
        this.f = f;
        this.g = g;
        this.e = e;
        this.k = k;
        this.l = l;
        this.m = m;
        this.a = a;
        this.b = b;
        this.n = n;
        this.c = resources.getString(2131952483);
        this.o = o;
        this.p = p23;
        this.q = q;
        this.r = r;
        this.y = new kkz(cfd.a);
        this.s = s;
        this.t = t;
        this.u = u;
        this.d = d;
        this.v = v;
        this.w = w;
    }
    
    public final cfg a() {
        synchronized (this) {
            synchronized (this.A) {
                if (this.m.e() == this.x) {
                    final cfg z = this.z;
                    if (z != null) {
                        return z;
                    }
                }
                this.l.a(cic.b).c(this);
                this.x = this.m.e();
                final fxu fxu = (fxu)this.m.f().c();
                gir b;
                if (!this.t.k(cxr.R)) {
                    b = new gir(this.d, this.e, fxu, this.t, this.u);
                }
                else {
                    b = new gir(this.d, this.e, fxu, kqp.g(this.w.a(this.m.e()).c()), this.t, this.u);
                }
                final kkz e = new kkz(fxu.h());
                final klj j = klq.j(e, btt.j);
                final kkz c = new kkz(fws.c());
                final kkz d = new kkz(fws.c());
                final fvv w = new fvv(c, j);
                final fwf x = new fwf(d, j);
                final Boolean value = false;
                final kkz i = new kkz(value);
                final klj k = klq.j(this.s.a(hjq.l), new cfl(this));
                final klj l = klq.j(this.s.a(hjq.o), btt.k);
                final kjk a = this.l.a(cic.b);
                if (this.m.j()) {
                    a.c(klq.d(l, k).a(new cfj(i), this.n));
                }
                else if (this.m.k()) {
                    a.c(this.s.a(hjq.m).a(new cfi(this, i), this.n));
                }
                final klv g = this.g;
                final Boolean value2 = true;
                g.aR(value2);
                final kkz m = new kkz(value);
                final kkz n = new kkz(value);
                a.c(this.h.b.a(new cfk(m, n, 2), odx.a));
                a.c(this.j.a.a(new cfj(m, 2), odx.a));
                a.c(i.a(new cfk(m, n), odx.a));
                a.c(b.a(new cfk(m, n, 1), odx.a));
                a.c(this.y.a(new cfh(this), this.n));
                final cff cff = new cff(null);
                final cfr k2 = this.k;
                k2.b();
                cff.u = k2.b;
                final cfr k3 = this.k;
                k3.b();
                cff.v = k3.c;
                final klj f = this.f;
                if (f == null) {
                    throw new NullPointerException("Null portraitIdle");
                }
                cff.t = f;
                cff.a = this.h.b;
                final klj a2 = this.j.a;
                if (a2 == null) {
                    throw new NullPointerException("Null awbSetting");
                }
                cff.s = a2;
                cff.r = nii.a;
                cff.B = b;
                cff.e = e;
                cff.c = c;
                cff.d = d;
                cff.w = w;
                cff.x = x;
                final klj e2 = this.e;
                if (e2 == null) {
                    throw new NullPointerException("Null zoomRatio");
                }
                cff.b = e2;
                cff.f = this.h.a;
                cff.g = this.i.a;
                final klv g2 = this.g;
                if (g2 == null) {
                    throw new NullPointerException("Null caf");
                }
                cff.h = g2;
                cff.i = i;
                cff.j = new kkz(cfe.a);
                cff.k = this.y;
                cff.l = this.s.a(hjq.o);
                cff.m = m;
                cff.n = n;
                cff.o = new kkz(value2);
                cff.p = new kkz(value);
                final klv o = this.o;
                if (o == null) {
                    throw new NullPointerException("Null stabilizationMode");
                }
                cff.q = o;
                final klv r = this.r;
                if (r == null) {
                    throw new NullPointerException("Null micInputOption");
                }
                cff.A = r;
                final klv p = this.p;
                if (p == null) {
                    throw new NullPointerException("Null isExtMicWiredConnected");
                }
                cff.y = p;
                final klv q = this.q;
                if (q != null) {
                    cff.z = q;
                    final klv a3 = cff.a;
                    if (a3 != null) {
                        final klj b2 = cff.b;
                        if (b2 != null) {
                            final klv c2 = cff.c;
                            if (c2 != null) {
                                final klv d2 = cff.d;
                                if (d2 != null) {
                                    final klv e3 = cff.e;
                                    if (e3 != null) {
                                        final klv f2 = cff.f;
                                        if (f2 != null) {
                                            final klv g3 = cff.g;
                                            if (g3 != null) {
                                                final klv h = cff.h;
                                                if (h != null) {
                                                    final klv i2 = cff.i;
                                                    if (i2 != null) {
                                                        final klv j2 = cff.j;
                                                        if (j2 != null) {
                                                            final klv k4 = cff.k;
                                                            if (k4 != null) {
                                                                final klj l2 = cff.l;
                                                                if (l2 != null) {
                                                                    final klv m2 = cff.m;
                                                                    if (m2 != null) {
                                                                        final klv n2 = cff.n;
                                                                        if (n2 != null) {
                                                                            final klv o2 = cff.o;
                                                                            if (o2 != null) {
                                                                                final klv p2 = cff.p;
                                                                                if (p2 != null) {
                                                                                    final klv q2 = cff.q;
                                                                                    if (q2 != null) {
                                                                                        final klj s = cff.s;
                                                                                        if (s != null) {
                                                                                            final klj t = cff.t;
                                                                                            if (t != null) {
                                                                                                final klj u = cff.u;
                                                                                                if (u != null) {
                                                                                                    final klj v = cff.v;
                                                                                                    if (v != null) {
                                                                                                        final klj w2 = cff.w;
                                                                                                        if (w2 != null) {
                                                                                                            final klj x2 = cff.x;
                                                                                                            if (x2 != null) {
                                                                                                                final klj y = cff.y;
                                                                                                                if (y != null) {
                                                                                                                    final klj z2 = cff.z;
                                                                                                                    if (z2 != null) {
                                                                                                                        final klj a4 = cff.A;
                                                                                                                        if (a4 != null) {
                                                                                                                            final gir b3 = cff.B;
                                                                                                                            if (b3 != null) {
                                                                                                                                return this.z = new cfg(a3, b2, c2, d2, e3, f2, g3, h, i2, j2, k4, l2, m2, n2, o2, p2, q2, cff.r, s, t, u, v, w2, x2, y, z2, a4, b3);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    if (cff.a == null) {
                        sb.append(" aeComp");
                    }
                    if (cff.b == null) {
                        sb.append(" zoomRatio");
                    }
                    if (cff.c == null) {
                        sb.append(" aeMeteringParameters");
                    }
                    if (cff.d == null) {
                        sb.append(" afMeteringParameters");
                    }
                    if (cff.e == null) {
                        sb.append(" scalerRegion");
                    }
                    if (cff.f == null) {
                        sb.append(" aeLock");
                    }
                    if (cff.g == null) {
                        sb.append(" afLock");
                    }
                    if (cff.h == null) {
                        sb.append(" caf");
                    }
                    if (cff.i == null) {
                        sb.append(" torchOn");
                    }
                    if (cff.j == null) {
                        sb.append(" recordingState");
                    }
                    if (cff.k == null) {
                        sb.append(" moduleState");
                    }
                    if (cff.l == null) {
                        sb.append(" backFlashThermallyDisabled");
                    }
                    if (cff.m == null) {
                        sb.append(" shouldUpdatePreviewRequest");
                    }
                    if (cff.n == null) {
                        sb.append(" shouldUpdateRecordingRequest");
                    }
                    if (cff.o == null) {
                        sb.append(" shouldUpdateAfMode");
                    }
                    if (cff.p == null) {
                        sb.append(" isStorageLow");
                    }
                    if (cff.q == null) {
                        sb.append(" stabilizationMode");
                    }
                    if (cff.s == null) {
                        sb.append(" awbSetting");
                    }
                    if (cff.t == null) {
                        sb.append(" portraitIdle");
                    }
                    if (cff.u == null) {
                        sb.append(" videoOrientation");
                    }
                    if (cff.v == null) {
                        sb.append(" deviceOrientation");
                    }
                    if (cff.w == null) {
                        sb.append(" aeMeteringRegion");
                    }
                    if (cff.x == null) {
                        sb.append(" afMeteringRegion");
                    }
                    if (cff.y == null) {
                        sb.append(" isExtMicWiredConnected");
                    }
                    if (cff.z == null) {
                        sb.append(" isExtMicBluetoothConnected");
                    }
                    if (cff.A == null) {
                        sb.append(" micInputOption");
                    }
                    if (cff.B == null) {
                        sb.append(" multiCropRegion");
                    }
                    final String value3 = String.valueOf(sb);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(value3);
                    throw new IllegalStateException(sb2.toString());
                }
                throw new NullPointerException("Null isExtMicBluetoothConnected");
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.A) {
            this.z = null;
        }
    }
}
