import java.io.IOException;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap;
import android.os.Vibrator;
import java.util.concurrent.Executor;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.content.Intent;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.content.Context;
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhx implements ewb, jgv, kfj, exn, exb, exl, exm, exe
{
    public static boolean a;
    private static final long[] v;
    private final HandlerThread A;
    private final Handler B;
    private final Activity C;
    private final jho D;
    private final htm E;
    private final eyt F;
    private final jia G;
    private final Context H;
    private final kjk I;
    private final ivj J;
    private final BottomBarController K;
    private final imb L;
    private final klv M;
    private final niz N;
    private final jhl O;
    long b;
    boolean c;
    int d;
    int e;
    Runnable f;
    Runnable g;
    public boolean h;
    public boolean i;
    public final jhg j;
    public final klv k;
    public final krr l;
    public final kse m;
    public final Object n;
    public final jjb o;
    public final klv p;
    public final ixn q;
    final hrk r;
    public String s;
    public String t;
    public final lit u;
    private String w;
    private Intent x;
    private int y;
    private long z;
    
    static {
        v = new long[] { 0L, 400L };
        jhx.a = false;
    }
    
    public jhx(final Activity c, final Context h, final lit u, final jhg j, final klv k, final jho d, final jjb o, final klv p20, final htm e, final eyt f, final jia g, final ixn q, final ivj i, final BottomBarController l, final imb m, final klv m2, final niz n, final jhl o2, final krr krr, final kse m3) {
        this.b = 0L;
        this.c = false;
        this.d = 480;
        this.e = 480;
        this.y = 0;
        this.z = -1L;
        this.n = new Object();
        this.r = new jhw(this);
        this.C = c;
        this.u = u;
        this.j = j;
        this.k = k;
        this.D = d;
        this.o = o;
        this.E = e;
        this.F = f;
        this.G = g;
        this.l = krr.a("WearRemoteShutterListenerV2");
        this.m = m3;
        this.H = h;
        this.p = p20;
        this.q = q;
        this.J = i;
        this.K = l;
        this.L = m;
        this.M = m2;
        this.N = n;
        this.O = o2;
        final HandlerThread a = new HandlerThread("WRSListenerV2 bkg");
        (this.A = a).start();
        this.B = kpo.d(a.getLooper());
        this.I = new kjk();
        egz.d(d.b, d.a, d);
        this.i = true;
    }
    
    private final void m() {
        if (this.l()) {
            this.G.c.b();
        }
    }
    
    private final void n() {
        this.w = null;
        this.z = -1L;
    }
    
    private final void o() {
        this.B.post((Runnable)new jhv(this, 5));
    }
    
    private final void p(final String s, final long n) {
        this.B.post((Runnable)new jht(this, s, n));
    }
    
    private final void q() {
        String s;
        if (!jhx.a) {
            s = "onPause";
        }
        else {
            s = "onResume";
        }
        this.B.post((Runnable)new jhs(this, s));
    }
    
    private final void r(final int n) {
        if (this.s(true)) {
            if (n <= 0 && this.L.c()) {
                this.J.u();
                return;
            }
            final hjg hjg = (hjg)this.M.aQ();
            if (hjg.g != n) {
                this.M.aR(hjg.a(n));
            }
            try {
                this.F.af(2);
                this.J.v();
                this.J.A(false);
                this.J.u();
                if (hjg.g != n) {
                    this.M.aR(hjg);
                }
            }
            finally {
                if (hjg.g != n) {
                    this.M.aR(hjg);
                }
            }
        }
    }
    
    private final boolean s(final boolean b) {
        synchronized (this.n) {
            final boolean empty = TextUtils.isEmpty((CharSequence)this.s);
            final boolean b2 = true;
            return !empty && jhx.a && (b || this.c) && b2;
        }
    }
    
    @Override
    public final void F() {
        this.f = new jhv(this, 8);
        this.g = new jhv(this, 2);
        final jqt c = this.j.c;
        final IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
        intentFilter.addDataScheme("wear");
        intentFilter.addDataAuthority("*", (String)null);
        final jtd i = lsp.i(this, c.h, "MessageListener");
        final jtk a = jtl.a();
        a.c = i;
        a.a = new khr(this, i, new IntentFilter[] { intentFilter });
        a.b = new khq(this);
        a.d = 24016;
        c.n(a.a());
        final jhg j = this.j;
        j.b.f("sendMessageAsync to /check_status");
        j.b("/check_status", null);
        this.B.post((Runnable)new jhv(this));
        this.q();
        this.o();
        this.B.post((Runnable)new jhv(this, 1));
        this.h(0L);
        this.o.e(new jhq(this));
        this.I.c(this.p.a(new jhu(this), odx.a));
        if (this.N.g()) {
            ((hrj)this.N.c()).b(this.r);
        }
    }
    
    @Override
    public final void a(final kht kht) {
        final krr l = this.l;
        final int a = kht.a;
        final String b = kht.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 66);
        sb.append("onMessageReceived() A message from watch was received:");
        sb.append(a);
        sb.append(" ");
        sb.append(b);
        l.g(sb.toString());
        final String b2 = kht.b;
        final int hashCode = b2.hashCode();
        final int n = 2;
        int n2 = 0;
        Label_0530: {
            switch (hashCode) {
                case 1580677032: {
                    if (b2.equals("/flip_camera")) {
                        n2 = 9;
                        break Label_0530;
                    }
                    break;
                }
                case 1463983852: {
                    if (b2.equals("onResume")) {
                        n2 = 2;
                        break Label_0530;
                    }
                    break;
                }
                case 1233860339: {
                    if (b2.equals("/snapshot")) {
                        n2 = 8;
                        break Label_0530;
                    }
                    break;
                }
                case 1142652788: {
                    if (b2.equals("/zoom_value")) {
                        n2 = 13;
                        break Label_0530;
                    }
                    break;
                }
                case 990591823: {
                    if (b2.equals("/log_lost_connection")) {
                        n2 = 7;
                        break Label_0530;
                    }
                    break;
                }
                case 768574312: {
                    if (b2.equals("/play_sound_from_wear")) {
                        n2 = 10;
                        break Label_0530;
                    }
                    break;
                }
                case 372591714: {
                    if (b2.equals("/enter_ambient")) {
                        n2 = 5;
                        break Label_0530;
                    }
                    break;
                }
                case 141093123: {
                    if (b2.equals("/launch_from_notification")) {
                        n2 = 11;
                        break Label_0530;
                    }
                    break;
                }
                case 47150210: {
                    if (b2.equals("/zoom")) {
                        n2 = 14;
                        break Label_0530;
                    }
                    break;
                }
                case -84327103: {
                    if (b2.equals("/leave_ambient")) {
                        n2 = 6;
                        break Label_0530;
                    }
                    break;
                }
                case -354612671: {
                    if (b2.equals("/sending_time")) {
                        n2 = 1;
                        break Label_0530;
                    }
                    break;
                }
                case -814358344: {
                    if (b2.equals("/check_status")) {
                        n2 = 0;
                        break Label_0530;
                    }
                    break;
                }
                case -1000270761: {
                    if (b2.equals("/count_down_from_phone")) {
                        n2 = 16;
                        break Label_0530;
                    }
                    break;
                }
                case -1340212393: {
                    if (b2.equals("onPause")) {
                        n2 = 3;
                        break Label_0530;
                    }
                    break;
                }
                case -1401315045: {
                    if (b2.equals("onDestroy")) {
                        n2 = 4;
                        break Label_0530;
                    }
                    break;
                }
                case -1591117040: {
                    if (b2.equals("/support_feature_version")) {
                        n2 = 15;
                        break Label_0530;
                    }
                    break;
                }
                case -1806199438: {
                    if (b2.equals("/wear_size")) {
                        n2 = 12;
                        break Label_0530;
                    }
                    break;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            case 16: {
                try {
                    this.r(((jgw)oky.t(jgw.b, kht.c, okm.b())).a);
                }
                catch (final olm olm) {
                    this.l.i("Error when parsing count down time", olm);
                }
            }
            case 15: {
                try {
                    final jhl o = this.O;
                    final byte[] c = kht.c;
                    if (c != null) {
                        o.b = ((jgz)oky.t(jgz.b, c, okm.b())).a;
                    }
                    final krr i = this.l;
                    final int b3 = this.O.b;
                    final StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Get version from wear, version=");
                    sb2.append(b3);
                    i.f(sb2.toString());
                }
                catch (final olm olm2) {
                    this.l.i("Fail to parse version!", olm2);
                }
            }
            case 14: {
                try {
                    final float a2 = ((jha)oky.q(jha.b, kht.c)).a;
                    if (this.l()) {
                        this.o.l();
                        final jjb o2 = this.o;
                        float n3;
                        if (a2 > 0.0f) {
                            n3 = 1.01f;
                        }
                        else {
                            n3 = 0.99f;
                        }
                        o2.k(n3);
                        final jjb o3 = this.o;
                        ((jjq)o3).z.n();
                        if (!((jjq)o3).l) {
                            ((jjq)o3).z.w();
                        }
                        ((jjq)o3).z.z(8, ((jjq)o3).O, (float)((jjq)o3).g.aQ());
                        return;
                    }
                    break;
                }
                catch (final olm olm3) {
                    this.l.i("Error when get zoom delta", olm3);
                }
            }
            case 13: {
                try {
                    final float a3 = ((jhc)oky.q(jhc.b, kht.c)).a;
                    if (this.l()) {
                        ++this.y;
                        this.p.aR(a3);
                        return;
                    }
                    break;
                }
                catch (final olm olm4) {
                    this.l.i("Error when get zoom value", olm4);
                }
            }
            case 12: {
                final String s = new String(kht.c);
                final String[] split = s.split("x", -1);
                if (split.length == 2) {
                    this.d = Integer.parseInt(split[0]);
                    this.e = Integer.parseInt(split[1]);
                }
                final krr j = this.l;
                String concat;
                if (s.length() != 0) {
                    concat = "Wear size, ".concat(s);
                }
                else {
                    concat = new String("Wear size, ");
                }
                j.b(concat);
                return;
            }
            case 11: {
                final okt h = this.G.h;
                if (h.c) {
                    h.m();
                    h.c = false;
                }
                final obv obv = (obv)h.b;
                final obv g = obv.g;
                obv.f = 1;
                obv.a |= 0x80;
                return;
            }
            case 10: {
                final String s2 = new String(kht.c);
                int n4 = 0;
                Label_1243: {
                    switch (s2.hashCode()) {
                        case 1327375512: {
                            if (s2.equals("TIMER_START_SOUND")) {
                                n4 = 0;
                                break Label_1243;
                            }
                            break;
                        }
                        case 569397989: {
                            if (s2.equals("TIMER_INCREMENT_SOUND")) {
                                n4 = n;
                                break Label_1243;
                            }
                            break;
                        }
                        case -1085729529: {
                            if (s2.equals("TIMER_FINAL_SECOND_SOUND")) {
                                n4 = 1;
                                break Label_1243;
                            }
                            break;
                        }
                    }
                    n4 = -1;
                }
                int n5 = 0;
                switch (n4) {
                    default: {
                        throw new IllegalArgumentException();
                    }
                    case 2: {
                        n5 = 2131886103;
                        break;
                    }
                    case 1: {
                        n5 = 2131886102;
                        break;
                    }
                    case 0: {
                        n5 = 2131886104;
                        break;
                    }
                }
                this.E.b(n5);
                return;
            }
            case 9: {
                if (this.l()) {
                    this.K.switchCamera();
                    return;
                }
                break;
            }
            case 8: {
                this.r(0);
                return;
            }
            case 7: {
                this.l.b("Wear came back from connection lost");
                final jia g2 = this.G;
                ++g2.e;
                return;
            }
            case 6: {
                this.l.b("Wear leave ambient");
                final jhz d = this.G.d;
                if (!d.c) {
                    d.d.h("onSessionStop failed because session is not started!");
                    return;
                }
                d.c = false;
                final long b4 = d.b + (System.currentTimeMillis() - d.a);
                d.b = b4;
                final krr d2 = d.d;
                final StringBuilder sb3 = new StringBuilder(50);
                sb3.append("onSessionStop, elapseTimeMs = ");
                sb3.append(b4);
                d2.f(sb3.toString());
                return;
            }
            case 5: {
                this.l.b("Wear enter ambient");
                this.G.d.b();
                return;
            }
            case 4: {
                this.l.b("Wear onDestroy");
                this.C.finish();
                return;
            }
            case 3: {
                this.c = false;
                this.l.b("Wear onPause");
                return;
            }
            case 2: {
                this.c = true;
                this.q();
                this.o();
                this.j();
                this.h(0L);
                this.m();
                this.l.b("Wear onResume");
                return;
            }
            case 1: {
                Long value;
                try {
                    value = ((jgy)oky.q(jgy.c, kht.c)).b;
                }
                catch (final olm olm5) {
                    this.l.i("Error when get WearImageBundle", olm5);
                    value = null;
                }
                if (value != null) {
                    this.b = System.currentTimeMillis() - value;
                    this.i = true;
                    this.h(0L);
                    final jia g3 = this.G;
                    final long b5 = this.b;
                    g3.f += b5;
                    ++g3.g;
                    final krr k = this.l;
                    final StringBuilder sb4 = new StringBuilder(57);
                    sb4.append("Receive image callback with time gap ");
                    sb4.append(b5);
                    k.b(sb4.toString());
                    return;
                }
                break;
            }
            case 0: {
                this.q();
                this.o();
                this.B.post((Runnable)new jhv(this, 3));
                if (!TextUtils.isEmpty((CharSequence)this.w)) {
                    this.p(this.w, this.z);
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public final void b() {
        final boolean l = this.l();
        synchronized (this.n) {
            this.s = null;
            monitorexit(this.n);
            this.n();
            if (l) {
                this.B.post((Runnable)new jhv(this, 4));
            }
        }
    }
    
    @Override
    public final void bh() {
        final jia g = this.G;
        if (g.c.a() <= 0L) {
            g.b.f("Session is not started. No need to send usage log.");
        }
        else {
            final okt h = g.h;
            final long a = g.c.a();
            if (h.c) {
                h.m();
                h.c = false;
            }
            final obv obv = (obv)h.b;
            final obv g2 = obv.g;
            final int a2 = obv.a;
            int n = 1;
            obv.a = (a2 | 0x1);
            obv.b = a;
            final long a3 = g.d.a();
            if (h.c) {
                h.m();
                h.c = false;
            }
            final obv obv2 = (obv)h.b;
            final int a4 = obv2.a | 0x2;
            obv2.a = a4;
            obv2.c = a3;
            final int e = g.e;
            obv2.a = (a4 | 0x4);
            obv2.d = e;
            final long g3 = g.g;
            if (g3 > 0L) {
                final okt h2 = g.h;
                final int e2 = (int)(g.f / g3);
                if (h2.c) {
                    h2.m();
                    h2.c = false;
                }
                final obv obv3 = (obv)h2.b;
                obv3.a |= 0x40;
                obv3.e = e2;
            }
            final obv obv4 = (obv)g.h.h();
            g.a.H(obv4);
            final krr b = g.b;
            final long b2 = obv4.b;
            final long c = obv4.c;
            final int b3 = oce.b(obv4.f);
            if (b3 != 0) {
                n = b3;
            }
            final String string = Integer.toString(n - 1);
            final int d = obv4.d;
            String string2;
            if (g.g > 0L) {
                final int e3 = obv4.e;
                final StringBuilder sb = new StringBuilder(37);
                sb.append(", LatencyAveragePreviewMs=");
                sb.append(e3);
                string2 = sb.toString();
            }
            else {
                string2 = "";
            }
            final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 157 + String.valueOf(string2).length());
            sb2.append("sendUsageLog done, SessionDurationMs=");
            sb2.append(b2);
            sb2.append(", SessionAmbientDurationMs=");
            sb2.append(c);
            sb2.append(", LaunchType=");
            sb2.append(string);
            sb2.append(", FailureLostConnectionTimes=");
            sb2.append(d);
            sb2.append(string2);
            b.f(sb2.toString());
        }
        final jhg j = this.j;
        final Runnable g4 = this.g;
        nov.z(g4);
        j.b("onDestroy", g4);
        final jqt c2 = this.j.c;
        final jtb b4 = lsp.i(this, c2.h, "MessageListener").b;
        if (b4 != null) {
            c2.f(b4, 24007);
            this.A.quitSafely();
            this.I.close();
            return;
        }
        throw new NullPointerException("Key must not be null");
    }
    
    @Override
    public final void bk() {
        jhx.a = true;
        this.q();
        if (!TextUtils.isEmpty((CharSequence)this.t)) {
            this.c(this.t);
        }
        else {
            this.o();
        }
        this.h(0L);
        this.m();
        this.y = 0;
        final Intent intent = this.C.getIntent();
        if (intent != null && intent.equals(this.x)) {
            return;
        }
        this.x = intent;
        if (intent.getBooleanExtra("extra_launch_fom_wear", false)) {
            final okt h = this.G.h;
            if (h.c) {
                h.m();
                h.c = false;
            }
            final obv obv = (obv)h.b;
            final obv g = obv.g;
            obv.f = 2;
            obv.a |= 0x80;
            final Vibrator vibrator = (Vibrator)this.H.getSystemService("vibrator");
            if (vibrator != null && vibrator.hasVibrator()) {
                vibrator.vibrate(jhx.v, -1);
            }
        }
    }
    
    @Override
    public final void c(final String s) {
        synchronized (this.n) {
            this.s = s;
            monitorexit(this.n);
            if (this.l()) {
                this.o();
                this.h(0L);
            }
            this.m();
        }
    }
    
    @Override
    public final void e() {
        synchronized (this.n) {
            this.t = this.s;
            monitorexit(this.n);
            this.b();
            jhx.a = false;
            this.q();
        }
    }
    
    @Override
    public final void f(final Bitmap bitmap) {
        if (this.s(true)) {
            this.B.post((Runnable)new jhr(this, bitmap));
        }
    }
    
    @Override
    public final void g(final String w, final long z) {
        if (this.l()) {
            this.p(w, z);
        }
        if (!"/video_state_paused".equals(w) || !"/video_state_recording".equals(this.w)) {
            this.z = z;
        }
        this.w = w;
        if ("/video_state_stopped".equals(w)) {
            this.n();
        }
    }
    
    public final void h(final long n) {
        if (this.l()) {
            final Runnable f = this.f;
            if (f != null) {
                this.B.removeCallbacks(f);
                if (n <= 0L) {
                    this.B.post(this.f);
                    return;
                }
                this.B.postDelayed(this.f, n);
            }
        }
    }
    
    public final void i(final Bitmap bitmap, final boolean b) {
        int n;
        if (!b) {
            n = 65;
        }
        else {
            n = 30;
        }
        Throwable t = null;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap$CompressFormat.JPEG, n, (OutputStream)byteArrayOutputStream);
                byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            }
            finally {
                try {
                    byteArrayOutputStream.close();
                }
                finally {
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
        catch (final IOException ex) {
            this.l.i("Error when compressBitmap", ex);
            t = null;
        }
        if (b) {
            bitmap.recycle();
        }
        if (t == null) {
            this.l.d("Compress bitmap failed!");
            return;
        }
        final okt m = jgy.c.m();
        final ojw t3 = ojw.t((byte[])(Object)t);
        if (m.c) {
            m.m();
            m.c = false;
        }
        ((jgy)m.b).a = t3;
        final long currentTimeMillis = System.currentTimeMillis();
        if (m.c) {
            m.m();
            m.c = false;
        }
        ((jgy)m.b).b = currentTimeMillis;
        final jgy jgy = (jgy)m.h();
        String s;
        if (!b) {
            s = "/image";
        }
        else {
            s = "/preview";
        }
        if (!this.s(b ^ true)) {
            this.l.f("Not active now. Skip sending preview");
            return;
        }
        this.j.d(s, jgy.g());
    }
    
    public final void j() {
        this.B.post((Runnable)new jhv(this, 6));
        this.k();
    }
    
    public final void k() {
        final int y = this.y;
        if (y > 0) {
            this.y = y - 1;
            return;
        }
        this.B.post((Runnable)new jhv(this, 7));
    }
    
    final boolean l() {
        return this.s(false);
    }
    
    @Override
    public final void z(final Intent intent) {
        this.t = null;
    }
}
