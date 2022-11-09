import android.os.Handler;
import android.hardware.SensorEvent;
import android.opengl.Matrix;
import android.os.HandlerThread;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjf implements SensorEventListener, dky, liq
{
    public final SensorManager a;
    public niz b;
    public niz c;
    public final dni d;
    public final dni e;
    public final lit f;
    private final dsy g;
    private final jdl h;
    private final Sensor i;
    private final Sensor j;
    private final float[] k;
    private final float[] l;
    private final float[] m;
    private final float[] n;
    private int o;
    private niz p;
    
    public fjf(final lit f, final SensorManager a, final dni d, final dni e) {
        this.k = new float[16];
        this.l = new float[16];
        this.m = new float[16];
        this.b = nii.a;
        this.o = 0;
        this.c = nii.a;
        this.p = nii.a;
        this.a = a;
        this.f = f;
        this.d = d;
        this.e = e;
        this.g = dsy.b();
        this.n = new float[3];
        this.h = new jdl();
        this.i = a.getDefaultSensor(1);
        this.j = a.getDefaultSensor(4);
    }
    
    private final krc g() {
        synchronized (this) {
            njo.o(this.c.g() ^ true);
            final HandlerThread handlerThread = new HandlerThread("CameraPoseFeatureExtractor");
            handlerThread.start();
            this.c = niz.i(kpo.d(handlerThread.getLooper()));
            this.a.registerListener((SensorEventListener)this, this.i, 3);
            this.a.registerListener((SensorEventListener)this, this.j, 3);
            this.f.b(this);
            return new fjd(this);
        }
    }
    
    private final void h(final lfg lfg) {
        synchronized (this) {
            final float[] array = new float[16];
            final float[] array2 = new float[16];
            Matrix.setRotateM(array, 0, 180.0f, 1.0f, 0.0f, 0.0f);
            Matrix.setRotateM(array2, 0, (float)lfg.f(), 0.0f, 0.0f, 1.0f);
            Matrix.multiplyMM(this.k, 0, array, 0, array2, 0);
            this.g.e();
            this.b = nii.a;
        }
    }
    
    private final void i(final long n) {
        monitorenter(this);
        try {
            this.b = niz.i(n);
            final double[] h = this.g.h();
            for (int i = 0; i < 16; ++i) {
                if (Double.isNaN(h[i])) {
                    this.g.e();
                    monitorexit(this);
                    return;
                }
                this.l[i] = (float)h[i];
            }
            Matrix.rotateM(this.l, 0, -90.0f, 1.0f, 0.0f, 0.0f);
            Matrix.multiplyMM(this.m, 0, this.k, 0, this.l, 0);
            Matrix.rotateM(this.m, 0, 0.0f, 1.0f, 0.0f, 0.0f);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void aY(final kra kra) {
        this.g.e();
    }
    
    public final void b(final SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            this.g.c(sensorEvent.values.clone(), sensorEvent.timestamp);
        }
        else if (sensorEvent.sensor.getType() == 4) {
            this.g.d(sensorEvent.values.clone(), sensorEvent.timestamp);
        }
        if (this.g.g()) {
            this.i(sensorEvent.timestamp);
        }
    }
    
    public final void c() {
        synchronized (this) {
            final int o = this.o - 1;
            this.o = o;
            if (o == 0 && this.p.g()) {
                ((kjk)this.p.c()).close();
                this.p = nii.a;
            }
        }
    }
    
    public final void d(final lfg lfg, final boa boa) {
        synchronized (this) {
            this.h(lfg);
            if (this.o == 0) {
                njo.o(this.p.g() ^ true);
                final kjk kjk = new kjk();
                kjk.c(this.g());
                this.p = niz.i(kjk);
            }
            ++this.o;
        }
    }
    
    public final void e() {
        synchronized (this) {
            final int e = this.f.a().e;
            final float n = (float)Math.toDegrees(Math.asin(this.m[6]));
            float n2;
            if (e == 90) {
                n2 = (float)Math.toDegrees(Math.asin(-this.m[4]));
            }
            else if (e == 180) {
                n2 = (float)(-Math.toDegrees(Math.asin(-this.m[5])));
            }
            else if (e == 270) {
                n2 = (float)(-Math.toDegrees(Math.asin(-this.m[4])));
            }
            else {
                n2 = (float)Math.toDegrees(Math.asin(-this.m[5]));
            }
            this.e.h((long)this.b.c(), (float)e, n, n2);
        }
    }
    
    public final void f() {
        synchronized (this) {
            final jdl h = this.h;
            final float[] m = this.m;
            final double n = m[0];
            final double n2 = m[5];
            final double n3 = m[10];
            Double.isNaN(n);
            final double n4 = n + 1.0;
            Double.isNaN(n2);
            Double.isNaN(n3);
            h.d = Math.sqrt(Math.max(0.0, n4 + n2 + n3)) * 0.5;
            Double.isNaN(n2);
            Double.isNaN(n3);
            h.a = Math.sqrt(Math.max(0.0, n4 - n2 - n3)) * 0.5;
            Double.isNaN(n);
            final double n5 = 1.0 - n;
            Double.isNaN(n2);
            Double.isNaN(n3);
            h.b = Math.sqrt(Math.max(0.0, n5 + n2 - n3)) * 0.5;
            Double.isNaN(n2);
            Double.isNaN(n3);
            final double n6 = Math.sqrt(Math.max(0.0, n5 - n2 + n3)) * 0.5;
            final boolean b = m[6] - m[9] < 0.0f;
            double a = h.a;
            if (b != a < 0.0) {
                a = -a;
            }
            h.a = a;
            final boolean b2 = m[8] - m[2] < 0.0f;
            double b3 = h.b;
            if (b2 != b3 < 0.0) {
                b3 = -b3;
            }
            h.b = b3;
            double c;
            if (m[1] - m[4] < 0.0f != n6 < 0.0) {
                c = -n6;
            }
            else {
                c = n6;
            }
            h.c = c;
            final jdl h2 = this.h;
            final float[] n7 = this.n;
            njo.d(true);
            final double a2 = h2.a;
            final double b4 = h2.b;
            final double c2 = h2.c;
            final double n8 = a2 * a2 + b4 * b4 + c2 * c2;
            if (n8 > 0.0) {
                final double sqrt = Math.sqrt(n8);
                final double d = h2.d;
                double n9;
                if (d < 0.0) {
                    n9 = Math.atan2(-sqrt, -d);
                }
                else {
                    n9 = Math.atan2(sqrt, d);
                }
                final double n10 = (n9 + n9) / sqrt;
                n7[0] = (float)(a2 * n10);
                n7[1] = (float)(b4 * n10);
                n7[2] = (float)(c2 * n10);
            }
            else {
                n7[0] = (float)(a2 + a2);
                n7[1] = (float)(b4 + b4);
                n7[2] = (float)(c2 + c2);
            }
            this.d.h((long)this.b.c(), this.n);
        }
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        synchronized (this) {
            if (this.c.g()) {
                ((Handler)this.c.c()).post((Runnable)new fje(this, sensorEvent));
            }
        }
    }
}
