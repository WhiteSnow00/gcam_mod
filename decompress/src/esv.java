import android.os.Handler;
import javax.microedition.khronos.egl.EGLConfig;
import java.util.Iterator;
import android.graphics.Bitmap;
import android.widget.TextView;
import java.nio.Buffer;
import android.os.SystemClock;
import java.util.Map;
import android.graphics.PointF;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.opengl.Matrix;
import android.opengl.GLES20;
import javax.microedition.khronos.opengles.GL10;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import java.util.HashMap;
import android.content.Context;
import java.util.Vector;
import java.util.ArrayList;
import android.opengl.GLSurfaceView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esv implements GLSurfaceView$Renderer
{
    public int A;
    public int B;
    public byte[] C;
    public boolean D;
    public etp E;
    public ess F;
    public int G;
    public esa H;
    public esa I;
    private final etb J;
    private final float[] K;
    private final float[] L;
    private final float[] M;
    private final float[] N;
    private final float[] O;
    private final float[] P;
    private final float[] Q;
    private final float[] R;
    private float[] S;
    private float T;
    private float U;
    private float V;
    private int W;
    private int X;
    private boolean Y;
    private int Z;
    public erx a;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private int af;
    private boolean ag;
    private final ArrayList ah;
    private final gkw ai;
    private boolean aj;
    private etj ak;
    private etj al;
    private boolean am;
    private long an;
    private boolean ao;
    private double ap;
    private double aq;
    private final Vector ar;
    private final Context as;
    private int at;
    private float au;
    private final HashMap av;
    private final esf aw;
    public final esy b;
    public eta c;
    public final ete d;
    public final PhotoSphereMessageOverlay e;
    public erw f;
    public erw g;
    public etc h;
    public ets i;
    public esb j;
    public etq k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public etf y;
    public boolean z;
    
    public esv(final Context as, final etb j, final PhotoSphereMessageOverlay e, final gkw ai) {
        this.b = new esy();
        this.K = new float[16];
        this.L = new float[16];
        this.M = new float[16];
        this.N = new float[16];
        this.O = new float[16];
        this.P = new float[16];
        this.Q = new float[16];
        this.R = new float[16];
        this.S = new float[16];
        this.T = 60.0f;
        this.U = 100.0f;
        this.V = 100.0f;
        this.W = 120;
        this.X = 80;
        this.l = false;
        this.m = false;
        this.Y = false;
        this.n = true;
        this.ae = false;
        this.af = 0;
        this.ag = false;
        this.q = false;
        this.ah = new ArrayList();
        this.r = false;
        this.s = false;
        this.t = false;
        this.G = 1;
        this.u = false;
        this.aj = false;
        this.v = false;
        this.w = false;
        this.x = 2131952103;
        this.aw = new esf();
        this.am = false;
        this.an = 0L;
        this.ao = false;
        this.y = null;
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.ap = 0.0;
        this.aq = 0.0;
        this.ar = new Vector();
        this.at = 0;
        this.au = -1.0f;
        this.av = new HashMap();
        this.as = as;
        this.J = j;
        this.e = e;
        this.ai = ai;
        this.d = new ete(as);
    }
    
    private final float g(final float n) {
        final int ab = this.ab;
        float n2 = n;
        if (ab < this.ac) {
            final double tan = Math.tan(Math.toRadians(n) / 2.0);
            final double n3 = ab;
            Double.isNaN(n3);
            final double n4 = n3 / (tan + tan);
            final double n5 = this.ac;
            Double.isNaN(n5);
            final double atan = Math.atan(n5 / (n4 + n4));
            n2 = (float)Math.toDegrees(atan + atan);
        }
        return n2;
    }
    
    private final void h(final boolean b) {
        synchronized (this) {
            Object o = this.h;
            if (o != null) {
                if (this.m) {
                    final etf y = this.y;
                    final byte[] c = this.C;
                    final int a = this.A;
                    final int b2 = this.B;
                    final boolean b3 = ((etc)o).h && this.F.t;
                    Label_0148: {
                        if (c == null) {
                            break Label_0148;
                        }
                        o = esh.a;
                        synchronized (o) {
                            if (!esh.b) {
                                throw new IllegalStateException("State is not ready.");
                            }
                            final float[] processFrame = LightCycleNative.ProcessFrame(c, a, b2, b3);
                            monitorexit(o);
                            y.c = processFrame;
                            y.a = (y.c[0] != -1.0f);
                            y.b = esh.u();
                            ++this.at;
                            if (b) {
                                return;
                            }
                            final boolean a2 = this.y.a;
                            this.ad = a2;
                            this.ag = esh.s();
                            o = this.y;
                            if (((etf)o).b && a2 && !this.t) {
                                final float[] c2 = ((etf)o).c;
                                final int b4 = this.c.b(c2);
                                o = esh.a;
                                synchronized (o) {
                                    if (!esh.b) {
                                        throw new IllegalStateException("State is not ready.");
                                    }
                                    final String addImage = LightCycleNative.AddImage(c2);
                                    monitorexit(o);
                                    final int n = this.c.e() - 1;
                                    o = this.F;
                                    if (!((ess)o).s && ((ess)o).t) {
                                        ((ess)o).F.add(addImage);
                                        ((ess)o).s = true;
                                        new esk((ess)o).execute((Object[])new Void[0]);
                                        ((ess)o).E.add(c2);
                                        final Vector m = ((ess)o).m;
                                        m.setSize(Math.max(n + 1, m.size()));
                                        ((ess)o).m.set(n, b4);
                                    }
                                    this.c.f(n, false);
                                    this.ah.add(n);
                                    this.q = true;
                                    this.i();
                                    this.n = false;
                                    this.e.a();
                                    this.ao = false;
                                    this.am = false;
                                }
                            }
                            if (this.r) {
                                if (this.ah.size() > 0) {
                                    final int intValue = this.ah.get(0);
                                    this.ah.remove(0);
                                    this.c.f(intValue, true);
                                }
                                this.d.a();
                                this.e.d(this.w, this.F.n);
                                this.r = false;
                            }
                            if (!this.h.h) {
                                final boolean v = esh.v();
                                int c3;
                                final int n2 = c3 = esh.c();
                                Label_0703: {
                                    if (!this.v) {
                                        c3 = n2;
                                        if (!this.h.g) {
                                            c3 = n2;
                                            if (v && (c3 = n2) == 0) {
                                                o = this.F;
                                                if (((ess)o).t) {
                                                    this.v = true;
                                                    o = ((ess)o).c;
                                                    final est est = new est(this);
                                                    if (((ers)o).d) {
                                                        final atu f = ((ers)o).b.f();
                                                        f.s = ath.a;
                                                        ((ers)o).b.o(f);
                                                        ((ers)o).b.j(((ers)o).a, est);
                                                        break Label_0703;
                                                    }
                                                    est.a(true, null);
                                                    break Label_0703;
                                                }
                                                else {
                                                    c3 = 0;
                                                }
                                            }
                                        }
                                    }
                                    o = this.h;
                                    if (((etc)o).g && (!v || this.ag || c3 != 0)) {
                                        ((etc)o).a();
                                    }
                                }
                                if (this.t) {
                                    this.h.a();
                                }
                            }
                            this.z = false;
                        }
                    }
                }
            }
        }
    }
    
    private final void i() {
        this.c.e();
        this.c.e();
    }
    
    private static final int j(final int n, final int n2) {
        return n * 31 + n2;
    }
    
    private static final etj k(final int n) {
        if (n == 2) {
            return new etl(true);
        }
        if (n == 3) {
            return new etl(false);
        }
        if (n == 1) {
            return new etk();
        }
        if (n == 5) {
            return new eti();
        }
        if (n == 4) {
            return new etm();
        }
        return null;
    }
    
    private static final float l(final float n, final float n2) {
        final double n3 = n2;
        final double n4 = n;
        Double.isNaN(n4);
        final double tan = Math.tan(n4 * 0.5 / 180.0 * 3.141592653589793);
        Double.isNaN(n3);
        return (float)(Math.atan(n3 * tan) * 114.59155902616465);
    }
    
    public final void a(final float n) {
        this.e(n);
        this.T = this.U;
        this.l = false;
    }
    
    public final void b() {
        this.a(this.U / this.T);
    }
    
    public final void c() {
        this.q = false;
    }
    
    public final void d() {
        monitorenter(this);
        try {
            final int e = this.c.e();
            final eta c = this.c;
            Object o = c.g;
            synchronized (o) {
                if (c.g.size() > 0) {
                    final Vector g = c.g;
                    g.removeElementAt(g.size() - 1);
                }
                monitorexit(o);
                while (this.ar.size() > e) {
                    o = this.ar;
                    ((Vector)o).removeElementAt(((Vector)o).size() - 1);
                }
                if (this.ar.size() == e) {
                    final double ap = this.ap - this.ar.lastElement();
                    this.ap = ap;
                    this.aq = ap / 45.0;
                    o = this.ar;
                    ((Vector)o).removeElementAt(((Vector)o).size() - 1);
                }
                this.i();
                o = new esu(this);
                ((Thread)o).start();
                try {
                    ((Thread)o).join();
                }
                catch (final InterruptedException o) {
                    ((InterruptedException)o).printStackTrace();
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e(float u) {
        u = this.T / u;
        this.U = u;
        u = Math.min(u, (float)this.W);
        this.U = u;
        u = Math.max(u, (float)this.X);
        this.U = u;
        this.V = this.g(u);
    }
    
    public final void f(final int g) {
        final int g2 = this.G;
        this.G = g;
        this.w = false;
        this.x = 2131952103;
        if (g != 0) {
            switch (g - 1) {
                case 5: {
                    this.e.d(false, this.F.n);
                    this.w = true;
                    break;
                }
                case 4: {
                    this.e.a();
                    this.d.e(4);
                    this.aj = true;
                    this.aw.b();
                    break;
                }
                case 3: {
                    this.x = 2131952703;
                    this.e.a();
                    this.d.e(3);
                    this.aj = true;
                    this.aw.b();
                    break;
                }
                case 2: {
                    this.x = 2131952703;
                    this.e.a();
                    this.d.e(2);
                    this.aj = true;
                    this.aw.b();
                    break;
                }
                case 1: {
                    this.x = 2131952703;
                    this.e.a();
                    this.d.e(1);
                    this.aj = true;
                    this.aw.b();
                    break;
                }
                case 0: {
                    this.d.e(0);
                    break;
                }
            }
            this.ak = k(g2);
            this.al = k(g);
            return;
        }
        throw null;
    }
    
    public final void onDrawFrame(GL10 d) {
        if (!this.m || this.s) {
            return;
        }
        if (this.ab != 0) {
            GLES20.glClear(16384);
            if (this.m) {
                if (!this.s) {
                    Object x = esh.a;
                    synchronized (x) {
                        final boolean booleanValue = esh.b;
                        monitorexit(x);
                        if (booleanValue) {
                            if (!this.ae) {
                                ery.b();
                                final int b = ery.b();
                                esh.i(b, this.A, this.B);
                                x = this.b;
                                ((esy)x).d.clear();
                                final ery ery = new ery();
                                ((esy)x).k.add(ery);
                                ((esy)x).d.add(0, ery);
                                ((esy)x).d.get(0).a = b;
                                this.ae = true;
                                esh.i(this.p = ery.a(), this.A, this.B);
                                esh.i(this.o = ery.a(), this.A, this.B);
                            }
                            if (!this.q && this.z) {
                                if (this.G == 1 && !this.u) {
                                    this.h(true);
                                }
                                else {
                                    this.h(false);
                                }
                            }
                            if (this.n) {
                                this.E.c(0.0);
                            }
                            else {
                                final double ap = this.ap;
                                if (ap != 0.0) {
                                    final double abs = Math.abs(ap);
                                    final double abs2 = Math.abs(this.aq);
                                    if (abs < abs2 + abs2) {
                                        final etp e = this.E;
                                        e.c(e.a() + this.ap);
                                        this.ap = 0.0;
                                    }
                                    else {
                                        final etp e2 = this.E;
                                        e2.c(e2.a() + this.aq);
                                        this.ap -= this.aq;
                                    }
                                }
                            }
                            esh.m(this.S = this.E.f());
                            if (this.D) {
                                esh.q(this.p);
                            }
                            Label_3782: {
                                if (this.af > 0) {
                                    final int p = this.p;
                                    GLES20.glEnable(3042);
                                    GLES20.glBlendFunc(770, 771);
                                    final float n = this.ab / (float)this.ac;
                                    float v = this.V;
                                    final double a = this.aw.a();
                                    if (this.G != 1) {
                                        if (this.aj) {
                                            final double n2 = this.V;
                                            Double.isNaN(n2);
                                            v = (float)(n2 + a * 18.0);
                                        }
                                        else {
                                            final double n3 = this.V;
                                            Double.isNaN(n3);
                                            v = (float)(n3 + (1.0 - a) * 18.0);
                                        }
                                    }
                                    final double n4 = v;
                                    Double.isNaN(n4);
                                    final float n5 = (float)Math.tan(n4 / 360.0 * 3.141592653589793) * 0.1f;
                                    final float n6 = n5 * n;
                                    Matrix.frustumM(this.M, 0, -n6, n6, -n5, n5, 0.1f, 200.0f);
                                    Matrix.setIdentityM(this.N, 0);
                                    Matrix.rotateM(this.N, 0, this.ai.f().a() - this.E.k, 0.0f, 0.0f, 1.0f);
                                    Matrix.multiplyMM(this.K, 0, this.M, 0, this.N, 0);
                                    if (!this.Y) {
                                        Matrix.orthoM(this.P, 0, 0.0f, (float)this.ab, 0.0f, (float)this.ac, -50.0f, 50.0f);
                                        final Integer value = j(this.ab, this.ac);
                                        x = this.av.get(value);
                                        if (x != null) {
                                            this.h = (etc)x;
                                        }
                                        else {
                                            x = new etc(this.as, this.E, this.ab, this.ac);
                                            this.h = (etc)x;
                                            this.av.put(value, x);
                                            this.av.put(j(this.ac, this.ab), new etc(this.as, this.E, this.ac, this.ab));
                                        }
                                        d = (GL10)this.d;
                                        final int ab = this.ab;
                                        final int ac = this.ac;
                                        x = this.h;
                                        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                                        bitmapFactory$Options.inScaled = false;
                                        final Bitmap decodeResource = BitmapFactory.decodeResource(((ete)d).c.getResources(), 2131231425, bitmapFactory$Options);
                                        if (decodeResource != null) {
                                            decodeResource.recycle();
                                        }
                                        (((ete)d).e = new esc()).g(((ete)d).c, 2131231425, -1.0f);
                                        (((ete)d).f = new esc()).g(((ete)d).c, 2131231424, -1.0f);
                                        try {
                                            ((ete)d).g = new etr();
                                            ((ete)d).h = new etq();
                                        }
                                        catch (final erz erz) {
                                            erz.printStackTrace();
                                        }
                                        final esc e3 = ((ete)d).e;
                                        final etr g = ((ete)d).g;
                                        e3.e = g;
                                        ((ete)d).f.e = g;
                                        ((ete)d).m = ab / 2.0f;
                                        ((ete)d).n = ac / 2.0f;
                                        Matrix.setIdentityM(((ete)d).w, 0);
                                        ((ete)d).x = (etc)x;
                                        this.d.q = this.E;
                                        final Context as = this.as;
                                        x = new BitmapFactory$Options();
                                        ((BitmapFactory$Options)x).inScaled = false;
                                        ((BitmapFactory$Options)x).inJustDecodeBounds = true;
                                        BitmapFactory.decodeResource(as.getResources(), 2131231150, (BitmapFactory$Options)x);
                                        final int n7 = (int)(new aua(((BitmapFactory$Options)x).outWidth, ((BitmapFactory$Options)x).outHeight).a() * 0.85f);
                                        final int n8 = this.ac / 2;
                                        final float n9 = (float)(this.ab / 2);
                                        final PointF pointF = new PointF(n9, (float)(n8 + n7));
                                        x = new PointF(n9, (float)(n8 - n7));
                                        this.f = new erw();
                                        this.g = new erw();
                                        this.f.g(this.as, 2131231423, -1.0f);
                                        this.g.g(this.as, 2131231422, -1.0f);
                                        this.f.b(pointF);
                                        this.g.b((PointF)x);
                                        try {
                                            this.k = new etq();
                                        }
                                        catch (final erz erz2) {
                                            erz2.printStackTrace();
                                        }
                                        x = this.f;
                                        final etq k = this.k;
                                        ((erx)x).e = k;
                                        this.g.e = k;
                                        this.Y = true;
                                    }
                                    final esy b2 = this.b;
                                    b2.l = true;
                                    if (this.D) {
                                        b2.m = true;
                                    }
                                    else {
                                        b2.m = false;
                                    }
                                    final boolean l = this.at > 3;
                                    if (!(this.D = (this.c.e() == 0 && l))) {
                                        this.b.m = false;
                                    }
                                    final esy b3 = this.b;
                                    b3.l = l;
                                    b3.e(p);
                                    final etb j = this.J;
                                    final boolean a2 = this.c.e() > 0 && !this.F.B.b;
                                    if (a2 != j.a) {
                                        j.a = a2;
                                    }
                                    GLES20.glViewport(0, 0, this.Z, this.aa);
                                    GLES20.glClear(256);
                                    GLES20.glEnable(2929);
                                    try {
                                        Matrix.multiplyMM(this.O, 0, this.N, 0, this.S, 0);
                                        Matrix.multiplyMM(this.K, 0, this.M, 0, this.O, 0);
                                        GLES20.glLineWidth(2.0f);
                                        this.a.c(this.K);
                                        GLES20.glDisable(2929);
                                        GLES20.glEnable(3042);
                                        this.c.a(this.K);
                                        Matrix.setIdentityM(this.N, 0);
                                        Matrix.rotateM(this.N, 0, this.ai.f().a() - this.E.k, 0.0f, 0.0f, 1.0f);
                                        Matrix.rotateM(this.N, 0, 180.0f, 1.0f, 0.0f, 0.0f);
                                        Matrix.multiplyMM(this.L, 0, this.M, 0, this.N, 0);
                                        this.j.j(err.c);
                                        if ((!this.l && this.ad) || this.n) {
                                            this.i.c();
                                            this.i.j(1.0f);
                                            this.b.a(this.L);
                                        }
                                        final ete d2 = this.d;
                                        d2.l = this.S;
                                        x = this.K;
                                        final float[] p2 = this.P;
                                        final int f = esh.f();
                                        if (f >= 0) {
                                            final float o = d2.o;
                                            d2.o = o + (1.0f - o) * 0.1f;
                                        }
                                        else {
                                            d2.o = 0.0f;
                                        }
                                        final float n10 = (Math.max(Math.min((float)Math.sqrt(d2.q.m), 0.6981317f), 0.17453292f) - 0.17453292f) / 0.5235988f;
                                        Object a3 = esh.a;
                                        synchronized (a3) {
                                            if (!esh.b) {
                                                throw new IllegalStateException("State is not ready.");
                                            }
                                            LightCycleNative.SetTargetHitAngleRadians((n10 * 0.75f + 2.75f) * 0.017453292f);
                                            monitorexit(a3);
                                            final float[] i = d2.l;
                                            a3 = new jdm(-i[2], -i[6], -i[10]);
                                            GLES20.glBlendFunc(1, 771);
                                            d2.g.c();
                                            GLES20.glUniform1f(d2.g.e, 1.0f);
                                            d2.g.j(1.0f);
                                            Label_3171: {
                                                try {
                                                    synchronized (d2.d) {
                                                        for (final Map.Entry<K, float[]> entry : d2.d.entrySet()) {
                                                            final float[] array = entry.getValue();
                                                            Matrix.multiplyMM(d2.k, 0, (float[])x, 0, array, 0);
                                                            Matrix.multiplyMV(d2.j, 0, d2.k, 0, d2.i, 0);
                                                            final etd r = d2.r;
                                                            final jdm jdm = new jdm(-array[8], -array[9], -array[10]);
                                                            final float n11 = (float)Math.acos(jdm.a * ((jdm)a3).a + jdm.b * ((jdm)a3).b + jdm.c * ((jdm)a3).c);
                                                            if (n11 < ete.b) {
                                                                r.a = 1.0f;
                                                                r.b = 1.0f;
                                                            }
                                                            else if (n11 < ete.a) {
                                                                final float n12 = 1.0f - (n11 - ete.b) / (ete.a - ete.b);
                                                                r.a = n12 + 0.0f;
                                                                r.b = n12 * 0.6f + 0.4f;
                                                            }
                                                            else {
                                                                r.a = 0.0f;
                                                                r.b = 0.4f;
                                                            }
                                                            float n13;
                                                            if (!d2.p) {
                                                                n13 = d2.r.a;
                                                            }
                                                            else {
                                                                n13 = 1.0f;
                                                            }
                                                            final float b4 = d2.r.b;
                                                            float n14;
                                                            if (d2.d.size() == 1) {
                                                                n13 = Math.max(0.75f, n13);
                                                                n14 = 1.0f;
                                                            }
                                                            else if (d2.s && !d2.p) {
                                                                final float max = Math.max(d2.u, n13);
                                                                if (d2.t) {
                                                                    final float u = d2.u;
                                                                    final float u2 = u + (1.0f - u) * 0.01f;
                                                                    d2.u = u2;
                                                                    if (u2 > 0.9f) {
                                                                        if (d2.v == 0L) {
                                                                            d2.v = SystemClock.elapsedRealtimeNanos();
                                                                        }
                                                                        else {
                                                                            final double n15 = (double)(SystemClock.elapsedRealtimeNanos() - d2.v);
                                                                            Double.isNaN(n15);
                                                                            if (n15 / 1.0E9 > 0.5) {
                                                                                d2.t = false;
                                                                            }
                                                                            d2.u = 0.9f;
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    d2.u *= 0.985f;
                                                                }
                                                                n13 = max;
                                                                n14 = b4;
                                                                if (d2.u < 0.01f) {
                                                                    d2.u = 0.0f;
                                                                    d2.s = false;
                                                                    n13 = max;
                                                                    n14 = b4;
                                                                }
                                                            }
                                                            else {
                                                                n14 = b4;
                                                            }
                                                            final float[] m = d2.j;
                                                            if (m[3] >= 0.0f) {
                                                                ete.c(m);
                                                                final float[] j2 = d2.j;
                                                                final float n16 = j2[0];
                                                                final float m2 = d2.m;
                                                                final float n17 = n16 * m2 + m2;
                                                                final float n18 = j2[1];
                                                                final float n19 = d2.n;
                                                                final float n20 = n18 * n19 + n19;
                                                                if ((int)entry.getKey() == f) {
                                                                    d2.g.j(n13);
                                                                    d2.f.f(p2, n17, n20, n14);
                                                                    d2.g.j(1.0f - n13);
                                                                    d2.e.f(p2, n17, n20, n14);
                                                                    d2.g.j(1.0f);
                                                                }
                                                                else {
                                                                    d2.g.j(n13);
                                                                    d2.e.f(p2, n17, n20, n14);
                                                                }
                                                            }
                                                        }
                                                        monitorexit(d2.d);
                                                        x = d2.x;
                                                        if (x == null) {
                                                            break Label_3171;
                                                        }
                                                        if (!((etc)x).i) {
                                                            break Label_3171;
                                                        }
                                                        if (((etc)x).g) {
                                                            final double n21 = (double)(SystemClock.elapsedRealtimeNanos() - ((etc)x).c);
                                                            Double.isNaN(n21);
                                                            if ((((etc)x).f = (int)((int)(n21 / 1000000.0) / 400L) + 1) >= ((etc)x).a.size() - 1) {
                                                                ((etc)x).g = false;
                                                                ((etc)x).h = true;
                                                                final double n22 = (double)(SystemClock.elapsedRealtimeNanos() - ((etc)x).c);
                                                                Double.isNaN(n22);
                                                                final int n23 = (int)(n22 / 1000000.0);
                                                                final etp b5 = ((etc)x).b;
                                                                final float[] w = esh.w(b5.e(), b5.i, n23);
                                                                final float n24 = w[0];
                                                                final float n25 = w[1];
                                                                final float n26 = w[2];
                                                                final StringBuilder sb = new StringBuilder(56);
                                                                sb.append("Bias : ");
                                                                sb.append(n24);
                                                                sb.append(", ");
                                                                sb.append(n25);
                                                                sb.append(", ");
                                                                sb.append(n26);
                                                                sb.toString();
                                                                ((etc)x).f = ((etc)x).a.size() - 1;
                                                            }
                                                        }
                                                        GLES20.glEnable(3042);
                                                        ((etc)x).d.c();
                                                        if (!((etc)x).g) {
                                                            GLES20.glBlendFunc(770, 771);
                                                            ((etc)x).d.j(0.5f);
                                                        }
                                                        else {
                                                            GLES20.glBlendFunc(1, 771);
                                                            ((etc)x).d.j(1.2f);
                                                        }
                                                        final esc esc = ((etc)x).a.get(((etc)x).f);
                                                        final float n27 = (float)((etc)x).e.x;
                                                        final float n28 = (float)((etc)x).e.y;
                                                        if (!esc.l) {
                                                            a.l(esc.f.b(), "Sprite not initialized.", '\u0572');
                                                            break Label_3171;
                                                        }
                                                        x = esc.e;
                                                        if (x == null) {
                                                            break Label_3171;
                                                        }
                                                        ((esa)x).c();
                                                        esc.a.position(0);
                                                        esc.b.position(0);
                                                        esc.e.g(esc.a);
                                                        esc.e.e(esc.b);
                                                        Matrix.translateM(esc.j, 0, p2, 0, n27 + esc.h, n28 + esc.i, 0.0f);
                                                        Matrix.rotateM(esc.j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                                                        esc.e.f(esc.j);
                                                        if (esc.d.size() != 0) {
                                                            x = esc.d.get(0);
                                                            final esa e4 = esc.e;
                                                            ((ery)x).d();
                                                            esc.c.position(0);
                                                            GLES20.glDrawElements(4, esc.k, 5123, (Buffer)esc.c);
                                                        }
                                                    }
                                                }
                                                catch (final erz erz3) {
                                                    erz3.printStackTrace();
                                                }
                                            }
                                            GLES20.glBlendFunc(770, 771);
                                            if (this.G != 1) {
                                                if (!this.u) {
                                                    final double a4 = this.aw.a();
                                                    Matrix.multiplyMM(this.L, 0, this.M, 0, this.N, 0);
                                                    if (this.aj) {
                                                        this.ak.a(1.0f - (float)a4, this.d, this.P, this.ab, this.ac);
                                                        final esf aw = this.aw;
                                                        if (aw.a) {
                                                            aw.b();
                                                            this.aj = false;
                                                        }
                                                    }
                                                    else {
                                                        this.al.a((float)a4, this.d, this.P, this.ab, this.ac);
                                                    }
                                                }
                                            }
                                            GLES20.glDisable(3042);
                                            GLES20.glDisable(2929);
                                            GLES20.glBlendFunc(770, 771);
                                            GLES20.glDisable(2929);
                                            GLES20.glEnable(3042);
                                            int c = esh.c();
                                            Label_3521: {
                                                if (c == 0) {
                                                    if (!this.ao && esh.t()) {
                                                        this.ao = true;
                                                        this.am = false;
                                                    }
                                                    if (this.ao && !esh.t()) {
                                                        this.ao = false;
                                                        this.am = true;
                                                        this.an = SystemClock.elapsedRealtimeNanos();
                                                    }
                                                    if (this.am) {
                                                        final double n29 = (double)(SystemClock.elapsedRealtimeNanos() - this.an);
                                                        Double.isNaN(n29);
                                                        if (n29 / 1.0E9 > 0.25) {
                                                            this.am = false;
                                                            x = this.e;
                                                            final TextView textView = (TextView)((PhotoSphereMessageOverlay)x).findViewById(2131427943);
                                                            ((PhotoSphereMessageOverlay)x).c(2131952740);
                                                            x = ((PhotoSphereMessageOverlay)x).a;
                                                            ((Handler)x).postDelayed((Runnable)new ety(textView), 750L);
                                                            c = 0;
                                                            break Label_3521;
                                                        }
                                                    }
                                                    c = 0;
                                                }
                                            }
                                            boolean b6 = false;
                                            final int g2 = this.G;
                                            final boolean b7 = g2 == 2 || g2 == 3 || g2 == 4;
                                            Label_3680: {
                                                if (this.n && !b7) {
                                                    final float[] p3 = this.P;
                                                    final float n30 = -this.E.f()[6];
                                                    GLES20.glEnable(3042);
                                                    Label_3639: {
                                                        if (n30 > 0.34906584f) {
                                                            Label_3676: {
                                                                try {
                                                                    this.k.c();
                                                                    this.k.j(0.5f);
                                                                    this.g.a(p3);
                                                                }
                                                                catch (final erz erz4) {
                                                                    break Label_3676;
                                                                }
                                                                break Label_3639;
                                                            }
                                                            final erz erz4;
                                                            erz4.printStackTrace();
                                                            break Label_3680;
                                                        }
                                                    }
                                                    if (n30 < -0.34906584f) {
                                                        this.k.c();
                                                        this.k.j(0.5f);
                                                        this.f.a(p3);
                                                    }
                                                }
                                            }
                                            if (c != 0) {
                                                if (c == -1) {
                                                    b6 = true;
                                                }
                                                x = this.e;
                                                ((PhotoSphereMessageOverlay)x).a.post((Runnable)new etz((PhotoSphereMessageOverlay)x, b6));
                                                break Label_3782;
                                            }
                                            x = this.e;
                                            ((PhotoSphereMessageOverlay)x).a.post((Runnable)new eua((PhotoSphereMessageOverlay)x));
                                        }
                                    }
                                    catch (final erz erz5) {
                                        erz5.printStackTrace();
                                    }
                                }
                            }
                            final int p4 = this.p;
                            this.p = this.o;
                            this.o = p4;
                            ++this.af;
                        }
                    }
                }
            }
        }
    }
    
    public final void onSurfaceChanged(final GL10 gl10, final int n, final int n2) {
        if (n == this.ab && n2 == this.ac) {
            return;
        }
        this.ab = n;
        this.ac = n2;
        this.Z = n;
        this.aa = n2;
        this.Y = false;
        this.z = false;
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        try {
            float au;
            if ((au = this.au) < 0.0f) {
                au = this.F.a();
                this.au = au;
            }
            this.U = l(au, 1.7f);
            this.W = (int)l(this.au, 2.5f);
            this.X = (int)l(this.au, 1.1f);
            final float u = this.U;
            this.T = u;
            this.V = this.g(u);
            this.H = new esa((byte[])null);
            this.j = new esb();
            this.I = new esa((char[])null);
            this.i = new ets();
            this.j.j(err.a);
            this.c = new eta(this.b);
            new BitmapFactory$Options().inScaled = false;
            this.a = new esw();
            final esy b = this.b;
            b.e = this.i;
            b.j = this.j;
            if (this.D) {
                b.m = true;
                b.l = true;
            }
            Matrix.setIdentityM(this.Q, 0);
            final float[] q = this.Q;
            q[0] = 0.0f;
            q[1] = -1.0f;
            q[4] = 1.0f;
            q[5] = 0.0f;
            Matrix.setIdentityM(this.S, 0);
            GLES20.glClearColor(err.b[0], err.b[1], err.b[2], err.b[3]);
            this.m = true;
            if (this.w) {
                this.e.d(true, 0);
            }
            Matrix.setIdentityM(this.R, 0);
        }
        catch (final erz erz) {
            erz.printStackTrace();
        }
        this.z = false;
    }
}
