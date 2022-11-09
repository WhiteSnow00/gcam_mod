import android.opengl.Matrix;
import java.util.Arrays;
import android.hardware.SensorEventListener;
import android.os.HandlerThread;
import android.hardware.SensorManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etp
{
    public final bqu a;
    public SensorManager b;
    public final jdm c;
    public boolean d;
    public final float[] e;
    public long f;
    public final float[] g;
    public final float[] h;
    public int i;
    public final dsy j;
    public float k;
    public euc l;
    public float m;
    public boolean n;
    public HandlerThread o;
    public final SensorEventListener p;
    private final float[] q;
    private double[] r;
    
    public etp(final bqu a) {
        this.b = null;
        this.c = new jdm();
        this.d = false;
        this.e = new float[3];
        this.f = 0L;
        this.g = new float[3];
        this.h = new float[] { 0.0f, 0.0f, 0.0f };
        this.i = 0;
        this.j = dsy.b();
        this.q = new float[16];
        this.k = 90.0f;
        this.l = null;
        this.m = 0.0f;
        this.n = false;
        this.r = new double[16];
        this.p = (SensorEventListener)new eto(this);
        this.a = a;
    }
    
    public final double a() {
        return this.j.a();
    }
    
    public final void b() {
        Arrays.fill(this.h, 0.0f);
    }
    
    public final void c(double n) {
        if (n < 0.0) {
            n += 360.0;
        }
        if (n > 360.0) {
            n -= 360.0;
        }
        this.j.f(n);
    }
    
    public final void d() {
        this.n = false;
        final HandlerThread o = this.o;
        if (o != null) {
            o.quit();
        }
        this.o = null;
        final SensorManager b = this.b;
        if (b != null) {
            b.unregisterListener(this.p);
        }
    }
    
    public final float[] e() {
        synchronized (this) {
            final float[] array = this.g.clone();
            final float[] g = this.g;
            g[0] = 0.0f;
            g[2] = (g[1] = 0.0f);
            this.i = 0;
            return array;
        }
    }
    
    public final float[] f() {
        if (this.j.g()) {
            this.r = this.j.h();
        }
        final float[] array = new float[16];
        for (int i = 0; i < 16; ++i) {
            array[i] = (float)this.r[i];
        }
        Matrix.rotateM(array, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        final float[] array2 = new float[16];
        Matrix.setIdentityM(array2, 0);
        Matrix.rotateM(array2, 0, this.k, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(this.q, 0, array2, 0, array, 0);
        return this.q;
    }
}
