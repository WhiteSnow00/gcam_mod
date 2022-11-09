import android.hardware.SensorEvent;
import android.hardware.Sensor;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.os.Vibrator;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class imi implements SensorEventListener
{
    final /* synthetic */ Vibrator a;
    final /* synthetic */ BottomBarController b;
    final /* synthetic */ imk c;
    
    public imi(final imk c, final Vibrator a, final BottomBarController b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.c.b.ar();
        if (this.a.hasVibrator()) {
            this.a.vibrate(imk.a, -1);
        }
        this.b.switchCamera();
    }
}
