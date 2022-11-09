import android.content.pm.PackageInfo;
import android.view.Window;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.hardware.display.DisplayManager;
import android.os.Process;
import android.os.Build;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.view.WindowManager$LayoutParams;
import android.content.pm.PackageManager$NameNotFoundException;
import android.hardware.SensorManager;
import java.nio.file.Paths;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.os.HandlerThread;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import android.hardware.display.DisplayManager$DisplayListener;
import android.view.View;
import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import android.view.View$OnTouchListener;
import android.content.DialogInterface$OnClickListener;
import java.util.Set;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fol extends bqw implements dsl
{
    private static boolean U;
    public static final nsd b;
    public final hfn A;
    public final ilx B;
    public final Handler C;
    public final drs D;
    public final klv E;
    public final Set F;
    public boolean G;
    public Handler H;
    public dsm I;
    protected kc J;
    protected kc K;
    public final DialogInterface$OnClickListener L;
    public final View$OnTouchListener M;
    public int N;
    public long O;
    public int P;
    public int Q;
    public final hxd R;
    public final dqx S;
    public etu T;
    private final etp V;
    private final ivj W;
    private final BottomBarListener X;
    private final bqu Y;
    private final kjm Z;
    private final Context aa;
    private final cxl ab;
    private View ac;
    private etw ad;
    private DisplayManager$DisplayListener ae;
    private etb af;
    private PhotoSphereMessageOverlay ag;
    private final klj ah;
    private final klj ai;
    private kjk aj;
    private final gkv ak;
    private final klv al;
    private final car am;
    private HandlerThread an;
    private final isx ao;
    private final kri ap;
    private final euc aq;
    private final euc ar;
    private final euc as;
    private final hld at;
    private final eiq au;
    private final eip av;
    private final Runnable aw;
    private final Runnable ax;
    private final hyl ay;
    public final gxf c;
    public final gxa d;
    public final htm e;
    public final BottomBarController f;
    public final ivq g;
    public esg h;
    public ers i;
    public boolean j;
    public boolean k;
    public boolean l;
    public LocalSessionStorage m;
    public final ega n;
    public MainActivityLayout o;
    public boolean p;
    public int q;
    public esv r;
    public ess s;
    public final bqm t;
    public final itn u;
    public final eyt v;
    public Thread w;
    public int x;
    public int y;
    public int z;
    
    static {
        b = nsd.g("com/google/android/apps/camera/modules/lightcycle/PanoramaModule");
    }
    
    public fol(final hfn a, final bqu y, final bqm t, final itn u, final htm e, final cxl ab, final gxf c, final gxa d, final hwz hwz, final kjk kjk, final kjm z, final klj ah, final klj ai, final eiq au, final ilx b, final hxd r, final BottomBarController f, final ivj w, final eyt v, final drs d2, final dqx s, final hgy hgy, final hhw hhw, final gkv ak, final klv e2, final Set f2, final hyl ay, final klv al, final hif hif, final kse kse) {
        this.Q = 1;
        this.p = false;
        this.q = 0;
        this.C = new foj(this);
        this.G = false;
        this.L = (DialogInterface$OnClickListener)new fob(this, 1);
        this.M = (View$OnTouchListener)new fod(this);
        final isy ao = new isy(this);
        this.ao = ao;
        this.N = 0;
        this.O = 0L;
        final foe ap = new foe(this);
        this.ap = ap;
        this.aq = new fnx(this, 2);
        this.ar = new fnx(this, 3);
        this.as = new fnx(this, 4);
        this.P = 2;
        final foh at = new foh();
        this.at = at;
        this.av = new foi(this);
        this.aw = new fnt(this, 3);
        this.ax = new fnt(this, 4);
        this.Z = z;
        this.ay = ay;
        y.getClass();
        t.getClass();
        this.t = t;
        this.Y = y;
        this.u = u;
        e.getClass();
        this.e = e;
        ab.getClass();
        this.ab = ab;
        c.getClass();
        this.c = c;
        this.d = d;
        au.getClass();
        this.au = au;
        b.getClass();
        this.B = b;
        this.R = r;
        this.ai = ai;
        this.ah = ah;
        f.getClass();
        this.f = f;
        w.getClass();
        this.W = w;
        this.v = v;
        this.D = d2;
        this.S = s;
        this.ak = ak;
        this.E = e2;
        this.F = f2;
        this.al = al;
        this.A = a;
        this.am = new car(kse, f2);
        this.V = new etp(y);
        at.d(t.k());
        kjk.c(ah.a(ap, z));
        this.X = new fnn(this);
        this.g = new fnp(this, b);
        final ega u2 = t.u();
        this.n = u2;
        final Context f3 = t.f();
        this.aa = f3;
        try {
            hny.a = new etu(a, hwz, hgy, hhw, t.i(), hif);
            this.T = hny.a;
            this.D(false);
            y.l();
            final MainActivityLayout f4 = ((bsa)t.g()).f;
            this.o = f4;
            LayoutInflater.from(f3).inflate(2131624092, (ViewGroup)f4.findViewById(2131427776), true);
            t.r(ao, false);
            this.z = gkn.a(u2.a());
            (this.ag = (PhotoSphereMessageOverlay)this.o.findViewById(2131427854)).b(this.z);
            this.ac = this.o.findViewById(2131427608);
            this.ad = new etw();
            this.z = gkn.a(u2.a());
            this.ae = (DisplayManager$DisplayListener)new fnq(this);
            if (ab.k(cxr.bi)) {
                kjk.c(ai.a(new fnm(this), odx.a));
            }
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Cannot instantiate PanoramaModule.", ex);
        }
    }
    
    private final void H() {
        this.J(true);
    }
    
    private final void I() {
        final ess s = this.s;
        if (s != null) {
            s.f();
        }
        this.V.d();
        final ofn f = ofn.f();
        final Handler h = this.H;
        if (h != null) {
            h.post((Runnable)new fny(this, f));
        }
        try {
            f.get(500L, TimeUnit.MILLISECONDS);
            return;
        }
        catch (final TimeoutException ex) {}
        catch (final ExecutionException ex2) {}
        catch (final InterruptedException ex3) {}
        a.l(fol.b.b(), "Fail to wait freeGLMemory to finish", '\u06bd');
    }
    
    private final void J(final boolean b) {
        this.q = 0;
        if (b) {
            this.ax.run();
        }
        else {
            this.aw.run();
        }
        this.C.postDelayed((Runnable)new fnt(this, 1), 1400L);
        this.l = false;
        final klj ah = this.ah;
        if (ah != null) {
            this.B((String)((kkz)ah).d);
        }
    }
    
    private final void K() {
        this.p = false;
        final gxa d = this.d;
        Object o = d.b;
        synchronized (o) {
            final krr a = d.a;
            final int size = d.c.size();
            final StringBuilder sb = new StringBuilder(42);
            sb.append("Resume processing. Queue size: ");
            sb.append(size);
            a.b(sb.toString());
            if (d.e) {
                d.e = false;
                if (!d.c.isEmpty()) {
                    d.b();
                }
            }
            monitorexit(o);
            o = this.s;
            if (o != null) {
                ((ess)o).f();
            }
            this.q = 0;
            this.J(this.k = false);
            this.u.h();
            if (this.t.g() != null) {
                this.u();
            }
        }
    }
    
    public final void A() {
        this.l = true;
        this.B.b();
    }
    
    public final void B(final String s) {
        if (super.a && !this.l) {
            if (s.equals(this.aa.getString(2131952371))) {
                if (this.Q != 2) {
                    this.Q = 2;
                    final ess s2 = this.s;
                    if (s2 != null) {
                        s2.h(2);
                    }
                    final esv r = this.r;
                    if (r != null) {
                        r.f(this.Q);
                    }
                }
            }
            else if (s.equals(this.aa.getString(2131952373))) {
                if (this.Q != 3) {
                    this.Q = 3;
                    final ess s3 = this.s;
                    if (s3 != null) {
                        s3.h(3);
                    }
                    final esv r2 = this.r;
                    if (r2 != null) {
                        r2.f(this.Q);
                    }
                }
            }
            else if (s.equals(this.aa.getString(2131952374))) {
                if (this.Q != 4) {
                    this.Q = 4;
                    final ess s4 = this.s;
                    if (s4 != null) {
                        s4.h(4);
                    }
                    final esv r3 = this.r;
                    if (r3 != null) {
                        r3.f(this.Q);
                    }
                }
            }
            else if (s.equals(this.aa.getString(2131952370))) {
                if (this.Q != 5) {
                    this.Q = 5;
                    final ess s5 = this.s;
                    if (s5 != null) {
                        s5.h(5);
                    }
                    final esv r4 = this.r;
                    if (r4 != null) {
                        r4.f(this.Q);
                    }
                }
            }
            else if (s.equals(this.aa.getString(2131952372)) && this.Q != 1) {
                this.Q = 1;
                final ess s6 = this.s;
                if (s6 != null) {
                    s6.h(1);
                }
                final esv r5 = this.r;
                if (r5 != null) {
                    r5.f(this.Q);
                }
            }
            final LocalSessionStorage m = this.m;
            if (m != null) {
                m.j = this.Q;
            }
        }
    }
    
    public final void C() {
        synchronized (this) {
            if (super.a) {
                this.K();
                this.F();
            }
        }
    }
    
    public final void D(final boolean j) {
        this.t.g().k(j);
        this.j = j;
    }
    
    public final void E() {
        this.K();
        this.Y.i();
        final ess s = this.s;
        if (s != null) {
            s.A.quitSafely();
            this.s = null;
        }
        final dsm i = this.I;
        if (i != null) {
            i.i.post((Runnable)new dsi(i));
            this.I = null;
        }
        final LocalSessionStorage m = this.m;
        if (m != null && m.e != null) {
            synchronized (this.F) {
                this.F.remove(this.m.e);
            }
        }
    }
    
    public final void F() {
        if (this.i == null) {
            a.l(fol.b.c(), "startCapture: camera device not open yet.", '\u06c0');
            return;
        }
        if (this.k) {
            this.K();
        }
        this.q = 0;
        this.u.h();
        this.N = 0;
        try {
            final etu t = this.T;
            final long currentTimeMillis = System.currentTimeMillis();
            final hie a = t.f.a(currentTimeMillis, drk.c, "PHOTOSPHERE");
            final String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(currentTimeMillis));
            final File d = t.d;
            final String value = String.valueOf(format);
            String concat;
            if (value.length() != 0) {
                concat = "session_".concat(value);
            }
            else {
                concat = new String("session_");
            }
            final File file = new File(d, concat);
            file.mkdirs();
            try {
                if (file.isDirectory()) {
                    final String[] list = file.list();
                    for (int i = 0; i < list.length; ++i) {
                        new File(file, list[i]).delete();
                    }
                }
            }
            catch (final Exception ex) {
                a.l(etu.a.b(), "Could not delete temporary images.", '\u0586');
            }
            final LocalSessionStorage m = new LocalSessionStorage();
            m.a = format;
            m.c = t.c.getAbsolutePath();
            m.d = t.d.getAbsolutePath();
            m.e = file.getAbsolutePath();
            final String value2 = String.valueOf(format);
            String concat2;
            if (value2.length() != 0) {
                concat2 = "session_".concat(value2);
            }
            else {
                concat2 = new String("session_");
            }
            m.f = Paths.get("panorama_sessions", concat2).toString();
            final String b = t.h.b(currentTimeMillis);
            final hij hij = new hij(t.i, m.f, b);
            if (hij.c()) {
                final hgy g = t.g;
                final btl c = t.e.c();
                final Object value3 = g.a.get();
                final gxa gxa = (gxa)g.c.get();
                gxa.getClass();
                b.getClass();
                m.b = new hgx((hfk)value3, gxa, hij, b, c, a);
                final String j = llk.c.j;
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(j).length());
                sb.append(b);
                sb.append(".");
                sb.append(j);
                final String string = sb.toString();
                if (t.a() == null) {
                    a.l(etu.a.b(), "Could not get the thumbnail directory.", '\u0587');
                    m.g = "";
                }
                else {
                    m.g = new File(t.a(), string).getAbsolutePath();
                }
                m.i = new File(file, "orientations.txt").getAbsolutePath();
                m.h = new File(file, "session.meta").getAbsolutePath();
                this.m = m;
                Object o = this.F;
                synchronized (o) {
                    this.F.add(this.m.e);
                    monitorexit(o);
                    this.am.a(this.m.d);
                    final car am = this.am;
                    o = String.valueOf(this.m.c);
                    final String value4 = String.valueOf(this.m.d);
                    if (value4.length() != 0) {
                        o = ((String)o).concat(value4);
                    }
                    else {
                        o = new String((String)o);
                    }
                    am.a((String)o);
                    final LocalSessionStorage k = this.m;
                    final String h = k.h;
                    final String l = k.i;
                    o = k.e;
                    final String a2 = k.a;
                    final String g2 = k.g;
                    String.valueOf(h).length();
                    String.valueOf(l).length();
                    String.valueOf(o).length();
                    String.valueOf(a2).length();
                    String.valueOf(g2).length();
                    this.m.j = this.Q;
                    this.h = new esg();
                    o = new esv(this.aa, this.af, this.ag, this.t.j());
                    (this.r = (esv)o).f(this.Q);
                    final etp v = this.V;
                    final Context aa = this.aa;
                    if (!v.n) {
                        v.n = true;
                        o = v.a;
                        v.k = (float)((bqu)o).f(((bqu)o).e()).a();
                        v.b = (SensorManager)aa.getSystemService("sensor");
                        (v.o = new etn(v)).start();
                        v.d = false;
                        v.b();
                        v.j.e();
                    }
                    o = new ess(this.aa, this.ab, this.i, this.V, this.m, this.h, this.r, this.t.i(), this.n);
                    this.s = (ess)o;
                    ((ess)o).C = this.aq;
                    ((ess)o).u = this.I;
                    ((ess)o).x = this.ar;
                    ((ess)o).y = this.as;
                    o = this.t.t();
                    final WindowManager$LayoutParams attributes = ((Window)o).getAttributes();
                    attributes.systemUiVisibility = 1;
                    ((Window)o).setAttributes(attributes);
                    final aua a3 = this.i.a(this.n.a(), this.ab, this.s.J, true);
                    this.s.g();
                    o = this.s;
                    final int b2 = a3.b();
                    final int a4 = a3.a();
                    o = ((ess)o).b;
                    ((esv)o).A = b2;
                    ((esv)o).B = a4;
                    final ess s = this.s;
                    int q = this.Q;
                    if (s.c == null) {
                        a.l(fol.b.c(), "Can't setup LightCycleController for startPreview.", '\u06be');
                        return;
                    }
                    if (s.b() <= 0.0f) {
                        q = 6;
                    }
                    o = s.c.b.e();
                    if (q != 1 && q != 6 && q != 5) {
                        o = eru.a((atl)o);
                    }
                    else {
                        o = eru.a((atl)o);
                    }
                    ((ert)o).b.b();
                    s.b.f(q);
                    s.h(q);
                    try {
                        o = s.p.getPackageManager().getPackageInfo(s.p.getPackageName(), 0);
                    }
                    catch (PackageManager$NameNotFoundException o) {
                        o = null;
                    }
                    if (o != null) {
                        o = ((PackageInfo)o).versionName;
                        final String value5 = String.valueOf(o);
                        if (value5.length() != 0) {
                            "Setting version to ".concat(value5);
                        }
                        else {
                            new String("Setting version to ");
                        }
                        esh.l((String)o);
                    }
                    s.e();
                    o = new fnr(this);
                    this.i.b.r(this.C, (asy)o);
                    return;
                }
            }
            throw new IOException("Cannot create temporary session file.");
        }
        catch (final IOException ex2) {
            a.m(fol.b.b(), "Cannot start capture, local session storage not ready.", '\u06bf', ex2);
        }
    }
    
    public final void G() {
        final Handler h = this.H;
        if (h != null) {
            h.sendEmptyMessage(3);
        }
    }
    
    @Override
    public final niz b() {
        return niz.i(new ixt(Bitmap.createBitmap(1, 1, Bitmap$Config.ALPHA_8), 1, nii.a, false));
    }
    
    public final void bs() {
    }
    
    public final void bt() {
        knf.f(this.ay.a(), new fnl(this), this.Z);
    }
    
    @Override
    public final void bu(final asx asx) {
        this.i = new ers(asx, this.C);
        Label_0206: {
            if (fol.U) {
                break Label_0206;
            }
            final atl e = asx.e();
            new aua(0, 0);
            final ert a = eru.a(e);
            final aua aua = new aua(a.a.b(), a.a.a());
            float a2;
            if (asx == null) {
                a2 = 0.0f;
            }
            else {
                final ert a3 = eru.a(asx.e());
                final atu f = asx.f();
                f.k(new aua(a3.b.b(), a3.b.a()));
                f.l(new aua(a3.a.b(), a3.a.a()));
                asx.o(f);
                a2 = ese.a(asx.e().u);
            }
            final int b = aua.b();
            final int a4 = aua.a();
            Object a5 = esh.a;
            synchronized (a5) {
                LightCycleNative.Init(b, a4, a2, esh.d);
                esh.b = false;
                monitorexit(a5);
                fol.U = true;
                if (this.I == null) {
                    a5 = this.t.g();
                    final SurfaceTexture t = ((bsa)a5).t;
                    if (t != null) {
                        asx.p();
                        this.ao.onSurfaceTextureAvailable(t, ((bsa)a5).u, ((bsa)a5).v);
                    }
                    return;
                }
                this.F();
            }
        }
    }
    
    @Override
    public final String c() {
        final int q = this.Q;
        if (q != 0) {
            int n = 0;
            switch (q - 1) {
                default: {
                    n = 2131952223;
                    break;
                }
                case 4: {
                    n = 2131952006;
                    break;
                }
                case 3: {
                    n = 2131952825;
                    break;
                }
                case 2: {
                    n = 2131952770;
                    break;
                }
                case 1: {
                    n = 2131952104;
                    break;
                }
                case 0: {
                    n = 2131952410;
                    break;
                }
            }
            return this.t.f().getResources().getString(n);
        }
        throw null;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void e(final Configuration configuration) {
        final int a = gkn.a(this.n.a());
        this.z = a;
        this.ag.b(a);
        this.u();
    }
    
    @Override
    public final void f(final int p) {
        this.P = p;
        final esv r = this.r;
        if (r == null) {
            return;
        }
        final boolean b = false;
        boolean t = false;
        Label_0053: {
            if (!(r.s = (p == 2))) {
                t = b;
                if (p != 1) {
                    break Label_0053;
                }
            }
            t = true;
        }
        r.t = t;
    }
    
    public final void m() {
        this.al.aR(true);
        (this.aj = new kjk()).c(this.W.d(this.g));
        this.aj.c(this.B.d.a(new foe(this, 1), odx.a));
        this.f.addListener(this.X);
        this.t.r(this.ao, false);
        this.Y.l();
        this.w();
        final String model = Build.MODEL;
        final String manufacturer = Build.MANUFACTURER;
        final StringBuilder sb = new StringBuilder(String.valueOf(model).length() + 3 + String.valueOf(manufacturer).length());
        sb.append(model);
        sb.append(" (");
        sb.append(manufacturer);
        sb.append(")");
        final String value = String.valueOf(sb.toString());
        if (value.length() != 0) {
            "Model is: ".concat(value);
        }
        else {
            new String("Model is: ");
        }
        if (this.Y.e() == -1) {
            this.bv();
            this.p();
            final ndv ndv = new ndv(this.t.s());
            ndv.j(2131952420);
            ndv.i(false);
            ndv.h(2131952355, (DialogInterface$OnClickListener)new fob(this));
            ndv.b().show();
            return;
        }
        Process.setThreadPriority(-19);
        final hwy a = hxk.a();
        final etu t = this.T;
        t.b = new File(a.b());
        if (!t.b.exists() && !t.b.mkdirs()) {
            a.l(etu.a.b(), "Panorama directory not created.", '\u058b');
        }
        ((DisplayManager)this.t.f().getSystemService("display")).registerDisplayListener(this.ae, (Handler)null);
        this.af = new etb();
        this.au.a(this.av);
    }
    
    public final void o() {
        this.aj.close();
        this.f.removeListener(this.X);
        this.H();
        ((DisplayManager)this.t.f().getSystemService("display")).unregisterDisplayListener(this.ae);
        this.E();
        final HandlerThread an = this.an;
        if (an != null) {
            an.quitSafely();
            this.an = null;
            this.H = null;
        }
        this.V.d();
        final esg h = this.h;
        if (h != null && !h.isInterrupted()) {
            this.h.interrupt();
        }
        this.C.post((Runnable)new fnt(this, 5));
        this.i = null;
        this.au.b(this.av);
    }
    
    @Override
    public final boolean q() {
        if (this.l) {
            this.y();
            return true;
        }
        this.B.by();
        return false;
    }
    
    @Override
    public final boolean t() {
        return false;
    }
    
    public final void u() {
        final int q = this.q;
        this.t.g().b();
        if (q != 0) {
            this.ak.a(fol.class);
            return;
        }
        this.ak.b(fol.class);
    }
    
    public final void v() {
        this.D(false);
        this.I();
        if (!this.h.isInterrupted() && this.h.isAlive()) {
            this.h.a(new fnx(this, 1));
        }
        else {
            this.C.sendEmptyMessage(105);
        }
        this.H();
        this.u();
        synchronized (this.F) {
            this.F.remove(this.m.e);
        }
    }
    
    public final void w() {
        synchronized (this) {
            if (this.an == null) {
                (this.an = new HandlerThread("PhotoSphereGLThread")).start();
                this.H = new fok(this, this.an.getLooper());
            }
        }
    }
    
    public final void x() {
        final esv r = this.r;
        if (r != null && r.q) {
            a.l(fol.b.c(), "Not finishing capture since photo taking is in progress.", '\u06b8');
            return;
        }
        this.e.b(2131886099);
        this.u();
        this.D(false);
        esh.n();
        final etw ad = this.ad;
        final View ac = this.ac;
        final ObjectAnimator a = ad.a;
        if (a != null && a.isRunning()) {
            ad.a.cancel();
        }
        (ad.a = ObjectAnimator.ofFloat((Object)ac, "alpha", new float[] { 0.3f, 0.0f })).setDuration(300L);
        ad.a.addListener((Animator$AnimatorListener)new etv(ad, ac));
        ad.a.start();
        (this.w = new fnw(this)).start();
        this.I();
        this.h.a(new fnx(this));
    }
    
    public final void y() {
        this.C.post((Runnable)new fnt(this));
    }
    
    public final void z() {
        if (!this.j) {
            return;
        }
        if (this.Q != 5) {
            this.x();
            return;
        }
        if (esh.d() < esh.e()) {
            this.C.post((Runnable)new fnt(this, 2));
            return;
        }
        this.x();
    }
}
