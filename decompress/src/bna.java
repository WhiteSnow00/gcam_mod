import java.util.List;
import android.content.pm.PackageManager;
import android.os.Process;
import java.util.concurrent.TimeUnit;
import android.content.pm.ApplicationInfo;
import android.content.Intent;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bna extends bwx implements exn, exl, exm, hey
{
    private static volatile Boolean i;
    public final eyt a;
    public final egb b;
    public long c;
    public boolean d;
    public final bmq e;
    public final hvp f;
    public int g;
    private final klv j;
    private final CameraActivityTiming k;
    private final kjm l;
    private final kse m;
    private final dbk n;
    private final Context o;
    private final hfb p;
    private final hjr q;
    private final boolean r;
    private long s;
    private hez t;
    private long u;
    
    public bna(final Context o, final bmq e, final eyt a, final CameraActivityTiming k, final egb b, final hvp f, final kjm l, final kse m, final klv j, final dbk n, final gkw gkw, final hjr q, final hfb p13) {
        super(odx.a);
        this.g = 1;
        this.o = o;
        this.e = e;
        a.getClass();
        this.a = a;
        this.k = k;
        b.getClass();
        this.b = b;
        j.getClass();
        this.j = j;
        this.f = f;
        this.l = l;
        this.m = m;
        this.n = n;
        this.p = p13;
        this.q = q;
        this.r = gkw.i();
    }
    
    @Override
    protected final void a() {
    }
    
    @Override
    public final void b(final hez t) {
        this.u = SystemClock.elapsedRealtimeNanos();
        this.t = t;
        final hfb p = this.p;
        synchronized (p.e) {
            p.i.remove(this);
            final boolean empty = p.i.isEmpty();
            boolean b = false;
            if (empty) {
                p.j = false;
                b = true;
            }
            monitorexit(p.e);
            if (b) {
                p.b.execute(new hex(p, 1));
            }
        }
    }
    
    @Override
    public final void bk() {
        final hfb p = this.p;
        synchronized (p.e) {
            p.i.add(this);
            boolean b;
            if (!p.j) {
                p.j = true;
                b = true;
            }
            else {
                b = false;
            }
            monitorexit(p.e);
            if (b) {
                p.b.execute(new hex(p));
            }
            this.l.execute(this.m.c("logForegroundStat", new bnc(this, 1)));
        }
    }
    
    @Override
    public final void e() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.s >= 2000L) {
            final Boolean i = bna.i;
            final boolean b = true;
            if (i == null) {
                synchronized (bna.class) {
                    if (bna.i == null) {
                        final Context o = this.o;
                        final PackageManager packageManager = o.getPackageManager();
                        niz niz;
                        if (!(niz = nrr.C(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA"), false)).g()) {
                            niz = nrr.C(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA_SECURE"), false);
                        }
                        niz c = niz;
                        if (!niz.g()) {
                            c = nrr.C(packageManager, new Intent("android.media.action.STILL_IMAGE_CAMERA"), true);
                        }
                        boolean equals;
                        if (c.g()) {
                            final String packageName = ((ApplicationInfo)c.c()).packageName;
                            final String packageName2 = o.getApplicationInfo().packageName;
                            equals = o.getApplicationInfo().packageName.equals(packageName);
                        }
                        else {
                            equals = false;
                        }
                        bna.i = equals;
                    }
                }
            }
            final boolean booleanValue = bna.i;
            this.s = elapsedRealtime;
            int n = this.g;
            final int n2 = 3;
            if (n != 1) {
                if (n == 3) {
                    this.d = true;
                }
                this.g = 1;
            }
            else {
                n = jbk.f((jbm)this.j.aQ());
            }
            final nii a = nii.a;
            final nns l = nns.l();
            final CameraActivityTiming k = this.k;
            niz j = a;
            List a2 = l;
            if (k.d()) {
                j = a;
                a2 = l;
                if (!k.c) {
                    long m;
                    if (this.f.b() == 1) {
                        m = this.k.l;
                    }
                    else {
                        m = 0L;
                    }
                    final okt m2 = nzv.s.m();
                    final long activityOnCreateStartNs = this.k.getActivityOnCreateStartNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv = (nzv)m2.b;
                    nzv.a |= 0x1;
                    nzv.b = activityOnCreateStartNs;
                    final long permissionStartupTaskTimeStartNs = this.k.getPermissionStartupTaskTimeStartNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv2 = (nzv)m2.b;
                    nzv2.a |= 0x80;
                    nzv2.i = permissionStartupTaskTimeStartNs;
                    final long permissionStartupTaskTimeEndNs = this.k.getPermissionStartupTaskTimeEndNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv3 = (nzv)m2.b;
                    nzv3.a |= 0x100;
                    nzv3.j = permissionStartupTaskTimeEndNs;
                    final long waitForCameraDevicesTaskTimeStartNs = this.k.getWaitForCameraDevicesTaskTimeStartNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv4 = (nzv)m2.b;
                    nzv4.a |= 0x800;
                    nzv4.k = waitForCameraDevicesTaskTimeStartNs;
                    final long waitForCameraDevicesTaskTimeEndNs = this.k.getWaitForCameraDevicesTaskTimeEndNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv5 = (nzv)m2.b;
                    nzv5.a |= 0x1000;
                    nzv5.l = waitForCameraDevicesTaskTimeEndNs;
                    final long activityInitializedNs = this.k.getActivityInitializedNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv6 = (nzv)m2.b;
                    nzv6.a |= 0x4;
                    nzv6.d = activityInitializedNs;
                    final long firstPreviewFrameReceivedNs = this.k.getFirstPreviewFrameReceivedNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv7 = (nzv)m2.b;
                    nzv7.a |= 0x2;
                    nzv7.c = firstPreviewFrameReceivedNs;
                    final long firstPreviewFrameRenderedNs = this.k.getFirstPreviewFrameRenderedNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv8 = (nzv)m2.b;
                    nzv8.a |= 0x40;
                    nzv8.h = firstPreviewFrameRenderedNs;
                    final long firstVfePreviewFrameRenderedNs = this.k.getFirstVfePreviewFrameRenderedNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv9 = (nzv)m2.b;
                    nzv9.a |= 0x20000;
                    nzv9.q = firstVfePreviewFrameRenderedNs;
                    final long shutterButtonFirstEnabledNs = this.k.getShutterButtonFirstEnabledNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv10 = (nzv)m2.b;
                    nzv10.a |= 0x10;
                    nzv10.f = shutterButtonFirstEnabledNs;
                    final long shutterButtonFirstDrawnNs = this.k.getShutterButtonFirstDrawnNs();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv11 = (nzv)m2.b;
                    final int a3 = nzv11.a | 0x8;
                    nzv11.a = a3;
                    nzv11.e = shutterButtonFirstDrawnNs;
                    nzv11.a = (a3 | 0x20);
                    nzv11.g = m;
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(Process.getStartElapsedRealtime());
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv12 = (nzv)m2.b;
                    nzv12.a |= 0x40000;
                    nzv12.r = nanos;
                    int n3 = 0;
                    switch (this.f.b() - 1) {
                        default: {
                            n3 = 1;
                            break;
                        }
                        case 2: {
                            n3 = 4;
                            break;
                        }
                        case 1: {
                            n3 = 3;
                            break;
                        }
                        case 0: {
                            n3 = 2;
                            break;
                        }
                    }
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final nzv nzv13 = (nzv)m2.b;
                    nzv13.p = n3 - 1;
                    final int a4 = nzv13.a | 0x10000;
                    nzv13.a = a4;
                    nzv13.a = (a4 | 0x2000);
                    nzv13.m = booleanValue;
                    final hez t = this.t;
                    if (t != null) {
                        final long u = this.u;
                        if (u != 0L) {
                            final okt m3 = obc.f.m();
                            if (m3.c) {
                                m3.m();
                                m3.c = false;
                            }
                            final obc obc = (obc)m3.b;
                            final int a5 = obc.a | 0x1;
                            obc.a = a5;
                            obc.b = u;
                            final float a6 = t.a;
                            final int a7 = a5 | 0x2;
                            obc.a = a7;
                            obc.c = a6;
                            final float b2 = t.b;
                            final int a8 = a7 | 0x4;
                            obc.a = a8;
                            obc.d = b2;
                            final float c2 = t.c;
                            obc.a = (a8 | 0x8);
                            obc.e = c2;
                            final obc o2 = (obc)m3.h();
                            if (m2.c) {
                                m2.m();
                                m2.c = false;
                            }
                            final nzv nzv14 = (nzv)m2.b;
                            o2.getClass();
                            nzv14.o = o2;
                            nzv14.a |= 0x8000;
                            int n4 = 0;
                            switch (gko.a(kra.b((int)this.t.c), this.r) - 1) {
                                default: {
                                    n4 = 5;
                                    break;
                                }
                                case 2: {
                                    n4 = 4;
                                    break;
                                }
                                case 1: {
                                    n4 = n2;
                                    break;
                                }
                                case 0: {
                                    n4 = 2;
                                    break;
                                }
                            }
                            if (m2.c) {
                                m2.m();
                                m2.c = false;
                            }
                            final nzv nzv15 = (nzv)m2.b;
                            nzv15.n = n4 - 1;
                            nzv15.a |= 0x4000;
                        }
                    }
                    j = niz.i(m2.h());
                    a2 = this.n.a();
                }
            }
            final hjr q = this.q;
            final okt m4 = nxz.d.m();
            final boolean booleanValue2 = (boolean)q.b.c(hjq.D);
            if (m4.c) {
                m4.m();
                m4.c = false;
            }
            final nxz nxz = (nxz)m4.b;
            nxz.a |= 0x1;
            nxz.b = booleanValue2;
            final boolean c3 = q.a.getString(hjq.r.b, (String)null) != null && b;
            if (m4.c) {
                m4.m();
                m4.c = false;
            }
            final nxz nxz2 = (nxz)m4.b;
            nxz2.a |= 0x2;
            nxz2.c = c3;
            this.a.N(n, a2, j, niz.i(m4.h()));
        }
    }
}
