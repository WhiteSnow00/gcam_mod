import android.hardware.SensorEvent;
import android.opengl.Matrix;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edy implements SensorEventListener
{
    public final SensorManager a;
    public final Sensor b;
    public final Sensor c;
    private final dsy d;
    private long e;
    private int f;
    private final float[] g;
    private final float[] h;
    private final float[] i;
    private double j;
    private double k;
    
    public edy(final SensorManager a) {
        final dsy b = dsy.b();
        this.e = 0L;
        this.f = 0;
        final float[] g = new float[16];
        this.g = g;
        this.h = new float[16];
        this.i = new float[16];
        this.j = 0.0;
        this.k = 0.0;
        this.d = b;
        this.a = a;
        this.b = a.getDefaultSensor(1);
        this.c = a.getDefaultSensor(4);
        final float[] array = new float[16];
        final float[] array2 = new float[16];
        Matrix.setRotateM(array, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        Matrix.setRotateM(array2, 0, 90.0f, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(g, 0, array, 0, array2, 0);
    }
    
    public final double a() {
        synchronized (this) {
            return this.k;
        }
    }
    
    public final double b() {
        synchronized (this) {
            return this.j;
        }
    }
    
    public final void c(final int f) {
        synchronized (this) {
            this.f = f;
            this.d.e();
        }
    }
    
    public final void d(final float[] array) {
        synchronized (this) {
            final float[] i = this.i;
            array[0] = i[0];
            array[1] = i[1];
            array[2] = i[2];
            array[3] = i[4];
            array[4] = i[5];
            array[5] = i[6];
            array[6] = i[8];
            array[7] = i[9];
            array[8] = i[10];
        }
    }
    
    final void e(float[] i, int j, final long e) {
        monitorenter(this);
        try {
            if (this.e == 0L) {
                this.d.e();
            }
            this.e = e;
            if (j == 1) {
                this.d.c(i, e);
            }
            else if (j == 4) {
                this.d.d(i, e);
            }
            final double[] h = this.d.h();
            for (j = 0; j < 16; ++j) {
                this.h[j] = (float)h[j];
            }
            Matrix.rotateM(this.h, 0, -90.0f, 1.0f, 0.0f, 0.0f);
            Matrix.multiplyMM(this.i, 0, this.g, 0, this.h, 0);
            Matrix.rotateM(this.i, 0, (float)(-this.f), 1.0f, 0.0f, 0.0f);
            i = this.i;
            final double n = i[2];
            final double n2 = i[10];
            final double hypot = Math.hypot(n, n2);
            double k = 0.0;
            if (hypot >= 0.1) {
                double n4;
                final double n3 = n4 = -90.0 - Math.toDegrees(Math.atan2(n2, n));
                if (n3 < 0.0) {
                    n4 = n3 + 360.0;
                }
                final double n5 = k = n4;
                if (n5 >= 360.0) {
                    k = n5 - 360.0;
                }
            }
            this.k = k;
            this.j = Math.toDegrees(Math.asin(this.i[6]));
            Math.toDegrees(Math.asin(Math.abs(this.i[5])));
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.e(sensorEvent.values, sensorEvent.sensor.getType(), sensorEvent.timestamp);
    }
}
