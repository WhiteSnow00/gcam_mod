import android.media.AudioDeviceInfo;
import android.text.TextUtils;
import android.os.HandlerThread;
import android.os.Handler;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ciu implements cis
{
    private static final nsd g;
    public final AudioManager a;
    public final AudioDeviceCallback b;
    public final Handler c;
    public boolean d;
    public boolean e;
    public final Object f;
    private final ciw h;
    private final klv i;
    private final klv j;
    private final cxl k;
    private final HandlerThread l;
    private boolean m;
    
    static {
        g = nsd.g("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceChangeListenerImpl");
    }
    
    public ciu(final ciw h, final AudioManager a, final klv i, final klv j, final cxl k) {
        final HandlerThread l = new HandlerThread("AudioDeviceChangeListenerImpl");
        this.l = l;
        this.d = false;
        this.e = false;
        this.m = true;
        this.f = new Object();
        this.h = h;
        this.a = a;
        this.i = i;
        this.j = j;
        this.k = k;
        this.b = new cit(this);
        l.start();
        this.c = kpo.d(l.getLooper());
    }
    
    @Override
    public final void a() {
        synchronized (this.f) {
            if (!this.d) {
                this.a.unregisterAudioDeviceCallback(this.b);
                final cxl k = this.k;
                final cxo a = cwv.a;
                k.e();
                this.i.aR(false);
                this.j.aR("");
                this.e = false;
            }
        }
    }
    
    public final void b() {
        final niz a = this.k.a(cwv.j);
        final boolean g = a.g();
        String string = "";
        final boolean b = false;
        boolean b2 = true;
        if (g) {
            this.i.aR(0x1 == ((int)a.c() & 0x1) || b);
            final klv j = this.j;
            if (((int)a.c() & 0x2) > 0) {
                string = "Bluetooth Audio";
            }
            j.aR(string);
            a.k(ciu.g.c(), "Override external mic state: %d. This should never be in prod.", a.c(), '\u0204');
            return;
        }
        if (this.h.b() == null) {
            b2 = false;
        }
        if (this.m || b2 != (boolean)this.i.aQ()) {
            this.i.aR(b2);
        }
        final AudioDeviceInfo a2 = this.h.a();
        if (a2 != null) {
            string = a2.getProductName().toString();
        }
        if (this.m || !TextUtils.equals((CharSequence)string, (CharSequence)this.j.aQ())) {
            this.j.aR(string);
        }
        this.m = false;
        this.i.aQ();
        this.j.aQ();
    }
    
    @Override
    public final void close() {
        synchronized (this.f) {
            if (this.d) {
                ciu.g.c().E(512).o("Already closed");
                return;
            }
            this.a();
            this.d = true;
            try {
                this.l.quit();
                this.l.join();
            }
            catch (final InterruptedException ex) {
                ciu.g.b().E(511).o("Could not complete shutting down AudioDeviceChangeListener.");
            }
        }
    }
}
