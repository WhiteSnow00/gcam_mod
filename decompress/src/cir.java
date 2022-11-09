import android.content.BroadcastReceiver;
import android.media.AudioManager;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cir implements krc
{
    public static final nsd a;
    public final Object b;
    public final klv c;
    public boolean d;
    public int e;
    private final Activity f;
    private final AudioManager g;
    private final kjk h;
    private final BroadcastReceiver i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceBluetoothManagerImpl");
    }
    
    public cir(final Activity f, final AudioManager g, final klv c) {
        this.h = new kjk();
        this.b = new Object();
        this.e = 1;
        this.d = false;
        this.i = new ciq(this);
        this.f = f;
        this.g = g;
        this.c = c;
    }
    
    @Override
    public final void close() {
        synchronized (this.b) {
            if (this.d) {
                cir.a.c().E(502).o("Already closed");
                return;
            }
            synchronized (this.b) {
                if (this.e != 0) {
                    this.g.stopBluetoothSco();
                    monitorexit(this.b);
                    this.h.close();
                    this.f.unregisterReceiver(this.i);
                    this.d = true;
                    return;
                }
                throw null;
            }
        }
    }
}
