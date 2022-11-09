import android.hardware.camera2.params.MeteringRectangle;
import android.util.Pair;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.Comparator;
import java.util.Arrays;
import android.graphics.Bitmap;
import java.util.Map;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.Executor;
import android.graphics.RectF;
import java.util.ArrayList;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Queue;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxd implements cvd, exn, exl, exm, hpb, hhz, bxu, ign, bxf
{
    public static final nsd a;
    private kjk A;
    private gzm[] B;
    private Rect C;
    private Rect D;
    private final bzm E;
    private long F;
    private long G;
    private final Queue H;
    private final List I;
    private final AtomicInteger J;
    private final AtomicInteger K;
    private final AtomicInteger L;
    private final klj M;
    private final klv N;
    private final jqt O;
    public final cxl b;
    public final hhu c;
    public final bzi d;
    public final kjm e;
    public final bzs f;
    public final ExecutorService g;
    public boolean h;
    public long i;
    public final ewy j;
    private final niz k;
    private final niz l;
    private final dlc m;
    private final dlc n;
    private final dlc o;
    private final dlc p;
    private final nmj q;
    private final hkc r;
    private final niz s;
    private final bxg t;
    private final CameraActivityTiming u;
    private final lmy v;
    private final int w;
    private final cai x;
    private gzn y;
    private lfu z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/BeholderExampleGenerator");
    }
    
    public bxd(final cxl b, final kjm e, final ewy j, final hhu c, final bzi d, final jqt o, final hkc r, final lmy v, final CameraActivityTiming u, final niz s, final bxg t, final cai x, final bzs f, final klj m, final klv n, final niz k, final niz l, final dlc i, final dlc n2, final dlc o2, final dlc p23, final int w, final ExecutorService g) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.j = j;
        this.k = k;
        this.l = l;
        this.O = o;
        this.r = r;
        this.s = s;
        this.t = t;
        this.g = g;
        this.h = false;
        this.w = w;
        this.q = nmj.c(w);
        this.v = v;
        this.u = u;
        this.H = nmj.c(1);
        this.I = new ArrayList();
        this.i = 0L;
        this.E = new bzm();
        this.F = -1L;
        this.G = -1L;
        this.J = new AtomicInteger(0);
        this.K = new AtomicInteger(0);
        this.L = new AtomicInteger(0);
        this.M = m;
        this.N = n;
        this.f = f;
        this.m = i;
        this.n = n2;
        this.o = o2;
        this.p = p23;
        this.x = x;
    }
    
    private static void A(final okt okt, final String s, final long n) {
        final okt m = psv.c.m();
        final okt i = psz.b.m();
        i.ak(n);
        final psz b = (psz)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final psv psv = (psv)m.b;
        b.getClass();
        psv.b = b;
        psv.a = 3;
        okt.aj(s, (psv)m.h());
    }
    
    private final void B(final okt okt) {
        synchronized (this) {
            if (this.H.isEmpty()) {
                return;
            }
            final RectF rectF = this.H.poll();
            if (rectF == null) {
                return;
            }
            z(okt, "tracking/left", rectF.left);
            z(okt, "tracking/top", rectF.top);
            z(okt, "tracking/right", rectF.right);
            z(okt, "tracking/bottom", rectF.bottom);
        }
    }
    
    private static final void C(final dlc dlc, final String s, final okt okt) {
        float a;
        if (!dlc.e()) {
            dlc.d();
            a = dlc.d().a();
        }
        else {
            a = Float.NaN;
        }
        if (!Float.isNaN(a)) {
            z(okt, s, a);
        }
    }
    
    private final void w() {
        this.q.clear();
        this.x();
        this.J.set(0);
        this.K.set(0);
        this.L.set(0);
        this.i = 0L;
    }
    
    private final void x() {
        synchronized (this) {
            this.H.clear();
            this.I.clear();
        }
    }
    
    private static void y(final okt okt, final String s, final Iterable iterable) {
        final okt m = psv.c.m();
        final okt i = psy.b.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final psy psy = (psy)i.b;
        psy.i();
        ojf.e(iterable, psy.a);
        final psy b = (psy)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final psv psv = (psv)m.b;
        b.getClass();
        psv.b = b;
        psv.a = 2;
        okt.aj(s, (psv)m.h());
    }
    
    private static void z(final okt okt, final String s, final float... array) {
        final okt m = psy.b.m();
        for (final float n : array) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final psy psy = (psy)m.b;
            psy.i();
            psy.a.g(n);
        }
        final okt j = psv.c.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final psv psv = (psv)j.b;
        final psy b = (psy)m.h();
        b.getClass();
        psv.b = b;
        psv.a = 2;
        okt.aj(s, (psv)j.h());
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void b(final hph hph) {
    }
    
    @Override
    public final void bk() {
        final kjk a = new kjk();
        this.c.a(this);
        a.c(new bwy(this));
        this.A = a;
        final cxl b = this.b;
        final cxo a2 = cxr.a;
        b.b();
        ofi.w(lou.a(this.O.l()), new bxc(this), odx.a);
        if (this.s.g()) {
            ((igo)this.s.c()).e(this);
        }
        this.t.d = this;
        if (this.b.k(cxr.aZ)) {
            this.f.c();
        }
    }
    
    @Override
    public final void c(final lfg lfg) {
        this.z = lfg.l();
        this.C = (Rect)lfg.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        this.q.clear();
    }
    
    @Override
    public final void e() {
        final kjk a = this.A;
        if (a != null) {
            a.close();
            this.A = null;
        }
        if (this.s.g()) {
            ((igo)this.s.c()).g(this);
        }
        this.t.d = null;
        if (this.b.k(cxr.aZ)) {
            this.f.close();
        }
    }
    
    @Override
    public final void f(final jbm jbm) {
        jbm.name();
        final hio a = hio.a;
        switch (jbm.ordinal()) {
            default: {
                return;
            }
            case 12: {
                this.K.set(1);
                return;
            }
            case 6: {
                this.J.set(1);
                return;
            }
            case 3: {
                this.L.set(1);
            }
        }
    }
    
    @Override
    public final void g(final long n, final Map map) {
        this.E.c(map);
    }
    
    @Override
    public final void h(final ljm ljm) {
        final Rect c = this.C;
        if (c == null) {
            return;
        }
        final gzn y = new gzn(ljm, 0, c);
        this.y = y;
        this.q.add(y.c * 1.0E-6f * y.f * y.e);
        final gzn y2 = this.y;
        this.B = y2.p;
        this.D = y2.n;
    }
    
    @Override
    public final void o(final him him, final hih hih, final hip hip) {
        if (hip == hip.b) {
            this.w();
            return;
        }
        final jbm a = jbm.a;
        final hio a2 = hio.a;
        int n = 0;
        switch (hih.c.ordinal()) {
            default: {
                n = -1;
                break;
            }
            case 12: {
                n = 2;
                break;
            }
            case 10: {
                n = 3;
                break;
            }
            case 5:
            case 11: {
                n = 1;
                break;
            }
            case 1:
            case 2:
            case 3: {
                n = 0;
                break;
            }
        }
        if (this.h && n != -1) {
            final okt m = psx.b.m();
            A(m, "CAMERA/mode", n);
            A(m, "smarts/portrait", this.J.get());
            A(m, "smarts/long_exposure", this.K.get());
            A(m, "smarts/imax", this.L.get());
            final niz b = this.E.b();
            if (b.g()) {
                y(m, "ICA/labels", (Iterable)b.c());
            }
            final niz a3 = this.E.a();
            if (a3.g()) {
                y(m, "ICA/embeddings", (Iterable)a3.c());
                ((List)a3.c()).size();
            }
            if (this.y != null) {
                y(m, "EXPOSURE/buffer", this.q);
                A(m, "EXPOSURE/buffer_size", this.q.size());
                final lfu z = this.z;
                if (z != null) {
                    niz niz;
                    if (z == lfu.a) {
                        niz = this.b.g(cxv.b);
                    }
                    else {
                        niz = this.b.g(cxv.c);
                    }
                    z(m, "EXPOSURE/max", (float)niz.c());
                }
                A(m, "AE/mode", this.y.u);
                long n2;
                if (!this.y.x) {
                    n2 = 0L;
                }
                else {
                    n2 = 1L;
                }
                A(m, "AE/lock", n2);
            }
            final gzm[] b2 = this.B;
            Label_0887: {
                if (b2 != null) {
                    if (this.D != null) {
                        final int length = b2.length;
                        A(m, "FACE/num", length);
                        final gzm[] b3 = this.B;
                        b3.getClass();
                        Arrays.sort(b3, bzj.b);
                        final int min = Math.min(length, 10);
                        final float[] array = new float[min];
                        final float[] array2 = new float[min];
                        final float[] array3 = new float[min];
                        final float[] array4 = new float[min];
                        for (int i = 0; i < min; ++i) {
                            final gzm[] b4 = this.B;
                            b4.getClass();
                            final Rect a4 = b4[i].a;
                            final int width = a4.width();
                            final Rect d = this.D;
                            d.getClass();
                            final int width2 = d.width();
                            final int height = a4.height();
                            final Rect d2 = this.D;
                            d2.getClass();
                            final int height2 = d2.height();
                            final int centerX = a4.centerX();
                            final Rect d3 = this.D;
                            d3.getClass();
                            final int width3 = d3.width();
                            final int centerY = a4.centerY();
                            final Rect d4 = this.D;
                            d4.getClass();
                            final int height3 = d4.height();
                            array[i] = width / (float)width2;
                            array2[i] = height / (float)height2;
                            array3[i] = centerX / (float)width3;
                            array4[i] = centerY / (float)height3;
                        }
                        final int n3 = n;
                        z(m, "FACE/width", array);
                        z(m, "FACE/height", array2);
                        z(m, "FACE/center_x", array3);
                        z(m, "FACE/center_y", array4);
                        n = n3;
                        if (this.N.aQ()) {
                            final dlc p3 = this.p;
                            n = n3;
                            if (!p3.e()) {
                                p3.d();
                                final int min2 = Math.min(min, p3.d().a.length);
                                final float[] array5 = new float[min2];
                                for (int j = 0; j < min2; ++j) {
                                    n = n3;
                                    if (Float.isNaN(p3.d().b(j))) {
                                        break Label_0887;
                                    }
                                    array5[j] = p3.d().b(j);
                                }
                                z(m, "FACE/familiarity", array5);
                                A(m, "FACE/familiarity/num", min2);
                                n = n3;
                            }
                        }
                    }
                }
            }
            final boolean e = ((dlc)((njd)this.k).a).e();
            final fjc fjc = null;
            fja a5;
            if (!e) {
                a5 = fja.a(((dlc)((njd)this.k).a).d());
            }
            else {
                a5 = null;
            }
            final lfu z2 = this.z;
            if (z2 != null) {
                final boolean b5 = z2 == lfu.a;
                A(m, "CAMERA/front", b5 ? 1 : 0);
                final hkc r = this.r;
                if (r != null) {
                    String s = (String)r.c(hjq.i);
                    if ((b5 ? 1 : 0) == 1) {
                        s = (String)this.r.c(hjq.j);
                    }
                    A(m, "CAMERA/flash", s.equals("on") ? 1 : 0);
                }
                if (a5 != null) {
                    int n4;
                    if (a5.b > 70.0f && this.z != lfu.a) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    A(m, "CAMERA/to_ground", n4);
                }
            }
            z(m, "CAMERA/zoom", (float)this.M.aQ());
            if (!((dlc)((njd)this.k).a).e()) {
                final List b6 = dnw.b((dlc)((njd)this.k).a, this.w);
                final int size = b6.size();
                final float[] array6 = new float[size];
                final float[] array7 = new float[size];
                final float[] array8 = new float[size];
                for (int n5 = size - 1, k = 0; k < size; ++k, --n5) {
                    final fja a6 = fja.a(b6.get(n5));
                    array6[k] = a6.b;
                    array7[k] = a6.c;
                    array8[k] = (float)a6.a;
                }
                z(m, "imu/pitch_buffer", array6);
                z(m, "imu/roll_buffer", array7);
                z(m, "imu/rotation_buffer", array8);
                A(m, "imu/buffer_size", size);
            }
            fjc fjc2;
            if (!((dlc)((njd)this.l).a).e()) {
                ((dlc)((njd)this.l).a).d();
                fjc2 = new fjc(((dlc)((njd)this.l).a).d().a);
            }
            else {
                fjc2 = fjc;
            }
            if (fjc2 != null) {
                final Pair a7 = cua.a(fjc2);
                z(m, "imu/pitch_radius", (float)a7.first);
                z(m, "imu/yaw_radius", (float)a7.second);
            }
            final gzn y = this.y;
            if (y != null) {
                final MeteringRectangle[] b7 = y.B;
                if (b7 != null && b7.length > 0) {
                    final Rect c = this.C;
                    if (c != null) {
                        final MeteringRectangle meteringRectangle = b7[0];
                        final int width4 = c.width();
                        final int height4 = this.C.height();
                        final float n6 = (float)width4;
                        z(m, "AF/left_x", meteringRectangle.getX() / n6);
                        final float n7 = (float)height4;
                        z(m, "AF/upper_y", meteringRectangle.getY() / n7);
                        z(m, "AF/width", meteringRectangle.getWidth() / n6);
                        z(m, "AF/height", meteringRectangle.getHeight() / n7);
                    }
                }
                A(m, "AF/mode", this.y.v);
            }
            A(m, "CAMERA/timestamp", TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.v.a())));
            final CameraActivityTiming u = this.u;
            if (u != null) {
                if (!u.c) {
                    final long activityOnCreateStartNs = u.getActivityOnCreateStartNs();
                    if (activityOnCreateStartNs != -1L) {
                        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        if (this.G != activityOnCreateStartNs) {
                            this.F = activityOnCreateStartNs;
                            A(m, "CAMERA/first_capture_since_session_start_timing", TimeUnit.NANOSECONDS.toMillis(elapsedRealtimeNanos - this.F));
                        }
                        else {
                            A(m, "CAMERA/capture_intervals", TimeUnit.NANOSECONDS.toMillis(elapsedRealtimeNanos - this.F));
                        }
                        this.G = activityOnCreateStartNs;
                        this.F = elapsedRealtimeNanos;
                    }
                }
            }
            this.B(m);
            A(m, "tap/count", this.i);
            if (!this.I.isEmpty()) {
                final int min3 = Math.min(this.I.size(), 10);
                int n8;
                if (min3 < this.I.size()) {
                    n8 = this.I.size() - min3;
                }
                else {
                    n8 = 0;
                }
                final float[] array9 = new float[min3];
                final float[] array10 = new float[min3];
                final float[] array11 = new float[min3];
                final float[] array12 = new float[min3];
                for (int l = 0; l < min3; ++l) {
                    final RectF rectF = this.I.get(l + n8);
                    array9[l] = rectF.left;
                    array10[l] = rectF.top;
                    array11[l] = rectF.right;
                    array12[l] = rectF.bottom;
                    final float left = rectF.left;
                    final float top = rectF.top;
                    final float right = rectF.right;
                    final float bottom = rectF.bottom;
                }
                z(m, "tracking/cancelled/left", array9);
                z(m, "tracking/cancelled/top", array10);
                z(m, "tracking/cancelled/right", array11);
                z(m, "tracking/cancelled/bottom", array12);
            }
            final gzn y2 = this.y;
            if (y2 != null) {
                z(m, "metadata/focal_length", y2.g);
                z(m, "metadata/focal_distance", this.y.h);
                z(m, "metadata/fnumber", this.y.z);
                z(m, "metadata/subject_motion", this.y.o);
                A(m, "metadata/auto_white_balance_mode", this.y.w);
                long n9;
                if (!this.y.y) {
                    n9 = 0L;
                }
                else {
                    n9 = 1L;
                }
                A(m, "metadata/auto_white_balance_lock", n9);
                A(m, "metadata/jpeg_quality", Long.parseLong(Byte.toString(this.y.A)));
            }
            C(this.m, "frame/topshot_score", m);
            C(this.n, "frame/face_quality", m);
            C(this.o, "frame/aesthetic_score", m);
            ofi.w(odg.i(oet.q(this.d.b(String.valueOf(this.x.a(hih.b).c()))), new bwz(this, n, m), this.g), new bxc(this, 1), this.g);
        }
        this.w();
    }
    
    @Override
    public final void q() {
    }
    
    @Override
    public final void r() {
        synchronized (this) {
            if (this.H.isEmpty()) {
                return;
            }
            final RectF rectF = this.H.poll();
            if (rectF == null) {
                return;
            }
            this.I.add(rectF);
            this.H.clear();
        }
    }
    
    @Override
    public final void s(final RectF rectF) {
        synchronized (this) {
            this.H.add(rectF);
        }
    }
    
    @Override
    public final void t() {
    }
    
    @Override
    public final void u() {
    }
}
