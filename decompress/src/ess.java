import android.view.View;
import android.opengl.Matrix;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import android.hardware.SensorManager;
import android.location.Location;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import android.view.MotionEvent;
import java.io.IOException;
import android.os.Looper;
import java.util.ArrayList;
import android.content.Context;
import java.io.FileWriter;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import android.os.Handler;
import java.util.List;
import android.os.HandlerThread;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ess implements View$OnClickListener
{
    public static final nsd a;
    public final HandlerThread A;
    public final esg B;
    public euc C;
    public final List D;
    public final List E;
    public final List F;
    public final esx G;
    public boolean H;
    public final Handler I;
    public final esl J;
    private float K;
    private final eya L;
    private final LocalSessionStorage M;
    private final aso N;
    private final aso O;
    private final esn P;
    public esv b;
    public final ers c;
    public boolean d;
    public float e;
    public float f;
    public final etp g;
    public double h;
    public double i;
    public boolean j;
    public int k;
    public final Semaphore l;
    public final Vector m;
    public int n;
    public FileWriter o;
    public final Context p;
    public final cxl q;
    public final ega r;
    public boolean s;
    public boolean t;
    public dsm u;
    public boolean v;
    public boolean w;
    public euc x;
    public euc y;
    public final Handler z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/lightcycle/panorama/LightCycleController");
    }
    
    public ess(final Context p9, final cxl q, final ers c, final etp etp, final LocalSessionStorage m, final esg b, final esv b2, final eya l, final ega r) {
        this.l = new Semaphore(0);
        this.m = new Vector(100);
        this.n = 0;
        this.o = null;
        this.s = false;
        this.t = false;
        this.v = false;
        this.w = false;
        this.x = null;
        this.y = null;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new esx();
        this.H = false;
        this.J = new esl(this);
        this.N = new esm();
        this.P = new esn(this);
        this.O = new esp(this);
        this.r = r;
        this.p = p9;
        this.q = q;
        this.g = etp;
        this.M = m;
        this.B = b;
        this.L = l;
        this.I = kpo.d(Looper.getMainLooper());
        try {
            this.o = new FileWriter(m.i);
        }
        catch (final IOException ex) {
            ess.a.b().E(1407).r("Could not create file writer for : %s", this.M.i);
        }
        final HandlerThread a = new HandlerThread("FileHandlerThread");
        (this.A = a).start();
        this.z = kpo.d(a.getLooper());
        this.c = c;
        if (c == null) {
            return;
        }
        this.b = b2;
        b2.F = this;
        this.r.a().getDefaultDisplay();
        final esv b3 = this.b;
        b3.E = etp;
        b3.y = new etf();
        this.g.l = new esi(this);
        this.G.c = ese.c();
        this.w = q.k(cyb.c);
    }
    
    public static final float i(final MotionEvent motionEvent) {
        final float n = motionEvent.getX(0) - motionEvent.getX(1);
        final float n2 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float)Math.sqrt(n * n + n2 * n2);
    }
    
    public final float a() {
        final float b = this.b();
        if (b > 0.0f) {
            return b;
        }
        float k;
        if ((k = this.K) > 75.0f) {
            k = 55.0f;
        }
        return k;
    }
    
    public final float b() {
        if (this.c == null) {
            throw new IllegalStateException("Cannot use stopped controller");
        }
        final int intValue = (int)this.q.a(cyb.a).c();
        if (intValue > 0) {
            return intValue / 1000.0f;
        }
        final esd a = ese.a;
        return ese.a(this.K);
    }
    
    public final int c() {
        monitorenter(this);
        try {
            final int n = this.n;
            final int n2 = 0;
            if (n == 0) {
                monitorexit(this);
                return 0;
            }
            this.n = n - 1;
            final List d = this.D;
            d.remove(d.size() - 1);
            try {
                this.o.close();
                final BufferedReader bufferedReader = new BufferedReader(new FileReader(this.M.i));
                final StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.n; ++i) {
                    sb.append(bufferedReader.readLine());
                    sb.append("\n");
                }
                bufferedReader.close();
                (this.o = new FileWriter(this.M.i)).write(sb.toString());
                this.o.flush();
            }
            catch (final IOException ex) {
                a.m(ess.a.b(), "undo image exception:", '\u057d', ex);
            }
            int n3 = this.n;
            if (n3 == 0) {
                this.v = false;
                n3 = n2;
            }
            this.H = true;
            monitorexit(this);
            return n3;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d(final asx asx) {
        asx.q(this.I, this.P, this.N, this.O);
        final niz d = this.L.d();
        final List d2 = this.D;
        final long currentTimeMillis = System.currentTimeMillis();
        final Location location = (Location)d.f();
        final etp g = this.g;
        final float[] array = new float[16];
        final jdm c = g.c;
        SensorManager.getRotationMatrix(array, (float[])null, new float[] { c.a, c.b, c.c }, g.e);
        final float[] array2 = new float[16];
        SensorManager.remapCoordinateSystem(array, 1, 3, array2);
        final float[] array3 = new float[3];
        SensorManager.getOrientation(array2, array3);
        final double n = array3[0] * 180.0f;
        Double.isNaN(n);
        d2.add(new euf(currentTimeMillis, location, (int)(n / 3.141592653589793)));
        this.H = false;
    }
    
    public final void e() {
        Object o = esh.a;
        monitorenter(o);
        try {
            if (esh.b) {
                final float[] getFrameGeometry = LightCycleNative.GetFrameGeometry(2, 2);
                monitorexit(o);
                o = this.b.b;
                ((esy)o).f = 6;
                ((esy)o).a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
                ((esy)o).b = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                final int f = ((esy)o).f;
                ((esy)o).c = ByteBuffer.allocateDirect(f + f).order(ByteOrder.nativeOrder()).asShortBuffer();
                ((esy)o).i = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asShortBuffer();
                final int n = 0;
                for (int i = 0; i < 12; ++i) {
                    ((esy)o).a.put(i, getFrameGeometry[i]);
                }
                int j = 0;
                int n2 = 0;
                while (j < 2) {
                    final float n3 = (float)j;
                    for (int k = 0; k < 2; ++k) {
                        ((esy)o).b.put(n2, (float)k);
                        ((esy)o).b.put(n2 + 1, n3);
                        n2 += 2;
                    }
                    ++j;
                }
                int l = 0;
                int n4 = 0;
                while (l <= 0) {
                    int n5 = 0;
                    int n6 = 0;
                    int n7 = 2;
                    while (n5 <= 0) {
                        final int n8 = n4 + 1;
                        final short n9 = (short)n6;
                        ((esy)o).c.put(n4, n9);
                        final int n10 = n8 + 1;
                        final int n11 = n7 + 1;
                        final short n12 = (short)n11;
                        ((esy)o).c.put(n8, n12);
                        final int n13 = n10 + 1;
                        ((esy)o).c.put(n10, (short)n7);
                        final int n14 = n13 + 1;
                        ((esy)o).c.put(n13, n9);
                        final int n15 = n14 + 1;
                        ++n6;
                        ((esy)o).c.put(n14, (short)n6);
                        final int n16 = n15 + 1;
                        ((esy)o).c.put(n15, n12);
                        n7 = n11;
                        n5 = 1;
                        n4 = n16;
                    }
                    l = 1;
                }
                int n17;
                int n18;
                for (n17 = 0, n18 = 0; n17 < 2; ++n17, ++n18) {
                    ((esy)o).i.put(n18, (short)n17);
                }
                for (int n19 = n; n19 < 2; ++n19, ++n18) {
                    ((esy)o).i.put(n18, (short)(n19 + n19 + 1));
                }
                for (int n20 = 1; n20 >= 0; --n20, ++n18) {
                    ((esy)o).i.put(n18, (short)(n20 + 2));
                }
                for (int n21 = 1; n21 >= 0; --n21, ++n18) {
                    ((esy)o).i.put(n18, (short)(n21 + n21));
                }
                ((esy)o).g = n18 - 1;
                ((esy)o).h = true;
                return;
            }
            throw new IllegalStateException("State is not ready.");
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void f() {
        monitorenter(this);
        try {
            if (!this.t) {
                a.l(ess.a.c(), "stopCamera invoked, but camera is already stopped!", '\u0580');
            }
            else {
                this.t = false;
                this.b.s = true;
                final ers c = this.c;
                if (c != null) {
                    final asx b = c.b;
                    if (b != null) {
                        if (b.g().a() != 1) {
                            final asx b2 = c.b;
                            if (!b2.g().d()) {
                                final atc atc = new atc();
                                try {
                                    b2.h().b(new asw(b2, atc), atc.b, "stop preview");
                                }
                                catch (final RuntimeException ex) {
                                    b2.d().c().c(ex);
                                }
                            }
                            c.b.m(c.a, null);
                            c.b.k(true);
                            final asx b3 = c.b;
                            b3.c().sendMessageAtFrontOfQueue(b3.c().obtainMessage(302));
                            b3.c().sendEmptyMessage(305);
                        }
                        c.e = null;
                    }
                    eue.d(this.M.h, this.D);
                    try {
                        this.o.close();
                        monitorexit(this);
                        return;
                    }
                    catch (final IOException ex2) {
                        ex2.printStackTrace();
                        monitorexit(this);
                        return;
                    }
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void g() {
        this.K = this.c.b.b().getHorizontalViewAngle();
    }
    
    public final void h(final int n) {
        final String e = this.M.e;
        if (n != 0) {
            switch (n - 1) {
                default: {
                    esh.j(e, this.a());
                    break;
                }
                case 4: {
                    final float a = this.a();
                    synchronized (esh.a) {
                        LightCycleNative.ResetForFisheyeCapture(e, a);
                        esh.b = true;
                        break;
                    }
                }
                case 3: {
                    final float a2 = this.a();
                    synchronized (esh.a) {
                        LightCycleNative.ResetForWideCapture(e, a2);
                        esh.b = true;
                        break;
                    }
                }
                case 2: {
                    final float a3 = this.a();
                    synchronized (esh.a) {
                        LightCycleNative.ResetForVerticalCapture(e, a3);
                        esh.b = true;
                        break;
                    }
                }
                case 1: {
                    final float a4 = this.a();
                    synchronized (esh.a) {
                        LightCycleNative.ResetForHorizontalCapture(e, a4);
                        esh.b = true;
                        break;
                    }
                }
                case 0: {
                    esh.j(e, this.a());
                    break;
                }
            }
            final esv b = this.b;
            b.d.d();
            b.e.a();
            if (n == 6) {
                final float[] array = new float[16];
                Matrix.setIdentityM(array, 0);
                final esv b2 = this.b;
                b2.d.b(array);
                if (b2.n && b2.G == 1) {
                    b2.e.c(b2.x);
                }
                b2.u = true;
            }
            this.v = false;
            this.n = 0;
            return;
        }
        throw null;
    }
    
    public final void onClick(final View view) {
    }
}
